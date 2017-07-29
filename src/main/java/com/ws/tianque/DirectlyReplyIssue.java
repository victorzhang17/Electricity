
package com.ws.tianque;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>directlyReplyIssue complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="directlyReplyIssue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.webService.issue.plugin.tianque.com/}baseDomain"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="issueId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="issueLogId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="issueStepId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="messageContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="replyContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="replyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="replyOrg" type="{http://service.webService.issue.plugin.tianque.com/}organization" minOccurs="0"/&gt;
 *         &lt;element name="replyPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "directlyReplyIssue", propOrder = {
    "issueId",
    "issueLogId",
    "issueStepId",
    "messageContent",
    "replyContent",
    "replyDate",
    "replyOrg",
    "replyPerson"
})
public class DirectlyReplyIssue
    extends BaseDomain
{

    protected Long issueId;
    protected Long issueLogId;
    protected Long issueStepId;
    protected String messageContent;
    protected String replyContent;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar replyDate;
    protected Organization replyOrg;
    protected String replyPerson;

    /**
     * 获取issueId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIssueId() {
        return issueId;
    }

    /**
     * 设置issueId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIssueId(Long value) {
        this.issueId = value;
    }

    /**
     * 获取issueLogId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIssueLogId() {
        return issueLogId;
    }

    /**
     * 设置issueLogId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIssueLogId(Long value) {
        this.issueLogId = value;
    }

    /**
     * 获取issueStepId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIssueStepId() {
        return issueStepId;
    }

    /**
     * 设置issueStepId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIssueStepId(Long value) {
        this.issueStepId = value;
    }

    /**
     * 获取messageContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageContent() {
        return messageContent;
    }

    /**
     * 设置messageContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageContent(String value) {
        this.messageContent = value;
    }

    /**
     * 获取replyContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyContent() {
        return replyContent;
    }

    /**
     * 设置replyContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyContent(String value) {
        this.replyContent = value;
    }

    /**
     * 获取replyDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReplyDate() {
        return replyDate;
    }

    /**
     * 设置replyDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReplyDate(XMLGregorianCalendar value) {
        this.replyDate = value;
    }

    /**
     * 获取replyOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getReplyOrg() {
        return replyOrg;
    }

    /**
     * 设置replyOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setReplyOrg(Organization value) {
        this.replyOrg = value;
    }

    /**
     * 获取replyPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyPerson() {
        return replyPerson;
    }

    /**
     * 设置replyPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyPerson(String value) {
        this.replyPerson = value;
    }

}
