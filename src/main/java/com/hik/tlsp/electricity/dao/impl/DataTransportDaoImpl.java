package com.hik.tlsp.electricity.dao.impl;

import com.hik.tlsp.electricity.dao.DataTransportDao;
import com.hik.tlsp.electricity.model.ElectricityDetail;
import com.hik.tlsp.electricity.util.CommonUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 数据传送DAO实现
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-8-1.
 */
public class DataTransportDaoImpl extends BaseDaoImpl implements DataTransportDao {

    @Override
    public int insert(ElectricityDetail electricityDetail) throws SQLException {
        int flag;
        try {
            connection = jdbcPoolUtil.getConnection();
            String strSql = "INSERT  INTO ZHONGHENG_ELECTRICITY_WARN VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            statement = connection.prepareStatement(strSql);
            operationElectricityDetail4statement(electricityDetail, statement);
            flag = statement.executeUpdate();
        } finally {
            jdbcPoolUtil.close(statement, connection);
        }
        return flag;
    }

    private void operationElectricityDetail4statement(ElectricityDetail electricityDetail, PreparedStatement statement) throws SQLException {
        statement.setString(1, CommonUtil.createUUID());
        statement.setString(2, electricityDetail.getStationName());
        statement.setString(3, electricityDetail.getStationId());
        statement.setString(4, electricityDetail.getMonitoredObjectName());
        statement.setString(5, electricityDetail.getMonitoredObjectId());
        statement.setLong(6, electricityDetail.getTimeStamp());
        statement.setString(7, electricityDetail.getAlarmName());
        statement.setString(8, electricityDetail.getDesc());
        statement.setInt(9, electricityDetail.getAlarmLevelCh());
        statement.setString(10, electricityDetail.getAlarmLevel());
        statement.setString(11, electricityDetail.getDetailMetricItem());
        statement.setString(12, electricityDetail.getAlarmRuleId());
        statement.setString(13, electricityDetail.getStationAddress());
        statement.setString(14, electricityDetail.getContactPersonName());
        statement.setString(15, electricityDetail.getPhone());
        statement.setString(16, electricityDetail.getLontitude());
        statement.setString(17, electricityDetail.getLatititude());
    }
}
