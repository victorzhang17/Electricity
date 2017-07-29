
package com.ws.tianque;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>assignBusiness complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="assignBusiness"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.webService.issue.plugin.tianque.com/}baseDomain"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acceptTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="assignFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="feedbackTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="isAnonymous" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isImportantDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="issue" type="{http://service.webService.issue.plugin.tianque.com/}issueNew" minOccurs="0"/&gt;
 *         &lt;element name="issueLog" type="{http://service.webService.issue.plugin.tianque.com/}issueLogNew" minOccurs="0"/&gt;
 *         &lt;element name="issueStep" type="{http://service.webService.issue.plugin.tianque.com/}issueStep" minOccurs="0"/&gt;
 *         &lt;element name="leadershipInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignBusiness", propOrder = {
    "acceptTime",
    "assignFlag",
    "feedbackTime",
    "isAnonymous",
    "isImportantDocument",
    "issue",
    "issueLog",
    "issueStep",
    "leadershipInstruction"
})
public class AssignBusiness
    extends BaseDomain
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acceptTime;
    protected Integer assignFlag;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar feedbackTime;
    protected Boolean isAnonymous;
    protected Boolean isImportantDocument;
    protected IssueNew issue;
    protected IssueLogNew issueLog;
    protected IssueStep issueStep;
    protected String leadershipInstruction;

    /**
     * 获取acceptTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcceptTime() {
        return acceptTime;
    }

    /**
     * 设置acceptTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcceptTime(XMLGregorianCalendar value) {
        this.acceptTime = value;
    }

    /**
     * 获取assignFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAssignFlag() {
        return assignFlag;
    }

    /**
     * 设置assignFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAssignFlag(Integer value) {
        this.assignFlag = value;
    }

    /**
     * 获取feedbackTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFeedbackTime() {
        return feedbackTime;
    }

    /**
     * 设置feedbackTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFeedbackTime(XMLGregorianCalendar value) {
        this.feedbackTime = value;
    }

    /**
     * 获取isAnonymous属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAnonymous() {
        return isAnonymous;
    }

    /**
     * 设置isAnonymous属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAnonymous(Boolean value) {
        this.isAnonymous = value;
    }

    /**
     * 获取isImportantDocument属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsImportantDocument() {
        return isImportantDocument;
    }

    /**
     * 设置isImportantDocument属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsImportantDocument(Boolean value) {
        this.isImportantDocument = value;
    }

    /**
     * 获取issue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueNew }
     *     
     */
    public IssueNew getIssue() {
        return issue;
    }

    /**
     * 设置issue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueNew }
     *     
     */
    public void setIssue(IssueNew value) {
        this.issue = value;
    }

    /**
     * 获取issueLog属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueLogNew }
     *     
     */
    public IssueLogNew getIssueLog() {
        return issueLog;
    }

    /**
     * 设置issueLog属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueLogNew }
     *     
     */
    public void setIssueLog(IssueLogNew value) {
        this.issueLog = value;
    }

    /**
     * 获取issueStep属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueStep }
     *     
     */
    public IssueStep getIssueStep() {
        return issueStep;
    }

    /**
     * 设置issueStep属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueStep }
     *     
     */
    public void setIssueStep(IssueStep value) {
        this.issueStep = value;
    }

    /**
     * 获取leadershipInstruction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadershipInstruction() {
        return leadershipInstruction;
    }

    /**
     * 设置leadershipInstruction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadershipInstruction(String value) {
        this.leadershipInstruction = value;
    }

}
