package com.hik.tlsp.electricity.dao;

import java.sql.SQLException;

/**
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-8-1.
 */
public interface DataPushDao {
    String getNewIssueSerialNumFromDB() throws SQLException;

    long getTimeStampByAlarmRuleId(String alarmRuleId) throws SQLException;

    String getOccurDateFromDB() throws SQLException;
}