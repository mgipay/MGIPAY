
package com.ac1211.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillPaymentCancelRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillPaymentCancelRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Request">
 *       &lt;sequence>
 *         &lt;element name="referenceNumber" type="{http://www.moneygram.com/AgentConnect1211}referenceNumber"/>
 *         &lt;element name="productVariant" type="{http://www.moneygram.com/AgentConnect1211}productVariant"/>
 *         &lt;element name="reasonDetailCode" type="{http://www.moneygram.com/AgentConnect1211}billPayCancelReasonType"/>
 *         &lt;element name="sendAmount" type="{http://www.moneygram.com/AgentConnect1211}decimal14nonZero"/>
 *         &lt;element name="feeAmount" type="{http://www.moneygram.com/AgentConnect1211}decimal14"/>
 *         &lt;element name="sendCurrency" type="{http://www.moneygram.com/AgentConnect1211}currencyCode"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillPaymentCancelRequest", propOrder = {
    "referenceNumber",
    "productVariant",
    "reasonDetailCode",
    "sendAmount",
    "feeAmount",
    "sendCurrency"
})
public class BillPaymentCancelRequest
    extends Request
{

    @XmlElement(required = true)
    protected String referenceNumber;
    @XmlElement(required = true)
    protected ProductVariant productVariant;
    @XmlElement(required = true)
    protected BillPayCancelReasonType reasonDetailCode;
    @XmlElement(required = true)
    protected BigDecimal sendAmount;
    @XmlElement(required = true)
    protected BigDecimal feeAmount;
    @XmlElement(required = true)
    protected String sendCurrency;

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the productVariant property.
     * 
     * @return
     *     possible object is
     *     {@link ProductVariant }
     *     
     */
    public ProductVariant getProductVariant() {
        return productVariant;
    }

    /**
     * Sets the value of the productVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductVariant }
     *     
     */
    public void setProductVariant(ProductVariant value) {
        this.productVariant = value;
    }

    /**
     * Gets the value of the reasonDetailCode property.
     * 
     * @return
     *     possible object is
     *     {@link BillPayCancelReasonType }
     *     
     */
    public BillPayCancelReasonType getReasonDetailCode() {
        return reasonDetailCode;
    }

    /**
     * Sets the value of the reasonDetailCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPayCancelReasonType }
     *     
     */
    public void setReasonDetailCode(BillPayCancelReasonType value) {
        this.reasonDetailCode = value;
    }

    /**
     * Gets the value of the sendAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSendAmount() {
        return sendAmount;
    }

    /**
     * Sets the value of the sendAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSendAmount(BigDecimal value) {
        this.sendAmount = value;
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

}
