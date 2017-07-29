package com.hik.tlsp.electricity.model;

import lombok.Data;

/**
 * 企业信息
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-28.
 */
@Data
public class Enterprise {
    private String enterpriseName;
    private String enterpriseAddress;
    private String legalPersonName;
    private String phone;
    private String lontitude;
    private String latititude;
}
