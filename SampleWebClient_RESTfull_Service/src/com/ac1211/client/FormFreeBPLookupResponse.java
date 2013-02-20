
package com.ac1211.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FormFreeBPLookupResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormFreeBPLookupResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Response">
 *       &lt;sequence>
 *         &lt;element name="maxAmount" type="{http://www.moneygram.com/AgentConnect1211}decimal14nonZero"/>
 *         &lt;element name="feeAmount" type="{http://www.moneygram.com/AgentConnect1211}decimal14" minOccurs="0"/>
 *         &lt;element name="freqCustCardNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax20" minOccurs="0"/>
 *         &lt;element name="receiveCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType"/>
 *         &lt;element name="receiveCode" type="{http://www.moneygram.com/AgentConnect1211}receiveCodeType" minOccurs="0"/>
 *         &lt;element name="receiveAgentID" type="{http://www.moneygram.com/AgentConnect1211}agentID" minOccurs="0"/>
 *         &lt;element name="billerAccountNumber" type="{http://www.moneygram.com/AgentConnect1211}billerAccountNumber"/>
 *         &lt;element name="validateAccountNumber" type="{http://www.moneygram.com/AgentConnect1211}billerAccountNumber" minOccurs="0"/>
 *         &lt;element name="billerName" type="{http://www.moneygram.com/AgentConnect1211}stringMax64" minOccurs="0"/>
 *         &lt;element name="senderFirstName" type="{http://www.moneygram.com/AgentConnect1211}fNameLong" minOccurs="0"/>
 *         &lt;element name="senderMiddleName" type="{http://www.moneygram.com/AgentConnect1211}mNameLong" minOccurs="0"/>
 *         &lt;element name="senderLastName" type="{http://www.moneygram.com/AgentConnect1211}lNameLong" minOccurs="0"/>
 *         &lt;element name="senderLastName2" type="{http://www.moneygram.com/AgentConnect1211}lNameLong" minOccurs="0"/>
 *         &lt;element name="senderAddress" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="senderAddress2" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="senderAddress3" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="senderAddress4" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="senderCity" type="{http://www.moneygram.com/AgentConnect1211}cityTypeLong" minOccurs="0"/>
 *         &lt;element name="senderState" type="{http://www.moneygram.com/AgentConnect1211}stateTypeLong" minOccurs="0"/>
 *         &lt;element name="senderZipCode" type="{http://www.moneygram.com/AgentConnect1211}zipType" minOccurs="0"/>
 *         &lt;element name="senderCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="senderHomePhone" type="{http://www.moneygram.com/AgentConnect1211}phoneType14" minOccurs="0"/>
 *         &lt;element name="receiverFirstName" type="{http://www.moneygram.com/AgentConnect1211}fNameLong" minOccurs="0"/>
 *         &lt;element name="receiverMiddleName" type="{http://www.moneygram.com/AgentConnect1211}mNameLong" minOccurs="0"/>
 *         &lt;element name="receiverLastName" type="{http://www.moneygram.com/AgentConnect1211}lNameLong" minOccurs="0"/>
 *         &lt;element name="receiverLastName2" type="{http://www.moneygram.com/AgentConnect1211}lNameLong" minOccurs="0"/>
 *         &lt;element name="messageField1" type="{http://www.moneygram.com/AgentConnect1211}stringMax40" minOccurs="0"/>
 *         &lt;element name="messageField2" type="{http://www.moneygram.com/AgentConnect1211}stringMax33" minOccurs="0"/>
 *         &lt;element name="senderPhotoIdType" type="{http://www.moneygram.com/AgentConnect1211}photoIdType" minOccurs="0"/>
 *         &lt;element name="senderPhotoIdNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax20" minOccurs="0"/>
 *         &lt;element name="senderPhotoIdState" type="{http://www.moneygram.com/AgentConnect1211}stateType" minOccurs="0"/>
 *         &lt;element name="senderPhotoIdCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="senderLegalIdType" type="{http://www.moneygram.com/AgentConnect1211}legalIdType" minOccurs="0"/>
 *         &lt;element name="senderLegalIdNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax14" minOccurs="0"/>
 *         &lt;element name="senderDOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="senderOccupation" type="{http://www.moneygram.com/AgentConnect1211}stringMax30" minOccurs="0"/>
 *         &lt;element name="thirdPartyFirstName" type="{http://www.moneygram.com/AgentConnect1211}fNameLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyMiddleName" type="{http://www.moneygram.com/AgentConnect1211}mNameLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyLastName" type="{http://www.moneygram.com/AgentConnect1211}lNameLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyLastName2" type="{http://www.moneygram.com/AgentConnect1211}lNameLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyAddress" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyAddress2" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyAddress3" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyAddress4" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyCity" type="{http://www.moneygram.com/AgentConnect1211}cityTypeLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyState" type="{http://www.moneygram.com/AgentConnect1211}stateTypeLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="thirdPartyZipCode" type="{http://www.moneygram.com/AgentConnect1211}zipType" minOccurs="0"/>
 *         &lt;element name="thirdPartyLegalIdType" type="{http://www.moneygram.com/AgentConnect1211}legalIdType" minOccurs="0"/>
 *         &lt;element name="thirdPartyLegalIdNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax14" minOccurs="0"/>
 *         &lt;element name="thirdPartyDOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="thirdPartyOccupation" type="{http://www.moneygram.com/AgentConnect1211}stringMax30" minOccurs="0"/>
 *         &lt;element name="thirdPartyOrg" type="{http://www.moneygram.com/AgentConnect1211}stringMax60" minOccurs="0"/>
 *         &lt;element name="productVariant" type="{http://www.moneygram.com/AgentConnect1211}productVariant"/>
 *         &lt;element name="serviceOfferingID" type="{http://www.moneygram.com/AgentConnect1211}stringMax21" minOccurs="0"/>
 *         &lt;element name="sendCurrency" type="{http://www.moneygram.com/AgentConnect1211}currencyCode"/>
 *         &lt;element name="receiveCurrency" type="{http://www.moneygram.com/AgentConnect1211}currencyCode"/>
 *         &lt;element name="cardSwiped" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cardExpirationMonth" type="{http://www.moneygram.com/AgentConnect1211}month" minOccurs="0"/>
 *         &lt;element name="cardExpirationYear" type="{http://www.moneygram.com/AgentConnect1211}year" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormFreeBPLookupResponse", propOrder = {
    "maxAmount",
    "feeAmount",
    "freqCustCardNumber",
    "receiveCountry",
    "receiveCode",
    "receiveAgentID",
    "billerAccountNumber",
    "validateAccountNumber",
    "billerName",
    "senderFirstName",
    "senderMiddleName",
    "senderLastName",
    "senderLastName2",
    "senderAddress",
    "senderAddress2",
    "senderAddress3",
    "senderAddress4",
    "senderCity",
    "senderState",
    "senderZipCode",
    "senderCountry",
    "senderHomePhone",
    "receiverFirstName",
    "receiverMiddleName",
    "receiverLastName",
    "receiverLastName2",
    "messageField1",
    "messageField2",
    "senderPhotoIdType",
    "senderPhotoIdNumber",
    "senderPhotoIdState",
    "senderPhotoIdCountry",
    "senderLegalIdType",
    "senderLegalIdNumber",
    "senderDOB",
    "senderOccupation",
    "thirdPartyFirstName",
    "thirdPartyMiddleName",
    "thirdPartyLastName",
    "thirdPartyLastName2",
    "thirdPartyAddress",
    "thirdPartyAddress2",
    "thirdPartyAddress3",
    "thirdPartyAddress4",
    "thirdPartyCity",
    "thirdPartyState",
    "thirdPartyCountry",
    "thirdPartyZipCode",
    "thirdPartyLegalIdType",
    "thirdPartyLegalIdNumber",
    "thirdPartyDOB",
    "thirdPartyOccupation",
    "thirdPartyOrg",
    "productVariant",
    "serviceOfferingID",
    "sendCurrency",
    "receiveCurrency",
    "cardSwiped",
    "cardExpirationMonth",
    "cardExpirationYear"
})
public class FormFreeBPLookupResponse
    extends Response
{

    @XmlElement(required = true)
    protected BigDecimal maxAmount;
    protected BigDecimal feeAmount;
    protected String freqCustCardNumber;
    @XmlElement(required = true)
    protected String receiveCountry;
    protected String receiveCode;
    protected String receiveAgentID;
    @XmlElement(required = true)
    protected String billerAccountNumber;
    protected String validateAccountNumber;
    protected String billerName;
    protected String senderFirstName;
    protected String senderMiddleName;
    protected String senderLastName;
    protected String senderLastName2;
    protected String senderAddress;
    protected String senderAddress2;
    protected String senderAddress3;
    protected String senderAddress4;
    protected String senderCity;
    protected String senderState;
    protected String senderZipCode;
    protected String senderCountry;
    protected String senderHomePhone;
    protected String receiverFirstName;
    protected String receiverMiddleName;
    protected String receiverLastName;
    protected String receiverLastName2;
    protected String messageField1;
    protected String messageField2;
    protected PhotoIdType senderPhotoIdType;
    protected String senderPhotoIdNumber;
    protected String senderPhotoIdState;
    protected String senderPhotoIdCountry;
    protected LegalIdType senderLegalIdType;
    protected String senderLegalIdNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar senderDOB;
    protected String senderOccupation;
    protected String thirdPartyFirstName;
    protected String thirdPartyMiddleName;
    protected String thirdPartyLastName;
    protected String thirdPartyLastName2;
    protected String thirdPartyAddress;
    protected String thirdPartyAddress2;
    protected String thirdPartyAddress3;
    protected String thirdPartyAddress4;
    protected String thirdPartyCity;
    protected String thirdPartyState;
    protected String thirdPartyCountry;
    protected String thirdPartyZipCode;
    protected LegalIdType thirdPartyLegalIdType;
    protected String thirdPartyLegalIdNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar thirdPartyDOB;
    protected String thirdPartyOccupation;
    protected String thirdPartyOrg;
    @XmlElement(required = true)
    protected ProductVariant productVariant;
    protected String serviceOfferingID;
    @XmlElement(required = true)
    protected String sendCurrency;
    @XmlElement(required = true)
    protected String receiveCurrency;
    protected Boolean cardSwiped;
    protected String cardExpirationMonth;
    protected String cardExpirationYear;

    /**
     * Gets the value of the maxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    /**
     * Sets the value of the maxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAmount(BigDecimal value) {
        this.maxAmount = value;
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
     * Gets the value of the freqCustCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreqCustCardNumber() {
        return freqCustCardNumber;
    }

    /**
     * Sets the value of the freqCustCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreqCustCardNumber(String value) {
        this.freqCustCardNumber = value;
    }

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
     * Gets the value of the receiveCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveCode() {
        return receiveCode;
    }

    /**
     * Sets the value of the receiveCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveCode(String value) {
        this.receiveCode = value;
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
     * Gets the value of the validateAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidateAccountNumber() {
        return validateAccountNumber;
    }

    /**
     * Sets the value of the validateAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidateAccountNumber(String value) {
        this.validateAccountNumber = value;
    }

    /**
     * Gets the value of the billerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillerName() {
        return billerName;
    }

    /**
     * Sets the value of the billerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillerName(String value) {
        this.billerName = value;
    }

    /**
     * Gets the value of the senderFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderFirstName() {
        return senderFirstName;
    }

    /**
     * Sets the value of the senderFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderFirstName(String value) {
        this.senderFirstName = value;
    }

    /**
     * Gets the value of the senderMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderMiddleName() {
        return senderMiddleName;
    }

    /**
     * Sets the value of the senderMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderMiddleName(String value) {
        this.senderMiddleName = value;
    }

    /**
     * Gets the value of the senderLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderLastName() {
        return senderLastName;
    }

    /**
     * Sets the value of the senderLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderLastName(String value) {
        this.senderLastName = value;
    }

    /**
     * Gets the value of the senderLastName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderLastName2() {
        return senderLastName2;
    }

    /**
     * Sets the value of the senderLastName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderLastName2(String value) {
        this.senderLastName2 = value;
    }

    /**
     * Gets the value of the senderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderAddress() {
        return senderAddress;
    }

    /**
     * Sets the value of the senderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderAddress(String value) {
        this.senderAddress = value;
    }

    /**
     * Gets the value of the senderAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderAddress2() {
        return senderAddress2;
    }

    /**
     * Sets the value of the senderAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderAddress2(String value) {
        this.senderAddress2 = value;
    }

    /**
     * Gets the value of the senderAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderAddress3() {
        return senderAddress3;
    }

    /**
     * Sets the value of the senderAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderAddress3(String value) {
        this.senderAddress3 = value;
    }

    /**
     * Gets the value of the senderAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderAddress4() {
        return senderAddress4;
    }

    /**
     * Sets the value of the senderAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderAddress4(String value) {
        this.senderAddress4 = value;
    }

    /**
     * Gets the value of the senderCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderCity() {
        return senderCity;
    }

    /**
     * Sets the value of the senderCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderCity(String value) {
        this.senderCity = value;
    }

    /**
     * Gets the value of the senderState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderState() {
        return senderState;
    }

    /**
     * Sets the value of the senderState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderState(String value) {
        this.senderState = value;
    }

    /**
     * Gets the value of the senderZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderZipCode() {
        return senderZipCode;
    }

    /**
     * Sets the value of the senderZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderZipCode(String value) {
        this.senderZipCode = value;
    }

    /**
     * Gets the value of the senderCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderCountry() {
        return senderCountry;
    }

    /**
     * Sets the value of the senderCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderCountry(String value) {
        this.senderCountry = value;
    }

    /**
     * Gets the value of the senderHomePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderHomePhone() {
        return senderHomePhone;
    }

    /**
     * Sets the value of the senderHomePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderHomePhone(String value) {
        this.senderHomePhone = value;
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
     * Gets the value of the messageField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageField1() {
        return messageField1;
    }

    /**
     * Sets the value of the messageField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageField1(String value) {
        this.messageField1 = value;
    }

    /**
     * Gets the value of the messageField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageField2() {
        return messageField2;
    }

    /**
     * Sets the value of the messageField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageField2(String value) {
        this.messageField2 = value;
    }

    /**
     * Gets the value of the senderPhotoIdType property.
     * 
     * @return
     *     possible object is
     *     {@link PhotoIdType }
     *     
     */
    public PhotoIdType getSenderPhotoIdType() {
        return senderPhotoIdType;
    }

    /**
     * Sets the value of the senderPhotoIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhotoIdType }
     *     
     */
    public void setSenderPhotoIdType(PhotoIdType value) {
        this.senderPhotoIdType = value;
    }

    /**
     * Gets the value of the senderPhotoIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderPhotoIdNumber() {
        return senderPhotoIdNumber;
    }

    /**
     * Sets the value of the senderPhotoIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderPhotoIdNumber(String value) {
        this.senderPhotoIdNumber = value;
    }

    /**
     * Gets the value of the senderPhotoIdState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderPhotoIdState() {
        return senderPhotoIdState;
    }

    /**
     * Sets the value of the senderPhotoIdState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderPhotoIdState(String value) {
        this.senderPhotoIdState = value;
    }

    /**
     * Gets the value of the senderPhotoIdCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderPhotoIdCountry() {
        return senderPhotoIdCountry;
    }

    /**
     * Sets the value of the senderPhotoIdCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderPhotoIdCountry(String value) {
        this.senderPhotoIdCountry = value;
    }

    /**
     * Gets the value of the senderLegalIdType property.
     * 
     * @return
     *     possible object is
     *     {@link LegalIdType }
     *     
     */
    public LegalIdType getSenderLegalIdType() {
        return senderLegalIdType;
    }

    /**
     * Sets the value of the senderLegalIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalIdType }
     *     
     */
    public void setSenderLegalIdType(LegalIdType value) {
        this.senderLegalIdType = value;
    }

    /**
     * Gets the value of the senderLegalIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderLegalIdNumber() {
        return senderLegalIdNumber;
    }

    /**
     * Sets the value of the senderLegalIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderLegalIdNumber(String value) {
        this.senderLegalIdNumber = value;
    }

    /**
     * Gets the value of the senderDOB property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSenderDOB() {
        return senderDOB;
    }

    /**
     * Sets the value of the senderDOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSenderDOB(XMLGregorianCalendar value) {
        this.senderDOB = value;
    }

    /**
     * Gets the value of the senderOccupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderOccupation() {
        return senderOccupation;
    }

    /**
     * Sets the value of the senderOccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderOccupation(String value) {
        this.senderOccupation = value;
    }

    /**
     * Gets the value of the thirdPartyFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyFirstName() {
        return thirdPartyFirstName;
    }

    /**
     * Sets the value of the thirdPartyFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyFirstName(String value) {
        this.thirdPartyFirstName = value;
    }

    /**
     * Gets the value of the thirdPartyMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyMiddleName() {
        return thirdPartyMiddleName;
    }

    /**
     * Sets the value of the thirdPartyMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyMiddleName(String value) {
        this.thirdPartyMiddleName = value;
    }

    /**
     * Gets the value of the thirdPartyLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyLastName() {
        return thirdPartyLastName;
    }

    /**
     * Sets the value of the thirdPartyLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyLastName(String value) {
        this.thirdPartyLastName = value;
    }

    /**
     * Gets the value of the thirdPartyLastName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyLastName2() {
        return thirdPartyLastName2;
    }

    /**
     * Sets the value of the thirdPartyLastName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyLastName2(String value) {
        this.thirdPartyLastName2 = value;
    }

    /**
     * Gets the value of the thirdPartyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyAddress() {
        return thirdPartyAddress;
    }

    /**
     * Sets the value of the thirdPartyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyAddress(String value) {
        this.thirdPartyAddress = value;
    }

    /**
     * Gets the value of the thirdPartyAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyAddress2() {
        return thirdPartyAddress2;
    }

    /**
     * Sets the value of the thirdPartyAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyAddress2(String value) {
        this.thirdPartyAddress2 = value;
    }

    /**
     * Gets the value of the thirdPartyAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyAddress3() {
        return thirdPartyAddress3;
    }

    /**
     * Sets the value of the thirdPartyAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyAddress3(String value) {
        this.thirdPartyAddress3 = value;
    }

    /**
     * Gets the value of the thirdPartyAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyAddress4() {
        return thirdPartyAddress4;
    }

    /**
     * Sets the value of the thirdPartyAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyAddress4(String value) {
        this.thirdPartyAddress4 = value;
    }

    /**
     * Gets the value of the thirdPartyCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyCity() {
        return thirdPartyCity;
    }

    /**
     * Sets the value of the thirdPartyCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyCity(String value) {
        this.thirdPartyCity = value;
    }

    /**
     * Gets the value of the thirdPartyState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyState() {
        return thirdPartyState;
    }

    /**
     * Sets the value of the thirdPartyState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyState(String value) {
        this.thirdPartyState = value;
    }

    /**
     * Gets the value of the thirdPartyCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyCountry() {
        return thirdPartyCountry;
    }

    /**
     * Sets the value of the thirdPartyCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyCountry(String value) {
        this.thirdPartyCountry = value;
    }

    /**
     * Gets the value of the thirdPartyZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyZipCode() {
        return thirdPartyZipCode;
    }

    /**
     * Sets the value of the thirdPartyZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyZipCode(String value) {
        this.thirdPartyZipCode = value;
    }

    /**
     * Gets the value of the thirdPartyLegalIdType property.
     * 
     * @return
     *     possible object is
     *     {@link LegalIdType }
     *     
     */
    public LegalIdType getThirdPartyLegalIdType() {
        return thirdPartyLegalIdType;
    }

    /**
     * Sets the value of the thirdPartyLegalIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalIdType }
     *     
     */
    public void setThirdPartyLegalIdType(LegalIdType value) {
        this.thirdPartyLegalIdType = value;
    }

    /**
     * Gets the value of the thirdPartyLegalIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyLegalIdNumber() {
        return thirdPartyLegalIdNumber;
    }

    /**
     * Sets the value of the thirdPartyLegalIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyLegalIdNumber(String value) {
        this.thirdPartyLegalIdNumber = value;
    }

    /**
     * Gets the value of the thirdPartyDOB property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThirdPartyDOB() {
        return thirdPartyDOB;
    }

    /**
     * Sets the value of the thirdPartyDOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThirdPartyDOB(XMLGregorianCalendar value) {
        this.thirdPartyDOB = value;
    }

    /**
     * Gets the value of the thirdPartyOccupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyOccupation() {
        return thirdPartyOccupation;
    }

    /**
     * Sets the value of the thirdPartyOccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyOccupation(String value) {
        this.thirdPartyOccupation = value;
    }

    /**
     * Gets the value of the thirdPartyOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyOrg() {
        return thirdPartyOrg;
    }

    /**
     * Sets the value of the thirdPartyOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyOrg(String value) {
        this.thirdPartyOrg = value;
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
     * Gets the value of the cardExpirationMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpirationMonth() {
        return cardExpirationMonth;
    }

    /**
     * Sets the value of the cardExpirationMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpirationMonth(String value) {
        this.cardExpirationMonth = value;
    }

    /**
     * Gets the value of the cardExpirationYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpirationYear() {
        return cardExpirationYear;
    }

    /**
     * Sets the value of the cardExpirationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpirationYear(String value) {
        this.cardExpirationYear = value;
    }

}
