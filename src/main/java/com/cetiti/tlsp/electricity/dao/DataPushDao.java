package com.cetiti.tlsp.electricity.dao;

import java.sql.SQLException;

/**
 * 数据推送DAO接口
 *
 * @author victorzhang
 */
public interface DataPushDao {
    /**
     * 从数据库中获取serialNum
     *
     * @return serialNum
     * @throws SQLException 抛出SQL异常信息
     */
    String getNewIssueSerialNumFromDB() throws SQLException;

    /**
     * 根据预警规则ID获得最新时间戳
     *
     * @param alarmRuleId 预警规则ID
     * @return 最新时间戳
     * @throws SQLException 抛出SQL异常信息
     */
    long getNewestTimeStampByAlarmRuleId(String alarmRuleId) throws SQLException;

    /**
     * 从数据库中获取当前日期事件
     *
     * @return 当前日期事件
     * @throws SQLException 抛出SQL异常信息
     */
    String getOccurDateFromDB() throws SQLException;
}
