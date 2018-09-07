package com.cetiti.tlsp.electricity.util;


import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

/**
 * 天阙XML数据处理工具
 *
 * @author victorzhang
 */
public class XmlUtil {
    private Element element;
    private Document document;

    public void addArg(String key, String value) {
        element.addElement(key).addText(value);
    }

    public void initSendInfo() {
        document = DocumentHelper.createDocument();
        Element root = document.addElement("data");
        element = root.addElement("issueNew");
    }

    public String getArgXml() {
        document.setXMLEncoding("UTF-8");
        return document.asXML();
    }
}