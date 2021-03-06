package com.cetiti.tlsp.electricity.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cetiti.tlsp.electricity.dao.DataTransportDao;
import com.cetiti.tlsp.electricity.model.ElectricityDetail;
import com.cetiti.tlsp.electricity.util.CommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 数据传送DAO实现
 *
 * @author victorzhang
 */
public class DataTransportDaoImpl extends BaseDaoImpl implements DataTransportDao {
    private static final Logger logger = LoggerFactory.getLogger(DataTransportDaoImpl.class);

    private void operationElectricityDetail4statement(ElectricityDetail electricityDetail, PreparedStatement statement) throws SQLException {
        statement.setString(1, CommonUtil.createUUID());
        statement.setString(2, electricityDetail.getStationName());
        statement.setString(3, electricityDetail.getStationId());
        statement.setString(4, electricityDetail.getMonitoredObjectName());
        statement.setString(5, electricityDetail.getMonitoredObjectId());
        statement.setLong(6, electricityDetail.getTimeStamp());
        statement.setString(7, electricityDetail.getAlarmName());
        statement.setString(8, electricityDetail.getDesc());
        statement.setString(9, electricityDetail.getAlarmLevelCh());
        statement.setInt(10, electricityDetail.getAlarmLevel());
        statement.setString(11, electricityDetail.getDetailMetricItem());
        statement.setString(12, electricityDetail.getAlarmRuleId());
        statement.setString(13, electricityDetail.getStationAddress());
        statement.setString(14, electricityDetail.getContactPersonName());
        statement.setString(15, electricityDetail.getPhone());
        statement.setString(16, electricityDetail.getLontitude());
        statement.setString(17, electricityDetail.getLatititude());
        statement.setString(18, electricityDetail.getIssueSerialNum());
    }

    public int insert(ElectricityDetail electricityDetail) throws SQLException {
        int flag;
        try {
            connection = jdbcPoolUtil.getConnection();
            String strSql = "INSERT  INTO ZHONGHENG_ELECTRICITY_WARN VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            logger.warn(strSql);

            statement = connection.prepareStatement(strSql);
            operationElectricityDetail4statement(electricityDetail, statement);
            flag = statement.executeUpdate();
        } finally {
            jdbcPoolUtil.close(statement, connection);
        }
        return flag;
    }
}
