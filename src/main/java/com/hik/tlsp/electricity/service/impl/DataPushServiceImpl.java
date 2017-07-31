package com.hik.tlsp.electricity.service.impl;

import com.alibaba.druid.pool.DruidPooledConnection;
import com.hik.tlsp.electricity.exception.ElectricityException;
import com.hik.tlsp.electricity.model.ElectricityDetail;
import com.hik.tlsp.electricity.service.DataPushService;
import com.hik.tlsp.electricity.util.CommonUtil;
import com.hik.tlsp.electricity.util.JdbcPoolUtil;
import com.hik.tlsp.electricity.util.XmlUtil;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.hik.tlsp.electricity.util.ErrorCode.ALARM_LEVEL_OUT_OF_INDEX;
import static com.hik.tlsp.electricity.util.ErrorCode.TIANQUE_WSDL_DECODER_FAIL;

/**
 * 中电海康--天阙推送预警信息服务实现
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-29.
 */
public class DataPushServiceImpl implements DataPushService {
    private static InternalLogger logger = InternalLoggerFactory.getInstance(DataPushServiceImpl.class);

    private static final String ALARM_LEVEL_LOW = "告警";
    private static final String ALARM_LEVEL_MEDIUM = "一般";
    private static final String ALARM_LEVEL_HIGH = "严重";

    private static final String ISSUE_URL = "http://60.191.18.40:9010/webService/wbsIssue?wsdl";

    private IssueBase issueBase = null;

    public void push(ElectricityDetail electricityDetail) throws SQLException {
        logger.info("开始推送");
        getPushServerConnection();
        XmlUtil xmlUtil = createXmlSource(electricityDetail);

        //TODO 服务单号处理

        //TODO 如果24小时重复推送信息不予处理，alarmRuleId+timeStamp进行判断

        String result = issueBase.addIssuesNew(xmlUtil.getArgXml());
        logger.info("推送结束，result:" + result);
    }

    private void getPushServerConnection() {
        if (issueBase != null) {
            return;
        }

        if (!isIssueUrlValidate()) {
            logger.error("大联动URL不可用");
        } else {
            logger.info("大联动URL正常连接，获取大连接开始");
            issueBase = new IssueBase();
            logger.info("获取大联动结束");
        }
    }

    private boolean isIssueUrlValidate() {
        boolean flag = false;
        try {
            URL url = new URL(ISSUE_URL);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setConnectTimeout(5000);
            urlConnection.setReadTimeout(5000);
            if (urlConnection.getResponseCode() == 200) {
                flag = true;
            }
        } catch (IOException e) {
            throw new ElectricityException("天阙wsdl地址解析错误", TIANQUE_WSDL_DECODER_FAIL);
        }
        return flag;
    }

    private XmlUtil createXmlSource(ElectricityDetail electricityDetail) throws SQLException {
        XmlUtil xmlUtil = new XmlUtil();

        xmlUtil.initSendInfo();
        xmlUtil.addArg("subject", "中恒--中电海康预警数据对接");
        xmlUtil.addArg("dePartmentNo", "330122003004");
        xmlUtil.addArg("lon", "" + electricityDetail.getLontitude());
        xmlUtil.addArg("lat", "" + electricityDetail.getLatititude());
        xmlUtil.addArg("occurDate", CommonUtil.getDateTime());
        xmlUtil.addArg("issueBigTypeName", "政法");
        xmlUtil.addArg("issueSmallTypeName", "消防安全");
        xmlUtil.addArg("sourcePerson", electricityDetail.getContactPersonName());
        xmlUtil.addArg("sourceMobile", electricityDetail.getPhone());
        //TODO 构建预警详细信息

        xmlUtil.addArg("issueContent", constructIssueContent(electricityDetail));
        xmlUtil.addArg("recordingUrl", "");
        xmlUtil.addArg("serialNumber", getNewIssueSerialNum());
        return xmlUtil;
    }

    private String constructIssueContent(ElectricityDetail electricityDetail) {
        StringBuffer buffer = new StringBuffer();

        buffer.append("站点名称：");
        buffer.append(electricityDetail.getStationName());
        buffer.append("站点ID：");
        buffer.append(electricityDetail.getStationId());
        buffer.append("被监控设备名称：");
        buffer.append(electricityDetail.getMonitoredObjectName());
        buffer.append("被监控设备ID：");
        buffer.append(electricityDetail.getMonitoredObjectId());
        buffer.append("告警规则类型名称：");
        buffer.append("告警规则类型描述：");
        buffer.append("告警级别文本描述：");
        buffer.append("告警规则ID：");
        buffer.append("企业名称：");
        buffer.append("企业地址：");

        return buffer.toString();
    }

    private String getAlarmLevelString(int alarmLevel) {
        if (alarmLevel == 1) {
            return ALARM_LEVEL_LOW;
        } else if (alarmLevel == 2) {
            return ALARM_LEVEL_MEDIUM;
        } else if (alarmLevel == 3) {
            return ALARM_LEVEL_HIGH;
        } else {
            throw new ElectricityException("注意：告警级别参数为1，2，3",ALARM_LEVEL_OUT_OF_INDEX);
        }

    }

    private String getNewIssueSerialNum() throws SQLException {
        String strSql = "SELECT NEW_ELEC_ISSUE_seq.Nextval FROM dual";

        JdbcPoolUtil jdbcPoolUtil = JdbcPoolUtil.getDruidPoolUtilInstance();
        DruidPooledConnection connection = jdbcPoolUtil.getConnection();
        PreparedStatement statement = connection.prepareStatement(strSql);;
        ResultSet resultSet = statement.executeQuery();
        long newIssueSerialNum = 0;

        while (resultSet.next()) {
            newIssueSerialNum = resultSet.getLong(1);
        }

        jdbcPoolUtil.close(resultSet, statement, connection);
        return "消" + newIssueSerialNum;
    }

}
