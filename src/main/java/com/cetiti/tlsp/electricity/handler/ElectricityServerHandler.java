package com.cetiti.tlsp.electricity.handler;

import java.sql.SQLException;

import com.alibaba.fastjson.JSONObject;
import com.cetiti.tlsp.electricity.exception.ElectricityException;
import com.cetiti.tlsp.electricity.model.ElectricityDetail;
import com.cetiti.tlsp.electricity.service.DataPushService;
import com.cetiti.tlsp.electricity.service.DataTransportService;
import com.cetiti.tlsp.electricity.service.impl.DataPushServiceImpl;
import com.cetiti.tlsp.electricity.service.impl.DataTransportServiceImpl;
import com.cetiti.tlsp.electricity.util.ErrorCode;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.util.CharsetUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.netty.handler.codec.http.HttpResponseStatus.OK;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;

/**
 * netty 事务处理类
 *
 * @author victorzhang
 */
public class ElectricityServerHandler extends ChannelInboundHandlerAdapter {
    private static final Logger logger = LoggerFactory.getLogger(ElectricityServerHandler.class);

    private static final String CONTENT_TYPE = "Content-Type";
    private static final String CONTENT_LENGTH = "Content-Length";

    private FullHttpRequest request;
    private DataTransportService dataTransportService;
    private DataPushService dataPushService;

    /**
     * Constructor method : DI（依赖注入），解耦内聚
     */
    public ElectricityServerHandler() {
        dataTransportService = new DataTransportServiceImpl();
        dataPushService = new DataPushServiceImpl();
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        int errorCode = ErrorCode.TRANSPORT_AND_PUSH_DATA_SUCCESS;
        try {
            if (msg instanceof FullHttpRequest) {
                request = (FullHttpRequest) msg;
                errorCode = doFullHttpRequestHandler();
            } else {
                errorCode = ErrorCode.HTTP_OBJECT_TYPE_IS_NOT_FULLHTTPREQUEST;
                throw new ElectricityException("NETTY服务器，HTTP传输对象类型非FullHttpRequest", ErrorCode.HTTP_OBJECT_TYPE_IS_NOT_FULLHTTPREQUEST);
            }
        } catch (SQLException ex) {
            errorCode = ex.getErrorCode();
            logger.error("数据库操作失败，ORACLE数据库错误码：{}", errorCode);
        } finally {
            response2Client(ctx, errorCode);
        }
    }

    private int doFullHttpRequestHandler() throws SQLException {
        int errorCode;
        if (request.method() == HttpMethod.POST) {
            String uri = request.uri();
            if (StringUtils.equals(uri, "/insertTransportData")) {
                //查找数据库中是否存在alarmRuldId,不存在则推送，如果存在判断是否在24小时内，24小时内不予推送
                ElectricityDetail electricityDetail = getElectricityDetailFromHttpRequest(request);
                errorCode = dataPushService.push(electricityDetail);
                if (!dataTransportService.insert(electricityDetail)) {
                    errorCode = ErrorCode.DATA_INSERT_ERROR;
                    logger.error("电力预警数据插入数据库失败，错误码：{}", errorCode);
                }
            } else {
                errorCode = ErrorCode.HTTP_URL_INCORRECT;
                logger.error("HTTP的URL地址不正确，错误码：{}", errorCode);
            }
        } else {
            errorCode = ErrorCode.HTTP_METHOD_INVALID;
            logger.error("HTTP的请求方法不正确，这里只支持Method方法，错误码：{}", errorCode);
        }
        return errorCode;
    }

    private ElectricityDetail getElectricityDetailFromHttpRequest(FullHttpRequest request) throws SQLException {
        ByteBuf jsonBuf = request.content();
        String jsonStr = jsonBuf.toString(CharsetUtil.UTF_8);
        logger.info("HTTP传输json串：{}", jsonStr);

        JSONObject json = JSONObject.parseObject(jsonStr);
        json.put("issueSerialNum", dataPushService.getIssueSerialNum());
        ElectricityDetail electricityDetail = JSONObject.toJavaObject(json, ElectricityDetail.class);
        logger.info("HTTP传输json串转换成对象：{}", electricityDetail.toString());
        return electricityDetail;
    }

    private void response2Client(ChannelHandlerContext ctx, int errorCode) {
        FullHttpResponse response = new DefaultFullHttpResponse(HTTP_1_1, OK, Unpooled.wrappedBuffer(String.valueOf(errorCode).getBytes()));
        response.headers().set(CONTENT_TYPE, "text/plain");
        response.headers().set(CONTENT_LENGTH, response.content().readableBytes());
        ctx.channel().writeAndFlush(response);
    }
}