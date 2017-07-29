
package com.ws.tianque;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>issueOperate complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="issueOperate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cent" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="increase" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="mobileCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "issueOperate", propOrder = {
    "cent",
    "code",
    "desc",
    "increase",
    "mobileCode"
})
public class IssueOperate {

    protected int cent;
    protected int code;
    protected String desc;
    protected boolean increase;
    protected String mobileCode;

    /**
     * 获取cent属性的值。
     * 
     */
    public int getCent() {
        return cent;
    }

    /**
     * 设置cent属性的值。
     * 
     */
    public void setCent(int value) {
        this.cent = value;
    }

    /**
     * 获取code属性的值。
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * 获取desc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置desc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * 获取increase属性的值。
     * 
     */
    public boolean isIncrease() {
        return increase;
    }

    /**
     * 设置increase属性的值。
     * 
     */
    public void setIncrease(boolean value) {
        this.increase = value;
    }

    /**
     * 获取mobileCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileCode() {
        return mobileCode;
    }

    /**
     * 设置mobileCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileCode(String value) {
        this.mobileCode = value;
    }

}
