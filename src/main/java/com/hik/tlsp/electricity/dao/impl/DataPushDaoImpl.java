package com.hik.tlsp.electricity.dao.impl;


import com.hik.tlsp.electricity.dao.DataPushDao;

import java.sql.SQLException;
import java.sql.Timestamp;

/**
 * 数据推送DAO实现
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-8-1.
 */
public class DataPushDaoImpl extends BaseDaoImpl implements DataPushDao {

    public String getNewIssueSerialNumFromDB() throws SQLException {
        String strSql = "SELECT NEW_ELEC_ISSUE_seq.Nextval FROM dual";
        long newIssueSerialNum = 0;

        try {
            initJdbcConnectionForQuery(strSql);
            while (resultSet.next()) {
                newIssueSerialNum = resultSet.getLong(1);
            }
        } finally {
            jdbcPoolUtil.close(resultSet, statement, connection);

        }
        return "消" + newIssueSerialNum;
    }

    public long getTimeStampByAlarmRuleId(String alarmRuleId) throws SQLException {
        String strSql = "SELECT *  FROM ZHONGHENG_ELECTRICITY_WARN WHERE ALARM_RULE_ID=" + alarmRuleId;
        long timeStamp = 0;

        try {
            initJdbcConnectionForQuery(strSql);
            if (resultSet.next()) {
                timeStamp = resultSet.getLong("ALARM_TIME_STAMP");
            }

        } finally {
            jdbcPoolUtil.close(resultSet, statement, connection);
        }
        return timeStamp;
    }

    public String getOccurDateFromDB() throws SQLException {
        String strSql = "SELECT sysdate  FROM dual";
        Timestamp timeStamp = null;
        try {
            initJdbcConnectionForQuery(strSql);
            if (resultSet.next()) {
                timeStamp = resultSet.getTimestamp("SYSDATE");
            }
        } finally {
            jdbcPoolUtil.close(resultSet, statement, connection);
        }
        return timeStamp.toString();
    }

}