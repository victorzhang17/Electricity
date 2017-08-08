package com.hik.tlsp.electricity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 中恒——中电——天阙
 * 电力预警数据传输服务
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-28.
 */
public class ElectricityServer {
    private static final Logger logger = LoggerFactory.getLogger(ElectricityServer.class);
    private static final int DEFAULT_PORT = 8899;

    public static void main(String[] args) {
        int port = getServerPort(args);
        ElectricityTransportation server = new ElectricityTransportation();
        server.start(port);
    }

    private static int getServerPort(String[] args) {
        int port = DEFAULT_PORT;
        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                logger.error("端口范围为0-65535, 请使用默认端口{}", DEFAULT_PORT);
            }
        }
        return port;
    }
}
