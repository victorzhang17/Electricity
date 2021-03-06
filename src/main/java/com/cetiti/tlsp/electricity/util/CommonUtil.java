package com.cetiti.tlsp.electricity.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 通用工具类
 *
 * @author victorzhang
 */
public class CommonUtil {
    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static String createUUID() {
        String randomUUID = UUID.randomUUID().toString();
        return randomUUID.toUpperCase().replace("-", "");
    }

    public static String getDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        return dateFormat.format(new Date());
    }

    public static Timestamp getTimeStampObject(long timeStamp) {
        Timestamp timestamp = new Timestamp(Long.valueOf(timeStamp + "000"));
        return timestamp;
    }

}
