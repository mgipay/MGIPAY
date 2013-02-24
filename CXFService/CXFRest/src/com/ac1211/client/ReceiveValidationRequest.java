
package com.ac1211.client;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReceiveValidationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiveValidationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Request">
 *       &lt;sequence>
 *         &lt;element name="operatorName" type="{http://www.moneygram.com/AgentConnect1211}stringMax7" minOccurs="0"/>
 *         &lt;element name="referenceNumber" type="{http://www.moneygram.com/AgentConnect1211}referenceNumber"/>
 *         &lt;element name="pin" type="{http://www.moneygram.com/AgentConnect1211}stringMax8" minOccurs="0"/>
 *         &lt;element name="receiveCurrency" type="{http://www.moneygram.com/AgentConnect1211}currencyCode"/>
 *         &lt;element name="agentCheckNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax12" minOccurs="0"/>
 *         &lt;element name="agentCheckType" type="{http://www.moneygram.com/AgentConnect1211}checkType" minOccurs="0"/>
 *         &lt;element name="agentCheckAmount" type="{http://www.moneygram.com/AgentConnect1211}decimal14" minOccurs="0"/>
 *         &lt;element name="customerCheckNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax12" minOccurs="0"/>
 *         &lt;element name="customerCheckType" type="{http://www.moneygram.com/AgentConnect1211}checkType" minOccurs="0"/>
 *         &lt;element name="customerCheckAmount" type="{http://www.moneygram.com/AgentConnect1211}decimal14" minOccurs="0"/>
 *         &lt;element name="receiverAddress" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="receiverAddress2" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="receiverAddress3" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="receiverCity" type="{http://www.moneygram.com/AgentConnect1211}cityTypeLong" minOccurs="0"/>
 *         &lt;element name="receiverState" type="{http://www.moneygram.com/AgentConnect1211}stateType" minOccurs="0"/>
 *         &lt;element name="receiverZipCode" type="{http://www.moneygram.com/AgentConnect1211}zipType" minOccurs="0"/>
 *         &lt;element name="receiverCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="receiverPhotoIdType" type="{http://www.moneygram.com/AgentConnect1211}photoIdType" minOccurs="0"/>
 *         &lt;element name="receiverPhotoIdNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax20" minOccurs="0"/>
 *         &lt;element name="receiverPhotoIdState" type="{http://www.moneygram.com/AgentConnect1211}stateType" minOccurs="0"/>
 *         &lt;element name="receiverPhotoIdCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="receiverLegalIdType" type="{http://www.moneygram.com/AgentConnect1211}legalIdType" minOccurs="0"/>
 *         &lt;element name="receiverLegalIdNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax14" minOccurs="0"/>
 *         &lt;element name="receiverDOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="receiverOccupation" type="{http://www.moneygram.com/AgentConnect1211}stringMax30" minOccurs="0"/>
 *         &lt;element name="thirdPartyFirstName" type="{http://www.moneygram.com/AgentConnect1211}fNameLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyMiddleName" type="{http://www.moneygram.com/AgentConnect1211}mNameLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyLastName" type="{http://www.moneygram.com/AgentConnect1211}lNameLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyAddress" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyAddress2" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyAddress3" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyCity" type="{http://www.moneygram.com/AgentConnect1211}cityTypeLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyState" type="{http://www.moneygram.com/AgentConnect1211}stateType" minOccurs="0"/>
 *         &lt;element name="thirdPartyZipCode" type="{http://www.moneygram.com/AgentConnect1211}zipType" minOccurs="0"/>
 *         &lt;element name="thirdPartyCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="thirdPartyLegalIdType" type="{http://www.moneygram.com/AgentConnect1211}legalIdType" minOccurs="0"/>
 *         &lt;element name="thirdPartyLegalIdNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax14" minOccurs="0"/>
 *         &lt;element name="thirdPartyDOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="thirdPartyOccupation" type="{http://www.moneygram.com/AgentConnect1211}stringMax30" minOccurs="0"/>
 *         &lt;element name="thirdPartyOrg" type="{http://www.moneygram.com/AgentConnect1211}stringMax60" minOccurs="0"/>
 *         &lt;element name="receiverBirthCity" type="{http://www.moneygram.com/AgentConnect1211}cityTypeLong" minOccurs="0"/>
 *         &lt;element name="receiverBirthCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="receiverPassportIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="receiverPassportIssueCity" type="{http://www.moneygram.com/AgentConnect1211}cityTypeLong" minOccurs="0"/>
 *         &lt;element name="receiverPassportIssueCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="pcTerminalNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax10" minOccurs="0"/>
 *         &lt;element name="agentUseReceiveData" type="{http://www.moneygram.com/AgentConnect1211}stringMax200" minOccurs="0"/>
 *         &lt;element name="billerAccountNumber" type="{http://www.moneygram.com/AgentConnect1211}billerAccountNumber" minOccurs="0"/>
 *         &lt;element name="otherPayoutType" type="{http://www.moneygram.com/AgentConnect1211}otherPayoutType" minOccurs="0"/>
 *         &lt;element name="otherPayoutAmount" type="{http://www.moneygram.com/AgentConnect1211}decimal14" minOccurs="0"/>
 *         &lt;element name="cardExpirationMonth" type="{http://www.moneygram.com/AgentConnect1211}month" minOccurs="0"/>
 *         &lt;element name="cardExpirationYear" type="{http://www.moneygram.com/AgentConnect1211}year" minOccurs="0"/>
 *         &lt;element name="cardSwiped" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="consumerId" type="{http://www.moneygram.com/AgentConnect1211}consumerId"/>
 *         &lt;element name="receiverPhone" type="{http://www.moneygram.com/AgentConnect1211}phoneType14" minOccurs="0"/>
 *         &lt;element name="receiverLegalIdIssueCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="thirdPartyPhotoIdType" type="{http://www.moneygram.com/AgentConnect1211}photoIdType" minOccurs="0"/>
 *         &lt;element name="thirdPartyPhotoIdNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax20" minOccurs="0"/>
 *         &lt;element name="thirdPartyPhotoIdState" type="{http://www.moneygram.com/AgentConnect1211}stateType" minOccurs="0"/>
 *         &lt;element name="thirdPartyPhotoIdIssueCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="thirdPartyLegalIdIssueCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="agentConsumerID" type="{http://www.moneygram.com/AgentConnect1211}agentConsumerId" minOccurs="0"/>
 *         &lt;element name="agentTransactionId" type="{http://www.moneygram.com/AgentConnect1211}stringMax20" minOccurs="0"/>
 *         &lt;element name="mgiTransactionSessionID" type="{http://www.moneygram.com/AgentConnect1211}mgiTransactionSessionID"/>
 *         &lt;element name="formFreeStaging" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="timeToLive" type="{http://www.moneygram.com/AgentConnect1211}int5" minOccurs="0"/>
 *         &lt;element name="fieldValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="keyValuePair" type="{http://www.moneygram.com/AgentConnect1211}KeyValuePair" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiveValidationRequest", propOrder = {
    "operatorName",
    "referenceNumber",
    "pin",
    "receiveCurrency",
    "agentCheckNumber",
    "agentCheckType",
    "agentCheckAmount",
    "customerCheckNumber",
    "customerCheckType",
    "customerCheckAmount",
    "receiverAddress",
    "receiverAddress2",
    "receiverAddress3",
    "receiverCity",
    "receiverState",
    "receiverZipCode",
    "receiverCountry",
    "receiverPhotoIdType",
    "receiverPhotoIdNumber",
    "receiverPhotoIdState",
    "receiverPhotoIdCountry",
    "receiverLegalIdType",
    "receiverLegalIdNumber",
    "receiverDOB",
    "receiverOccupation",
    "thirdPartyFirstName",
    "thirdPartyMiddleName",
    "thirdPartyLastName",
    "thirdPartyAddress",
    "thirdPartyAddress2",
    "thirdPartyAddress3",
    "thirdPartyCity",
    "thirdPartyState",
    "thirdPartyZipCode",
    "thirdPartyCountry",
    "thirdPartyLegalIdType",
    "thirdPartyLegalIdNumber",
    "thirdPartyDOB",
    "thirdPartyOccupation",
    "thirdPartyOrg",
    "receiverBirthCity",
    "receiverBirthCountry",
    "receiverPassportIssueDate",
    "receiverPassportIssueCity",
    "receiverPassportIssueCountry",
    "pcTerminalNumber",
    "agentUseReceiveData",
    "billerAccountNumber",
    "otherPayoutType",
    "otherPayoutAmount",
    "cardExpirationMonth",
    "cardExpirationYear",
    "cardSwiped",
    "consumerId",
    "receiverPhone",
    "receiverLegalIdIssueCountry",
    "thirdPartyPhotoIdType",
    "thirdPartyPhotoIdNumber",
    "thirdPartyPhotoIdState",
    "thirdPartyPhotoIdIssueCountry",
    "thirdPartyLegalIdIssueCountry",
    "agentConsumerID",
    "agentTransactionId",
    "mgiTransactionSessionID",
    "formFreeStaging",
    "timeToLive",
    "fieldValues"
})
public class ReceiveValidationRequest
    extends Request
{

    protected String operatorName;
    @XmlElement(required = true)
    protected String referenceNumber;
    protected String pin;
    @XmlElement(required = true)
    protected String receiveCurrency;
    protected String agentCheckNumber;
    protected String agentCheckType;
    protected BigDecimal agentCheckAmount;
    protected String customerCheckNumber;
    protected String customerCheckType;
    protected BigDecimal customerCheckAmount;
    protected String receiverAddress;
    protected String receiverAddress2;
    protected String receiverAddress3;
    protected String receiverCity;
    protected String receiverState;
    protected String receiverZipCode;
    protected String receiverCountry;
    protected PhotoIdType receiverPhotoIdType;
    protected String receiverPhotoIdNumber;
    protected String receiverPhotoIdState;
    protected String receiverPhotoIdCountry;
    protected LegalIdType receiverLegalIdType;
    protected String receiverLegalIdNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receiverDOB;
    protected String receiverOccupation;
    protected String thirdPartyFirstName;
    protected String thirdPartyMiddleName;
    protected String thirdPartyLastName;
    protected String thirdPartyAddress;
    protected String thirdPartyAddress2;
    protected String thirdPartyAddress3;
    protected String thirdPartyCity;
    protected String thirdPartyState;
    protected String thirdPartyZipCode;
    protected String thirdPartyCountry;
    protected LegalIdType thirdPartyLegalIdType;
    protected String thirdPartyLegalIdNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar thirdPartyDOB;
    protected String thirdPartyOccupation;
    protected String thirdPartyOrg;
    protected String receiverBirthCity;
    protected String receiverBirthCountry;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receiverPassportIssueDate;
    protected String receiverPassportIssueCity;
    protected String receiverPassportIssueCountry;
    protected String pcTerminalNumber;
    protected String agentUseReceiveData;
    protected String billerAccountNumber;
    protected String otherPayoutType;
    protected BigDecimal otherPayoutAmount;
    protected String cardExpirationMonth;
    protected String cardExpirationYear;
    protected Boolean cardSwiped;
    @XmlElement(required = true)
    protected String consumerId;
    protected String receiverPhone;
    protected String receiverLegalIdIssueCountry;
    protected PhotoIdType thirdPartyPhotoIdType;
    protected String thirdPartyPhotoIdNumber;
    protected String thirdPartyPhotoIdState;
    protected String thirdPartyPhotoIdIssueCountry;
    protected String thirdPartyLegalIdIssueCountry;
    protected String agentConsumerID;
    protected String agentTransactionId;
    @XmlElement(required = true)
    protected String mgiTransactionSessionID;
    protected boolean formFreeStaging;
    protected BigInteger timeToLive;
    protected ReceiveValidationRequest.FieldValues fieldValues;

    /**
     * Gets the value of the operatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * Sets the value of the operatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorName(String value) {
        this.operatorName = value;
    }

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
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
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
     * Gets the value of the agentCheckNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentCheckNumber() {
        return agentCheckNumber;
    }

    /**
     * Sets the value of the agentCheckNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentCheckNumber(String value) {
        this.agentCheckNumber = value;
    }

    /**
     * Gets the value of the agentCheckType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentCheckType() {
        return agentCheckType;
    }

    /**
     * Sets the value of the agentCheckType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentCheckType(String value) {
        this.agentCheckType = value;
    }

    /**
     * Gets the value of the agentCheckAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgentCheckAmount() {
        return agentCheckAmount;
    }

    /**
     * Sets the value of the agentCheckAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAgentCheckAmount(BigDecimal value) {
        this.agentCheckAmount = value;
    }

    /**
     * Gets the value of the customerCheckNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCheckNumber() {
        return customerCheckNumber;
    }

    /**
     * Sets the value of the customerCheckNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCheckNumber(String value) {
        this.customerCheckNumber = value;
    }

    /**
     * Gets the value of the customerCheckType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCheckType() {
        return customerCheckType;
    }

    /**
     * Sets the value of the customerCheckType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCheckType(String value) {
        this.customerCheckType = value;
    }

    /**
     * Gets the value of the customerCheckAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomerCheckAmount() {
        return customerCheckAmount;
    }

    /**
     * Sets the value of the customerCheckAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomerCheckAmount(BigDecimal value) {
        this.customerCheckAmount = value;
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
     * Gets the value of the receiverPhotoIdType property.
     * 
     * @return
     *     possible object is
     *     {@link PhotoIdType }
     *     
     */
    public PhotoIdType getReceiverPhotoIdType() {
        return receiverPhotoIdType;
    }

    /**
     * Sets the value of the receiverPhotoIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhotoIdType }
     *     
     */
    public void setReceiverPhotoIdType(PhotoIdType value) {
        this.receiverPhotoIdType = value;
    }

    /**
     * Gets the value of the receiverPhotoIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverPhotoIdNumber() {
        return receiverPhotoIdNumber;
    }

    /**
     * Sets the value of the receiverPhotoIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverPhotoIdNumber(String value) {
        this.receiverPhotoIdNumber = value;
    }

    /**
     * Gets the value of the receiverPhotoIdState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverPhotoIdState() {
        return receiverPhotoIdState;
    }

    /**
     * Sets the value of the receiverPhotoIdState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverPhotoIdState(String value) {
        this.receiverPhotoIdState = value;
    }

    /**
     * Gets the value of the receiverPhotoIdCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverPhotoIdCountry() {
        return receiverPhotoIdCountry;
    }

    /**
     * Sets the value of the receiverPhotoIdCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverPhotoIdCountry(String value) {
        this.receiverPhotoIdCountry = value;
    }

    /**
     * Gets the value of the receiverLegalIdType property.
     * 
     * @return
     *     possible object is
     *     {@link LegalIdType }
     *     
     */
    public LegalIdType getReceiverLegalIdType() {
        return receiverLegalIdType;
    }

    /**
     * Sets the value of the receiverLegalIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalIdType }
     *     
     */
    public void setReceiverLegalIdType(LegalIdType value) {
        this.receiverLegalIdType = value;
    }

    /**
     * Gets the value of the receiverLegalIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverLegalIdNumber() {
        return receiverLegalIdNumber;
    }

    /**
     * Sets the value of the receiverLegalIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverLegalIdNumber(String value) {
        this.receiverLegalIdNumber = value;
    }

    /**
     * Gets the value of the receiverDOB property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiverDOB() {
        return receiverDOB;
    }

    /**
     * Sets the value of the receiverDOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiverDOB(XMLGregorianCalendar value) {
        this.receiverDOB = value;
    }

    /**
     * Gets the value of the receiverOccupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverOccupation() {
        return receiverOccupation;
    }

    /**
     * Sets the value of the receiverOccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverOccupation(String value) {
        this.receiverOccupation = value;
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
     * Gets the value of the receiverBirthCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverBirthCity() {
        return receiverBirthCity;
    }

    /**
     * Sets the value of the receiverBirthCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverBirthCity(String value) {
        this.receiverBirthCity = value;
    }

    /**
     * Gets the value of the receiverBirthCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverBirthCountry() {
        return receiverBirthCountry;
    }

    /**
     * Sets the value of the receiverBirthCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverBirthCountry(String value) {
        this.receiverBirthCountry = value;
    }

    /**
     * Gets the value of the receiverPassportIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiverPassportIssueDate() {
        return receiverPassportIssueDate;
    }

    /**
     * Sets the value of the receiverPassportIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiverPassportIssueDate(XMLGregorianCalendar value) {
        this.receiverPassportIssueDate = value;
    }

    /**
     * Gets the value of the receiverPassportIssueCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverPassportIssueCity() {
        return receiverPassportIssueCity;
    }

    /**
     * Sets the value of the receiverPassportIssueCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverPassportIssueCity(String value) {
        this.receiverPassportIssueCity = value;
    }

    /**
     * Gets the value of the receiverPassportIssueCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverPassportIssueCountry() {
        return receiverPassportIssueCountry;
    }

    /**
     * Sets the value of the receiverPassportIssueCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverPassportIssueCountry(String value) {
        this.receiverPassportIssueCountry = value;
    }

    /**
     * Gets the value of the pcTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcTerminalNumber() {
        return pcTerminalNumber;
    }

    /**
     * Sets the value of the pcTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcTerminalNumber(String value) {
        this.pcTerminalNumber = value;
    }

    /**
     * Gets the value of the agentUseReceiveData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentUseReceiveData() {
        return agentUseReceiveData;
    }

    /**
     * Sets the value of the agentUseReceiveData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentUseReceiveData(String value) {
        this.agentUseReceiveData = value;
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
     * Gets the value of the otherPayoutAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherPayoutAmount() {
        return otherPayoutAmount;
    }

    /**
     * Sets the value of the otherPayoutAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherPayoutAmount(BigDecimal value) {
        this.otherPayoutAmount = value;
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
     * Gets the value of the receiverLegalIdIssueCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverLegalIdIssueCountry() {
        return receiverLegalIdIssueCountry;
    }

    /**
     * Sets the value of the receiverLegalIdIssueCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverLegalIdIssueCountry(String value) {
        this.receiverLegalIdIssueCountry = value;
    }

    /**
     * Gets the value of the thirdPartyPhotoIdType property.
     * 
     * @return
     *     possible object is
     *     {@link PhotoIdType }
     *     
     */
    public PhotoIdType getThirdPartyPhotoIdType() {
        return thirdPartyPhotoIdType;
    }

    /**
     * Sets the value of the thirdPartyPhotoIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhotoIdType }
     *     
     */
    public void setThirdPartyPhotoIdType(PhotoIdType value) {
        this.thirdPartyPhotoIdType = value;
    }

    /**
     * Gets the value of the thirdPartyPhotoIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyPhotoIdNumber() {
        return thirdPartyPhotoIdNumber;
    }

    /**
     * Sets the value of the thirdPartyPhotoIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyPhotoIdNumber(String value) {
        this.thirdPartyPhotoIdNumber = value;
    }

    /**
     * Gets the value of the thirdPartyPhotoIdState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyPhotoIdState() {
        return thirdPartyPhotoIdState;
    }

    /**
     * Sets the value of the thirdPartyPhotoIdState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyPhotoIdState(String value) {
        this.thirdPartyPhotoIdState = value;
    }

    /**
     * Gets the value of the thirdPartyPhotoIdIssueCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyPhotoIdIssueCountry() {
        return thirdPartyPhotoIdIssueCountry;
    }

    /**
     * Sets the value of the thirdPartyPhotoIdIssueCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyPhotoIdIssueCountry(String value) {
        this.thirdPartyPhotoIdIssueCountry = value;
    }

    /**
     * Gets the value of the thirdPartyLegalIdIssueCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyLegalIdIssueCountry() {
        return thirdPartyLegalIdIssueCountry;
    }

    /**
     * Sets the value of the thirdPartyLegalIdIssueCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyLegalIdIssueCountry(String value) {
        this.thirdPartyLegalIdIssueCountry = value;
    }

    /**
     * Gets the value of the agentConsumerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentConsumerID() {
        return agentConsumerID;
    }

    /**
     * Sets the value of the agentConsumerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentConsumerID(String value) {
        this.agentConsumerID = value;
    }

    /**
     * Gets the value of the agentTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentTransactionId() {
        return agentTransactionId;
    }

    /**
     * Sets the value of the agentTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentTransactionId(String value) {
        this.agentTransactionId = value;
    }

    /**
     * Gets the value of the mgiTransactionSessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMgiTransactionSessionID() {
        return mgiTransactionSessionID;
    }

    /**
     * Sets the value of the mgiTransactionSessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMgiTransactionSessionID(String value) {
        this.mgiTransactionSessionID = value;
    }

    /**
     * Gets the value of the formFreeStaging property.
     * 
     */
    public boolean isFormFreeStaging() {
        return formFreeStaging;
    }

    /**
     * Sets the value of the formFreeStaging property.
     * 
     */
    public void setFormFreeStaging(boolean value) {
        this.formFreeStaging = value;
    }

    /**
     * Gets the value of the timeToLive property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeToLive() {
        return timeToLive;
    }

    /**
     * Sets the value of the timeToLive property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeToLive(BigInteger value) {
        this.timeToLive = value;
    }

    /**
     * Gets the value of the fieldValues property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiveValidationRequest.FieldValues }
     *     
     */
    public ReceiveValidationRequest.FieldValues getFieldValues() {
        return fieldValues;
    }

    /**
     * Sets the value of the fieldValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiveValidationRequest.FieldValues }
     *     
     */
    public void setFieldValues(ReceiveValidationRequest.FieldValues value) {
        this.fieldValues = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="keyValuePair" type="{http://www.moneygram.com/AgentConnect1211}KeyValuePair" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "keyValuePair"
    })
    public static class FieldValues {

        protected List<KeyValuePair> keyValuePair;

        /**
         * Gets the value of the keyValuePair property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the keyValuePair property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKeyValuePair().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KeyValuePair }
         * 
         * 
         */
        public List<KeyValuePair> getKeyValuePair() {
            if (keyValuePair == null) {
                keyValuePair = new ArrayList<KeyValuePair>();
            }
            return this.keyValuePair;
        }

    }

}
