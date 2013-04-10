
package com.mgi.agentconnect.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFieldsForProductRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFieldsForProductRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Request">
 *       &lt;sequence>
 *         &lt;element name="receiveCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType"/>
 *         &lt;element name="deliveryOption" type="{http://www.moneygram.com/AgentConnect1211}deliveryOption" minOccurs="0"/>
 *         &lt;element name="thirdPartyType" type="{http://www.moneygram.com/AgentConnect1211}thirdPartyType"/>
 *         &lt;element name="receiveAgentID" type="{http://www.moneygram.com/AgentConnect1211}agentID" minOccurs="0"/>
 *         &lt;element name="customerReceiveNumber" type="{http://www.moneygram.com/AgentConnect1211}customerReceiveNumber" minOccurs="0"/>
 *         &lt;element name="billerAccountNumber" type="{http://www.moneygram.com/AgentConnect1211}billerAccountNumber" minOccurs="0"/>
 *         &lt;element name="cardSwiped" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="otherPayoutType" type="{http://www.moneygram.com/AgentConnect1211}otherPayoutType" minOccurs="0"/>
 *         &lt;element name="receiveCurrency" type="{http://www.moneygram.com/AgentConnect1211}currencyCode"/>
 *         &lt;element name="amount" type="{http://www.moneygram.com/AgentConnect1211}decimal14"/>
 *         &lt;element name="sendCurrency" type="{http://www.moneygram.com/AgentConnect1211}currencyCode" minOccurs="0"/>
 *         &lt;element name="productType" type="{http://www.moneygram.com/AgentConnect1211}productType"/>
 *         &lt;element name="productVariant" type="{http://www.moneygram.com/AgentConnect1211}productVariant" minOccurs="0"/>
 *         &lt;element name="serviceOfferingID" type="{http://www.moneygram.com/AgentConnect1211}stringMax21" minOccurs="0"/>
 *         &lt;element name="consumerId" type="{http://www.moneygram.com/AgentConnect1211}consumerId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFieldsForProductRequest", propOrder = {
    "receiveCountry",
    "deliveryOption",
    "thirdPartyType",
    "receiveAgentID",
    "customerReceiveNumber",
    "billerAccountNumber",
    "cardSwiped",
    "otherPayoutType",
    "receiveCurrency",
    "amount",
    "sendCurrency",
    "productType",
    "productVariant",
    "serviceOfferingID",
    "consumerId"
})
public class GetFieldsForProductRequest
    extends Request
{

    @XmlElement(required = true)
    protected String receiveCountry;
    protected String deliveryOption;
    @XmlElement(required = true)
    protected ThirdPartyType thirdPartyType;
    protected String receiveAgentID;
    protected String customerReceiveNumber;
    protected String billerAccountNumber;
    protected Boolean cardSwiped;
    protected String otherPayoutType;
    @XmlElement(required = true)
    protected String receiveCurrency;
    @XmlElement(required = true)
    protected BigDecimal amount;
    protected String sendCurrency;
    @XmlElement(required = true)
    protected ProductType productType;
    protected ProductVariant productVariant;
    protected String serviceOfferingID;
    @XmlElement(required = true)
    protected String consumerId;

    /**
     * Gets the value of the receiveCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveCountry() {
        return receiveCountry;
    }

    /**
     * Sets the value of the receiveCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveCountry(String value) {
        this.receiveCountry = value;
    }

    /**
     * Gets the value of the deliveryOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryOption() {
        return deliveryOption;
    }

    /**
     * Sets the value of the deliveryOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryOption(String value) {
        this.deliveryOption = value;
    }

    /**
     * Gets the value of the thirdPartyType property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyType }
     *     
     */
    public ThirdPartyType getThirdPartyType() {
        return thirdPartyType;
    }

    /**
     * Sets the value of the thirdPartyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyType }
     *     
     */
    public void setThirdPartyType(ThirdPartyType value) {
        this.thirdPartyType = value;
    }

    /**
     * Gets the value of the receiveAgentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveAgentID() {
        return receiveAgentID;
    }

    /**
     * Sets the value of the receiveAgentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveAgentID(String value) {
        this.receiveAgentID = value;
    }

    /**
     * Gets the value of the customerReceiveNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReceiveNumber() {
        return customerReceiveNumber;
    }

    /**
     * Sets the value of the customerReceiveNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReceiveNumber(String value) {
        this.customerReceiveNumber = value;
    }

    /**
     * Gets the value of the billerAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillerAccountNumber() {
        return billerAccountNumber;
    }

    /**
     * Sets the value of the billerAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillerAccountNumber(String value) {
        this.billerAccountNumber = value;
    }

    /**
     * Gets the value of the cardSwiped property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardSwiped() {
        return cardSwiped;
    }

    /**
     * Sets the value of the cardSwiped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardSwiped(Boolean value) {
        this.cardSwiped = value;
    }

    /**
     * Gets the value of the otherPayoutType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPayoutType() {
        return otherPayoutType;
    }

    /**
     * Sets the value of the otherPayoutType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPayoutType(String value) {
        this.otherPayoutType = value;
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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
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
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProductType(ProductType value) {
        this.productType = value;
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
     * Gets the value of the serviceOfferingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOfferingID() {
        return serviceOfferingID;
    }

    /**
     * Sets the value of the serviceOfferingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOfferingID(String value) {
        this.serviceOfferingID = value;
    }

    /**
     * Gets the value of the consumerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerId() {
        return consumerId;
    }

    /**
     * Sets the value of the consumerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerId(String value) {
        this.consumerId = value;
    }

}
