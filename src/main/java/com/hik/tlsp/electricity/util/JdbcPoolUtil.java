package com.hik.tlsp.electricity.util;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.hik.tlsp.electricity.exception.ElectricityException;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 使用Druid连接池Jdbc工具类
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-29.
 */
public class JdbcPoolUtil {

    public static InternalLogger logger = InternalLoggerFactory.getInstance(JdbcPoolUtil.class);
    private static Properties properties = new Properties();
    private static DruidDataSource dataSource = null;
    private static final String JDBC_LOCATION = "/jdbcPool.properties";

    static {
        try {
            properties.load(JdbcPoolUtil.class.getResourceAsStream(JDBC_LOCATION));
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("JdbcPoolUtil can not find jdbcPool.properties");
            throw new ElectricityException("数据库连接池初始化错误");
        }
    }

    private JdbcPoolUtil() {
    }

    private static class JdbcPoolUtilHolder {
        private static JdbcPoolUtil instance = new JdbcPoolUtil();
    }

    public static JdbcPoolUtil getDruidPoolUtilInstance() {
        return JdbcPoolUtilHolder.instance;
    }

    public DruidPooledConnection getConnection() {
        DruidPooledConnection connection;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            logger.error("Datasource can not get connection");
            throw new ElectricityException("数据库连接失败");
        }
        logger.info("DataSource get connection successful");
        return connection;
    }

    public void close(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            logger.error("DataBase connection can not close");
            throw new ElectricityException("数据库连接没有成功关闭");
        }
        logger.info("DataBase connection closed success");
    }

    public void close(PreparedStatement statement, Connection connection) {
        try {
            if (statement != null)
                statement.close();
        } catch (SQLException e) {
            logger.error("PreparedStatement can not close");
            throw new ElectricityException("数据库查询没有成功关闭");
        } finally {
            close(connection);
        }
    }

    public void close(ResultSet resultSet, PreparedStatement statement, Connection connection) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            logger.error("ResultSet can not close");
            throw new ElectricityException("数据库结果集没有成功关闭");
        } finally {
            close(statement, connection);
        }
    }

    public void rollback(Connection connection){
        try {
            connection.rollback();
        } catch (SQLException e) {
            logger.info("database rollback");
        }
    }
}
