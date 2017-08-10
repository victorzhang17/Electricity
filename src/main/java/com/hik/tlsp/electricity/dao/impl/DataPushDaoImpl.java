package com.hik.tlsp.electricity.dao.impl;


import com.hik.tlsp.electricity.dao.DataPushDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;

/**
 * 数据推送DAO实现
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-8-1.
 */
public class DataPushDaoImpl extends BaseDaoImpl implements DataPushDao {
    private static final Logger logger = LoggerFactory.getLogger(DataPushDaoImpl.class);

    public String getNewIssueSerialNumFromDB() throws SQLException {
        String strSql = "SELECT NEW_ELEC_ISSUE_seq.Nextval FROM dual";
        long newIssueSerialNum = 0;

        try {
            initJdbcConnectionForQuery(strSql);
            while (resultSet.next()) {
                newIssueSerialNum = resultSet.getLong(1);
                logger.warn("{} --> {}", strSql, newIssueSerialNum);
            }
        } finally {
            jdbcPoolUtil.close(resultSet, statement, connection);

        }
        return "消" + newIssueSerialNum;
    }

    public long getNewestTimeStampByAlarmRuleId(String alarmRuleId) throws SQLException {
        String strSql = "SELECT ALARM_TIME_STAMP  FROM ZHONGHENG_ELECTRICITY_WARN WHERE ALARM_RULE_ID='" + alarmRuleId + "' ORDER BY ALARM_TIME_STAMP DESC";
        long timeStamp = 0;

        try {
            initJdbcConnectionForQuery(strSql);
            if (resultSet.next()) {
                timeStamp = resultSet.getLong("ALARM_TIME_STAMP");
            }
            logger.warn("查询预警规则ID为：{}的SQL语句：{}", alarmRuleId, strSql);

        } finally {
            jdbcPoolUtil.close(resultSet, statement, connection);
        }
        return timeStamp;
    }

    public String getOccurDateFromDB() throws SQLException {
        String strSql = "SELECT TO_CHAR(SYSDATE,'YYYY-MM-DD HH24:MI:SS') AS STR_SYSDATE  FROM DUAL";
        String strTimeStamp  = null;
        try {
            initJdbcConnectionForQuery(strSql);
            if (resultSet.next()) {
                strTimeStamp = resultSet.getString("STR_SYSDATE");
                logger.warn("{} --> {}", strSql, strTimeStamp);
            }
        } finally {
            jdbcPoolUtil.close(resultSet, statement, connection);
        }
        return strTimeStamp;
    }

}