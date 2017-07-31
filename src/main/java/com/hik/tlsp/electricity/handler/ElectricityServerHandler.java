package com.hik.tlsp.electricity.handler;

import com.alibaba.fastjson.JSONObject;
import com.hik.tlsp.electricity.exception.ElectricityException;
import com.hik.tlsp.electricity.model.ElectricityDetail;
import com.hik.tlsp.electricity.service.DataPushService;
import com.hik.tlsp.electricity.service.DataTransportService;
import com.hik.tlsp.electricity.service.impl.DataPushServiceImpl;
import com.hik.tlsp.electricity.service.impl.DataTransportServiceImpl;
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

import java.sql.SQLException;

import static com.hik.tlsp.electricity.util.ErrorCode.*;
import static io.netty.handler.codec.http.HttpResponseStatus.OK;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;

/**
 * netty事务处理类
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-28.
 */
public class ElectricityServerHandler extends ChannelInboundHandlerAdapter {
    private static final String CONTENT_TYPE = "Content-Type";
    private static final String CONTENT_LENGTH = "Content-Length";

    private FullHttpRequest request;

    private DataTransportService dataTransportService;
    private DataPushService dataPushService;

    public ElectricityServerHandler() {
        dataTransportService = new DataTransportServiceImpl();
        dataPushService = new DataPushServiceImpl();
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {

        int errorCode = TRANSPORT_AND_PUSH_DATA_SUCCESS;
        try {
            if (msg instanceof FullHttpRequest) {
                request = (FullHttpRequest) msg;

                if (request.method() == HttpMethod.GET) {
                    errorCode = HTTP_METHOD_GET_INVALID;
                } else if (request.method() == HttpMethod.POST) {
                    //可扩展，请求分发
                    String uri = request.uri();
                    if (StringUtils.equals(uri, "/insertTransportData")) {
                        ElectricityDetail electricityDetail = getElectricityDetailFromHttpRequest(request);
                        saveElectricityDetail2DB(electricityDetail);
                        dataPushService.push(electricityDetail);
                    } else {
                        errorCode = HTTP_URL_INCORRECT;
                    }
                }
            }
        } catch (ElectricityException e) {
            errorCode = e.getErrorCode();
        } catch (SQLException ex){
            errorCode = ex.getErrorCode();
        }finally {
            response2Client(ctx, errorCode);
        }
    }

    private void response2Client(ChannelHandlerContext ctx, int errorCode) {
        FullHttpResponse response = new DefaultFullHttpResponse(HTTP_1_1, OK, Unpooled.wrappedBuffer(String.valueOf(errorCode).getBytes()));
        response.headers().set(CONTENT_TYPE, "text/plain");
        response.headers().set(CONTENT_LENGTH, response.content().readableBytes());
        ctx.channel().writeAndFlush(response);
    }

    private ElectricityDetail getElectricityDetailFromHttpRequest(FullHttpRequest request) {
        ByteBuf jsonBuf = request.content();
        String jsonStr = jsonBuf.toString(CharsetUtil.UTF_8);
        JSONObject json = JSONObject.parseObject(jsonStr);

        ElectricityDetail electricityDetail = JSONObject.toJavaObject(json, ElectricityDetail.class);

        return electricityDetail;
    }

    private boolean saveElectricityDetail2DB(ElectricityDetail electricityDetail) throws SQLException {
        boolean flag = false;

        int i = dataTransportService.insert(electricityDetail);
        if (i > 0) {
            flag = true;
        }
        return flag;
    }
}
