
package com.ws.tianque;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>issueCount complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="issueCount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="allMonthCount" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="monthCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="sumCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="toDayCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "issueCount", propOrder = {
    "allMonthCount",
    "monthCount",
    "sumCount",
    "toDayCount"
})
public class IssueCount {

    @XmlElement(nillable = true)
    protected List<Integer> allMonthCount;
    protected Integer monthCount;
    protected Integer sumCount;
    protected Integer toDayCount;

    /**
     * Gets the value of the allMonthCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allMonthCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllMonthCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getAllMonthCount() {
        if (allMonthCount == null) {
            allMonthCount = new ArrayList<Integer>();
        }
        return this.allMonthCount;
    }

    /**
     * 获取monthCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonthCount() {
        return monthCount;
    }

    /**
     * 设置monthCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonthCount(Integer value) {
        this.monthCount = value;
    }

    /**
     * 获取sumCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSumCount() {
        return sumCount;
    }

    /**
     * 设置sumCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSumCount(Integer value) {
        this.sumCount = value;
    }

    /**
     * 获取toDayCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getToDayCount() {
        return toDayCount;
    }

    /**
     * 设置toDayCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setToDayCount(Integer value) {
        this.toDayCount = value;
    }

}
