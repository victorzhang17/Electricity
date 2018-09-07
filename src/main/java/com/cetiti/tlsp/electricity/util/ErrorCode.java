package com.cetiti.tlsp.electricity.util;

/**
 * 错误码常量
 *
 * @author victorzhang
 */
public class ErrorCode {
    /**
     * 传输和推送数据成功
     */
    public static final int TRANSPORT_AND_PUSH_DATA_SUCCESS = 66666;
    /**
     * 数据源配置信息错误
     */
    public static final int DATASOURCE_SETTING_ERROR = 60000;
    /**
     * 天阙WSDL解码错误
     */
    public static final int TIANQUE_WSDL_DECODER_FAIL = 60001;
    /**
     * HTTP方法不可用，只支持POST方法
     */
    public static final int HTTP_METHOD_INVALID = 60002;
    /**
     * HTTP请求URL地址不正确（404）
     */
    public static final int HTTP_URL_INCORRECT = 60003;
    /**
     * 24小时重复传输相同的预警数据，保存至数据库，不予推送至大联动
     */
    public static final int REPEAT_ALARM_INFORMATION = 60004;
    /**
     * 数据插入至数据库失败
     */
    public static final int DATA_INSERT_ERROR = 60005;
    /**
     * NETTY服务器HTTP对象类型不是FullHttpRequest
     */
    public static final int HTTP_OBJECT_TYPE_IS_NOT_FULLHTTPREQUEST = 60006;
}
