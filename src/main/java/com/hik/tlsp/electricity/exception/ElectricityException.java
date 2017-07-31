package com.hik.tlsp.electricity.exception;

/**
 * 自定义异常
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-28.
 */
public class ElectricityException extends RuntimeException {
    private int errorCode;

    public ElectricityException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
