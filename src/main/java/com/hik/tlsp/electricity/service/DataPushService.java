package com.hik.tlsp.electricity.service;

import com.hik.tlsp.electricity.model.ElectricityDetail;

import java.sql.SQLException;

/**
 * 中电海康--天阙推送预警信息服务接口
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-29.
 */
public interface DataPushService {
    int push(ElectricityDetail electricityDetail) throws SQLException;
}
