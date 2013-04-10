
package com.mgi.agentconnect.client;

import java.math.BigDecimal;
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
 * <p>Java class for FormFreeSendLookupResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormFreeSendLookupResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Response">
 *       &lt;sequence>
 *         &lt;element name="agentTransactionId" type="{http://www.moneygram.com/AgentConnect1211}stringMax20" minOccurs="0"/>
 *         &lt;element name="confirmationNumber" type="{http://www.moneygram.com/AgentConnect1211}confirmationNumber" minOccurs="0"/>
 *         &lt;element name="mgiTransactionSessionID" type="{http://www.moneygram.com/AgentConnect1211}mgiTransactionSessionID"/>
 *         &lt;element name="maxAmount" type="{http://www.moneygram.com/AgentConnect1211}decimal14nonZero"/>
 *         &lt;element name="mgiRewardsNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax20" minOccurs="0"/>
 *         &lt;element name="agentCustomerNumber" type="{http://www.moneygram.com/AgentConnect1211}agentFrequentCustomerNumber" minOccurs="0"/>
 *         &lt;element name="destinationCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType"/>
 *         &lt;element name="destinationState" type="{http://www.moneygram.com/AgentConnect1211}stateType" minOccurs="0"/>
 *         &lt;element name="deliveryOption" type="{http://www.moneygram.com/AgentConnect1211}deliveryOption"/>
 *         &lt;element name="receiveAgentID" type="{http://www.moneygram.com/AgentConnect1211}agentID" minOccurs="0"/>
 *         &lt;element name="accountNumberLastFour" type="{http://www.moneygram.com/AgentConnect1211}stringMax4" minOccurs="0"/>
 *         &lt;element name="customerReceiveNumber" type="{http://www.moneygram.com/AgentConnect1211}customerReceiveNumber" minOccurs="0"/>
 *         &lt;element name="accountNickname" type="{http://www.moneygram.com/AgentConnect1211}accountNickname" minOccurs="0"/>
 *         &lt;element name="senderFirstName" type="{http://www.moneygram.com/AgentConnect1211}fNameLong"/>
 *         &lt;element name="senderMiddleName" type="{http://www.moneygram.com/AgentConnect1211}mNameLong" minOccurs="0"/>
 *         &lt;element name="senderLastName" type="{http://www.moneygram.com/AgentConnect1211}lNameLong"/>
 *         &lt;element name="senderAddress" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong"/>
 *         &lt;element name="senderAddress2" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="senderAddress3" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="senderCity" type="{http://www.moneygram.com/AgentConnect1211}cityTypeLong"/>
 *         &lt;element name="senderState" type="{http://www.moneygram.com/AgentConnect1211}stateType" minOccurs="0"/>
 *         &lt;element name="senderZipCode" type="{http://www.moneygram.com/AgentConnect1211}zipType" minOccurs="0"/>
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
 *         &lt;element name="promotionInfo" type="{http://www.moneygram.com/AgentConnect1211}PromotionInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="senderPassportIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="senderPassportIssueCity" type="{http://www.moneygram.com/AgentConnect1211}cityTypeLong" minOccurs="0"/>
 *         &lt;element name="senderPassportIssueCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="senderLegalIdIssueCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="senderEmailAddress" type="{http://www.moneygram.com/AgentConnect1211}emailType" minOccurs="0"/>
 *         &lt;element name="senderMobilePhone" type="{http://www.moneygram.com/AgentConnect1211}phoneType14" minOccurs="0"/>
 *         &lt;element name="marketingOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="consumerId" type="{http://www.moneygram.com/AgentConnect1211}consumerId"/>
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
 *         &lt;element name="promotionalMessage" type="{http://www.moneygram.com/AgentConnect1211}TextTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="readyForCommit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="disclosureText" type="{http://www.moneygram.com/AgentConnect1211}TextTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="receiveAgentName" type="{http://www.moneygram.com/AgentConnect1211}stringMax40" minOccurs="0"/>
 *         &lt;element name="receiveAgentAddress" type="{http://www.moneygram.com/AgentConnect1211}AgentAddress" minOccurs="0"/>
 *         &lt;element name="additionalFieldsToCollect" type="{http://www.moneygram.com/AgentConnect1211}ProductFieldInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sendAmounts" type="{http://www.moneygram.com/AgentConnect1211}SendAmountInfo" minOccurs="0"/>
 *         &lt;element name="receiveAmounts" type="{http://www.moneygram.com/AgentConnect1211}ReceiveAmountInfo" minOccurs="0"/>
 *         &lt;element name="exchangeRateApplied" type="{http://www.moneygram.com/AgentConnect1211}decimal14" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormFreeSendLookupResponse", propOrder = {
    "agentTransactionId",
    "confirmationNumber",
    "mgiTransactionSessionID",
    "maxAmount",
    "mgiRewardsNumber",
    "agentCustomerNumber",
    "destinationCountry",
    "destinationState",
    "deliveryOption",
    "receiveAgentID",
    "accountNumberLastFour",
    "customerReceiveNumber",
    "accountNickname",
    "senderFirstName",
    "senderMiddleName",
    "senderLastName",
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
    "promotionInfo",
    "senderPassportIssueDate",
    "senderPassportIssueCity",
    "senderPassportIssueCountry",
    "senderLegalIdIssueCountry",
    "senderEmailAddress",
    "senderMobilePhone",
    "marketingOptIn",
    "consumerId",
    "fieldValues",
    "promotionalMessage",
    "readyForCommit",
    "disclosureText",
    "receiveAgentName",
    "receiveAgentAddress",
    "additionalFieldsToCollect",
    "sendAmounts",
    "receiveAmounts",
    "exchangeRateApplied"
})
public class FormFreeSendLookupResponse
    extends Response
{

    protected String agentTransactionId;
    protected String confirmationNumber;
    @XmlElement(required = true)
    protected String mgiTransactionSessionID;
    @XmlElement(required = true)
    protected BigDecimal maxAmount;
    protected String mgiRewardsNumber;
    protected String agentCustomerNumber;
    @XmlElement(required = true)
    protected String destinationCountry;
    protected String destinationState;
    @XmlElement(required = true)
    protected String deliveryOption;
    protected String receiveAgentID;
    protected String accountNumberLastFour;
    protected String customerReceiveNumber;
    protected String accountNickname;
    @XmlElement(required = true)
    protected String senderFirstName;
    protected String senderMiddleName;
    @XmlElement(required = true)
    protected String senderLastName;
    @XmlElement(required = true)
    protected String senderAddress;
    protected String senderAddress2;
    protected String senderAddress3;
    @XmlElement(required = true)
    protected String senderCity;
    protected String senderState;
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
    protected List<PromotionInfo> promotionInfo;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar senderPassportIssueDate;
    protected String senderPassportIssueCity;
    protected String senderPassportIssueCountry;
    protected String senderLegalIdIssueCountry;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String senderEmailAddress;
    protected String senderMobilePhone;
    protected Boolean marketingOptIn;
    @XmlElement(required = true)
    protected String consumerId;
    protected FormFreeSendLookupResponse.FieldValues fieldValues;
    protected List<TextTranslation> promotionalMessage;
    protected Boolean readyForCommit;
    protected List<TextTranslation> disclosureText;
    protected String receiveAgentName;
    protected AgentAddress receiveAgentAddress;
    protected List<ProductFieldInfo> additionalFieldsToCollect;
    protected SendAmountInfo sendAmounts;
    protected ReceiveAmountInfo receiveAmounts;
    protected BigDecimal exchangeRateApplied;

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
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationNumber(String value) {
        this.confirmationNumber = value;
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
     * Gets the value of the accountNumberLastFour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumberLastFour() {
        return accountNumberLastFour;
    }

    /**
     * Sets the value of the accountNumberLastFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumberLastFour(String value) {
        this.accountNumberLastFour = value;
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
     * Gets the value of the promotionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionInfo }
     * 
     * 
     */
    public List<PromotionInfo> getPromotionInfo() {
        if (promotionInfo == null) {
            promotionInfo = new ArrayList<PromotionInfo>();
        }
        return this.promotionInfo;
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
     * Gets the value of the fieldValues property.
     * 
     * @return
     *     possible object is
     *     {@link FormFreeSendLookupResponse.FieldValues }
     *     
     */
    public FormFreeSendLookupResponse.FieldValues getFieldValues() {
        return fieldValues;
    }

    /**
     * Sets the value of the fieldValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormFreeSendLookupResponse.FieldValues }
     *     
     */
    public void setFieldValues(FormFreeSendLookupResponse.FieldValues value) {
        this.fieldValues = value;
    }

    /**
     * Gets the value of the promotionalMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionalMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionalMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextTranslation }
     * 
     * 
     */
    public List<TextTranslation> getPromotionalMessage() {
        if (promotionalMessage == null) {
            promotionalMessage = new ArrayList<TextTranslation>();
        }
        return this.promotionalMessage;
    }

    /**
     * Gets the value of the readyForCommit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadyForCommit() {
        return readyForCommit;
    }

    /**
     * Sets the value of the readyForCommit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadyForCommit(Boolean value) {
        this.readyForCommit = value;
    }

    /**
     * Gets the value of the disclosureText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disclosureText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclosureText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextTranslation }
     * 
     * 
     */
    public List<TextTranslation> getDisclosureText() {
        if (disclosureText == null) {
            disclosureText = new ArrayList<TextTranslation>();
        }
        return this.disclosureText;
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
     * Gets the value of the receiveAgentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AgentAddress }
     *     
     */
    public AgentAddress getReceiveAgentAddress() {
        return receiveAgentAddress;
    }

    /**
     * Sets the value of the receiveAgentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentAddress }
     *     
     */
    public void setReceiveAgentAddress(AgentAddress value) {
        this.receiveAgentAddress = value;
    }

    /**
     * Gets the value of the additionalFieldsToCollect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalFieldsToCollect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalFieldsToCollect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductFieldInfo }
     * 
     * 
     */
    public List<ProductFieldInfo> getAdditionalFieldsToCollect() {
        if (additionalFieldsToCollect == null) {
            additionalFieldsToCollect = new ArrayList<ProductFieldInfo>();
        }
        return this.additionalFieldsToCollect;
    }

    /**
     * Gets the value of the sendAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link SendAmountInfo }
     *     
     */
    public SendAmountInfo getSendAmounts() {
        return sendAmounts;
    }

    /**
     * Sets the value of the sendAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendAmountInfo }
     *     
     */
    public void setSendAmounts(SendAmountInfo value) {
        this.sendAmounts = value;
    }

    /**
     * Gets the value of the receiveAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiveAmountInfo }
     *     
     */
    public ReceiveAmountInfo getReceiveAmounts() {
        return receiveAmounts;
    }

    /**
     * Sets the value of the receiveAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiveAmountInfo }
     *     
     */
    public void setReceiveAmounts(ReceiveAmountInfo value) {
        this.receiveAmounts = value;
    }

    /**
     * Gets the value of the exchangeRateApplied property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRateApplied() {
        return exchangeRateApplied;
    }

    /**
     * Sets the value of the exchangeRateApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRateApplied(BigDecimal value) {
        this.exchangeRateApplied = value;
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
