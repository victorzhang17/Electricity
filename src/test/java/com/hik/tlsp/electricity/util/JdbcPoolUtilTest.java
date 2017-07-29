package com.hik.tlsp.electricity.util;

import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcPoolUtilTest {

    @Test
    public void testJdbcPoolConnection() throws SQLException {
        String sql = "select * from ZHONGHENG_ELECTRICITY_WARN";
        JdbcPoolUtil jdbcUtil = JdbcPoolUtil.getDruidPoolUtilInstance();
        Connection connection = jdbcUtil.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.executeQuery();
        jdbcUtil.close(statement, connection);
    }

    @Test
    public void testLoadProperties() throws IOException {
        Properties properties = new Properties();
        properties.load(JdbcPoolUtilTest.class.getResourceAsStream("/jdbcPoolTest.properties"));
        System.out.println("success");
    }

}
