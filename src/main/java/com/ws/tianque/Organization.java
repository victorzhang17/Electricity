
package com.ws.tianque;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>organization complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="organization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.webService.issue.plugin.tianque.com/}baseDomain"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="buildingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactWay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departmentNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fullOrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fullPinyin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gisInfo" type="{http://service.webService.issue.plugin.tianque.com/}gisInfo" minOccurs="0"/&gt;
 *         &lt;element name="hasJudgeAuthorize" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isLeapfrogReporting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orgInternalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgLevel" type="{http://service.webService.issue.plugin.tianque.com/}propertyDict" minOccurs="0"/&gt;
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgType" type="{http://service.webService.issue.plugin.tianque.com/}propertyDict" minOccurs="0"/&gt;
 *         &lt;element name="parentFunOrg" type="{http://service.webService.issue.plugin.tianque.com/}organization" minOccurs="0"/&gt;
 *         &lt;element name="parentOrg" type="{http://service.webService.issue.plugin.tianque.com/}organization" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seq" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="simplePinyin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="subCountFun" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organization", propOrder = {
    "buildingId",
    "contactWay",
    "departmentNo",
    "fullOrgName",
    "fullPinyin",
    "gisInfo",
    "hasJudgeAuthorize",
    "initial",
    "isLeapfrogReporting",
    "maxCode",
    "orgInternalCode",
    "orgLevel",
    "orgName",
    "orgType",
    "parentFunOrg",
    "parentOrg",
    "remark",
    "seq",
    "simplePinyin",
    "subCount",
    "subCountFun"
})
public class Organization
    extends BaseDomain
{

    protected String buildingId;
    protected String contactWay;
    protected String departmentNo;
    protected String fullOrgName;
    protected String fullPinyin;
    protected GisInfo gisInfo;
    protected Boolean hasJudgeAuthorize;
    protected String initial;
    protected String isLeapfrogReporting;
    protected int maxCode;
    protected String orgInternalCode;
    protected PropertyDict orgLevel;
    protected String orgName;
    protected PropertyDict orgType;
    protected Organization parentFunOrg;
    protected Organization parentOrg;
    protected String remark;
    protected Long seq;
    protected String simplePinyin;
    protected Long subCount;
    protected Long subCountFun;

    /**
     * 获取buildingId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingId() {
        return buildingId;
    }

    /**
     * 设置buildingId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingId(String value) {
        this.buildingId = value;
    }

    /**
     * 获取contactWay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactWay() {
        return contactWay;
    }

    /**
     * 设置contactWay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactWay(String value) {
        this.contactWay = value;
    }

    /**
     * 获取departmentNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentNo() {
        return departmentNo;
    }

    /**
     * 设置departmentNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentNo(String value) {
        this.departmentNo = value;
    }

    /**
     * 获取fullOrgName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullOrgName() {
        return fullOrgName;
    }

    /**
     * 设置fullOrgName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullOrgName(String value) {
        this.fullOrgName = value;
    }

    /**
     * 获取fullPinyin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullPinyin() {
        return fullPinyin;
    }

    /**
     * 设置fullPinyin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullPinyin(String value) {
        this.fullPinyin = value;
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
     * 获取hasJudgeAuthorize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasJudgeAuthorize() {
        return hasJudgeAuthorize;
    }

    /**
     * 设置hasJudgeAuthorize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasJudgeAuthorize(Boolean value) {
        this.hasJudgeAuthorize = value;
    }

    /**
     * 获取initial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitial() {
        return initial;
    }

    /**
     * 设置initial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitial(String value) {
        this.initial = value;
    }

    /**
     * 获取isLeapfrogReporting属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsLeapfrogReporting() {
        return isLeapfrogReporting;
    }

    /**
     * 设置isLeapfrogReporting属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsLeapfrogReporting(String value) {
        this.isLeapfrogReporting = value;
    }

    /**
     * 获取maxCode属性的值。
     * 
     */
    public int getMaxCode() {
        return maxCode;
    }

    /**
     * 设置maxCode属性的值。
     * 
     */
    public void setMaxCode(int value) {
        this.maxCode = value;
    }

    /**
     * 获取orgInternalCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgInternalCode() {
        return orgInternalCode;
    }

    /**
     * 设置orgInternalCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgInternalCode(String value) {
        this.orgInternalCode = value;
    }

    /**
     * 获取orgLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyDict }
     *     
     */
    public PropertyDict getOrgLevel() {
        return orgLevel;
    }

    /**
     * 设置orgLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDict }
     *     
     */
    public void setOrgLevel(PropertyDict value) {
        this.orgLevel = value;
    }

    /**
     * 获取orgName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置orgName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * 获取orgType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyDict }
     *     
     */
    public PropertyDict getOrgType() {
        return orgType;
    }

    /**
     * 设置orgType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDict }
     *     
     */
    public void setOrgType(PropertyDict value) {
        this.orgType = value;
    }

    /**
     * 获取parentFunOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getParentFunOrg() {
        return parentFunOrg;
    }

    /**
     * 设置parentFunOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setParentFunOrg(Organization value) {
        this.parentFunOrg = value;
    }

    /**
     * 获取parentOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getParentOrg() {
        return parentOrg;
    }

    /**
     * 设置parentOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setParentOrg(Organization value) {
        this.parentOrg = value;
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
     * 获取seq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeq() {
        return seq;
    }

    /**
     * 设置seq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeq(Long value) {
        this.seq = value;
    }

    /**
     * 获取simplePinyin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimplePinyin() {
        return simplePinyin;
    }

    /**
     * 设置simplePinyin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimplePinyin(String value) {
        this.simplePinyin = value;
    }

    /**
     * 获取subCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubCount() {
        return subCount;
    }

    /**
     * 设置subCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubCount(Long value) {
        this.subCount = value;
    }

    /**
     * 获取subCountFun属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubCountFun() {
        return subCountFun;
    }

    /**
     * 设置subCountFun属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubCountFun(Long value) {
        this.subCountFun = value;
    }

}
