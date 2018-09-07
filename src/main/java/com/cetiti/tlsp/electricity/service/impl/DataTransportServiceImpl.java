package com.cetiti.tlsp.electricity.service.impl;

import java.sql.SQLException;

import com.cetiti.tlsp.electricity.dao.DataTransportDao;
import com.cetiti.tlsp.electricity.dao.impl.DataTransportDaoImpl;
import com.cetiti.tlsp.electricity.model.ElectricityDetail;
import com.cetiti.tlsp.electricity.service.DataTransportService;

/**
 * 中恒--中电--天阙电力预警数据传输服务实现
 * @author victorzhang
 */
public class DataTransportServiceImpl implements DataTransportService {

    private DataTransportDao dataTransportDao;

    public DataTransportServiceImpl() {
        dataTransportDao = new DataTransportDaoImpl();
    }

    public boolean insert(ElectricityDetail electricityDetail) throws SQLException {
        int i = dataTransportDao.insert(electricityDetail);
        if (i > 0) {
            return true;
        }
        return false;
    }


}