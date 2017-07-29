
package com.ws.tianque;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>issueType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="issueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.webService.issue.plugin.tianque.com/}baseDomain"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="fullPinYin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indexId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="internalId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="issueTypeDomain" type="{http://service.webService.issue.plugin.tianque.com/}issueTypeDomain" minOccurs="0"/&gt;
 *         &lt;element name="issueTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="org" type="{http://service.webService.issue.plugin.tianque.com/}organization" minOccurs="0"/&gt;
 *         &lt;element name="orgInternalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personalized" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="simplePinYin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "issueType", propOrder = {
    "content",
    "enabled",
    "fullPinYin",
    "indexId",
    "internalId",
    "issueTypeDomain",
    "issueTypeName",
    "org",
    "orgInternalCode",
    "orgName",
    "personalized",
    "simplePinYin"
})
public class IssueType
    extends BaseDomain
{

    protected String content;
    protected boolean enabled;
    protected String fullPinYin;
    protected int indexId;
    protected int internalId;
    protected IssueTypeDomain issueTypeDomain;
    protected String issueTypeName;
    protected Organization org;
    protected String orgInternalCode;
    protected String orgName;
    protected boolean personalized;
    protected String simplePinYin;

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
     * 获取enabled属性的值。
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * 设置enabled属性的值。
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * 获取fullPinYin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullPinYin() {
        return fullPinYin;
    }

    /**
     * 设置fullPinYin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullPinYin(String value) {
        this.fullPinYin = value;
    }

    /**
     * 获取indexId属性的值。
     * 
     */
    public int getIndexId() {
        return indexId;
    }

    /**
     * 设置indexId属性的值。
     * 
     */
    public void setIndexId(int value) {
        this.indexId = value;
    }

    /**
     * 获取internalId属性的值。
     * 
     */
    public int getInternalId() {
        return internalId;
    }

    /**
     * 设置internalId属性的值。
     * 
     */
    public void setInternalId(int value) {
        this.internalId = value;
    }

    /**
     * 获取issueTypeDomain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueTypeDomain }
     *     
     */
    public IssueTypeDomain getIssueTypeDomain() {
        return issueTypeDomain;
    }

    /**
     * 设置issueTypeDomain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueTypeDomain }
     *     
     */
    public void setIssueTypeDomain(IssueTypeDomain value) {
        this.issueTypeDomain = value;
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
     * 获取org属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getOrg() {
        return org;
    }

    /**
     * 设置org属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setOrg(Organization value) {
        this.org = value;
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
     * 获取personalized属性的值。
     * 
     */
    public boolean isPersonalized() {
        return personalized;
    }

    /**
     * 设置personalized属性的值。
     * 
     */
    public void setPersonalized(boolean value) {
        this.personalized = value;
    }

    /**
     * 获取simplePinYin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimplePinYin() {
        return simplePinYin;
    }

    /**
     * 设置simplePinYin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimplePinYin(String value) {
        this.simplePinYin = value;
    }

}
