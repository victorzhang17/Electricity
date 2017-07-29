
package com.ws.tianque;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>issueStep complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="issueStep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.webService.issue.plugin.tianque.com/}baseDomain"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="backTo" type="{http://service.webService.issue.plugin.tianque.com/}issueStep" minOccurs="0"/&gt;
 *         &lt;element name="completeApplyOrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="completeApplyStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="deadlineDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dealDeadLineStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dealDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="delayStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="entryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="extensionDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="gsm_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="handleState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="issue" type="{http://service.webService.issue.plugin.tianque.com/}issueNew" minOccurs="0"/&gt;
 *         &lt;element name="lastDealDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="peopleOrSystem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://service.webService.issue.plugin.tianque.com/}organization" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="superviseLevel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="target" type="{http://service.webService.issue.plugin.tianque.com/}organization" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "issueStep", propOrder = {
    "backTo",
    "completeApplyOrgId",
    "completeApplyStatus",
    "deadlineDays",
    "dealDeadLineStatus",
    "dealDeadline",
    "delayStatus",
    "endDate",
    "entryDate",
    "extensionDays",
    "groupId",
    "gsmId",
    "handleState",
    "issue",
    "lastDealDate",
    "peopleOrSystem",
    "source",
    "state",
    "stateCode",
    "superviseLevel",
    "target"
})
public class IssueStep
    extends BaseDomain
{

    protected IssueStep backTo;
    protected Long completeApplyOrgId;
    protected Integer completeApplyStatus;
    protected Integer deadlineDays;
    protected Integer dealDeadLineStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dealDeadline;
    protected Integer delayStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entryDate;
    protected Integer extensionDays;
    protected Long groupId;
    @XmlElement(name = "gsm_id")
    protected Long gsmId;
    protected Integer handleState;
    protected IssueNew issue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastDealDate;
    protected Long peopleOrSystem;
    protected Organization source;
    protected String state;
    protected int stateCode;
    protected int superviseLevel;
    protected Organization target;

    /**
     * 获取backTo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueStep }
     *     
     */
    public IssueStep getBackTo() {
        return backTo;
    }

    /**
     * 设置backTo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueStep }
     *     
     */
    public void setBackTo(IssueStep value) {
        this.backTo = value;
    }

    /**
     * 获取completeApplyOrgId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompleteApplyOrgId() {
        return completeApplyOrgId;
    }

    /**
     * 设置completeApplyOrgId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompleteApplyOrgId(Long value) {
        this.completeApplyOrgId = value;
    }

    /**
     * 获取completeApplyStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompleteApplyStatus() {
        return completeApplyStatus;
    }

    /**
     * 设置completeApplyStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompleteApplyStatus(Integer value) {
        this.completeApplyStatus = value;
    }

    /**
     * 获取deadlineDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeadlineDays() {
        return deadlineDays;
    }

    /**
     * 设置deadlineDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeadlineDays(Integer value) {
        this.deadlineDays = value;
    }

    /**
     * 获取dealDeadLineStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDealDeadLineStatus() {
        return dealDeadLineStatus;
    }

    /**
     * 设置dealDeadLineStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDealDeadLineStatus(Integer value) {
        this.dealDeadLineStatus = value;
    }

    /**
     * 获取dealDeadline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDealDeadline() {
        return dealDeadline;
    }

    /**
     * 设置dealDeadline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDealDeadline(XMLGregorianCalendar value) {
        this.dealDeadline = value;
    }

    /**
     * 获取delayStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDelayStatus() {
        return delayStatus;
    }

    /**
     * 设置delayStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDelayStatus(Integer value) {
        this.delayStatus = value;
    }

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
     * 获取entryDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    /**
     * 设置entryDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryDate(XMLGregorianCalendar value) {
        this.entryDate = value;
    }

    /**
     * 获取extensionDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExtensionDays() {
        return extensionDays;
    }

    /**
     * 设置extensionDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExtensionDays(Integer value) {
        this.extensionDays = value;
    }

    /**
     * 获取groupId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * 设置groupId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupId(Long value) {
        this.groupId = value;
    }

    /**
     * 获取gsmId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGsmId() {
        return gsmId;
    }

    /**
     * 设置gsmId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGsmId(Long value) {
        this.gsmId = value;
    }

    /**
     * 获取handleState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHandleState() {
        return handleState;
    }

    /**
     * 设置handleState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHandleState(Integer value) {
        this.handleState = value;
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
     * 获取lastDealDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDealDate() {
        return lastDealDate;
    }

    /**
     * 设置lastDealDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDealDate(XMLGregorianCalendar value) {
        this.lastDealDate = value;
    }

    /**
     * 获取peopleOrSystem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeopleOrSystem() {
        return peopleOrSystem;
    }

    /**
     * 设置peopleOrSystem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeopleOrSystem(Long value) {
        this.peopleOrSystem = value;
    }

    /**
     * 获取source属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getSource() {
        return source;
    }

    /**
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setSource(Organization value) {
        this.source = value;
    }

    /**
     * 获取state属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * 设置state属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * 获取stateCode属性的值。
     * 
     */
    public int getStateCode() {
        return stateCode;
    }

    /**
     * 设置stateCode属性的值。
     * 
     */
    public void setStateCode(int value) {
        this.stateCode = value;
    }

    /**
     * 获取superviseLevel属性的值。
     * 
     */
    public int getSuperviseLevel() {
        return superviseLevel;
    }

    /**
     * 设置superviseLevel属性的值。
     * 
     */
    public void setSuperviseLevel(int value) {
        this.superviseLevel = value;
    }

    /**
     * 获取target属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getTarget() {
        return target;
    }

    /**
     * 设置target属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setTarget(Organization value) {
        this.target = value;
    }

}
