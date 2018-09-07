package com.cetiti.tlsp.electricity.service.impl;

import com.ws.tianque.WbsIssue;
import com.ws.tianque.WbsIssueImplService;

/**
 * 事件基类
 *
 * @author victorzhang
 */
public class IssueBase {

    private WbsIssue wbsIssue;

    public IssueBase(){
        WbsIssueImplService wbsIssueImplService = new WbsIssueImplService();
        wbsIssue = wbsIssueImplService.getWbsIssueImplPort();
    }

    public String addIssuesNew(String str){
        return wbsIssue.addIssueNew(str);
    }
}
