
package com.ws.tianque;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>issueConfirmation complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="issueConfirmation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.webService.issue.plugin.tianque.com/}baseDomain"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attitudeOpinionOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterSampleLibrary" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="feedbackPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isEfficiency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="isHotspot" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="isInvestigation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="issue" type="{http://service.webService.issue.plugin.tianque.com/}issueNew" minOccurs="0"/&gt;
 *         &lt;element name="issueLog" type="{http://service.webService.issue.plugin.tianque.com/}issueLogNew" minOccurs="0"/&gt;
 *         &lt;element name="issueStep" type="{http://service.webService.issue.plugin.tianque.com/}issueStep" minOccurs="0"/&gt;
 *         &lt;element name="managementOpinion" type="{http://service.webService.issue.plugin.tianque.com/}propertyDict" minOccurs="0"/&gt;
 *         &lt;element name="managementOpinionOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="openNetwork" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="petitonEvaluate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceAttitudeOpinion" type="{http://service.webService.issue.plugin.tianque.com/}propertyDict" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "issueConfirmation", propOrder = {
    "attitudeOpinionOther",
    "enterSampleLibrary",
    "feedbackPerson",
    "isEfficiency",
    "isHotspot",
    "isInvestigation",
    "issue",
    "issueLog",
    "issueStep",
    "managementOpinion",
    "managementOpinionOther",
    "openNetwork",
    "petitonEvaluate",
    "serviceAttitudeOpinion"
})
public class IssueConfirmation
    extends BaseDomain
{

    protected String attitudeOpinionOther;
    protected Integer enterSampleLibrary;
    protected String feedbackPerson;
    protected Integer isEfficiency;
    protected Integer isHotspot;
    protected Integer isInvestigation;
    protected IssueNew issue;
    protected IssueLogNew issueLog;
    protected IssueStep issueStep;
    protected PropertyDict managementOpinion;
    protected String managementOpinionOther;
    protected Integer openNetwork;
    protected String petitonEvaluate;
    protected PropertyDict serviceAttitudeOpinion;

    /**
     * 获取attitudeOpinionOther属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttitudeOpinionOther() {
        return attitudeOpinionOther;
    }

    /**
     * 设置attitudeOpinionOther属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttitudeOpinionOther(String value) {
        this.attitudeOpinionOther = value;
    }

    /**
     * 获取enterSampleLibrary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEnterSampleLibrary() {
        return enterSampleLibrary;
    }

    /**
     * 设置enterSampleLibrary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEnterSampleLibrary(Integer value) {
        this.enterSampleLibrary = value;
    }

    /**
     * 获取feedbackPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackPerson() {
        return feedbackPerson;
    }

    /**
     * 设置feedbackPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackPerson(String value) {
        this.feedbackPerson = value;
    }

    /**
     * 获取isEfficiency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsEfficiency() {
        return isEfficiency;
    }

    /**
     * 设置isEfficiency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsEfficiency(Integer value) {
        this.isEfficiency = value;
    }

    /**
     * 获取isHotspot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsHotspot() {
        return isHotspot;
    }

    /**
     * 设置isHotspot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsHotspot(Integer value) {
        this.isHotspot = value;
    }

    /**
     * 获取isInvestigation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsInvestigation() {
        return isInvestigation;
    }

    /**
     * 设置isInvestigation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsInvestigation(Integer value) {
        this.isInvestigation = value;
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
     * 获取issueLog属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueLogNew }
     *     
     */
    public IssueLogNew getIssueLog() {
        return issueLog;
    }

    /**
     * 设置issueLog属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueLogNew }
     *     
     */
    public void setIssueLog(IssueLogNew value) {
        this.issueLog = value;
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
     * 获取managementOpinion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyDict }
     *     
     */
    public PropertyDict getManagementOpinion() {
        return managementOpinion;
    }

    /**
     * 设置managementOpinion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDict }
     *     
     */
    public void setManagementOpinion(PropertyDict value) {
        this.managementOpinion = value;
    }

    /**
     * 获取managementOpinionOther属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementOpinionOther() {
        return managementOpinionOther;
    }

    /**
     * 设置managementOpinionOther属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementOpinionOther(String value) {
        this.managementOpinionOther = value;
    }

    /**
     * 获取openNetwork属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOpenNetwork() {
        return openNetwork;
    }

    /**
     * 设置openNetwork属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOpenNetwork(Integer value) {
        this.openNetwork = value;
    }

    /**
     * 获取petitonEvaluate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPetitonEvaluate() {
        return petitonEvaluate;
    }

    /**
     * 设置petitonEvaluate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPetitonEvaluate(String value) {
        this.petitonEvaluate = value;
    }

    /**
     * 获取serviceAttitudeOpinion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyDict }
     *     
     */
    public PropertyDict getServiceAttitudeOpinion() {
        return serviceAttitudeOpinion;
    }

    /**
     * 设置serviceAttitudeOpinion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDict }
     *     
     */
    public void setServiceAttitudeOpinion(PropertyDict value) {
        this.serviceAttitudeOpinion = value;
    }

}
