package com.hik.tlsp.electricity.dao.impl;


import com.alibaba.druid.pool.DruidPooledConnection;
import com.hik.tlsp.electricity.dao.DataPushDao;
import com.hik.tlsp.electricity.util.JdbcPoolUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 * 数据推送DAO
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-8-1.
 */
public class DataPushDaoImpl implements DataPushDao {

    public PreparedStatement statement;
    public ResultSet resultSet;
    public DruidPooledConnection connection;

    private JdbcPoolUtil jdbcPoolUtil = JdbcPoolUtil.getDruidPoolUtilInstance();

    public void initJdbcConnectionForQuery(String strSql) throws SQLException {
        connection = jdbcPoolUtil.getConnection();
        statement = connection.prepareStatement(strSql);
        resultSet = statement.executeQuery();
    }

    public String getNewIssueSerialNumFromDB() throws SQLException {
        String strSql = "SELECT NEW_ELEC_ISSUE_seq.Nextval FROM dual";
        initJdbcConnectionForQuery(strSql);

        long newIssueSerialNum = 0;
        while (resultSet.next()) {
            newIssueSerialNum = resultSet.getLong(1);
        }

        jdbcPoolUtil.close(resultSet, statement, connection);
        return "消" + newIssueSerialNum;
    }

    public long getTimeStampByAlarmRuleId(String alarmRuleId) throws SQLException {
        String strSql = "SELECT *  FROM ZHONGHENG_ELECTRICITY_WARN WHERE ALARM_RULE_ID=" + alarmRuleId;

        initJdbcConnectionForQuery(strSql);
        long timeStamp = 0;
        if (resultSet.next()) {
            timeStamp = resultSet.getLong("ALARM_TIME_STAMP");
        }
        jdbcPoolUtil.close(resultSet, statement, connection);
        return timeStamp;
    }

    public String getOccurDateFromDB() throws SQLException {
        String strSql = "SELECT sysdate  FROM dual";
        initJdbcConnectionForQuery(strSql);

        Timestamp timeStamp = null;
        if (resultSet.next()) {
            timeStamp = resultSet.getTimestamp("SYSDATE");
        }
        jdbcPoolUtil.close(resultSet, statement, connection);
        return timeStamp.toString();
    }

}
