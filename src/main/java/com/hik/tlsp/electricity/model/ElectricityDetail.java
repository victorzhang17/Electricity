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
    private String timeStamp;
    private String alarmName;
    private String desc;
    private String alarmLevelCH;
    private String alarmLevel;
    private String detailMetricItem;
    private String alarmRuleId;
    private Enterprise enterprise;
}
