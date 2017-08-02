package com.hik.tlsp.electricity.service;

import com.hik.tlsp.electricity.model.ElectricityDetail;

import java.sql.SQLException;

/**
 * 中恒--中电海康电力预警数据传输服务
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-29.
 */
public interface DataTransportService {

    boolean insert(ElectricityDetail electricityDetail) throws SQLException;
}
