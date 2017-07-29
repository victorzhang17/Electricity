package com.hik.tlsp.electricity.service.impl;

import com.ws.tianque.WbsIssue;
import com.ws.tianque.WbsIssueImplService;

public class IssueBase {

    private WbsIssue wbsIssue = null;

    public IssueBase(){
        WbsIssueImplService wbsIssueImplService = new WbsIssueImplService();
        wbsIssue = wbsIssueImplService.getWbsIssueImplPort();
    }

    public String addIssuesNew(String str){
        return wbsIssue.addIssueNew(str);
    }
}
