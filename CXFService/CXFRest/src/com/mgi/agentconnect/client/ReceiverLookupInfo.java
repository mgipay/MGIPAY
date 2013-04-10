
package com.mgi.agentconnect.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiverLookupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiverLookupInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="receiveCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="receiverFirstName" type="{http://www.moneygram.com/AgentConnect1211}fNameLong" minOccurs="0"/>
 *         &lt;element name="receiverMiddleName" type="{http://www.moneygram.com/AgentConnect1211}mNameLong" minOccurs="0"/>
 *         &lt;element name="receiverLastName" type="{http://www.moneygram.com/AgentConnect1211}lNameLong" minOccurs="0"/>
 *         &lt;element name="receiverLastName2" type="{http://www.moneygram.com/AgentConnect1211}lNameLong" minOccurs="0"/>
 *         &lt;element name="receiverAddress" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="receiverAddress2" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="receiverAddress3" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="receiverAddress4" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="receiverCity" type="{http://www.moneygram.com/AgentConnect1211}cityTypeLong" minOccurs="0"/>
 *         &lt;element name="receiverState" type="{http://www.moneygram.com/AgentConnect1211}stateType" minOccurs="0"/>
 *         &lt;element name="receiverZipCode" type="{http://www.moneygram.com/AgentConnect1211}zipType" minOccurs="0"/>
 *         &lt;element name="receiverCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="receiverPhone" type="{http://www.moneygram.com/AgentConnect1211}phoneType14" minOccurs="0"/>
 *         &lt;element name="sendAmount" type="{http://www.moneygram.com/AgentConnect1211}decimal14nonZero" minOccurs="0"/>
 *         &lt;element name="deliveryOption" type="{http://www.moneygram.com/AgentConnect1211}deliveryOption" minOccurs="0"/>
 *         &lt;element name="sendCurrency" type="{http://www.moneygram.com/AgentConnect1211}currencyCode" minOccurs="0"/>
 *         &lt;element name="direction1" type="{http://www.moneygram.com/AgentConnect1211}directionType" minOccurs="0"/>
 *         &lt;element name="direction2" type="{http://www.moneygram.com/AgentConnect1211}directionType" minOccurs="0"/>
 *         &lt;element name="direction3" type="{http://www.moneygram.com/AgentConnect1211}directionType" minOccurs="0"/>
 *         &lt;element name="customerReceiveNumber" type="{http://www.moneygram.com/AgentConnect1211}customerReceiveNumber" minOccurs="0"/>
 *         &lt;element name="accountNickname" type="{http://www.moneygram.com/AgentConnect1211}accountNickname" minOccurs="0"/>
 *         &lt;element name="accountNumberLast4" type="{http://www.moneygram.com/AgentConnect1211}string4" minOccurs="0"/>
 *         &lt;element name="receiveAgentID" type="{http://www.moneygram.com/AgentConnect1211}agentID" minOccurs="0"/>
 *         &lt;element name="receiveAgentName" type="{http://www.moneygram.com/AgentConnect1211}stringMax40" minOccurs="0"/>
 *         &lt;element name="receiveAgentAbbreviation" type="{http://www.moneygram.com/AgentConnect1211}stringMax40" minOccurs="0"/>
 *         &lt;element name="receiveCurrency" type="{http://www.moneygram.com/AgentConnect1211}stringMax3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiverLookupInfo", propOrder = {
    "receiveCountry",
    "receiverFirstName",
    "receiverMiddleName",
    "receiverLastName",
    "receiverLastName2",
    "receiverAddress",
    "receiverAddress2",
    "receiverAddress3",
    "receiverAddress4",
    "receiverCity",
    "receiverState",
    "receiverZipCode",
    "receiverCountry",
    "receiverPhone",
    "sendAmount",
    "deliveryOption",
    "sendCurrency",
    "direction1",
    "direction2",
    "direction3",
    "customerReceiveNumber",
    "accountNickname",
    "accountNumberLast4",
    "receiveAgentID",
    "receiveAgentName",
    "receiveAgentAbbreviation",
    "receiveCurrency"
})
public class ReceiverLookupInfo {

    protected String receiveCountry;
    protected String receiverFirstName;
    protected String receiverMiddleName;
    protected String receiverLastName;
    protected String receiverLastName2;
    protected String receiverAddress;
    protected String receiverAddress2;
    protected String receiverAddress3;
    protected String receiverAddress4;
    protected String receiverCity;
    protected String receiverState;
    protected String receiverZipCode;
    protected String receiverCountry;
    protected String receiverPhone;
    protected BigDecimal sendAmount;
    protected String deliveryOption;
    protected String sendCurrency;
    protected String direction1;
    protected String direction2;
    protected String direction3;
    protected String customerReceiveNumber;
    protected String accountNickname;
    protected String accountNumberLast4;
    protected String receiveAgentID;
    protected String receiveAgentName;
    protected String receiveAgentAbbreviation;
    protected String receiveCurrency;

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
     * Gets the value of the receiverFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverFirstName() {
        return receiverFirstName;
    }

    /**
     * Sets the value of the receiverFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverFirstName(String value) {
        this.receiverFirstName = value;
    }

    /**
     * Gets the value of the receiverMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverMiddleName() {
        return receiverMiddleName;
    }

    /**
     * Sets the value of the receiverMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverMiddleName(String value) {
        this.receiverMiddleName = value;
    }

    /**
     * Gets the value of the receiverLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverLastName() {
        return receiverLastName;
    }

    /**
     * Sets the value of the receiverLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverLastName(String value) {
        this.receiverLastName = value;
    }

    /**
     * Gets the value of the receiverLastName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverLastName2() {
        return receiverLastName2;
    }

    /**
     * Sets the value of the receiverLastName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverLastName2(String value) {
        this.receiverLastName2 = value;
    }

    /**
     * Gets the value of the receiverAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * Sets the value of the receiverAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverAddress(String value) {
        this.receiverAddress = value;
    }

    /**
     * Gets the value of the receiverAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverAddress2() {
        return receiverAddress2;
    }

    /**
     * Sets the value of the receiverAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverAddress2(String value) {
        this.receiverAddress2 = value;
    }

    /**
     * Gets the value of the receiverAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverAddress3() {
        return receiverAddress3;
    }

    /**
     * Sets the value of the receiverAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverAddress3(String value) {
        this.receiverAddress3 = value;
    }

    /**
     * Gets the value of the receiverAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverAddress4() {
        return receiverAddress4;
    }

    /**
     * Sets the value of the receiverAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverAddress4(String value) {
        this.receiverAddress4 = value;
    }

    /**
     * Gets the value of the receiverCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverCity() {
        return receiverCity;
    }

    /**
     * Sets the value of the receiverCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverCity(String value) {
        this.receiverCity = value;
    }

    /**
     * Gets the value of the receiverState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverState() {
        return receiverState;
    }

    /**
     * Sets the value of the receiverState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverState(String value) {
        this.receiverState = value;
    }

    /**
     * Gets the value of the receiverZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverZipCode() {
        return receiverZipCode;
    }

    /**
     * Sets the value of the receiverZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverZipCode(String value) {
        this.receiverZipCode = value;
    }

    /**
     * Gets the value of the receiverCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverCountry() {
        return receiverCountry;
    }

    /**
     * Sets the value of the receiverCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverCountry(String value) {
        this.receiverCountry = value;
    }

    /**
     * Gets the value of the receiverPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * Sets the value of the receiverPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverPhone(String value) {
        this.receiverPhone = value;
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
     * Gets the value of the direction1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection1() {
        return direction1;
    }

    /**
     * Sets the value of the direction1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection1(String value) {
        this.direction1 = value;
    }

    /**
     * Gets the value of the direction2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection2() {
        return direction2;
    }

    /**
     * Sets the value of the direction2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection2(String value) {
        this.direction2 = value;
    }

    /**
     * Gets the value of the direction3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection3() {
        return direction3;
    }

    /**
     * Sets the value of the direction3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection3(String value) {
        this.direction3 = value;
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
     * Gets the value of the accountNickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNickname() {
        return accountNickname;
    }

    /**
     * Sets the value of the accountNickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNickname(String value) {
        this.accountNickname = value;
    }

    /**
     * Gets the value of the accountNumberLast4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumberLast4() {
        return accountNumberLast4;
    }

    /**
     * Sets the value of the accountNumberLast4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumberLast4(String value) {
        this.accountNumberLast4 = value;
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
     * Gets the value of the receiveAgentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveAgentName() {
        return receiveAgentName;
    }

    /**
     * Sets the value of the receiveAgentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveAgentName(String value) {
        this.receiveAgentName = value;
    }

    /**
     * Gets the value of the receiveAgentAbbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveAgentAbbreviation() {
        return receiveAgentAbbreviation;
    }

    /**
     * Sets the value of the receiveAgentAbbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveAgentAbbreviation(String value) {
        this.receiveAgentAbbreviation = value;
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

}
