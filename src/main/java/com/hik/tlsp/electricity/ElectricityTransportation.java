package com.hik.tlsp.electricity;

import com.hik.tlsp.electricity.exception.ElectricityException;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;

/**
 * 中恒——中电——天阙
 * 电力预警数据传输服务
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-28.
 */
public class ElectricityTransportation {
    public static InternalLogger logger = InternalLoggerFactory.getInstance(ElectricityServer.class);
    private static final int DEFAULT_PORT = 8899;

    public static void main(String[] args) {
        int port = getServerPort(args);
        ElectricityServer server = new ElectricityServer();
        server.start(port);
    }

    private static int getServerPort(String[] args) {
        int port = DEFAULT_PORT;
        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                throw new ElectricityException("Invalid port, please use default port 8899");
            }
        }
        return port;
    }
}
