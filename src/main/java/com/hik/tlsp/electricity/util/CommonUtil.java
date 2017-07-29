package com.hik.tlsp.electricity.util;

import java.util.UUID;

/**
 * 工具类
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-29.
 */
public class CommonUtil {

    public static String createUUID(){
        String randomUUID = UUID.randomUUID().toString();
        return randomUUID.toUpperCase().replace("-","");
    }
}
