
package com.ac1211.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unitProfileID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="agentID" type="{http://www.moneygram.com/AgentConnect1211}agentID" minOccurs="0"/>
 *         &lt;element name="agentSequence" type="{http://www.moneygram.com/AgentConnect1211}stringMax2" minOccurs="0"/>
 *         &lt;element name="token" type="{http://www.moneygram.com/AgentConnect1211}token"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="apiVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clientSoftwareVersion" type="{http://www.moneygram.com/AgentConnect1211}stringMax6"/>
 *         &lt;element name="userID" type="{http://www.moneygram.com/AgentConnect1211}stringMax20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", propOrder = {
    "unitProfileID",
    "agentID",
    "agentSequence",
    "token",
    "language",
    "timeStamp",
    "apiVersion",
    "clientSoftwareVersion",
    "userID"
})
@XmlSeeAlso({
    BillerSearchRequest.class,
    GetRelatedProfilesRequest.class,
    SaveRewardsRequest.class,
    MoneyGramReceiveDetailReportRequest.class,
    DirectedSendRegistrationFieldsRequest.class,
    BillPaymentConsumerLookupRequest.class,
    SendValidationRequest.class,
    CodeTableRequest.class,
    CheckInRequest.class,
    BillPaymentSummaryReportRequest.class,
    FormFreeTranLookupRequest.class,
    FormFreeReceiveLookupRequest.class,
    CityListRequest.class,
    DirectoryOfAgentsByAreaCodePrefixRequest.class,
    FormFreeTypeLookupRequest.class,
    GetFQDOByCustomerReceiveNumberRequest.class,
    FQDOsForCountryRequest.class,
    CurrencyInfoRequest.class,
    DoddFrankStateRegulatorInfoRequest.class,
    ConfirmTokenRequest.class,
    FormFreeSendLookupRequest.class,
    DirectoryOfAgentsByCityRequest.class,
    SaveRegistrationRequest.class,
    GetFieldsForRewardsRequest.class,
    MoneyGramSendSummaryReportRequest.class,
    BillPaymentCancelRequest.class,
    TranslationsRequest.class,
    AmendTransactionRequest.class,
    MoneyGramSendDetailReportRequest.class,
    BillPaymentDetailReportRequest.class,
    BpValidationRequest.class,
    ProfileRequest.class,
    ReceiveCountryRequirementsRequest.class,
    MoneyGramReceiveSummaryReportRequest.class,
    CountryInfoRequest.class,
    CommitTransactionRequest.class,
    ReferenceNumberRequest.class,
    FormFreeBPLookupRequest.class,
    GetFieldsForProductRequest.class,
    ReferenceNumberNameRequest.class,
    DirectoryOfAgentsByZipRequest.class,
    QueryRegistrationByNamesRequest.class,
    StateProvinceInfoRequest.class,
    InitialSetupRequest.class,
    ReceiveValidationRequest.class,
    MoneyGramConsumerLookupRequest.class,
    DetailLookupRequest.class,
    IndustryRequest.class,
    ReferenceNumberPhoneRequest.class,
    FeeLookupRequest.class,
    SendReversalRequest.class,
    ReceiveReversalRequest.class
})
public class Request {

    protected Integer unitProfileID;
    protected String agentID;
    protected String agentSequence;
    @XmlElement(required = true)
    protected String token;
    protected String language;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlElement(required = true)
    protected String apiVersion;
    @XmlElement(required = true)
    protected String clientSoftwareVersion;
    protected String userID;

    /**
     * Gets the value of the unitProfileID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnitProfileID() {
        return unitProfileID;
    }

    /**
     * Sets the value of the unitProfileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitProfileID(Integer value) {
        this.unitProfileID = value;
    }

    /**
     * Gets the value of the agentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentID() {
        return agentID;
    }

    /**
     * Sets the value of the agentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentID(String value) {
        this.agentID = value;
    }

    /**
     * Gets the value of the agentSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentSequence() {
        return agentSequence;
    }

    /**
     * Sets the value of the agentSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentSequence(String value) {
        this.agentSequence = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the apiVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * Sets the value of the apiVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiVersion(String value) {
        this.apiVersion = value;
    }

    /**
     * Gets the value of the clientSoftwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSoftwareVersion() {
        return clientSoftwareVersion;
    }

    /**
     * Sets the value of the clientSoftwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSoftwareVersion(String value) {
        this.clientSoftwareVersion = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

}
