
package com.mgi.agentconnect.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoneyGramSendSummaryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoneyGramSendSummaryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faceAmount" type="{http://www.moneygram.com/AgentConnect1211}decimal14nonZero"/>
 *         &lt;element name="feeAmount" type="{http://www.moneygram.com/AgentConnect1211}decimal14"/>
 *         &lt;element name="totalAmount" type="{http://www.moneygram.com/AgentConnect1211}decimal14nonZero"/>
 *         &lt;element name="sendCurrency" type="{http://www.moneygram.com/AgentConnect1211}currencyCode"/>
 *         &lt;element name="agentNumber" type="{http://www.moneygram.com/AgentConnect1211}agentNumber"/>
 *         &lt;element name="agentName" type="{http://www.moneygram.com/AgentConnect1211}agentName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyGramSendSummaryInfo", propOrder = {
    "faceAmount",
    "feeAmount",
    "totalAmount",
    "sendCurrency",
    "agentNumber",
    "agentName"
})
public class MoneyGramSendSummaryInfo {

    @XmlElement(required = true)
    protected BigDecimal faceAmount;
    @XmlElement(required = true)
    protected BigDecimal feeAmount;
    @XmlElement(required = true)
    protected BigDecimal totalAmount;
    @XmlElement(required = true)
    protected String sendCurrency;
    @XmlElement(required = true)
    protected String agentNumber;
    @XmlElement(required = true)
    protected String agentName;

    /**
     * Gets the value of the faceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFaceAmount() {
        return faceAmount;
    }

    /**
     * Sets the value of the faceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFaceAmount(BigDecimal value) {
        this.faceAmount = value;
    }

    /**
     * Gets the value of the feeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeeAmount(BigDecimal value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the sendCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendCurrency() {
        return sendCurrency;
    }

    /**
     * Sets the value of the sendCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendCurrency(String value) {
        this.sendCurrency = value;
    }

    /**
     * Gets the value of the agentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentNumber() {
        return agentNumber;
    }

    /**
     * Sets the value of the agentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentNumber(String value) {
        this.agentNumber = value;
    }

    /**
     * Gets the value of the agentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * Sets the value of the agentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentName(String value) {
        this.agentName = value;
    }

}
