package com.hik.tlsp.electricity.service.impl;

import com.hik.tlsp.electricity.dao.DataPushDao;
import com.hik.tlsp.electricity.dao.impl.DataPushDaoImpl;
import com.hik.tlsp.electricity.exception.ElectricityException;
import com.hik.tlsp.electricity.model.ElectricityDetail;
import com.hik.tlsp.electricity.service.DataPushService;
import com.hik.tlsp.electricity.util.CommonUtil;
import com.hik.tlsp.electricity.util.XmlUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

import static com.hik.tlsp.electricity.util.ErrorCode.*;

/**
 * 中电海康--天阙推送预警信息服务实现
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-29.
 */
public class DataPushServiceImpl implements DataPushService {
    private static final Logger logger = LoggerFactory.getLogger(DataPushServiceImpl.class);
    private static final String ISSUE_URL = "http://115.236.101.205:8011/webService/wbsIssue?wsdl";
    private IssueBase issueBase = null;

    private DataPushDao dataPushDao;

    public DataPushServiceImpl() {
        dataPushDao = new DataPushDaoImpl();
    }

    public int push(ElectricityDetail electricityDetail) throws SQLException {
        logger.info("大联动开始推送");
        getPushServerConnection();
        XmlUtil xmlUtil = createXmlSource(electricityDetail);
        if (isAlarmWithinOneDay(electricityDetail.getAlarmRuleId())) {
            return REPEAT_ALARM_INFORMATION;
        }

        String result = issueBase.addIssuesNew(xmlUtil.getArgXml());
        logger.warn("大联动推送信息：{}", xmlUtil.getArgXml());
        logger.info("推送结束，result:" + result);
        return TRANSPORT_AND_PUSH_DATA_SUCCESS;
    }

    private boolean isAlarmWithinOneDay(String alarmRuleId) throws SQLException {
        long alarmTimeStamp = dataPushDao.getTimeStampByAlarmRuleId(alarmRuleId);

        //数据库中不存在alarmRuleId,进行推送
        if (alarmTimeStamp == 0) {
            return false;
        }
        Date alarmDate = CommonUtil.getTimeStampObject(alarmTimeStamp);
        Date nowDate = CommonUtil.getTimeStampObject(dataPushDao.getOccurDateFromDB());

        Calendar alarmCalendar = Calendar.getInstance();
        alarmCalendar.setTime(alarmDate);
        Calendar nowCalendar = Calendar.getInstance();
        nowCalendar.setTime(nowDate);

        boolean isSameYear = (alarmCalendar.get(Calendar.YEAR) == nowCalendar.get(Calendar.YEAR));
        boolean isSameMonth = (alarmCalendar.get(Calendar.MONTH) == nowCalendar.get(Calendar.MONTH));
        boolean isSameDayOfMonth = (alarmCalendar.get(Calendar.DAY_OF_MONTH) == nowCalendar.get(Calendar.DAY_OF_MONTH));

        return isSameYear && isSameMonth && isSameDayOfMonth;
    }

    private void getPushServerConnection() {
        if (issueBase != null) {
            return;
        }

        if (!isIssueUrlValidate()) {
            logger.error("大联动URL：{}不可用", ISSUE_URL);
        } else {
            logger.info("大联动URL：{}正常连接，获取大连接开始", ISSUE_URL);
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
        xmlUtil.addArg("lon", electricityDetail.getLontitude());
        xmlUtil.addArg("lat", electricityDetail.getLatititude());
        xmlUtil.addArg("occurDate", dataPushDao.getOccurDateFromDB());
        xmlUtil.addArg("issueBigTypeName", "政法");
        xmlUtil.addArg("issueSmallTypeName", "消防安全");
        xmlUtil.addArg("sourcePerson", electricityDetail.getContactPersonName());
        xmlUtil.addArg("sourceMobile", electricityDetail.getPhone());
        xmlUtil.addArg("issueContent", constructIssueContent(electricityDetail));
        xmlUtil.addArg("recordingUrl", "");
        xmlUtil.addArg("serialNumber", getIssueSerialNum());
        return xmlUtil;
    }

    public String getIssueSerialNum() throws SQLException {
        return dataPushDao.getNewIssueSerialNumFromDB();
    }

    //TODO 研究更加健壮的写法
    private String constructIssueContent(ElectricityDetail electricityDetail) {
        StringBuffer buffer = new StringBuffer();

        buffer.append("站点名称：");
        buffer.append(electricityDetail.getStationName());
        buffer.append(",站点ID：");
        buffer.append(electricityDetail.getStationId());
        buffer.append(",被监控设备名称：");
        buffer.append(electricityDetail.getMonitoredObjectName());
        buffer.append(",被监控设备ID：");
        buffer.append(electricityDetail.getMonitoredObjectId());
        buffer.append(",告警规则类型名称：");
        buffer.append(electricityDetail.getAlarmName());
        buffer.append(",告警规则类型描述：");
        buffer.append(electricityDetail.getDesc());
        buffer.append(",告警级别文本描述：");
        buffer.append(electricityDetail.getAlarmLevelCh());
        buffer.append(",告警级别：");
        buffer.append(electricityDetail.getAlarmLevel());
        buffer.append(",告警情况：");
        buffer.append(electricityDetail.getDetailMetricItem());
        buffer.append(",告警规则ID：");
        buffer.append(electricityDetail.getAlarmRuleId());
        buffer.append(",站点地址：");
        buffer.append(electricityDetail.getStationAddress());

        return buffer.toString();
    }
}
