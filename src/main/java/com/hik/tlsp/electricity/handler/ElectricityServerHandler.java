package com.hik.tlsp.electricity.handler;

import com.alibaba.fastjson.JSONObject;
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

import static io.netty.handler.codec.http.HttpResponseStatus.OK;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;

/**
 * netty事务处理类
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-28.
 */
public class ElectricityServerHandler extends ChannelInboundHandlerAdapter {

    private static final String CONTENT_TYPE = "Content-Type";
    private static final String CONTENT_LENGTH = "Content-Length";
    private static final String TRASPORT_TO_HIK_SUCCESS = "数据传输至中电海康服务端成功";
    private static final String TRASPORT_TO_HIK_ERROR = "数据传输至中电海康服务端失败";
    private FullHttpRequest request;

    private DataTransportService dataTransportService;
    private DataPushService dataPushService;

    public ElectricityServerHandler() {
        dataTransportService = new DataTransportServiceImpl();
        dataPushService = new DataPushServiceImpl();
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)  {

        if (msg instanceof FullHttpRequest) {
            request = (FullHttpRequest) msg;

            String result = "";
            if (request.method() == HttpMethod.GET) {
                result = "please use post method";
            } else if (request.method() == HttpMethod.POST) {
                result = doPost(request);
            }
            response2Client(ctx, result);
        }
    }

    private void response2Client(ChannelHandlerContext ctx, String result) {
        FullHttpResponse response = new DefaultFullHttpResponse(HTTP_1_1, OK, Unpooled.wrappedBuffer(result.getBytes()));
        response.headers().set(CONTENT_TYPE, "text/plain");
        response.headers().set(CONTENT_LENGTH, response.content().readableBytes());
        ctx.channel().writeAndFlush(response);
    }

    private String doPost(FullHttpRequest request) {

        ByteBuf jsonBuf = request.content();
        String jsonStr = jsonBuf.toString(CharsetUtil.UTF_8);
        JSONObject json = JSONObject.parseObject(jsonStr);
        ElectricityDetail electricityDetail = JSONObject.toJavaObject(json, ElectricityDetail.class);
        if (saveElectricityDetail2DB(electricityDetail)) {
            dataPushService.push(electricityDetail);
            return TRASPORT_TO_HIK_SUCCESS;
        } else {
            return TRASPORT_TO_HIK_ERROR;
        }
    }

    private boolean saveElectricityDetail2DB(ElectricityDetail electricityDetail) {
        boolean flag = false;

        int i = dataTransportService.insert(electricityDetail);
        if (i > 0) {
            flag = true;
        }
        return flag;
    }
}
