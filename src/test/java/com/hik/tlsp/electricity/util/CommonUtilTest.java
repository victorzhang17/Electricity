package com.hik.tlsp.electricity.util;

import org.junit.Test;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class CommonUtilTest {

    @Test
    public void testCreateUUID() {
        System.out.println(CommonUtil.createUUID());
    }

    @Test
    public void testSysDate() {
        System.out.println(new Date());
    }

    @Test
    public void testCalendar() {
        System.out.println(Calendar.getInstance().get(Calendar.DATE));
    }

    @Test
    public void testTimeStamp() throws ParseException {
        Timestamp timestamp = new Timestamp(Long.valueOf(1470278082+"000"));
        System.out.println(timestamp);
    }

    @Test
    public void testDate() throws SQLException {
//        DataPushDao dataPushDao = new DataPushDaoImpl();
//        System.out.println(dataPushDao.getTimeStampByAlarmRuleId("12"));
    }

    @Test
    public void testSqlExceptionErrorCode(){
        SQLException sqlException = new SQLException();
        System.out.println(sqlException.getErrorCode());
    }

    @Test
    public void testGetTimeStamp(){
        System.out.println(System.currentTimeMillis());
    }
}
