package com.hik.tlsp.electricity.dao;

import com.hik.tlsp.electricity.model.ElectricityDetail;

import java.sql.SQLException;

/**
 * 数据传送DAO接口
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-8-1.
 */
public interface DataTransportDao {
    int insert(ElectricityDetail electricityDetail) throws SQLException;
}
