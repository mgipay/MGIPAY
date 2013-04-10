
package com.mgi.agentconnect.client;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SendValidationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendValidationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Request">
 *       &lt;sequence>
 *         &lt;element name="operatorName" type="{http://www.moneygram.com/AgentConnect1211}stringMax7" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.moneygram.com/AgentConnect1211}decimal14nonZero"/>
 *         &lt;element name="feeAmount" type="{http://www.moneygram.com/AgentConnect1211}decimal14" minOccurs="0"/>
 *         &lt;element name="mgiRewardsNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax20" minOccurs="0"/>
 *         &lt;element name="agentCustomerNumber" type="{http://www.moneygram.com/AgentConnect1211}agentFrequentCustomerNumber" minOccurs="0"/>
 *         &lt;element name="destinationCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType"/>
 *         &lt;element name="destinationState" type="{http://www.moneygram.com/AgentConnect1211}stateType" minOccurs="0"/>
 *         &lt;element name="deliveryOption" type="{http://www.moneygram.com/AgentConnect1211}deliveryOption"/>
 *         &lt;element name="receiveCurrency" type="{http://www.moneygram.com/AgentConnect1211}stringMax3" minOccurs="0"/>
 *         &lt;element name="receiveAgentID" type="{http://www.moneygram.com/AgentConnect1211}agentID" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.moneygram.com/AgentConnect1211}billerAccountNumber" minOccurs="0"/>
 *         &lt;element name="customerReceiveNumber" type="{http://www.moneygram.com/AgentConnect1211}customerReceiveNumber" minOccurs="0"/>
 *         &lt;element name="senderFirstName" type="{http://www.moneygram.com/AgentConnect1211}fNameLong"/>
 *         &lt;element name="senderMiddleName" type="{http://www.moneygram.com/AgentConnect1211}mNameLong" minOccurs="0"/>
 *         &lt;element name="senderLastName" type="{http://www.moneygram.com/AgentConnect1211}lNameLong"/>
 *         &lt;element name="senderLastName2" type="{http://www.moneygram.com/AgentConnect1211}lNameLong" minOccurs="0"/>
 *         &lt;element name="senderAddress" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong"/>
 *         &lt;element name="senderAddress2" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="senderAddress3" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="senderCity" type="{http://www.moneygram.com/AgentConnect1211}cityTypeLong"/>
 *         &lt;element name="senderState" type="{http://www.moneygram.com/AgentConnect1211}stateType" minOccurs="0"/>
 *         &lt;element name="senderZipCode" type="{http://www.moneygram.com/AgentConnect1211}zipType"/>
 *         &lt;element name="senderCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType"/>
 *         &lt;element name="senderHomePhone" type="{http://www.moneygram.com/AgentConnect1211}phoneType14" minOccurs="0"/>
 *         &lt;element name="receiverFirstName" type="{http://www.moneygram.com/AgentConnect1211}fNameLong"/>
 *         &lt;element name="receiverMiddleName" type="{http://www.moneygram.com/AgentConnect1211}mNameLong" minOccurs="0"/>
 *         &lt;element name="receiverLastName" type="{http://www.moneygram.com/AgentConnect1211}lNameLong"/>
 *         &lt;element name="receiverLastName2" type="{http://www.moneygram.com/AgentConnect1211}lNameLong" minOccurs="0"/>
 *         &lt;element name="receiverAddress" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="receiverAddress2" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="receiverAddress3" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="direction1" type="{http://www.moneygram.com/AgentConnect1211}directionType" minOccurs="0"/>
 *         &lt;element name="direction2" type="{http://www.moneygram.com/AgentConnect1211}directionType" minOccurs="0"/>
 *         &lt;element name="direction3" type="{http://www.moneygram.com/AgentConnect1211}directionType" minOccurs="0"/>
 *         &lt;element name="receiverCity" type="{http://www.moneygram.com/AgentConnect1211}cityTypeLong" minOccurs="0"/>
 *         &lt;element name="receiverState" type="{http://www.moneygram.com/AgentConnect1211}stateTypeLong" minOccurs="0"/>
 *         &lt;element name="receiverZipCode" type="{http://www.moneygram.com/AgentConnect1211}zipType" minOccurs="0"/>
 *         &lt;element name="receiverCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="receiverPhone" type="{http://www.moneygram.com/AgentConnect1211}phoneType14" minOccurs="0"/>
 *         &lt;element name="testQuestion" type="{http://www.moneygram.com/AgentConnect1211}stringMax30" minOccurs="0"/>
 *         &lt;element name="testAnswer" type="{http://www.moneygram.com/AgentConnect1211}stringMax30" minOccurs="0"/>
 *         &lt;element name="messageField1" type="{http://www.moneygram.com/AgentConnect1211}stringMax40" minOccurs="0"/>
 *         &lt;element name="messageField2" type="{http://www.moneygram.com/AgentConnect1211}stringMax40" minOccurs="0"/>
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
 *         &lt;element name="thirdPartyCity" type="{http://www.moneygram.com/AgentConnect1211}cityTypeLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyState" type="{http://www.moneygram.com/AgentConnect1211}stateType" minOccurs="0"/>
 *         &lt;element name="thirdPartyZipCode" type="{http://www.moneygram.com/AgentConnect1211}zipType" minOccurs="0"/>
 *         &lt;element name="thirdPartyCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="thirdPartyLegalIdType" type="{http://www.moneygram.com/AgentConnect1211}legalIdType" minOccurs="0"/>
 *         &lt;element name="thirdPartyLegalIdNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax14" minOccurs="0"/>
 *         &lt;element name="thirdPartyDOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="thirdPartyOccupation" type="{http://www.moneygram.com/AgentConnect1211}stringMax30" minOccurs="0"/>
 *         &lt;element name="thirdPartyOrg" type="{http://www.moneygram.com/AgentConnect1211}stringMax60" minOccurs="0"/>
 *         &lt;element name="thirdPartyPhotoIdType" type="{http://www.moneygram.com/AgentConnect1211}photoIdType" minOccurs="0"/>
 *         &lt;element name="thirdPartyPhotoIdNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax20" minOccurs="0"/>
 *         &lt;element name="thirdPartyPhotoIdState" type="{http://www.moneygram.com/AgentConnect1211}stateType" minOccurs="0"/>
 *         &lt;element name="thirdPartyPhotoIdIssueCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="thirdPartyLegalIdIssueCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="senderBirthCity" type="{http://www.moneygram.com/AgentConnect1211}cityTypeLong" minOccurs="0"/>
 *         &lt;element name="senderBirthCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="senderPassportIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="senderPassportIssueCity" type="{http://www.moneygram.com/AgentConnect1211}cityTypeLong" minOccurs="0"/>
 *         &lt;element name="senderPassportIssueCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="senderLegalIdIssueCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="senderEmailAddress" type="{http://www.moneygram.com/AgentConnect1211}emailType" minOccurs="0"/>
 *         &lt;element name="senderMobilePhone" type="{http://www.moneygram.com/AgentConnect1211}phoneType14" minOccurs="0"/>
 *         &lt;element name="marketingOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pcTerminalNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax10" minOccurs="0"/>
 *         &lt;element name="agentUseSendData" type="{http://www.moneygram.com/AgentConnect1211}stringMax200" minOccurs="0"/>
 *         &lt;element name="sendCurrency" type="{http://www.moneygram.com/AgentConnect1211}currencyCode"/>
 *         &lt;element name="consumerId" type="{http://www.moneygram.com/AgentConnect1211}consumerId"/>
 *         &lt;element name="senderPhotoIdExpDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="senderPhotoIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="senderPhotoIdStored" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="senderNationalityCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="senderNationalityAtBirthCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="agentTransactionId" type="{http://www.moneygram.com/AgentConnect1211}stringMax20" minOccurs="0"/>
 *         &lt;element name="mgiTransactionSessionID" type="{http://www.moneygram.com/AgentConnect1211}mgiTransactionSessionID"/>
 *         &lt;element name="formFreeStaging" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="timeToLive" type="{http://www.moneygram.com/AgentConnect1211}int5" minOccurs="0"/>
 *         &lt;element name="primaryReceiptLanguage" type="{http://www.moneygram.com/AgentConnect1211}stringMax3" minOccurs="0"/>
 *         &lt;element name="secondaryReceiptLanguage" type="{http://www.moneygram.com/AgentConnect1211}stringMax3" minOccurs="0"/>
 *         &lt;element name="promoCodeValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="promoCode" type="{http://www.moneygram.com/AgentConnect1211}stringMax20" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "SendValidationRequest", propOrder = {
    "operatorName",
    "amount",
    "feeAmount",
    "mgiRewardsNumber",
    "agentCustomerNumber",
    "destinationCountry",
    "destinationState",
    "deliveryOption",
    "receiveCurrency",
    "receiveAgentID",
    "accountNumber",
    "customerReceiveNumber",
    "senderFirstName",
    "senderMiddleName",
    "senderLastName",
    "senderLastName2",
    "senderAddress",
    "senderAddress2",
    "senderAddress3",
    "senderCity",
    "senderState",
    "senderZipCode",
    "senderCountry",
    "senderHomePhone",
    "receiverFirstName",
    "receiverMiddleName",
    "receiverLastName",
    "receiverLastName2",
    "receiverAddress",
    "receiverAddress2",
    "receiverAddress3",
    "direction1",
    "direction2",
    "direction3",
    "receiverCity",
    "receiverState",
    "receiverZipCode",
    "receiverCountry",
    "receiverPhone",
    "testQuestion",
    "testAnswer",
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
    "thirdPartyCity",
    "thirdPartyState",
    "thirdPartyZipCode",
    "thirdPartyCountry",
    "thirdPartyLegalIdType",
    "thirdPartyLegalIdNumber",
    "thirdPartyDOB",
    "thirdPartyOccupation",
    "thirdPartyOrg",
    "thirdPartyPhotoIdType",
    "thirdPartyPhotoIdNumber",
    "thirdPartyPhotoIdState",
    "thirdPartyPhotoIdIssueCountry",
    "thirdPartyLegalIdIssueCountry",
    "senderBirthCity",
    "senderBirthCountry",
    "senderPassportIssueDate",
    "senderPassportIssueCity",
    "senderPassportIssueCountry",
    "senderLegalIdIssueCountry",
    "senderEmailAddress",
    "senderMobilePhone",
    "marketingOptIn",
    "pcTerminalNumber",
    "agentUseSendData",
    "sendCurrency",
    "consumerId",
    "senderPhotoIdExpDate",
    "senderPhotoIdIssueDate",
    "senderPhotoIdStored",
    "senderNationalityCountry",
    "senderNationalityAtBirthCountry",
    "agentTransactionId",
    "mgiTransactionSessionID",
    "formFreeStaging",
    "timeToLive",
    "primaryReceiptLanguage",
    "secondaryReceiptLanguage",
    "promoCodeValues",
    "fieldValues"
})
public class SendValidationRequest
    extends Request
{

    protected String operatorName;
    @XmlElement(required = true)
    protected BigDecimal amount;
    protected BigDecimal feeAmount;
    protected String mgiRewardsNumber;
    protected String agentCustomerNumber;
    @XmlElement(required = true)
    protected String destinationCountry;
    protected String destinationState;
    @XmlElement(required = true)
    protected String deliveryOption;
    protected String receiveCurrency;
    protected String receiveAgentID;
    protected String accountNumber;
    protected String customerReceiveNumber;
    @XmlElement(required = true)
    protected String senderFirstName;
    protected String senderMiddleName;
    @XmlElement(required = true)
    protected String senderLastName;
    protected String senderLastName2;
    @XmlElement(required = true)
    protected String senderAddress;
    protected String senderAddress2;
    protected String senderAddress3;
    @XmlElement(required = true)
    protected String senderCity;
    protected String senderState;
    @XmlElement(required = true)
    protected String senderZipCode;
    @XmlElement(required = true)
    protected String senderCountry;
    protected String senderHomePhone;
    @XmlElement(required = true)
    protected String receiverFirstName;
    protected String receiverMiddleName;
    @XmlElement(required = true)
    protected String receiverLastName;
    protected String receiverLastName2;
    protected String receiverAddress;
    protected String receiverAddress2;
    protected String receiverAddress3;
    protected String direction1;
    protected String direction2;
    protected String direction3;
    protected String receiverCity;
    protected String receiverState;
    protected String receiverZipCode;
    protected String receiverCountry;
    protected String receiverPhone;
    protected String testQuestion;
    protected String testAnswer;
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
    protected PhotoIdType thirdPartyPhotoIdType;
    protected String thirdPartyPhotoIdNumber;
    protected String thirdPartyPhotoIdState;
    protected String thirdPartyPhotoIdIssueCountry;
    protected String thirdPartyLegalIdIssueCountry;
    protected String senderBirthCity;
    protected String senderBirthCountry;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar senderPassportIssueDate;
    protected String senderPassportIssueCity;
    protected String senderPassportIssueCountry;
    protected String senderLegalIdIssueCountry;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String senderEmailAddress;
    protected String senderMobilePhone;
    protected Boolean marketingOptIn;
    protected String pcTerminalNumber;
    protected String agentUseSendData;
    @XmlElement(required = true)
    protected String sendCurrency;
    @XmlElement(required = true)
    protected String consumerId;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar senderPhotoIdExpDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar senderPhotoIdIssueDate;
    protected Boolean senderPhotoIdStored;
    protected String senderNationalityCountry;
    protected String senderNationalityAtBirthCountry;
    protected String agentTransactionId;
    @XmlElement(required = true)
    protected String mgiTransactionSessionID;
    protected boolean formFreeStaging;
    protected BigInteger timeToLive;
    protected String primaryReceiptLanguage;
    protected String secondaryReceiptLanguage;
    protected SendValidationRequest.PromoCodeValues promoCodeValues;
    protected SendValidationRequest.FieldValues fieldValues;

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
     * Gets the value of the mgiRewardsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMgiRewardsNumber() {
        return mgiRewardsNumber;
    }

    /**
     * Sets the value of the mgiRewardsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMgiRewardsNumber(String value) {
        this.mgiRewardsNumber = value;
    }

    /**
     * Gets the value of the agentCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentCustomerNumber() {
        return agentCustomerNumber;
    }

    /**
     * Sets the value of the agentCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentCustomerNumber(String value) {
        this.agentCustomerNumber = value;
    }

    /**
     * Gets the value of the destinationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /**
     * Sets the value of the destinationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCountry(String value) {
        this.destinationCountry = value;
    }

    /**
     * Gets the value of the destinationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationState() {
        return destinationState;
    }

    /**
     * Sets the value of the destinationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationState(String value) {
        this.destinationState = value;
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
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
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
     * Gets the value of the testQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestQuestion() {
        return testQuestion;
    }

    /**
     * Sets the value of the testQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestQuestion(String value) {
        this.testQuestion = value;
    }

    /**
     * Gets the value of the testAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestAnswer() {
        return testAnswer;
    }

    /**
     * Sets the value of the testAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestAnswer(String value) {
        this.testAnswer = value;
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
     * Gets the value of the senderBirthCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderBirthCity() {
        return senderBirthCity;
    }

    /**
     * Sets the value of the senderBirthCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderBirthCity(String value) {
        this.senderBirthCity = value;
    }

    /**
     * Gets the value of the senderBirthCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderBirthCountry() {
        return senderBirthCountry;
    }

    /**
     * Sets the value of the senderBirthCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderBirthCountry(String value) {
        this.senderBirthCountry = value;
    }

    /**
     * Gets the value of the senderPassportIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSenderPassportIssueDate() {
        return senderPassportIssueDate;
    }

    /**
     * Sets the value of the senderPassportIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSenderPassportIssueDate(XMLGregorianCalendar value) {
        this.senderPassportIssueDate = value;
    }

    /**
     * Gets the value of the senderPassportIssueCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderPassportIssueCity() {
        return senderPassportIssueCity;
    }

    /**
     * Sets the value of the senderPassportIssueCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderPassportIssueCity(String value) {
        this.senderPassportIssueCity = value;
    }

    /**
     * Gets the value of the senderPassportIssueCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderPassportIssueCountry() {
        return senderPassportIssueCountry;
    }

    /**
     * Sets the value of the senderPassportIssueCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderPassportIssueCountry(String value) {
        this.senderPassportIssueCountry = value;
    }

    /**
     * Gets the value of the senderLegalIdIssueCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderLegalIdIssueCountry() {
        return senderLegalIdIssueCountry;
    }

    /**
     * Sets the value of the senderLegalIdIssueCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderLegalIdIssueCountry(String value) {
        this.senderLegalIdIssueCountry = value;
    }

    /**
     * Gets the value of the senderEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderEmailAddress() {
        return senderEmailAddress;
    }

    /**
     * Sets the value of the senderEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderEmailAddress(String value) {
        this.senderEmailAddress = value;
    }

    /**
     * Gets the value of the senderMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderMobilePhone() {
        return senderMobilePhone;
    }

    /**
     * Sets the value of the senderMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderMobilePhone(String value) {
        this.senderMobilePhone = value;
    }

    /**
     * Gets the value of the marketingOptIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarketingOptIn() {
        return marketingOptIn;
    }

    /**
     * Sets the value of the marketingOptIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketingOptIn(Boolean value) {
        this.marketingOptIn = value;
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
     * Gets the value of the agentUseSendData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentUseSendData() {
        return agentUseSendData;
    }

    /**
     * Sets the value of the agentUseSendData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentUseSendData(String value) {
        this.agentUseSendData = value;
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
     * Gets the value of the senderPhotoIdExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSenderPhotoIdExpDate() {
        return senderPhotoIdExpDate;
    }

    /**
     * Sets the value of the senderPhotoIdExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSenderPhotoIdExpDate(XMLGregorianCalendar value) {
        this.senderPhotoIdExpDate = value;
    }

    /**
     * Gets the value of the senderPhotoIdIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSenderPhotoIdIssueDate() {
        return senderPhotoIdIssueDate;
    }

    /**
     * Sets the value of the senderPhotoIdIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSenderPhotoIdIssueDate(XMLGregorianCalendar value) {
        this.senderPhotoIdIssueDate = value;
    }

    /**
     * Gets the value of the senderPhotoIdStored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSenderPhotoIdStored() {
        return senderPhotoIdStored;
    }

    /**
     * Sets the value of the senderPhotoIdStored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSenderPhotoIdStored(Boolean value) {
        this.senderPhotoIdStored = value;
    }

    /**
     * Gets the value of the senderNationalityCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderNationalityCountry() {
        return senderNationalityCountry;
    }

    /**
     * Sets the value of the senderNationalityCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderNationalityCountry(String value) {
        this.senderNationalityCountry = value;
    }

    /**
     * Gets the value of the senderNationalityAtBirthCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderNationalityAtBirthCountry() {
        return senderNationalityAtBirthCountry;
    }

    /**
     * Sets the value of the senderNationalityAtBirthCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderNationalityAtBirthCountry(String value) {
        this.senderNationalityAtBirthCountry = value;
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
     * Gets the value of the primaryReceiptLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryReceiptLanguage() {
        return primaryReceiptLanguage;
    }

    /**
     * Sets the value of the primaryReceiptLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryReceiptLanguage(String value) {
        this.primaryReceiptLanguage = value;
    }

    /**
     * Gets the value of the secondaryReceiptLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryReceiptLanguage() {
        return secondaryReceiptLanguage;
    }

    /**
     * Sets the value of the secondaryReceiptLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryReceiptLanguage(String value) {
        this.secondaryReceiptLanguage = value;
    }

    /**
     * Gets the value of the promoCodeValues property.
     * 
     * @return
     *     possible object is
     *     {@link SendValidationRequest.PromoCodeValues }
     *     
     */
    public SendValidationRequest.PromoCodeValues getPromoCodeValues() {
        return promoCodeValues;
    }

    /**
     * Sets the value of the promoCodeValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendValidationRequest.PromoCodeValues }
     *     
     */
    public void setPromoCodeValues(SendValidationRequest.PromoCodeValues value) {
        this.promoCodeValues = value;
    }

    /**
     * Gets the value of the fieldValues property.
     * 
     * @return
     *     possible object is
     *     {@link SendValidationRequest.FieldValues }
     *     
     */
    public SendValidationRequest.FieldValues getFieldValues() {
        return fieldValues;
    }

    /**
     * Sets the value of the fieldValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendValidationRequest.FieldValues }
     *     
     */
    public void setFieldValues(SendValidationRequest.FieldValues value) {
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
     *         &lt;element name="promoCode" type="{http://www.moneygram.com/AgentConnect1211}stringMax20" maxOccurs="unbounded" minOccurs="0"/>
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
        "promoCode"
    })
    public static class PromoCodeValues {

        protected List<String> promoCode;

        /**
         * Gets the value of the promoCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promoCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPromoCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPromoCode() {
            if (promoCode == null) {
                promoCode = new ArrayList<String>();
            }
            return this.promoCode;
        }

    }

}
