
package com.ws.tianque;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>issueDeal complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="issueDeal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.webService.issue.plugin.tianque.com/}baseDomain"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="feedbackType" type="{http://service.webService.issue.plugin.tianque.com/}propertyDict" minOccurs="0"/&gt;
 *         &lt;element name="feedbackTypeOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="helpPersonAdvice" type="{http://service.webService.issue.plugin.tianque.com/}propertyDict" minOccurs="0"/&gt;
 *         &lt;element name="helpPersonAdviceOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isHost" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="issue" type="{http://service.webService.issue.plugin.tianque.com/}issueNew" minOccurs="0"/&gt;
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="issueLeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issueLog" type="{http://service.webService.issue.plugin.tianque.com/}issueLogNew" minOccurs="0"/&gt;
 *         &lt;element name="leaderOpinion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="undertakeDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "issueDeal", propOrder = {
    "endDate",
    "feedbackType",
    "feedbackTypeOther",
    "helpPersonAdvice",
    "helpPersonAdviceOther",
    "isHost",
    "issue",
    "issueDate",
    "issueLeader",
    "issueLog",
    "leaderOpinion",
    "undertakeDepartment"
})
public class IssueDeal
    extends BaseDomain
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected PropertyDict feedbackType;
    protected String feedbackTypeOther;
    protected PropertyDict helpPersonAdvice;
    protected String helpPersonAdviceOther;
    protected Long isHost;
    protected IssueNew issue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;
    protected String issueLeader;
    protected IssueLogNew issueLog;
    protected String leaderOpinion;
    protected String undertakeDepartment;

    /**
     * 获取endDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * 设置endDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * 获取feedbackType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyDict }
     *     
     */
    public PropertyDict getFeedbackType() {
        return feedbackType;
    }

    /**
     * 设置feedbackType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDict }
     *     
     */
    public void setFeedbackType(PropertyDict value) {
        this.feedbackType = value;
    }

    /**
     * 获取feedbackTypeOther属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackTypeOther() {
        return feedbackTypeOther;
    }

    /**
     * 设置feedbackTypeOther属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackTypeOther(String value) {
        this.feedbackTypeOther = value;
    }

    /**
     * 获取helpPersonAdvice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyDict }
     *     
     */
    public PropertyDict getHelpPersonAdvice() {
        return helpPersonAdvice;
    }

    /**
     * 设置helpPersonAdvice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDict }
     *     
     */
    public void setHelpPersonAdvice(PropertyDict value) {
        this.helpPersonAdvice = value;
    }

    /**
     * 获取helpPersonAdviceOther属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpPersonAdviceOther() {
        return helpPersonAdviceOther;
    }

    /**
     * 设置helpPersonAdviceOther属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpPersonAdviceOther(String value) {
        this.helpPersonAdviceOther = value;
    }

    /**
     * 获取isHost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsHost() {
        return isHost;
    }

    /**
     * 设置isHost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsHost(Long value) {
        this.isHost = value;
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
     * 获取issueDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * 设置issueDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * 获取issueLeader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueLeader() {
        return issueLeader;
    }

    /**
     * 设置issueLeader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueLeader(String value) {
        this.issueLeader = value;
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
     * 获取leaderOpinion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaderOpinion() {
        return leaderOpinion;
    }

    /**
     * 设置leaderOpinion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaderOpinion(String value) {
        this.leaderOpinion = value;
    }

    /**
     * 获取undertakeDepartment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndertakeDepartment() {
        return undertakeDepartment;
    }

    /**
     * 设置undertakeDepartment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndertakeDepartment(String value) {
        this.undertakeDepartment = value;
    }

}
