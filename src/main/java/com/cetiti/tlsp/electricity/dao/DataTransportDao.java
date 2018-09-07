package com.cetiti.tlsp.electricity.dao;

import java.sql.SQLException;

import com.cetiti.tlsp.electricity.model.ElectricityDetail;

/**
 * 数据传送DAO接口
 *
 * @author victorzhang
 */
public interface DataTransportDao {

    /**
     * 保存电力信息
     *
     * @param electricityDetail 电力信息详情
     * @return 保存成功与否
     * @throws SQLException 抛出SQL异常信息
     */
    int insert(ElectricityDetail electricityDetail) throws SQLException;
}
