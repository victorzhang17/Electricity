package com.hik.tlsp.electricity.exception;

/**
 * 自定义异常
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-28.
 */
public class ElectricityException extends RuntimeException {

    public ElectricityException() {
        super();
    }

    public ElectricityException(String message) {
        super(message);
    }

    public ElectricityException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElectricityException(Throwable cause) {
        super(cause);
    }
}
