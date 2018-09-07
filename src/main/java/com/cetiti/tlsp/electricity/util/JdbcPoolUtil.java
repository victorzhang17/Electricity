package com.cetiti.tlsp.electricity.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.cetiti.tlsp.electricity.exception.ElectricityException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.cetiti.tlsp.electricity.util.ErrorCode.DATASOURCE_SETTING_ERROR;

/**
 * 使用Druid连接池Jdbc工具类
 *
 * @author victorzhang
 */
public class JdbcPoolUtil {
    private static final Logger logger = LoggerFactory.getLogger(JdbcPoolUtil.class);

    private static Properties properties = new Properties();
    private static DruidDataSource dataSource;
    private static final String JDBC_LOCATION = "/jdbcPool.properties";

    static {
        try {
            properties.load(JdbcPoolUtil.class.getResourceAsStream(JDBC_LOCATION));
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            logger.error("数据库连接池初始化配置错误，错误码：{}", DATASOURCE_SETTING_ERROR);
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
        logger.info("从数据源中成功获得SQL连接");
        return connection;
    }

    public void close(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
        logger.info("关闭连接");
    }

    public void close(PreparedStatement statement, Connection connection) throws SQLException {
        try {
            if (statement != null) {
                statement.close();
            }
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
