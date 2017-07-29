package com.hik.tlsp.electricity.service.impl;

import com.alibaba.druid.pool.DruidPooledConnection;
import com.hik.tlsp.electricity.exception.ElectricityException;
import com.hik.tlsp.electricity.model.ElectricityDetail;
import com.hik.tlsp.electricity.model.Enterprise;
import com.hik.tlsp.electricity.service.DataTransportService;
import com.hik.tlsp.electricity.util.CommonUtil;
import com.hik.tlsp.electricity.util.JdbcPoolUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 中恒--中电--天阙电力预警数据传输服务实现
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-29.
 */
public class DataTransportServiceImpl implements DataTransportService {

    /**
     * @param electricityDetail
     * @return 插入成功返回true，失败返回false
     */
    public int insert(ElectricityDetail electricityDetail) {
        JdbcPoolUtil jdbcPoolUtil = JdbcPoolUtil.getDruidPoolUtilInstance();
        DruidPooledConnection connection = jdbcPoolUtil.getConnection();
        PreparedStatement statement = null;
        int flag;

        try {
            connection.setAutoCommit(false);
            String sql = "INSERT  INTO ZHONGHENG_ELECTRICITY_WARN VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            statement = connection.prepareStatement(sql);
            operationElectricityDetail4statement(electricityDetail, statement);
            flag = statement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            jdbcPoolUtil.rollback(connection);
            throw new ElectricityException("数据库插入操作失败");
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
        statement.setLong(6, Long.parseLong(electricityDetail.getTimeStamp()));
        statement.setString(7, electricityDetail.getAlarmName());
        statement.setString(8, electricityDetail.getDesc());
        statement.setString(9, electricityDetail.getAlarmLevelCH());
        statement.setString(10, electricityDetail.getAlarmLevel());
        statement.setString(11, electricityDetail.getDetailMetricItem());
        statement.setString(12, electricityDetail.getAlarmRuleId());

        Enterprise enterprise = electricityDetail.getEnterprise();
        statement.setString(13, enterprise.getEnterpriseName());
        statement.setString(14, enterprise.getEnterpriseAddress());
        statement.setString(15, enterprise.getLegalPersonName());
        statement.setString(16, enterprise.getPhone());
        statement.setString(17, enterprise.getLontitude());
        statement.setString(18, enterprise.getLatititude());
    }
}