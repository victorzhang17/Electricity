package com.hik.tlsp.electricity.service;

import com.hik.tlsp.electricity.model.ElectricityDetail;

/**
 * 中恒--中电--天阙电力预警数据传输服务
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-29.
 */
public interface DataTransportService {

    int insert(ElectricityDetail electricityDetail);

}
