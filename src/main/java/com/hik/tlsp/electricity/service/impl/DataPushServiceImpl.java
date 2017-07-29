package com.hik.tlsp.electricity.service.impl;

import com.hik.tlsp.electricity.model.ElectricityDetail;
import com.hik.tlsp.electricity.service.DataPushService;
import com.hik.tlsp.electricity.util.CommonUtil;
import com.hik.tlsp.electricity.util.XmlUtil;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;

/**
 * 中电海康--天阙推送预警信息服务实现
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-29.
 */
public class DataPushServiceImpl implements DataPushService {
    private static InternalLogger logger = InternalLoggerFactory.getInstance(DataPushServiceImpl.class);

    private IssueBase issueBase = null;

    public void push(ElectricityDetail electricityDetail) {
        logger.info("开始推送");

        getPushServerConnection();
        XmlUtil xmlUtil = createXmlSource(electricityDetail);
        String result = issueBase.addIssuesNew(xmlUtil.getArgXml());

        logger.info("推送结束，result:"+result);
    }

    private void getPushServerConnection(){
        if (issueBase!=null){
            return;
        }

        if (!CommonUtil.isIssueUrlValidate()){
            logger.error("大联动URL不可用");
        }else{
            logger.info("大联动URL正常连接，获取大连接开始");
            issueBase = new IssueBase();
            logger.info("获取大联动结束");
        }
    }

    private XmlUtil createXmlSource(ElectricityDetail electricityDetail){
        XmlUtil xmlUtil = new XmlUtil();
        StringBuffer buffer = new StringBuffer();

        xmlUtil.initSendInfo();
        xmlUtil.addArg("subject", "海康对接");
        xmlUtil.addArg("dePartmentNo", "330122003004");
        xmlUtil.addArg("lon", "" + electricityDetail.getEnterprise().getLontitude());
        xmlUtil.addArg("lat", "" + electricityDetail.getEnterprise().getLatititude());
        xmlUtil.addArg("occurDate", CommonUtil.getDateTime());
        xmlUtil.addArg("issueBigTypeName", "政法");
        xmlUtil.addArg("issueSmallTypeName", "消防安全");
        //TODO 构建预警详细信息
        xmlUtil.addArg("sourcePerson", buffer.toString());
        xmlUtil.addArg("sourceMobile", "");
        xmlUtil.addArg("issueContent", "用电安全预警989989989");
        xmlUtil.addArg("recordingUrl", "");
        xmlUtil.addArg("serialNumber", "消"+CommonUtil.createUUID());
        return xmlUtil;
    }

}
