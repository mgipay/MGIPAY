
package com.ac1211.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="doCheckIn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="flags" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {
    "doCheckIn",
    "timeStamp",
    "flags"
})
@XmlSeeAlso({
    DirectoryOfAgentsByAreaCodePrefixResponse.class,
    SendReversalResponse.class,
    ProfileResponse.class,
    BillPaymentSummaryReportResponse.class,
    DirectoryOfAgentsByCityResponse.class,
    BillPaymentDetailReportResponse.class,
    DirectoryOfAgentsByZipResponse.class,
    ReceiveReversalResponse.class,
    BpValidationResponse.class,
    MoneyGramSendSummaryReportResponse.class,
    SaveRewardsResponse.class,
    CityListResponse.class,
    GetFieldsForRewardsResponse.class,
    MoneyGramConsumerLookupResponse.class,
    CodeTableResponse.class,
    FormFreeSendLookupResponse.class,
    FormFreeTypeLookupResponse.class,
    ReceiveCountryRequirementsResponse.class,
    StateProvinceInfoResponse.class,
    GetFieldsForProductResponse.class,
    ReferenceNumberPhoneResponse.class,
    DirectedSendRegistrationFieldsResponse.class,
    DoddFrankStateRegulatorInfoResponse.class,
    AmendTransactionResponse.class,
    MoneyGramSendDetailReportResponse.class,
    FQDOsForCountryResponse.class,
    MoneyGramReceiveSummaryReportResponse.class,
    ReferenceNumberResponse.class,
    GetFQDOByCustomerReceiveNumberResponse.class,
    FormFreeTranLookupResponse.class,
    CountryInfoResponse.class,
    DetailLookupResponse.class,
    FormFreeReceiveLookupResponse.class,
    BillPaymentCancelResponse.class,
    CommitTransactionResponse.class,
    ConfirmTokenResponse.class,
    ReferenceNumberNameResponse.class,
    ReceiveValidationResponse.class,
    CurrencyInfoResponse.class,
    GetRelatedProfilesResponse.class,
    SaveRegistrationResponse.class,
    IndustryResponse.class,
    BillPaymentConsumerLookupResponse.class,
    QueryRegistrationByNamesResponse.class,
    InitialSetupResponse.class,
    MoneyGramReceiveDetailReportResponse.class,
    FormFreeBPLookupResponse.class,
    SendValidationResponse.class,
    BillerSearchResponse.class,
    TranslationsResponse.class,
    CheckInResponse.class,
    FeeLookupResponse.class
})
public class Response {

    protected boolean doCheckIn;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    protected int flags;

    /**
     * Gets the value of the doCheckIn property.
     * 
     */
    public boolean isDoCheckIn() {
        return doCheckIn;
    }

    /**
     * Sets the value of the doCheckIn property.
     * 
     */
    public void setDoCheckIn(boolean value) {
        this.doCheckIn = value;
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
     * Gets the value of the flags property.
     * 
     */
    public int getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     */
    public void setFlags(int value) {
        this.flags = value;
    }

}
