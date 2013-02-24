
package com.ac1211.client;

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
 * <p>Java class for FormFreeReceiveLookupResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormFreeReceiveLookupResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Response">
 *       &lt;sequence>
 *         &lt;element name="referenceNumber" type="{http://www.moneygram.com/AgentConnect1211}referenceNumber"/>
 *         &lt;element name="receiveAmount" type="{http://www.moneygram.com/AgentConnect1211}decimal14nonZero"/>
 *         &lt;element name="receiveCurrency" type="{http://www.moneygram.com/AgentConnect1211}currencyCode"/>
 *         &lt;element name="senderFirstName" type="{http://www.moneygram.com/AgentConnect1211}fNameLong" minOccurs="0"/>
 *         &lt;element name="senderMiddleName" type="{http://www.moneygram.com/AgentConnect1211}mNameLong" minOccurs="0"/>
 *         &lt;element name="senderLastName" type="{http://www.moneygram.com/AgentConnect1211}lNameLong" minOccurs="0"/>
 *         &lt;element name="senderLastName2" type="{http://www.moneygram.com/AgentConnect1211}lNameLong" minOccurs="0"/>
 *         &lt;element name="senderHomePhone" type="{http://www.moneygram.com/AgentConnect1211}phoneType14" minOccurs="0"/>
 *         &lt;element name="originatingCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="dateTimeSent" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
 *         &lt;element name="messageField1" type="{http://www.moneygram.com/AgentConnect1211}stringMax40" minOccurs="0"/>
 *         &lt;element name="messageField2" type="{http://www.moneygram.com/AgentConnect1211}stringMax40" minOccurs="0"/>
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
 *         &lt;element name="thirdPartyLastName2" type="{http://www.moneygram.com/AgentConnect1211}lNameLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyAddress" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyAddress2" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyAddress3" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="thirdPartyAddress4" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
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
 *         &lt;element name="consumerId" type="{http://www.moneygram.com/AgentConnect1211}consumerId"/>
 *         &lt;element name="freqCustCardNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax20" minOccurs="0"/>
 *         &lt;element name="receiverPhone" type="{http://www.moneygram.com/AgentConnect1211}phoneType14" minOccurs="0"/>
 *         &lt;element name="receiverPhotoIdExpDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="receiverPhotoIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="receiverPhotoIdStored" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="receiverLegalIdExpDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="receiverLegalIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="receiverLegalIdIssueCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="receiverLegalIdStored" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="receiverPassportNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax20" minOccurs="0"/>
 *         &lt;element name="receiverPassportExpDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="receiverPassportStored" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="receiverNationalityCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="receiverNationalityAtBirthCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="additionalDocumentationNeeded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="purposeOfTransaction" type="{http://www.moneygram.com/AgentConnect1211}stringMax40" minOccurs="0"/>
 *         &lt;element name="relationToSender" type="{http://www.moneygram.com/AgentConnect1211}stringMax30" minOccurs="0"/>
 *         &lt;element name="receiverEmailAddress" type="{http://www.moneygram.com/AgentConnect1211}emailType" minOccurs="0"/>
 *         &lt;element name="receiverMobilePhone" type="{http://www.moneygram.com/AgentConnect1211}phoneType14" minOccurs="0"/>
 *         &lt;element name="marketingOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="thirdPartyPhotoIdType" type="{http://www.moneygram.com/AgentConnect1211}photoIdType" minOccurs="0"/>
 *         &lt;element name="thirdPartyPhotoIdNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax20" minOccurs="0"/>
 *         &lt;element name="thirdPartyPhotoIdExpDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="thirdPartyPhotoIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="thirdPartyPhotoIdIssueCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="thirdPartyPhotoIdStored" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="thirdPartyLegalIdExpDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="thirdPartyLegalIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="thirdPartyLegalIdIssueCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="thirdPartyLegalIdStored" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="mgiTransactionSessionID" type="{http://www.moneygram.com/AgentConnect1211}mgiTransactionSessionID"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormFreeReceiveLookupResponse", propOrder = {
    "referenceNumber",
    "receiveAmount",
    "receiveCurrency",
    "senderFirstName",
    "senderMiddleName",
    "senderLastName",
    "senderLastName2",
    "senderHomePhone",
    "originatingCountry",
    "dateTimeSent",
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
    "messageField1",
    "messageField2",
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
    "thirdPartyLastName2",
    "thirdPartyAddress",
    "thirdPartyAddress2",
    "thirdPartyAddress3",
    "thirdPartyAddress4",
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
    "consumerId",
    "freqCustCardNumber",
    "receiverPhone",
    "receiverPhotoIdExpDate",
    "receiverPhotoIdIssueDate",
    "receiverPhotoIdStored",
    "receiverLegalIdExpDate",
    "receiverLegalIdIssueDate",
    "receiverLegalIdIssueCountry",
    "receiverLegalIdStored",
    "receiverPassportNumber",
    "receiverPassportExpDate",
    "receiverPassportStored",
    "receiverNationalityCountry",
    "receiverNationalityAtBirthCountry",
    "additionalDocumentationNeeded",
    "purposeOfTransaction",
    "relationToSender",
    "receiverEmailAddress",
    "receiverMobilePhone",
    "marketingOptIn",
    "thirdPartyPhotoIdType",
    "thirdPartyPhotoIdNumber",
    "thirdPartyPhotoIdExpDate",
    "thirdPartyPhotoIdIssueDate",
    "thirdPartyPhotoIdIssueCountry",
    "thirdPartyPhotoIdStored",
    "thirdPartyLegalIdExpDate",
    "thirdPartyLegalIdIssueDate",
    "thirdPartyLegalIdIssueCountry",
    "thirdPartyLegalIdStored",
    "fieldValues",
    "mgiTransactionSessionID"
})
public class FormFreeReceiveLookupResponse
    extends Response
{

    @XmlElement(required = true)
    protected String referenceNumber;
    @XmlElement(required = true)
    protected BigDecimal receiveAmount;
    @XmlElement(required = true)
    protected String receiveCurrency;
    protected String senderFirstName;
    protected String senderMiddleName;
    protected String senderLastName;
    protected String senderLastName2;
    protected String senderHomePhone;
    protected String originatingCountry;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeSent;
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
    protected String messageField1;
    protected String messageField2;
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
    protected String thirdPartyLastName2;
    protected String thirdPartyAddress;
    protected String thirdPartyAddress2;
    protected String thirdPartyAddress3;
    protected String thirdPartyAddress4;
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
    @XmlElement(required = true)
    protected String consumerId;
    protected String freqCustCardNumber;
    protected String receiverPhone;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receiverPhotoIdExpDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receiverPhotoIdIssueDate;
    protected Boolean receiverPhotoIdStored;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receiverLegalIdExpDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receiverLegalIdIssueDate;
    protected String receiverLegalIdIssueCountry;
    protected Boolean receiverLegalIdStored;
    protected String receiverPassportNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receiverPassportExpDate;
    protected Boolean receiverPassportStored;
    protected String receiverNationalityCountry;
    protected String receiverNationalityAtBirthCountry;
    protected Boolean additionalDocumentationNeeded;
    protected String purposeOfTransaction;
    protected String relationToSender;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String receiverEmailAddress;
    protected String receiverMobilePhone;
    protected Boolean marketingOptIn;
    protected PhotoIdType thirdPartyPhotoIdType;
    protected String thirdPartyPhotoIdNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar thirdPartyPhotoIdExpDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar thirdPartyPhotoIdIssueDate;
    protected String thirdPartyPhotoIdIssueCountry;
    protected Boolean thirdPartyPhotoIdStored;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar thirdPartyLegalIdExpDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar thirdPartyLegalIdIssueDate;
    protected String thirdPartyLegalIdIssueCountry;
    protected Boolean thirdPartyLegalIdStored;
    protected FormFreeReceiveLookupResponse.FieldValues fieldValues;
    @XmlElement(required = true)
    protected String mgiTransactionSessionID;

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
     * Gets the value of the originatingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingCountry() {
        return originatingCountry;
    }

    /**
     * Sets the value of the originatingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingCountry(String value) {
        this.originatingCountry = value;
    }

    /**
     * Gets the value of the dateTimeSent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeSent() {
        return dateTimeSent;
    }

    /**
     * Sets the value of the dateTimeSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeSent(XMLGregorianCalendar value) {
        this.dateTimeSent = value;
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
     * Gets the value of the receiverPhotoIdExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiverPhotoIdExpDate() {
        return receiverPhotoIdExpDate;
    }

    /**
     * Sets the value of the receiverPhotoIdExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiverPhotoIdExpDate(XMLGregorianCalendar value) {
        this.receiverPhotoIdExpDate = value;
    }

    /**
     * Gets the value of the receiverPhotoIdIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiverPhotoIdIssueDate() {
        return receiverPhotoIdIssueDate;
    }

    /**
     * Sets the value of the receiverPhotoIdIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiverPhotoIdIssueDate(XMLGregorianCalendar value) {
        this.receiverPhotoIdIssueDate = value;
    }

    /**
     * Gets the value of the receiverPhotoIdStored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceiverPhotoIdStored() {
        return receiverPhotoIdStored;
    }

    /**
     * Sets the value of the receiverPhotoIdStored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceiverPhotoIdStored(Boolean value) {
        this.receiverPhotoIdStored = value;
    }

    /**
     * Gets the value of the receiverLegalIdExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiverLegalIdExpDate() {
        return receiverLegalIdExpDate;
    }

    /**
     * Sets the value of the receiverLegalIdExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiverLegalIdExpDate(XMLGregorianCalendar value) {
        this.receiverLegalIdExpDate = value;
    }

    /**
     * Gets the value of the receiverLegalIdIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiverLegalIdIssueDate() {
        return receiverLegalIdIssueDate;
    }

    /**
     * Sets the value of the receiverLegalIdIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiverLegalIdIssueDate(XMLGregorianCalendar value) {
        this.receiverLegalIdIssueDate = value;
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
     * Gets the value of the receiverLegalIdStored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceiverLegalIdStored() {
        return receiverLegalIdStored;
    }

    /**
     * Sets the value of the receiverLegalIdStored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceiverLegalIdStored(Boolean value) {
        this.receiverLegalIdStored = value;
    }

    /**
     * Gets the value of the receiverPassportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverPassportNumber() {
        return receiverPassportNumber;
    }

    /**
     * Sets the value of the receiverPassportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverPassportNumber(String value) {
        this.receiverPassportNumber = value;
    }

    /**
     * Gets the value of the receiverPassportExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiverPassportExpDate() {
        return receiverPassportExpDate;
    }

    /**
     * Sets the value of the receiverPassportExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiverPassportExpDate(XMLGregorianCalendar value) {
        this.receiverPassportExpDate = value;
    }

    /**
     * Gets the value of the receiverPassportStored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceiverPassportStored() {
        return receiverPassportStored;
    }

    /**
     * Sets the value of the receiverPassportStored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceiverPassportStored(Boolean value) {
        this.receiverPassportStored = value;
    }

    /**
     * Gets the value of the receiverNationalityCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverNationalityCountry() {
        return receiverNationalityCountry;
    }

    /**
     * Sets the value of the receiverNationalityCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverNationalityCountry(String value) {
        this.receiverNationalityCountry = value;
    }

    /**
     * Gets the value of the receiverNationalityAtBirthCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverNationalityAtBirthCountry() {
        return receiverNationalityAtBirthCountry;
    }

    /**
     * Sets the value of the receiverNationalityAtBirthCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverNationalityAtBirthCountry(String value) {
        this.receiverNationalityAtBirthCountry = value;
    }

    /**
     * Gets the value of the additionalDocumentationNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalDocumentationNeeded() {
        return additionalDocumentationNeeded;
    }

    /**
     * Sets the value of the additionalDocumentationNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalDocumentationNeeded(Boolean value) {
        this.additionalDocumentationNeeded = value;
    }

    /**
     * Gets the value of the purposeOfTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeOfTransaction() {
        return purposeOfTransaction;
    }

    /**
     * Sets the value of the purposeOfTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeOfTransaction(String value) {
        this.purposeOfTransaction = value;
    }

    /**
     * Gets the value of the relationToSender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationToSender() {
        return relationToSender;
    }

    /**
     * Sets the value of the relationToSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationToSender(String value) {
        this.relationToSender = value;
    }

    /**
     * Gets the value of the receiverEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverEmailAddress() {
        return receiverEmailAddress;
    }

    /**
     * Sets the value of the receiverEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverEmailAddress(String value) {
        this.receiverEmailAddress = value;
    }

    /**
     * Gets the value of the receiverMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverMobilePhone() {
        return receiverMobilePhone;
    }

    /**
     * Sets the value of the receiverMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverMobilePhone(String value) {
        this.receiverMobilePhone = value;
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
     * Gets the value of the thirdPartyPhotoIdExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThirdPartyPhotoIdExpDate() {
        return thirdPartyPhotoIdExpDate;
    }

    /**
     * Sets the value of the thirdPartyPhotoIdExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThirdPartyPhotoIdExpDate(XMLGregorianCalendar value) {
        this.thirdPartyPhotoIdExpDate = value;
    }

    /**
     * Gets the value of the thirdPartyPhotoIdIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThirdPartyPhotoIdIssueDate() {
        return thirdPartyPhotoIdIssueDate;
    }

    /**
     * Sets the value of the thirdPartyPhotoIdIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThirdPartyPhotoIdIssueDate(XMLGregorianCalendar value) {
        this.thirdPartyPhotoIdIssueDate = value;
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
     * Gets the value of the thirdPartyPhotoIdStored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isThirdPartyPhotoIdStored() {
        return thirdPartyPhotoIdStored;
    }

    /**
     * Sets the value of the thirdPartyPhotoIdStored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThirdPartyPhotoIdStored(Boolean value) {
        this.thirdPartyPhotoIdStored = value;
    }

    /**
     * Gets the value of the thirdPartyLegalIdExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThirdPartyLegalIdExpDate() {
        return thirdPartyLegalIdExpDate;
    }

    /**
     * Sets the value of the thirdPartyLegalIdExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThirdPartyLegalIdExpDate(XMLGregorianCalendar value) {
        this.thirdPartyLegalIdExpDate = value;
    }

    /**
     * Gets the value of the thirdPartyLegalIdIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThirdPartyLegalIdIssueDate() {
        return thirdPartyLegalIdIssueDate;
    }

    /**
     * Sets the value of the thirdPartyLegalIdIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThirdPartyLegalIdIssueDate(XMLGregorianCalendar value) {
        this.thirdPartyLegalIdIssueDate = value;
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
     * Gets the value of the thirdPartyLegalIdStored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isThirdPartyLegalIdStored() {
        return thirdPartyLegalIdStored;
    }

    /**
     * Sets the value of the thirdPartyLegalIdStored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThirdPartyLegalIdStored(Boolean value) {
        this.thirdPartyLegalIdStored = value;
    }

    /**
     * Gets the value of the fieldValues property.
     * 
     * @return
     *     possible object is
     *     {@link FormFreeReceiveLookupResponse.FieldValues }
     *     
     */
    public FormFreeReceiveLookupResponse.FieldValues getFieldValues() {
        return fieldValues;
    }

    /**
     * Sets the value of the fieldValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormFreeReceiveLookupResponse.FieldValues }
     *     
     */
    public void setFieldValues(FormFreeReceiveLookupResponse.FieldValues value) {
        this.fieldValues = value;
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
