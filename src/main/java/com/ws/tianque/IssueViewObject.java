
package com.ws.tianque;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>issueViewObject complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="issueViewObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="canDoList" type="{http://service.webService.issue.plugin.tianque.com/}issueOperate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="currentOrg" type="{http://service.webService.issue.plugin.tianque.com/}organization" minOccurs="0"/&gt;
 *         &lt;element name="dealDeadlineStatus" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dealState" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dealTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dealType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="evaluateContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="evaluateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="evaluateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="gsmIdForPeople" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="gsm_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="hours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issueContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issueDealLogs" type="{http://service.webService.issue.plugin.tianque.com/}issueLogNew" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="issueId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="issueLogId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="issueStepId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="lastOrg" type="{http://service.webService.issue.plugin.tianque.com/}organization" minOccurs="0"/&gt;
 *         &lt;element name="lastOrgDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxStepId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newOccurDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="occurDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="occurOrg" type="{http://service.webService.issue.plugin.tianque.com/}organization" minOccurs="0"/&gt;
 *         &lt;element name="operateForSupervision" type="{http://service.webService.issue.plugin.tianque.com/}issueOperate" minOccurs="0"/&gt;
 *         &lt;element name="operateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="peopleOrSystem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="publicltycass" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceKind" type="{http://service.webService.issue.plugin.tianque.com/}propertyDict" minOccurs="0"/&gt;
 *         &lt;element name="sourceMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceOrg" type="{http://service.webService.issue.plugin.tianque.com/}organization" minOccurs="0"/&gt;
 *         &lt;element name="sourcePerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="superviseLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="supervisionState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="targeOrg" type="{http://service.webService.issue.plugin.tianque.com/}organization" minOccurs="0"/&gt;
 *         &lt;element name="topState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="urgent" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "issueViewObject", propOrder = {
    "canDoList",
    "createDate",
    "currentOrg",
    "dealDeadlineStatus",
    "dealState",
    "dealTime",
    "dealType",
    "domainName",
    "evaluateContent",
    "evaluateTime",
    "evaluateType",
    "gsmIdForPeople",
    "gsmId",
    "hours",
    "issueContent",
    "issueDealLogs",
    "issueId",
    "issueLogId",
    "issueStepId",
    "lastOrg",
    "lastOrgDisplayName",
    "maxStepId",
    "minute",
    "newOccurDate",
    "occurDate",
    "occurOrg",
    "operateForSupervision",
    "operateType",
    "peopleOrSystem",
    "publicltycass",
    "serialNumber",
    "sourceKind",
    "sourceMobile",
    "sourceOrg",
    "sourcePerson",
    "status",
    "subject",
    "superviseLevel",
    "supervisionState",
    "targeOrg",
    "topState",
    "urgent"
})
public class IssueViewObject {

    @XmlElement(nillable = true)
    protected List<IssueOperate> canDoList;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    protected Organization currentOrg;
    protected int dealDeadlineStatus;
    protected Long dealState;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dealTime;
    protected Long dealType;
    protected String domainName;
    protected String evaluateContent;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar evaluateTime;
    protected Integer evaluateType;
    protected Long gsmIdForPeople;
    @XmlElement(name = "gsm_id")
    protected Long gsmId;
    protected String hours;
    protected String issueContent;
    @XmlElement(nillable = true)
    protected List<IssueLogNew> issueDealLogs;
    protected Long issueId;
    protected Long issueLogId;
    protected Long issueStepId;
    protected Organization lastOrg;
    protected String lastOrgDisplayName;
    protected String maxStepId;
    protected String minute;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar newOccurDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar occurDate;
    protected Organization occurOrg;
    protected IssueOperate operateForSupervision;
    protected String operateType;
    protected Long peopleOrSystem;
    protected Integer publicltycass;
    protected String serialNumber;
    protected PropertyDict sourceKind;
    protected String sourceMobile;
    protected Organization sourceOrg;
    protected String sourcePerson;
    protected Integer status;
    protected String subject;
    protected Integer superviseLevel;
    protected Integer supervisionState;
    protected Organization targeOrg;
    protected Integer topState;
    protected Long urgent;

    /**
     * Gets the value of the canDoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the canDoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCanDoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssueOperate }
     * 
     * 
     */
    public List<IssueOperate> getCanDoList() {
        if (canDoList == null) {
            canDoList = new ArrayList<IssueOperate>();
        }
        return this.canDoList;
    }

    /**
     * 获取createDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * 设置createDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * 获取currentOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getCurrentOrg() {
        return currentOrg;
    }

    /**
     * 设置currentOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setCurrentOrg(Organization value) {
        this.currentOrg = value;
    }

    /**
     * 获取dealDeadlineStatus属性的值。
     * 
     */
    public int getDealDeadlineStatus() {
        return dealDeadlineStatus;
    }

    /**
     * 设置dealDeadlineStatus属性的值。
     * 
     */
    public void setDealDeadlineStatus(int value) {
        this.dealDeadlineStatus = value;
    }

    /**
     * 获取dealState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDealState() {
        return dealState;
    }

    /**
     * 设置dealState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDealState(Long value) {
        this.dealState = value;
    }

    /**
     * 获取dealTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDealTime() {
        return dealTime;
    }

    /**
     * 设置dealTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDealTime(XMLGregorianCalendar value) {
        this.dealTime = value;
    }

    /**
     * 获取dealType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDealType() {
        return dealType;
    }

    /**
     * 设置dealType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDealType(Long value) {
        this.dealType = value;
    }

    /**
     * 获取domainName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * 设置domainName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * 获取evaluateContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaluateContent() {
        return evaluateContent;
    }

    /**
     * 设置evaluateContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaluateContent(String value) {
        this.evaluateContent = value;
    }

    /**
     * 获取evaluateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvaluateTime() {
        return evaluateTime;
    }

    /**
     * 设置evaluateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvaluateTime(XMLGregorianCalendar value) {
        this.evaluateTime = value;
    }

    /**
     * 获取evaluateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEvaluateType() {
        return evaluateType;
    }

    /**
     * 设置evaluateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEvaluateType(Integer value) {
        this.evaluateType = value;
    }

    /**
     * 获取gsmIdForPeople属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGsmIdForPeople() {
        return gsmIdForPeople;
    }

    /**
     * 设置gsmIdForPeople属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGsmIdForPeople(Long value) {
        this.gsmIdForPeople = value;
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
     * 获取hours属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHours() {
        return hours;
    }

    /**
     * 设置hours属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHours(String value) {
        this.hours = value;
    }

    /**
     * 获取issueContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueContent() {
        return issueContent;
    }

    /**
     * 设置issueContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueContent(String value) {
        this.issueContent = value;
    }

    /**
     * Gets the value of the issueDealLogs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issueDealLogs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssueDealLogs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssueLogNew }
     * 
     * 
     */
    public List<IssueLogNew> getIssueDealLogs() {
        if (issueDealLogs == null) {
            issueDealLogs = new ArrayList<IssueLogNew>();
        }
        return this.issueDealLogs;
    }

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
     * 获取lastOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getLastOrg() {
        return lastOrg;
    }

    /**
     * 设置lastOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setLastOrg(Organization value) {
        this.lastOrg = value;
    }

    /**
     * 获取lastOrgDisplayName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastOrgDisplayName() {
        return lastOrgDisplayName;
    }

    /**
     * 设置lastOrgDisplayName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastOrgDisplayName(String value) {
        this.lastOrgDisplayName = value;
    }

    /**
     * 获取maxStepId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxStepId() {
        return maxStepId;
    }

    /**
     * 设置maxStepId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxStepId(String value) {
        this.maxStepId = value;
    }

    /**
     * 获取minute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinute() {
        return minute;
    }

    /**
     * 设置minute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinute(String value) {
        this.minute = value;
    }

    /**
     * 获取newOccurDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNewOccurDate() {
        return newOccurDate;
    }

    /**
     * 设置newOccurDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNewOccurDate(XMLGregorianCalendar value) {
        this.newOccurDate = value;
    }

    /**
     * 获取occurDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOccurDate() {
        return occurDate;
    }

    /**
     * 设置occurDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOccurDate(XMLGregorianCalendar value) {
        this.occurDate = value;
    }

    /**
     * 获取occurOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getOccurOrg() {
        return occurOrg;
    }

    /**
     * 设置occurOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setOccurOrg(Organization value) {
        this.occurOrg = value;
    }

    /**
     * 获取operateForSupervision属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueOperate }
     *     
     */
    public IssueOperate getOperateForSupervision() {
        return operateForSupervision;
    }

    /**
     * 设置operateForSupervision属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueOperate }
     *     
     */
    public void setOperateForSupervision(IssueOperate value) {
        this.operateForSupervision = value;
    }

    /**
     * 获取operateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperateType() {
        return operateType;
    }

    /**
     * 设置operateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperateType(String value) {
        this.operateType = value;
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
     * 获取publicltycass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPublicltycass() {
        return publicltycass;
    }

    /**
     * 设置publicltycass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPublicltycass(Integer value) {
        this.publicltycass = value;
    }

    /**
     * 获取serialNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * 设置serialNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * 获取sourceKind属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyDict }
     *     
     */
    public PropertyDict getSourceKind() {
        return sourceKind;
    }

    /**
     * 设置sourceKind属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDict }
     *     
     */
    public void setSourceKind(PropertyDict value) {
        this.sourceKind = value;
    }

    /**
     * 获取sourceMobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceMobile() {
        return sourceMobile;
    }

    /**
     * 设置sourceMobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceMobile(String value) {
        this.sourceMobile = value;
    }

    /**
     * 获取sourceOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getSourceOrg() {
        return sourceOrg;
    }

    /**
     * 设置sourceOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setSourceOrg(Organization value) {
        this.sourceOrg = value;
    }

    /**
     * 获取sourcePerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcePerson() {
        return sourcePerson;
    }

    /**
     * 设置sourcePerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcePerson(String value) {
        this.sourcePerson = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * 获取subject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * 设置subject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * 获取superviseLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuperviseLevel() {
        return superviseLevel;
    }

    /**
     * 设置superviseLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuperviseLevel(Integer value) {
        this.superviseLevel = value;
    }

    /**
     * 获取supervisionState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSupervisionState() {
        return supervisionState;
    }

    /**
     * 设置supervisionState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSupervisionState(Integer value) {
        this.supervisionState = value;
    }

    /**
     * 获取targeOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getTargeOrg() {
        return targeOrg;
    }

    /**
     * 设置targeOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setTargeOrg(Organization value) {
        this.targeOrg = value;
    }

    /**
     * 获取topState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTopState() {
        return topState;
    }

    /**
     * 设置topState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTopState(Integer value) {
        this.topState = value;
    }

    /**
     * 获取urgent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUrgent() {
        return urgent;
    }

    /**
     * 设置urgent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUrgent(Long value) {
        this.urgent = value;
    }

}
