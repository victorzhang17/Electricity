package com.hik.tlsp.electricity.handler;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpResponseEncoder;

/**
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-28.
 */
public class ElectricityServerInitializer extends ChannelInitializer<SocketChannel> {

    private static final String HTTP_DECODER = "http-decoder";
    private static final String HTTP_AGGREGATOR = "http-aggregator";
    private static final String HTTP_ENCODER = "http-encoder";
    private static final int MAX_CONTENT_LENGTH = 512 * 1024;

    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline pipeline = socketChannel.pipeline();

        pipeline.addLast(HTTP_DECODER, new HttpRequestDecoder());
        pipeline.addLast(HTTP_AGGREGATOR, new HttpObjectAggregator(MAX_CONTENT_LENGTH));
        pipeline.addLast(HTTP_ENCODER, new HttpResponseEncoder());

        pipeline.addLast(new ElectricityServerHandler());

    }
}
