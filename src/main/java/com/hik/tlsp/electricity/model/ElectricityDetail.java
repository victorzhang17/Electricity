package com.hik.tlsp.electricity.model;

import lombok.Data;

/**
 * 中恒预警信息模型
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-28.
 */
@Data
public class ElectricityDetail {
    private String id;
    private String stationName;
    private String stationId;
    private String monitoredObjectName;
    private String monitoredObjectId;
    private long timeStamp;
    private String alarmName;
    private String desc;
    private String alarmLevelCh;
    private int alarmLevel;
    private String detailMetricItem;
    private String alarmRuleId;
    private String stationAddress;
    private String contactPersonName;
    private String phone;
    private String lontitude;
    private String latititude;

    //中电海康上传至大联动必须字段，存储到中电海康数据库
    private String issueSerialNum;
}
