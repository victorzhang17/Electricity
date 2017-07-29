
package com.ws.tianque;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>issueTypeDomain complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="issueTypeDomain"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.webService.issue.plugin.tianque.com/}baseDomain"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="internaleProperties" type="{http://service.webService.issue.plugin.tianque.com/}gridInternalProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="module" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personalized" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="systemSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "issueTypeDomain", propOrder = {
    "domainName",
    "internaleProperties",
    "module",
    "personalized",
    "systemSensitive"
})
public class IssueTypeDomain
    extends BaseDomain
{

    protected String domainName;
    @XmlElement(nillable = true)
    protected List<GridInternalProperty> internaleProperties;
    protected String module;
    protected boolean personalized;
    protected boolean systemSensitive;

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
     * Gets the value of the internaleProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internaleProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternaleProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GridInternalProperty }
     * 
     * 
     */
    public List<GridInternalProperty> getInternaleProperties() {
        if (internaleProperties == null) {
            internaleProperties = new ArrayList<GridInternalProperty>();
        }
        return this.internaleProperties;
    }

    /**
     * 获取module属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModule() {
        return module;
    }

    /**
     * 设置module属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModule(String value) {
        this.module = value;
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
     * 获取systemSensitive属性的值。
     * 
     */
    public boolean isSystemSensitive() {
        return systemSensitive;
    }

    /**
     * 设置systemSensitive属性的值。
     * 
     */
    public void setSystemSensitive(boolean value) {
        this.systemSensitive = value;
    }

}
