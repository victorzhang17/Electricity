package com.hik.tlsp.electricity.handler;

import com.alibaba.fastjson.JSONObject;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.util.CharsetUtil;

import java.io.UnsupportedEncodingException;

import static io.netty.handler.codec.http.HttpResponseStatus.OK;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;

/**
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-28.
 */
public class ElectricityServerHandler extends ChannelInboundHandlerAdapter {

    private static final String CONTENT_TYPE = "Content-Type";
    private static final String CONTENT_LENGTH = "Content-Length";
    private FullHttpRequest request;

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws UnsupportedEncodingException {

        if (msg instanceof FullHttpRequest) {
            request = (FullHttpRequest) msg;

            String result = "";
            if (request.method() == HttpMethod.GET) {
                result = "please use post method";
            } else if (request.method() == HttpMethod.POST) {
                doPost(request);
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

    private void doPost(FullHttpRequest request) throws UnsupportedEncodingException {
        ByteBuf jsonBuf = request.content();
        String jsonStr = jsonBuf.toString(CharsetUtil.UTF_8);
        JSONObject json = JSONObject.parseObject(jsonStr);
    }
}
