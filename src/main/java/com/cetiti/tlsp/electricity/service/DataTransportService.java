package com.cetiti.tlsp.electricity.service;

import java.sql.SQLException;

import com.cetiti.tlsp.electricity.model.ElectricityDetail;

/**
 * 中恒--中电海康电力预警数据传输服务
 *
 * @author victorhznag
 */
public interface DataTransportService {

    /**
     * 保存信息
     *
     * @param electricityDetail 电力详情
     * @return 保存成功与否
     * @throws SQLException 抛出SQL异常信息
     */
    boolean insert(ElectricityDetail electricityDetail) throws SQLException;
}
