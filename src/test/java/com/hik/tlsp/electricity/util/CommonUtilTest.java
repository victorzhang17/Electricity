package com.hik.tlsp.electricity.util;

import org.junit.Test;

import java.util.Date;

public class CommonUtilTest {

    @Test
    public void testCreateUUID(){
        System.out.println(CommonUtil.createUUID());
    }

    @Test
    public void testSysDate(){
        System.out.println(new Date());
    }
}
