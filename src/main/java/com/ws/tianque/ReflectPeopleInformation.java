
package com.ws.tianque;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>reflectPeopleInformation complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="reflectPeopleInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.webService.issue.plugin.tianque.com/}baseDomain"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acceptPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hotspot" type="{http://service.webService.issue.plugin.tianque.com/}propertyDict" minOccurs="0"/&gt;
 *         &lt;element name="issueId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="issueWorkOrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="jointPersons" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jointly" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="petitionIntent" type="{http://service.webService.issue.plugin.tianque.com/}propertyDict" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visitorNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reflectPeopleInformation", propOrder = {
    "acceptPerson",
    "hotspot",
    "issueId",
    "issueWorkOrderId",
    "jointPersons",
    "jointly",
    "petitionIntent",
    "remark",
    "visitorNumber"
})
public class ReflectPeopleInformation
    extends BaseDomain
{

    protected String acceptPerson;
    protected PropertyDict hotspot;
    protected Long issueId;
    protected Long issueWorkOrderId;
    protected String jointPersons;
    protected Integer jointly;
    protected PropertyDict petitionIntent;
    protected String remark;
    protected Long visitorNumber;

    /**
     * 获取acceptPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptPerson() {
        return acceptPerson;
    }

    /**
     * 设置acceptPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptPerson(String value) {
        this.acceptPerson = value;
    }

    /**
     * 获取hotspot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyDict }
     *     
     */
    public PropertyDict getHotspot() {
        return hotspot;
    }

    /**
     * 设置hotspot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDict }
     *     
     */
    public void setHotspot(PropertyDict value) {
        this.hotspot = value;
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
     * 获取issueWorkOrderId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIssueWorkOrderId() {
        return issueWorkOrderId;
    }

    /**
     * 设置issueWorkOrderId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIssueWorkOrderId(Long value) {
        this.issueWorkOrderId = value;
    }

    /**
     * 获取jointPersons属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJointPersons() {
        return jointPersons;
    }

    /**
     * 设置jointPersons属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJointPersons(String value) {
        this.jointPersons = value;
    }

    /**
     * 获取jointly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJointly() {
        return jointly;
    }

    /**
     * 设置jointly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJointly(Integer value) {
        this.jointly = value;
    }

    /**
     * 获取petitionIntent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyDict }
     *     
     */
    public PropertyDict getPetitionIntent() {
        return petitionIntent;
    }

    /**
     * 设置petitionIntent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDict }
     *     
     */
    public void setPetitionIntent(PropertyDict value) {
        this.petitionIntent = value;
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
     * 获取visitorNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisitorNumber() {
        return visitorNumber;
    }

    /**
     * 设置visitorNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisitorNumber(Long value) {
        this.visitorNumber = value;
    }

}
