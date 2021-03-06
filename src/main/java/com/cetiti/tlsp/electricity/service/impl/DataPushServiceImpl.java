package com.cetiti.tlsp.electricity.service.impl;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

import com.cetiti.tlsp.electricity.dao.DataPushDao;
import com.cetiti.tlsp.electricity.dao.impl.DataPushDaoImpl;
import com.cetiti.tlsp.electricity.exception.ElectricityException;
import com.cetiti.tlsp.electricity.model.ElectricityDetail;
import com.cetiti.tlsp.electricity.service.DataPushService;
import com.cetiti.tlsp.electricity.util.CommonUtil;
import com.cetiti.tlsp.electricity.util.ConstantUtil;
import com.cetiti.tlsp.electricity.util.ErrorCode;
import com.cetiti.tlsp.electricity.util.XmlUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 中电海康--天阙推送预警信息服务实现
 *
 * @author victorzhang
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
        String alarmRuleId = electricityDetail.getAlarmRuleId();
        if (isAlarmWithinOneDay(alarmRuleId, electricityDetail.getTimeStamp())) {
            logger.warn("预警规则ID为{}距离上一次推送时间在24小时内，不予推送");
            return ErrorCode.REPEAT_ALARM_INFORMATION;
        }

        String result = issueBase.addIssuesNew(xmlUtil.getArgXml());
        logger.warn("大联动推送信息：{}", xmlUtil.getArgXml());
        logger.info("推送结束，result:" + result);
        return ErrorCode.TRANSPORT_AND_PUSH_DATA_SUCCESS;
    }

    private boolean isAlarmWithinOneDay(String alarmRuleId, long timeStamp) throws SQLException {
        long newestAlarmTimeStampInDB = dataPushDao.getNewestTimeStampByAlarmRuleId(alarmRuleId);

        //数据库中不存在alarmRuleId,进行推送
        if (newestAlarmTimeStampInDB == 0) {
            return false;
        }
        Date alarmDateInDB = CommonUtil.getTimeStampObject(newestAlarmTimeStampInDB);
        Date nowDate = CommonUtil.getTimeStampObject(timeStamp);

        Calendar alarmCalendar = Calendar.getInstance();
        alarmCalendar.setTime(alarmDateInDB);
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
            throw new ElectricityException("天阙wsdl地址解析错误", ErrorCode.TIANQUE_WSDL_DECODER_FAIL);
        }
        return flag;
    }

    private XmlUtil createXmlSource(ElectricityDetail electricityDetail) throws SQLException {
        XmlUtil xmlUtil = new XmlUtil();
        xmlUtil.initSendInfo();
        xmlUtil.addArg("subject", "中恒中电海康预警数据对接");
        xmlUtil.addArg("dePartmentNo", "330122003004");
        xmlUtil.addArg("lon", electricityDetail.getLontitude());
        xmlUtil.addArg("lat", electricityDetail.getLatititude());
        xmlUtil.addArg("occurDate", dataPushDao.getOccurDateFromDB());
        xmlUtil.addArg("issueBigTypeName", "政法");
        xmlUtil.addArg("issueSmallTypeName", "消防安全");
        xmlUtil.addArg("sourcePerson", electricityDetail.getContactPersonName());
        xmlUtil.addArg("sourceMobile", electricityDetail.getPhone());
        xmlUtil.addArg("issueContent", constructIssueContent(electricityDetail));
//        xmlUtil.addArg("recordingUrl", "");
        xmlUtil.addArg("serialNumber", electricityDetail.getIssueSerialNum());
        return xmlUtil;
    }

    public String getIssueSerialNum() throws SQLException {
        return dataPushDao.getNewIssueSerialNumFromDB();
    }

    private String constructIssueContent(ElectricityDetail electricityDetail) {
        StringBuffer buffer = new StringBuffer();

        buffer.append(ConstantUtil.STATION_NAME);
        buffer.append(electricityDetail.getStationName());
        buffer.append("；");
        buffer.append(ConstantUtil.MONITORED_OBJECT_NAME);
        buffer.append(electricityDetail.getMonitoredObjectName());
        buffer.append("；");
        buffer.append(ConstantUtil.ALARM_NAME);
        buffer.append(electricityDetail.getAlarmName());
        buffer.append("；");
        buffer.append(ConstantUtil.DESC);
        buffer.append(electricityDetail.getDesc());
        buffer.append("；");
        buffer.append(ConstantUtil.DETAIL_METRIC_ITEM);
        buffer.append(electricityDetail.getDetailMetricItem());
        buffer.append("；");
        buffer.append(ConstantUtil.STATION_ADDRESS);
        buffer.append(electricityDetail.getStationAddress());

        return buffer.toString();
    }
}
