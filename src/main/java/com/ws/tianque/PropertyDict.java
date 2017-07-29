
package com.ws.tianque;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>propertyDict complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="propertyDict"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.webService.issue.plugin.tianque.com/}baseDomain"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displaySeq" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fullPinyin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gbCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="internalId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="propertyDomain" type="{http://service.webService.issue.plugin.tianque.com/}propertyDomain" minOccurs="0"/&gt;
 *         &lt;element name="simplePinyin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyDict", propOrder = {
    "displayName",
    "displaySeq",
    "fullPinyin",
    "gbCode",
    "internalId",
    "propertyDomain",
    "simplePinyin"
})
public class PropertyDict
    extends BaseDomain
{

    protected String displayName;
    protected int displaySeq;
    protected String fullPinyin;
    protected String gbCode;
    protected int internalId;
    protected PropertyDomain propertyDomain;
    protected String simplePinyin;

    /**
     * 获取displayName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 设置displayName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * 获取displaySeq属性的值。
     * 
     */
    public int getDisplaySeq() {
        return displaySeq;
    }

    /**
     * 设置displaySeq属性的值。
     * 
     */
    public void setDisplaySeq(int value) {
        this.displaySeq = value;
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
     * 获取gbCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGbCode() {
        return gbCode;
    }

    /**
     * 设置gbCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGbCode(String value) {
        this.gbCode = value;
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
     * 获取propertyDomain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyDomain }
     *     
     */
    public PropertyDomain getPropertyDomain() {
        return propertyDomain;
    }

    /**
     * 设置propertyDomain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDomain }
     *     
     */
    public void setPropertyDomain(PropertyDomain value) {
        this.propertyDomain = value;
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

}
