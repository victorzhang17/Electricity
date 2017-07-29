
package com.ws.tianque;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>resubmitTurnToDo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="resubmitTurnToDo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.webService.issue.plugin.tianque.com/}baseDomain"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="examinationOpinion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="examinationResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="handler" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issue" type="{http://service.webService.issue.plugin.tianque.com/}issueNew" minOccurs="0"/&gt;
 *         &lt;element name="issueLog" type="{http://service.webService.issue.plugin.tianque.com/}issueLogNew" minOccurs="0"/&gt;
 *         &lt;element name="issueStep" type="{http://service.webService.issue.plugin.tianque.com/}issueStep" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resubmitReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="turnToDoReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resubmitTurnToDo", propOrder = {
    "examinationOpinion",
    "examinationResult",
    "handler",
    "issue",
    "issueLog",
    "issueStep",
    "phone",
    "resubmitReason",
    "turnToDoReason"
})
public class ResubmitTurnToDo
    extends BaseDomain
{

    protected String examinationOpinion;
    protected Integer examinationResult;
    protected String handler;
    protected IssueNew issue;
    protected IssueLogNew issueLog;
    protected IssueStep issueStep;
    protected String phone;
    protected String resubmitReason;
    protected String turnToDoReason;

    /**
     * 获取examinationOpinion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationOpinion() {
        return examinationOpinion;
    }

    /**
     * 设置examinationOpinion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationOpinion(String value) {
        this.examinationOpinion = value;
    }

    /**
     * 获取examinationResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExaminationResult() {
        return examinationResult;
    }

    /**
     * 设置examinationResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExaminationResult(Integer value) {
        this.examinationResult = value;
    }

    /**
     * 获取handler属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandler() {
        return handler;
    }

    /**
     * 设置handler属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandler(String value) {
        this.handler = value;
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
     * 获取phone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置phone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * 获取resubmitReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResubmitReason() {
        return resubmitReason;
    }

    /**
     * 设置resubmitReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResubmitReason(String value) {
        this.resubmitReason = value;
    }

    /**
     * 获取turnToDoReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurnToDoReason() {
        return turnToDoReason;
    }

    /**
     * 设置turnToDoReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurnToDoReason(String value) {
        this.turnToDoReason = value;
    }

}
