
package com.ws.tianque;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>issueDetailVo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="issueDetailVo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="issueNew" type="{http://service.webService.issue.plugin.tianque.com/}issueNew" minOccurs="0"/&gt;
 *         &lt;element name="issuelogs" type="{http://service.webService.issue.plugin.tianque.com/}issueLog" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="step" type="{http://service.webService.issue.plugin.tianque.com/}issueStep" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "issueDetailVo", propOrder = {
    "issueNew",
    "issuelogs",
    "step"
})
public class IssueDetailVo {

    protected IssueNew issueNew;
    @XmlElement(nillable = true)
    protected List<IssueLog> issuelogs;
    protected IssueStep step;

    /**
     * 获取issueNew属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueNew }
     *     
     */
    public IssueNew getIssueNew() {
        return issueNew;
    }

    /**
     * 设置issueNew属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueNew }
     *     
     */
    public void setIssueNew(IssueNew value) {
        this.issueNew = value;
    }

    /**
     * Gets the value of the issuelogs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuelogs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuelogs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssueLog }
     * 
     * 
     */
    public List<IssueLog> getIssuelogs() {
        if (issuelogs == null) {
            issuelogs = new ArrayList<IssueLog>();
        }
        return this.issuelogs;
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

}
