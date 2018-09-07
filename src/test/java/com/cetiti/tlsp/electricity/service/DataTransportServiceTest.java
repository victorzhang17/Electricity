package com.cetiti.tlsp.electricity.service;

import com.cetiti.tlsp.electricity.service.impl.DataTransportServiceImpl;
import org.junit.Test;

public class DataTransportServiceTest {

    @Test
    public void testInsert() {

        String sql = "insert into ZHONGHENG_ELECTRICITY_WARN values (3,'浙江博风创意大厦配-3','assetaccount/t_powerclient:1479279636816','T1-总柜','assetaccount/t_circuit:1479283638956',1489394460,'严重电流三相不平衡','30%＜不平衡度','1',1,'电流三相不平衡度=60%','12','13','14','15','16','17','18')";

        DataTransportService dataTransportService = new DataTransportServiceImpl();
//        int i = dataTransportService.insert(sql);
//        System.out.println(i);
    }
}
