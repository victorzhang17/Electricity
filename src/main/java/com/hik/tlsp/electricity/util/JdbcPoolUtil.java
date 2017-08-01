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

import static com.hik.tlsp.electricity.util.ErrorCode.DATASOURCE_SETTING_ERROR;

/**
 * 使用Druid连接池Jdbc工具类
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-29.
 */
public class JdbcPoolUtil {
    private static InternalLogger logger = InternalLoggerFactory.getInstance(JdbcPoolUtil.class);

    private static Properties properties = new Properties();
    private static DruidDataSource dataSource = null;
    private static final String JDBC_LOCATION = "/jdbcPool.properties";

    static {
        try {
            properties.load(JdbcPoolUtil.class.getResourceAsStream(JDBC_LOCATION));
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            throw new ElectricityException("数据库连接池初始化配置错误", DATASOURCE_SETTING_ERROR);
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

    public DruidPooledConnection getConnection() throws SQLException {
        DruidPooledConnection connection = dataSource.getConnection();
        logger.info("数据源成功获得连接");
        return connection;
    }

    public void close(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
        logger.info("数据库连接成功关闭");
    }

    public void close(PreparedStatement statement, Connection connection) throws SQLException {
        try {
            if (statement != null)
                statement.close();
        } finally {
            close(connection);
        }
    }

    public void close(ResultSet resultSet, PreparedStatement statement, Connection connection) throws SQLException {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } finally {
            close(statement, connection);
        }
    }
}
