
package com.ws.tianque;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>issueLogNew complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="issueLogNew"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.webService.issue.plugin.tianque.com/}baseDomain"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assignBusiness" type="{http://service.webService.issue.plugin.tianque.com/}assignBusiness" minOccurs="0"/&gt;
 *         &lt;element name="backIssueLog" type="{http://service.webService.issue.plugin.tianque.com/}issueLogNew" minOccurs="0"/&gt;
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deadlineDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dealDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dealDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dealOrg" type="{http://service.webService.issue.plugin.tianque.com/}organization" minOccurs="0"/&gt;
 *         &lt;element name="dealOrgInternalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dealState" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dealStepIndex" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dealTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dealType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dealUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directlyReplyIssue" type="{http://service.webService.issue.plugin.tianque.com/}directlyReplyIssue" minOccurs="0"/&gt;
 *         &lt;element name="forIssueLog" type="{http://service.webService.issue.plugin.tianque.com/}issueLogNew" minOccurs="0"/&gt;
 *         &lt;element name="forLogEntryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="helpId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="isComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isConsent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isMediation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isMediationSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="issue" type="{http://service.webService.issue.plugin.tianque.com/}issueNew" minOccurs="0"/&gt;
 *         &lt;element name="issueConfirmation" type="{http://service.webService.issue.plugin.tianque.com/}issueConfirmation" minOccurs="0"/&gt;
 *         &lt;element name="issueDeal" type="{http://service.webService.issue.plugin.tianque.com/}issueDeal" minOccurs="0"/&gt;
 *         &lt;element name="issueStep" type="{http://service.webService.issue.plugin.tianque.com/}issueStep" minOccurs="0"/&gt;
 *         &lt;element name="logCompleteTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="mediationMethods" type="{http://service.webService.issue.plugin.tianque.com/}propertyDict" minOccurs="0"/&gt;
 *         &lt;element name="mediationOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mediationOrganizationType" type="{http://service.webService.issue.plugin.tianque.com/}propertyDict" minOccurs="0"/&gt;
 *         &lt;element name="mediationPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mediationPersonWay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="peopleOrSystem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="reportedGrade" type="{http://service.webService.issue.plugin.tianque.com/}propertyDict" minOccurs="0"/&gt;
 *         &lt;element name="resubmitTurnToDo" type="{http://service.webService.issue.plugin.tianque.com/}resubmitTurnToDo" minOccurs="0"/&gt;
 *         &lt;element name="stateClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supervisionState" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="targeOrg" type="{http://service.webService.issue.plugin.tianque.com/}organization" minOccurs="0"/&gt;
 *         &lt;element name="targeOrgInternalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "issueLogNew", propOrder = {
    "assignBusiness",
    "backIssueLog",
    "content",
    "deadlineDays",
    "dealDeadline",
    "dealDescription",
    "dealOrg",
    "dealOrgInternalCode",
    "dealState",
    "dealStepIndex",
    "dealTime",
    "dealType",
    "dealUserName",
    "directlyReplyIssue",
    "forIssueLog",
    "forLogEntryTime",
    "helpId",
    "isComplete",
    "isConsent",
    "isMediation",
    "isMediationSuccess",
    "issue",
    "issueConfirmation",
    "issueDeal",
    "issueStep",
    "logCompleteTime",
    "mediationMethods",
    "mediationOrganizationName",
    "mediationOrganizationType",
    "mediationPerson",
    "mediationPersonWay",
    "mobile",
    "peopleOrSystem",
    "reportedGrade",
    "resubmitTurnToDo",
    "stateClass",
    "supervisionState",
    "targeOrg",
    "targeOrgInternalCode"
})
public class IssueLogNew
    extends BaseDomain
{

    protected AssignBusiness assignBusiness;
    protected IssueLogNew backIssueLog;
    protected String content;
    protected Integer deadlineDays;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dealDeadline;
    protected String dealDescription;
    protected Organization dealOrg;
    protected String dealOrgInternalCode;
    protected Long dealState;
    protected Long dealStepIndex;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dealTime;
    protected Long dealType;
    protected String dealUserName;
    protected DirectlyReplyIssue directlyReplyIssue;
    protected IssueLogNew forIssueLog;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar forLogEntryTime;
    protected Long helpId;
    protected Boolean isComplete;
    protected Boolean isConsent;
    protected Boolean isMediation;
    protected Boolean isMediationSuccess;
    protected IssueNew issue;
    protected IssueConfirmation issueConfirmation;
    protected IssueDeal issueDeal;
    protected IssueStep issueStep;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar logCompleteTime;
    protected PropertyDict mediationMethods;
    protected String mediationOrganizationName;
    protected PropertyDict mediationOrganizationType;
    protected String mediationPerson;
    protected String mediationPersonWay;
    protected String mobile;
    protected Long peopleOrSystem;
    protected PropertyDict reportedGrade;
    protected ResubmitTurnToDo resubmitTurnToDo;
    protected String stateClass;
    protected Long supervisionState;
    protected Organization targeOrg;
    protected String targeOrgInternalCode;

    /**
     * 获取assignBusiness属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AssignBusiness }
     *     
     */
    public AssignBusiness getAssignBusiness() {
        return assignBusiness;
    }

    /**
     * 设置assignBusiness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AssignBusiness }
     *     
     */
    public void setAssignBusiness(AssignBusiness value) {
        this.assignBusiness = value;
    }

    /**
     * 获取backIssueLog属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueLogNew }
     *     
     */
    public IssueLogNew getBackIssueLog() {
        return backIssueLog;
    }

    /**
     * 设置backIssueLog属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueLogNew }
     *     
     */
    public void setBackIssueLog(IssueLogNew value) {
        this.backIssueLog = value;
    }

    /**
     * 获取content属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置content属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
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
     * 获取dealDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealDescription() {
        return dealDescription;
    }

    /**
     * 设置dealDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealDescription(String value) {
        this.dealDescription = value;
    }

    /**
     * 获取dealOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getDealOrg() {
        return dealOrg;
    }

    /**
     * 设置dealOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setDealOrg(Organization value) {
        this.dealOrg = value;
    }

    /**
     * 获取dealOrgInternalCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealOrgInternalCode() {
        return dealOrgInternalCode;
    }

    /**
     * 设置dealOrgInternalCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealOrgInternalCode(String value) {
        this.dealOrgInternalCode = value;
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
     * 获取dealStepIndex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDealStepIndex() {
        return dealStepIndex;
    }

    /**
     * 设置dealStepIndex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDealStepIndex(Long value) {
        this.dealStepIndex = value;
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
     * 获取dealUserName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealUserName() {
        return dealUserName;
    }

    /**
     * 设置dealUserName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealUserName(String value) {
        this.dealUserName = value;
    }

    /**
     * 获取directlyReplyIssue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DirectlyReplyIssue }
     *     
     */
    public DirectlyReplyIssue getDirectlyReplyIssue() {
        return directlyReplyIssue;
    }

    /**
     * 设置directlyReplyIssue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DirectlyReplyIssue }
     *     
     */
    public void setDirectlyReplyIssue(DirectlyReplyIssue value) {
        this.directlyReplyIssue = value;
    }

    /**
     * 获取forIssueLog属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueLogNew }
     *     
     */
    public IssueLogNew getForIssueLog() {
        return forIssueLog;
    }

    /**
     * 设置forIssueLog属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueLogNew }
     *     
     */
    public void setForIssueLog(IssueLogNew value) {
        this.forIssueLog = value;
    }

    /**
     * 获取forLogEntryTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getForLogEntryTime() {
        return forLogEntryTime;
    }

    /**
     * 设置forLogEntryTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setForLogEntryTime(XMLGregorianCalendar value) {
        this.forLogEntryTime = value;
    }

    /**
     * 获取helpId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHelpId() {
        return helpId;
    }

    /**
     * 设置helpId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHelpId(Long value) {
        this.helpId = value;
    }

    /**
     * 获取isComplete属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsComplete() {
        return isComplete;
    }

    /**
     * 设置isComplete属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsComplete(Boolean value) {
        this.isComplete = value;
    }

    /**
     * 获取isConsent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConsent() {
        return isConsent;
    }

    /**
     * 设置isConsent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConsent(Boolean value) {
        this.isConsent = value;
    }

    /**
     * 获取isMediation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMediation() {
        return isMediation;
    }

    /**
     * 设置isMediation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMediation(Boolean value) {
        this.isMediation = value;
    }

    /**
     * 获取isMediationSuccess属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMediationSuccess() {
        return isMediationSuccess;
    }

    /**
     * 设置isMediationSuccess属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMediationSuccess(Boolean value) {
        this.isMediationSuccess = value;
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
     * 获取issueConfirmation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueConfirmation }
     *     
     */
    public IssueConfirmation getIssueConfirmation() {
        return issueConfirmation;
    }

    /**
     * 设置issueConfirmation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueConfirmation }
     *     
     */
    public void setIssueConfirmation(IssueConfirmation value) {
        this.issueConfirmation = value;
    }

    /**
     * 获取issueDeal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueDeal }
     *     
     */
    public IssueDeal getIssueDeal() {
        return issueDeal;
    }

    /**
     * 设置issueDeal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueDeal }
     *     
     */
    public void setIssueDeal(IssueDeal value) {
        this.issueDeal = value;
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
     * 获取logCompleteTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLogCompleteTime() {
        return logCompleteTime;
    }

    /**
     * 设置logCompleteTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLogCompleteTime(XMLGregorianCalendar value) {
        this.logCompleteTime = value;
    }

    /**
     * 获取mediationMethods属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyDict }
     *     
     */
    public PropertyDict getMediationMethods() {
        return mediationMethods;
    }

    /**
     * 设置mediationMethods属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDict }
     *     
     */
    public void setMediationMethods(PropertyDict value) {
        this.mediationMethods = value;
    }

    /**
     * 获取mediationOrganizationName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediationOrganizationName() {
        return mediationOrganizationName;
    }

    /**
     * 设置mediationOrganizationName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediationOrganizationName(String value) {
        this.mediationOrganizationName = value;
    }

    /**
     * 获取mediationOrganizationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyDict }
     *     
     */
    public PropertyDict getMediationOrganizationType() {
        return mediationOrganizationType;
    }

    /**
     * 设置mediationOrganizationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDict }
     *     
     */
    public void setMediationOrganizationType(PropertyDict value) {
        this.mediationOrganizationType = value;
    }

    /**
     * 获取mediationPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediationPerson() {
        return mediationPerson;
    }

    /**
     * 设置mediationPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediationPerson(String value) {
        this.mediationPerson = value;
    }

    /**
     * 获取mediationPersonWay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediationPersonWay() {
        return mediationPersonWay;
    }

    /**
     * 设置mediationPersonWay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediationPersonWay(String value) {
        this.mediationPersonWay = value;
    }

    /**
     * 获取mobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置mobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
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
     * 获取reportedGrade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyDict }
     *     
     */
    public PropertyDict getReportedGrade() {
        return reportedGrade;
    }

    /**
     * 设置reportedGrade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDict }
     *     
     */
    public void setReportedGrade(PropertyDict value) {
        this.reportedGrade = value;
    }

    /**
     * 获取resubmitTurnToDo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResubmitTurnToDo }
     *     
     */
    public ResubmitTurnToDo getResubmitTurnToDo() {
        return resubmitTurnToDo;
    }

    /**
     * 设置resubmitTurnToDo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResubmitTurnToDo }
     *     
     */
    public void setResubmitTurnToDo(ResubmitTurnToDo value) {
        this.resubmitTurnToDo = value;
    }

    /**
     * 获取stateClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateClass() {
        return stateClass;
    }

    /**
     * 设置stateClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateClass(String value) {
        this.stateClass = value;
    }

    /**
     * 获取supervisionState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSupervisionState() {
        return supervisionState;
    }

    /**
     * 设置supervisionState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSupervisionState(Long value) {
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
     * 获取targeOrgInternalCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargeOrgInternalCode() {
        return targeOrgInternalCode;
    }

    /**
     * 设置targeOrgInternalCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargeOrgInternalCode(String value) {
        this.targeOrgInternalCode = value;
    }

}
