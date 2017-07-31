package com.hik.tlsp.electricity;

import com.hik.tlsp.electricity.handler.ElectricityServerInitializer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;

/**
 * 电力数据传输服务端
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-28.
 */
public class ElectricityServer {
    public static InternalLogger logger = InternalLoggerFactory.getInstance(ElectricityServer.class);

    public void start(int port) {
        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.option(ChannelOption.SO_BACKLOG, 128)
                    .group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .handler(new LoggingHandler(LogLevel.INFO))
                    .childHandler(new ElectricityServerInitializer());

            syncChannel(serverBootstrap, port);
        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }

    private void syncChannel(ServerBootstrap serverBootstrap, int port) {
        try {
            ChannelFuture channelFuture = serverBootstrap.bind(port).sync();
            logger.info("端口绑定成功");
            channelFuture.channel().closeFuture().sync();
        } catch (InterruptedException e) {
           logger.error("服务器端口被使用");
        }
    }
}
