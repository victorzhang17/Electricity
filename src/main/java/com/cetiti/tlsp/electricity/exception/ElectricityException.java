package com.cetiti.tlsp.electricity.exception;

/**
 * 自定义异常
 *
 * @author victorzhang
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
