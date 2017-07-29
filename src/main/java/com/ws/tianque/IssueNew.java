
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
 * <p>issueNew complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="issueNew"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.webService.issue.plugin.tianque.com/}baseDomain"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attachFilesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="centerX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="centerY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createOrg" type="{http://service.webService.issue.plugin.tianque.com/}organization" minOccurs="0"/&gt;
 *         &lt;element name="createOrgInternalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currentOrg" type="{http://service.webService.issue.plugin.tianque.com/}organization" minOccurs="0"/&gt;
 *         &lt;element name="currentOrgDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currentStep" type="{http://service.webService.issue.plugin.tianque.com/}issueStep" minOccurs="0"/&gt;
 *         &lt;element name="dealContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayStyle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="domainname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="effective" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="gisInfo" type="{http://service.webService.issue.plugin.tianque.com/}gisInfo" minOccurs="0"/&gt;
 *         &lt;element name="gisSearchState" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="gisSearchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="giscountNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="handleState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="handleTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="helpId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="historic" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="important" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="info" type="{http://service.webService.issue.plugin.tianque.com/}reflectPeopleInformation" minOccurs="0"/&gt;
 *         &lt;element name="informationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="involeObject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isAnonymous" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isCheck" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="isEmergency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isUnite" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="issueContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issueDomainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issueId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="issueKind" type="{http://service.webService.issue.plugin.tianque.com/}propertyDict" minOccurs="0"/&gt;
 *         &lt;element name="issueState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="issueTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issueTypeStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issueTypes" type="{http://service.webService.issue.plugin.tianque.com/}issueType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="keyPersonType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastOrg" type="{http://service.webService.issue.plugin.tianque.com/}organization" minOccurs="0"/&gt;
 *         &lt;element name="lastOrgInternalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lon" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="mainCharacters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mediate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="minute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="occurDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="occurLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="occurOrg" type="{http://service.webService.issue.plugin.tianque.com/}organization" minOccurs="0"/&gt;
 *         &lt;element name="occurOrgInternalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operation" type="{http://service.webService.issue.plugin.tianque.com/}issueLogNew" minOccurs="0"/&gt;
 *         &lt;element name="pentitionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="people" type="{http://service.webService.issue.plugin.tianque.com/}reflectPeople" minOccurs="0"/&gt;
 *         &lt;element name="processOperateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="publicity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recordingUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reflectChannel" type="{http://service.webService.issue.plugin.tianque.com/}propertyDict" minOccurs="0"/&gt;
 *         &lt;element name="reflectType" type="{http://service.webService.issue.plugin.tianque.com/}propertyDict" minOccurs="0"/&gt;
 *         &lt;element name="registeredPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relateAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="relatePeopleCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reminderNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="replyContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sdxf" type="{http://service.webService.issue.plugin.tianque.com/}propertyDict" minOccurs="0"/&gt;
 *         &lt;element name="seatNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secondAssign" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceKind" type="{http://service.webService.issue.plugin.tianque.com/}propertyDict" minOccurs="0"/&gt;
 *         &lt;element name="sourceMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourcePerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="step" type="{http://service.webService.issue.plugin.tianque.com/}issueStep" minOccurs="0"/&gt;
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supervisionState" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="syncToKnowledge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="syncToWeb" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="threeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tmpSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="urgent" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "issueNew", propOrder = {
    "attachFilesName",
    "centerX",
    "centerY",
    "createOrg",
    "createOrgInternalCode",
    "currentOrg",
    "currentOrgDisplayName",
    "currentStep",
    "dealContent",
    "displayStyle",
    "domainname",
    "effective",
    "endDate",
    "firstStatus",
    "flag",
    "gisInfo",
    "gisSearchState",
    "gisSearchType",
    "giscountNum",
    "handleState",
    "handleTime",
    "helpId",
    "historic",
    "hours",
    "important",
    "info",
    "informationId",
    "involeObject",
    "isAnonymous",
    "isCheck",
    "isEmergency",
    "isUnite",
    "issueContent",
    "issueDomainName",
    "issueId",
    "issueKind",
    "issueState",
    "issueTypeName",
    "issueTypeStr",
    "issueTypes",
    "keyPersonType",
    "lastOrg",
    "lastOrgInternalCode",
    "lastUsername",
    "lat",
    "lon",
    "mainCharacters",
    "mediate",
    "minute",
    "occurDate",
    "occurLocation",
    "occurOrg",
    "occurOrgInternalCode",
    "operateType",
    "operation",
    "pentitionDate",
    "people",
    "processOperateType",
    "publicity",
    "recordingUrl",
    "reflectChannel",
    "reflectType",
    "registeredPerson",
    "relateAmount",
    "relatePeopleCount",
    "remark",
    "reminderNumber",
    "replyContent",
    "sdxf",
    "seatNo",
    "secondAssign",
    "serialNumber",
    "sourceKind",
    "sourceMobile",
    "sourcePerson",
    "status",
    "step",
    "subject",
    "supervisionState",
    "syncToKnowledge",
    "syncToWeb",
    "threeType",
    "tmpSessionId",
    "urgent"
})
public class IssueNew
    extends BaseDomain
{

    protected String attachFilesName;
    protected String centerX;
    protected String centerY;
    protected Organization createOrg;
    protected String createOrgInternalCode;
    protected Organization currentOrg;
    protected String currentOrgDisplayName;
    protected IssueStep currentStep;
    protected String dealContent;
    protected Integer displayStyle;
    protected String domainname;
    protected Integer effective;
    protected String endDate;
    protected Integer firstStatus;
    protected Long flag;
    protected GisInfo gisInfo;
    protected int gisSearchState;
    protected String gisSearchType;
    protected int giscountNum;
    protected Integer handleState;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar handleTime;
    protected Long helpId;
    protected boolean historic;
    protected String hours;
    protected Boolean important;
    protected ReflectPeopleInformation info;
    protected Long informationId;
    protected String involeObject;
    protected Boolean isAnonymous;
    protected Integer isCheck;
    protected Boolean isEmergency;
    protected Long isUnite;
    protected String issueContent;
    protected String issueDomainName;
    protected Long issueId;
    protected PropertyDict issueKind;
    protected Integer issueState;
    protected String issueTypeName;
    protected String issueTypeStr;
    @XmlElement(nillable = true)
    protected List<IssueType> issueTypes;
    protected String keyPersonType;
    protected Organization lastOrg;
    protected String lastOrgInternalCode;
    protected String lastUsername;
    protected Double lat;
    protected Double lon;
    protected String mainCharacters;
    protected Boolean mediate;
    protected String minute;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar occurDate;
    protected String occurLocation;
    protected Organization occurOrg;
    protected String occurOrgInternalCode;
    protected String operateType;
    protected IssueLogNew operation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pentitionDate;
    protected ReflectPeople people;
    protected String processOperateType;
    protected String publicity;
    protected String recordingUrl;
    protected PropertyDict reflectChannel;
    protected PropertyDict reflectType;
    protected String registeredPerson;
    protected Double relateAmount;
    protected Integer relatePeopleCount;
    protected String remark;
    protected Integer reminderNumber;
    protected String replyContent;
    protected PropertyDict sdxf;
    protected String seatNo;
    protected Integer secondAssign;
    protected String serialNumber;
    protected PropertyDict sourceKind;
    protected String sourceMobile;
    protected String sourcePerson;
    protected Integer status;
    protected IssueStep step;
    protected String subject;
    protected Long supervisionState;
    protected Boolean syncToKnowledge;
    protected Boolean syncToWeb;
    protected String threeType;
    protected String tmpSessionId;
    protected Long urgent;

    /**
     * 获取attachFilesName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachFilesName() {
        return attachFilesName;
    }

    /**
     * 设置attachFilesName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachFilesName(String value) {
        this.attachFilesName = value;
    }

    /**
     * 获取centerX属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenterX() {
        return centerX;
    }

    /**
     * 设置centerX属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenterX(String value) {
        this.centerX = value;
    }

    /**
     * 获取centerY属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenterY() {
        return centerY;
    }

    /**
     * 设置centerY属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenterY(String value) {
        this.centerY = value;
    }

    /**
     * 获取createOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getCreateOrg() {
        return createOrg;
    }

    /**
     * 设置createOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setCreateOrg(Organization value) {
        this.createOrg = value;
    }

    /**
     * 获取createOrgInternalCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateOrgInternalCode() {
        return createOrgInternalCode;
    }

    /**
     * 设置createOrgInternalCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateOrgInternalCode(String value) {
        this.createOrgInternalCode = value;
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
     * 获取currentOrgDisplayName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentOrgDisplayName() {
        return currentOrgDisplayName;
    }

    /**
     * 设置currentOrgDisplayName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentOrgDisplayName(String value) {
        this.currentOrgDisplayName = value;
    }

    /**
     * 获取currentStep属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueStep }
     *     
     */
    public IssueStep getCurrentStep() {
        return currentStep;
    }

    /**
     * 设置currentStep属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueStep }
     *     
     */
    public void setCurrentStep(IssueStep value) {
        this.currentStep = value;
    }

    /**
     * 获取dealContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealContent() {
        return dealContent;
    }

    /**
     * 设置dealContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealContent(String value) {
        this.dealContent = value;
    }

    /**
     * 获取displayStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayStyle() {
        return displayStyle;
    }

    /**
     * 设置displayStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayStyle(Integer value) {
        this.displayStyle = value;
    }

    /**
     * 获取domainname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainname() {
        return domainname;
    }

    /**
     * 设置domainname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainname(String value) {
        this.domainname = value;
    }

    /**
     * 获取effective属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEffective() {
        return effective;
    }

    /**
     * 设置effective属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEffective(Integer value) {
        this.effective = value;
    }

    /**
     * 获取endDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * 设置endDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * 获取firstStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirstStatus() {
        return firstStatus;
    }

    /**
     * 设置firstStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstStatus(Integer value) {
        this.firstStatus = value;
    }

    /**
     * 获取flag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFlag() {
        return flag;
    }

    /**
     * 设置flag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFlag(Long value) {
        this.flag = value;
    }

    /**
     * 获取gisInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GisInfo }
     *     
     */
    public GisInfo getGisInfo() {
        return gisInfo;
    }

    /**
     * 设置gisInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GisInfo }
     *     
     */
    public void setGisInfo(GisInfo value) {
        this.gisInfo = value;
    }

    /**
     * 获取gisSearchState属性的值。
     * 
     */
    public int getGisSearchState() {
        return gisSearchState;
    }

    /**
     * 设置gisSearchState属性的值。
     * 
     */
    public void setGisSearchState(int value) {
        this.gisSearchState = value;
    }

    /**
     * 获取gisSearchType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGisSearchType() {
        return gisSearchType;
    }

    /**
     * 设置gisSearchType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGisSearchType(String value) {
        this.gisSearchType = value;
    }

    /**
     * 获取giscountNum属性的值。
     * 
     */
    public int getGiscountNum() {
        return giscountNum;
    }

    /**
     * 设置giscountNum属性的值。
     * 
     */
    public void setGiscountNum(int value) {
        this.giscountNum = value;
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
     * 获取handleTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHandleTime() {
        return handleTime;
    }

    /**
     * 设置handleTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHandleTime(XMLGregorianCalendar value) {
        this.handleTime = value;
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
     * 获取historic属性的值。
     * 
     */
    public boolean isHistoric() {
        return historic;
    }

    /**
     * 设置historic属性的值。
     * 
     */
    public void setHistoric(boolean value) {
        this.historic = value;
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
     * 获取important属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImportant() {
        return important;
    }

    /**
     * 设置important属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImportant(Boolean value) {
        this.important = value;
    }

    /**
     * 获取info属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReflectPeopleInformation }
     *     
     */
    public ReflectPeopleInformation getInfo() {
        return info;
    }

    /**
     * 设置info属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReflectPeopleInformation }
     *     
     */
    public void setInfo(ReflectPeopleInformation value) {
        this.info = value;
    }

    /**
     * 获取informationId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInformationId() {
        return informationId;
    }

    /**
     * 设置informationId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInformationId(Long value) {
        this.informationId = value;
    }

    /**
     * 获取involeObject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoleObject() {
        return involeObject;
    }

    /**
     * 设置involeObject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoleObject(String value) {
        this.involeObject = value;
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
     * 获取isCheck属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsCheck() {
        return isCheck;
    }

    /**
     * 设置isCheck属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsCheck(Integer value) {
        this.isCheck = value;
    }

    /**
     * 获取isEmergency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEmergency() {
        return isEmergency;
    }

    /**
     * 设置isEmergency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEmergency(Boolean value) {
        this.isEmergency = value;
    }

    /**
     * 获取isUnite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsUnite() {
        return isUnite;
    }

    /**
     * 设置isUnite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsUnite(Long value) {
        this.isUnite = value;
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
     * 获取issueDomainName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDomainName() {
        return issueDomainName;
    }

    /**
     * 设置issueDomainName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDomainName(String value) {
        this.issueDomainName = value;
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
     * 获取issueKind属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyDict }
     *     
     */
    public PropertyDict getIssueKind() {
        return issueKind;
    }

    /**
     * 设置issueKind属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDict }
     *     
     */
    public void setIssueKind(PropertyDict value) {
        this.issueKind = value;
    }

    /**
     * 获取issueState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIssueState() {
        return issueState;
    }

    /**
     * 设置issueState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIssueState(Integer value) {
        this.issueState = value;
    }

    /**
     * 获取issueTypeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueTypeName() {
        return issueTypeName;
    }

    /**
     * 设置issueTypeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueTypeName(String value) {
        this.issueTypeName = value;
    }

    /**
     * 获取issueTypeStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueTypeStr() {
        return issueTypeStr;
    }

    /**
     * 设置issueTypeStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueTypeStr(String value) {
        this.issueTypeStr = value;
    }

    /**
     * Gets the value of the issueTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issueTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssueTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssueType }
     * 
     * 
     */
    public List<IssueType> getIssueTypes() {
        if (issueTypes == null) {
            issueTypes = new ArrayList<IssueType>();
        }
        return this.issueTypes;
    }

    /**
     * 获取keyPersonType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyPersonType() {
        return keyPersonType;
    }

    /**
     * 设置keyPersonType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyPersonType(String value) {
        this.keyPersonType = value;
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
     * 获取lastOrgInternalCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastOrgInternalCode() {
        return lastOrgInternalCode;
    }

    /**
     * 设置lastOrgInternalCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastOrgInternalCode(String value) {
        this.lastOrgInternalCode = value;
    }

    /**
     * 获取lastUsername属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUsername() {
        return lastUsername;
    }

    /**
     * 设置lastUsername属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUsername(String value) {
        this.lastUsername = value;
    }

    /**
     * 获取lat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLat() {
        return lat;
    }

    /**
     * 设置lat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLat(Double value) {
        this.lat = value;
    }

    /**
     * 获取lon属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLon() {
        return lon;
    }

    /**
     * 设置lon属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLon(Double value) {
        this.lon = value;
    }

    /**
     * 获取mainCharacters属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainCharacters() {
        return mainCharacters;
    }

    /**
     * 设置mainCharacters属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainCharacters(String value) {
        this.mainCharacters = value;
    }

    /**
     * 获取mediate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMediate() {
        return mediate;
    }

    /**
     * 设置mediate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMediate(Boolean value) {
        this.mediate = value;
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
     * 获取occurLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurLocation() {
        return occurLocation;
    }

    /**
     * 设置occurLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurLocation(String value) {
        this.occurLocation = value;
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
     * 获取occurOrgInternalCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurOrgInternalCode() {
        return occurOrgInternalCode;
    }

    /**
     * 设置occurOrgInternalCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurOrgInternalCode(String value) {
        this.occurOrgInternalCode = value;
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
     * 获取operation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueLogNew }
     *     
     */
    public IssueLogNew getOperation() {
        return operation;
    }

    /**
     * 设置operation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueLogNew }
     *     
     */
    public void setOperation(IssueLogNew value) {
        this.operation = value;
    }

    /**
     * 获取pentitionDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPentitionDate() {
        return pentitionDate;
    }

    /**
     * 设置pentitionDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPentitionDate(XMLGregorianCalendar value) {
        this.pentitionDate = value;
    }

    /**
     * 获取people属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReflectPeople }
     *     
     */
    public ReflectPeople getPeople() {
        return people;
    }

    /**
     * 设置people属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReflectPeople }
     *     
     */
    public void setPeople(ReflectPeople value) {
        this.people = value;
    }

    /**
     * 获取processOperateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessOperateType() {
        return processOperateType;
    }

    /**
     * 设置processOperateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessOperateType(String value) {
        this.processOperateType = value;
    }

    /**
     * 获取publicity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicity() {
        return publicity;
    }

    /**
     * 设置publicity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicity(String value) {
        this.publicity = value;
    }

    /**
     * 获取recordingUrl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordingUrl() {
        return recordingUrl;
    }

    /**
     * 设置recordingUrl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordingUrl(String value) {
        this.recordingUrl = value;
    }

    /**
     * 获取reflectChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyDict }
     *     
     */
    public PropertyDict getReflectChannel() {
        return reflectChannel;
    }

    /**
     * 设置reflectChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDict }
     *     
     */
    public void setReflectChannel(PropertyDict value) {
        this.reflectChannel = value;
    }

    /**
     * 获取reflectType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyDict }
     *     
     */
    public PropertyDict getReflectType() {
        return reflectType;
    }

    /**
     * 设置reflectType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDict }
     *     
     */
    public void setReflectType(PropertyDict value) {
        this.reflectType = value;
    }

    /**
     * 获取registeredPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredPerson() {
        return registeredPerson;
    }

    /**
     * 设置registeredPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredPerson(String value) {
        this.registeredPerson = value;
    }

    /**
     * 获取relateAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRelateAmount() {
        return relateAmount;
    }

    /**
     * 设置relateAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRelateAmount(Double value) {
        this.relateAmount = value;
    }

    /**
     * 获取relatePeopleCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelatePeopleCount() {
        return relatePeopleCount;
    }

    /**
     * 设置relatePeopleCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelatePeopleCount(Integer value) {
        this.relatePeopleCount = value;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * 获取reminderNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReminderNumber() {
        return reminderNumber;
    }

    /**
     * 设置reminderNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReminderNumber(Integer value) {
        this.reminderNumber = value;
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
     * 获取sdxf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyDict }
     *     
     */
    public PropertyDict getSdxf() {
        return sdxf;
    }

    /**
     * 设置sdxf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDict }
     *     
     */
    public void setSdxf(PropertyDict value) {
        this.sdxf = value;
    }

    /**
     * 获取seatNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNo() {
        return seatNo;
    }

    /**
     * 设置seatNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNo(String value) {
        this.seatNo = value;
    }

    /**
     * 获取secondAssign属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecondAssign() {
        return secondAssign;
    }

    /**
     * 设置secondAssign属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecondAssign(Integer value) {
        this.secondAssign = value;
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
     * 获取step属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueStep }
     *     
     */
    public IssueStep getStep() {
        return step;
    }

    /**
     * 设置step属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueStep }
     *     
     */
    public void setStep(IssueStep value) {
        this.step = value;
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
     * 获取syncToKnowledge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSyncToKnowledge() {
        return syncToKnowledge;
    }

    /**
     * 设置syncToKnowledge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSyncToKnowledge(Boolean value) {
        this.syncToKnowledge = value;
    }

    /**
     * 获取syncToWeb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSyncToWeb() {
        return syncToWeb;
    }

    /**
     * 设置syncToWeb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSyncToWeb(Boolean value) {
        this.syncToWeb = value;
    }

    /**
     * 获取threeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeType() {
        return threeType;
    }

    /**
     * 设置threeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeType(String value) {
        this.threeType = value;
    }

    /**
     * 获取tmpSessionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmpSessionId() {
        return tmpSessionId;
    }

    /**
     * 设置tmpSessionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmpSessionId(String value) {
        this.tmpSessionId = value;
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
