package com.hik.tlsp.electricity.util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 工具类
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-29.
 */
public class CommonUtil {

    private static final String ISSUE_URL = "http://60.191.18.40:9010/webService/wbsIssue?wsdl";
    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static String createUUID() {
        String randomUUID = UUID.randomUUID().toString();
        return randomUUID.toUpperCase().replace("-", "");
    }

    public static boolean isIssueUrlValidate() {
        boolean flag = false;

        try {
            URL url = new URL(ISSUE_URL);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setConnectTimeout(5000);
            urlConnection.setReadTimeout(5000);
            if (urlConnection.getResponseCode() == 200) {
                flag = true;
            }
        } catch (IOException e) {
            flag = false;
        }

        return flag;
    }

    public static String getDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        return dateFormat.format(new Date());
    }

}
