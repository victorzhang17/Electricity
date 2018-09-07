package com.cetiti.tlsp.electricity.service;

import java.sql.SQLException;

import com.cetiti.tlsp.electricity.model.ElectricityDetail;

/**
 * 中电海康--天阙推送预警信息服务接口
 *
 * @author victorzhang
 */
public interface DataPushService {
    /**
     * 推送信息
     *
     * @param electricityDetail 电力详情
     * @return 推送成功与否
     * @throws SQLException 抛出SQL异常信息
     */
    int push(ElectricityDetail electricityDetail) throws SQLException;

    /**
     * 获取时间serialNum
     *
     * @return 返回serialNum
     * @throws SQLException 抛出SQL异常信息
     */
    String getIssueSerialNum() throws SQLException;
}
