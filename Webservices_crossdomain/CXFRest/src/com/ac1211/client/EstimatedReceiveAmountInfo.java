
package com.ac1211.client;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EstimatedReceiveAmountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstimatedReceiveAmountInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="receiveAmount" type="{http://www.moneygram.com/AgentConnect1211}decimal14nonZero" minOccurs="0"/>
 *         &lt;element name="receiveCurrency" type="{http://www.moneygram.com/AgentConnect1211}currencyCode" minOccurs="0"/>
 *         &lt;element name="validCurrencyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="payoutCurrency" type="{http://www.moneygram.com/AgentConnect1211}currencyCode"/>
 *         &lt;element name="totalReceiveFees" type="{http://www.moneygram.com/AgentConnect1211}decimal14" minOccurs="0"/>
 *         &lt;element name="totalReceiveTaxes" type="{http://www.moneygram.com/AgentConnect1211}decimal14" minOccurs="0"/>
 *         &lt;element name="totalReceiveAmount" type="{http://www.moneygram.com/AgentConnect1211}decimal14" minOccurs="0"/>
 *         &lt;element name="detailEstimatedReceiveAmounts" type="{http://www.moneygram.com/AgentConnect1211}AmountInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimatedReceiveAmountInfo", propOrder = {
    "receiveAmount",
    "receiveCurrency",
    "validCurrencyIndicator",
    "payoutCurrency",
    "totalReceiveFees",
    "totalReceiveTaxes",
    "totalReceiveAmount",
    "detailEstimatedReceiveAmounts"
})
public class EstimatedReceiveAmountInfo {

    protected BigDecimal receiveAmount;
    protected String receiveCurrency;
    protected Boolean validCurrencyIndicator;
    @XmlElement(required = true)
    protected String payoutCurrency;
    protected BigDecimal totalReceiveFees;
    protected BigDecimal totalReceiveTaxes;
    protected BigDecimal totalReceiveAmount;
    protected List<AmountInfo> detailEstimatedReceiveAmounts;

    /**
     * Gets the value of the receiveAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReceiveAmount() {
        return receiveAmount;
    }

    /**
     * Sets the value of the receiveAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReceiveAmount(BigDecimal value) {
        this.receiveAmount = value;
    }

    /**
     * Gets the value of the receiveCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveCurrency() {
        return receiveCurrency;
    }

    /**
     * Sets the value of the receiveCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveCurrency(String value) {
        this.receiveCurrency = value;
    }

    /**
     * Gets the value of the validCurrencyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidCurrencyIndicator() {
        return validCurrencyIndicator;
    }

    /**
     * Sets the value of the validCurrencyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidCurrencyIndicator(Boolean value) {
        this.validCurrencyIndicator = value;
    }

    /**
     * Gets the value of the payoutCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutCurrency() {
        return payoutCurrency;
    }

    /**
     * Sets the value of the payoutCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoutCurrency(String value) {
        this.payoutCurrency = value;
    }

    /**
     * Gets the value of the totalReceiveFees property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalReceiveFees() {
        return totalReceiveFees;
    }

    /**
     * Sets the value of the totalReceiveFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalReceiveFees(BigDecimal value) {
        this.totalReceiveFees = value;
    }

    /**
     * Gets the value of the totalReceiveTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalReceiveTaxes() {
        return totalReceiveTaxes;
    }

    /**
     * Sets the value of the totalReceiveTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalReceiveTaxes(BigDecimal value) {
        this.totalReceiveTaxes = value;
    }

    /**
     * Gets the value of the totalReceiveAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalReceiveAmount() {
        return totalReceiveAmount;
    }

    /**
     * Sets the value of the totalReceiveAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalReceiveAmount(BigDecimal value) {
        this.totalReceiveAmount = value;
    }

    /**
     * Gets the value of the detailEstimatedReceiveAmounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailEstimatedReceiveAmounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailEstimatedReceiveAmounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountInfo }
     * 
     * 
     */
    public List<AmountInfo> getDetailEstimatedReceiveAmounts() {
        if (detailEstimatedReceiveAmounts == null) {
            detailEstimatedReceiveAmounts = new ArrayList<AmountInfo>();
        }
        return this.detailEstimatedReceiveAmounts;
    }

}
