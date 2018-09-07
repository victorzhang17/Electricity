package com.cetiti.tlsp.electricity.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.alibaba.druid.pool.DruidPooledConnection;
import com.cetiti.tlsp.electricity.util.JdbcPoolUtil;

/**
 * 基础DAO实现
 * @author victorzhang
 */
public class BaseDaoImpl {

    protected PreparedStatement statement;
    protected ResultSet resultSet;
    protected DruidPooledConnection connection;

    protected static JdbcPoolUtil jdbcPoolUtil = JdbcPoolUtil.getDruidPoolUtilInstance();

    protected void initJdbcConnectionForQuery(String strSql) throws SQLException {
        connection = jdbcPoolUtil.getConnection();
        statement = connection.prepareStatement(strSql);
        resultSet = statement.executeQuery();
    }
}
