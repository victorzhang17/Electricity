package com.hik.tlsp.electricity.dao.impl;

import com.alibaba.druid.pool.DruidPooledConnection;
import com.hik.tlsp.electricity.util.JdbcPoolUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 基础DAO实现
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-8-1.
 */
public class BaseDaoImpl {

    protected PreparedStatement statement;
    protected ResultSet resultSet;
    protected DruidPooledConnection connection;

    protected JdbcPoolUtil jdbcPoolUtil = JdbcPoolUtil.getDruidPoolUtilInstance();

    protected void initJdbcConnectionForQuery(String strSql) throws SQLException {
        connection = jdbcPoolUtil.getConnection();
        statement = connection.prepareStatement(strSql);
        resultSet = statement.executeQuery();
    }
}
