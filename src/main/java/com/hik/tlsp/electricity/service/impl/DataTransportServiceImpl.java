package com.hik.tlsp.electricity.service.impl;

import com.hik.tlsp.electricity.dao.DataTransportDao;
import com.hik.tlsp.electricity.dao.impl.DataTransportDaoImpl;
import com.hik.tlsp.electricity.model.ElectricityDetail;
import com.hik.tlsp.electricity.service.DataTransportService;

import java.sql.SQLException;

/**
 * 中恒--中电--天阙电力预警数据传输服务实现
 * Created by zhangwei(zhangwei@cetiti.com) on 2017-7-29.
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