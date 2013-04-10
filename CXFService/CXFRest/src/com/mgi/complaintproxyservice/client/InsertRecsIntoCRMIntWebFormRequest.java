
package com.mgi.complaintproxyservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertRecsIntoCRMIntWebFormRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertRecsIntoCRMIntWebFormRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://moneygram.com/common_v1}BaseServiceRequestMessage">
 *       &lt;sequence>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegacyGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="whoCompletingForm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WhatReporting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callertype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComplainBehalf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middlename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendcountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receivecountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondaryphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refNum1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refNum2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refNum3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refNum4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refNum5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refNum6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refNum7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refNum8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refNum9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refDate1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refDate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refDate3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refDate4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refDate5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refDate6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refDate7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refDate8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refDate9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refNosDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fraudDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="share" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertRecsIntoCRMIntWebFormRequest", namespace = "http://moneygram.com/service/ComplaintProxyService_v1", propOrder = {
    "userID",
    "legacyGUID",
    "whoCompletingForm",
    "whatReporting",
    "product",
    "callertype",
    "complainBehalf",
    "firstname",
    "lastname",
    "middlename",
    "addr1",
    "addr2",
    "city",
    "state",
    "country",
    "sendcountry",
    "receivecountry",
    "postalcode",
    "phone",
    "secondaryphone",
    "emailaddress",
    "prefLanguage",
    "refNum1",
    "refNum2",
    "refNum3",
    "refNum4",
    "refNum5",
    "refNum6",
    "refNum7",
    "refNum8",
    "refNum9",
    "refDate1",
    "refDate2",
    "refDate3",
    "refDate4",
    "refDate5",
    "refDate6",
    "refDate7",
    "refDate8",
    "refDate9",
    "refNosDate",
    "receiverName",
    "fraudDesc",
    "share"
})
public class InsertRecsIntoCRMIntWebFormRequest
    extends BaseServiceRequestMessage
{

    protected String userID;
    @XmlElement(name = "LegacyGUID")
    protected String legacyGUID;
    @XmlElement(required = true)
    protected String whoCompletingForm;
    @XmlElement(name = "WhatReporting")
    protected String whatReporting;
    protected String product;
    protected String callertype;
    @XmlElement(name = "ComplainBehalf")
    protected String complainBehalf;
    protected String firstname;
    protected String lastname;
    protected String middlename;
    protected String addr1;
    protected String addr2;
    protected String city;
    protected String state;
    protected String country;
    protected String sendcountry;
    protected String receivecountry;
    protected String postalcode;
    protected String phone;
    protected String secondaryphone;
    protected String emailaddress;
    protected String prefLanguage;
    protected String refNum1;
    protected String refNum2;
    protected String refNum3;
    protected String refNum4;
    protected String refNum5;
    protected String refNum6;
    protected String refNum7;
    protected String refNum8;
    protected String refNum9;
    protected String refDate1;
    protected String refDate2;
    protected String refDate3;
    protected String refDate4;
    protected String refDate5;
    protected String refDate6;
    protected String refDate7;
    protected String refDate8;
    protected String refDate9;
    protected String refNosDate;
    protected String receiverName;
    protected String fraudDesc;
    protected String share;

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

    /**
     * Gets the value of the legacyGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyGUID() {
        return legacyGUID;
    }

    /**
     * Sets the value of the legacyGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyGUID(String value) {
        this.legacyGUID = value;
    }

    /**
     * Gets the value of the whoCompletingForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhoCompletingForm() {
        return whoCompletingForm;
    }

    /**
     * Sets the value of the whoCompletingForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhoCompletingForm(String value) {
        this.whoCompletingForm = value;
    }

    /**
     * Gets the value of the whatReporting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhatReporting() {
        return whatReporting;
    }

    /**
     * Sets the value of the whatReporting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhatReporting(String value) {
        this.whatReporting = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the callertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallertype() {
        return callertype;
    }

    /**
     * Sets the value of the callertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallertype(String value) {
        this.callertype = value;
    }

    /**
     * Gets the value of the complainBehalf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplainBehalf() {
        return complainBehalf;
    }

    /**
     * Sets the value of the complainBehalf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplainBehalf(String value) {
        this.complainBehalf = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the middlename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddlename() {
        return middlename;
    }

    /**
     * Sets the value of the middlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddlename(String value) {
        this.middlename = value;
    }

    /**
     * Gets the value of the addr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr1() {
        return addr1;
    }

    /**
     * Sets the value of the addr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr1(String value) {
        this.addr1 = value;
    }

    /**
     * Gets the value of the addr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr2() {
        return addr2;
    }

    /**
     * Sets the value of the addr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr2(String value) {
        this.addr2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the sendcountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendcountry() {
        return sendcountry;
    }

    /**
     * Sets the value of the sendcountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendcountry(String value) {
        this.sendcountry = value;
    }

    /**
     * Gets the value of the receivecountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivecountry() {
        return receivecountry;
    }

    /**
     * Sets the value of the receivecountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivecountry(String value) {
        this.receivecountry = value;
    }

    /**
     * Gets the value of the postalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalcode() {
        return postalcode;
    }

    /**
     * Sets the value of the postalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalcode(String value) {
        this.postalcode = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the secondaryphone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryphone() {
        return secondaryphone;
    }

    /**
     * Sets the value of the secondaryphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryphone(String value) {
        this.secondaryphone = value;
    }

    /**
     * Gets the value of the emailaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailaddress() {
        return emailaddress;
    }

    /**
     * Sets the value of the emailaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailaddress(String value) {
        this.emailaddress = value;
    }

    /**
     * Gets the value of the prefLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefLanguage() {
        return prefLanguage;
    }

    /**
     * Sets the value of the prefLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefLanguage(String value) {
        this.prefLanguage = value;
    }

    /**
     * Gets the value of the refNum1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNum1() {
        return refNum1;
    }

    /**
     * Sets the value of the refNum1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNum1(String value) {
        this.refNum1 = value;
    }

    /**
     * Gets the value of the refNum2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNum2() {
        return refNum2;
    }

    /**
     * Sets the value of the refNum2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNum2(String value) {
        this.refNum2 = value;
    }

    /**
     * Gets the value of the refNum3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNum3() {
        return refNum3;
    }

    /**
     * Sets the value of the refNum3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNum3(String value) {
        this.refNum3 = value;
    }

    /**
     * Gets the value of the refNum4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNum4() {
        return refNum4;
    }

    /**
     * Sets the value of the refNum4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNum4(String value) {
        this.refNum4 = value;
    }

    /**
     * Gets the value of the refNum5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNum5() {
        return refNum5;
    }

    /**
     * Sets the value of the refNum5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNum5(String value) {
        this.refNum5 = value;
    }

    /**
     * Gets the value of the refNum6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNum6() {
        return refNum6;
    }

    /**
     * Sets the value of the refNum6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNum6(String value) {
        this.refNum6 = value;
    }

    /**
     * Gets the value of the refNum7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNum7() {
        return refNum7;
    }

    /**
     * Sets the value of the refNum7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNum7(String value) {
        this.refNum7 = value;
    }

    /**
     * Gets the value of the refNum8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNum8() {
        return refNum8;
    }

    /**
     * Sets the value of the refNum8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNum8(String value) {
        this.refNum8 = value;
    }

    /**
     * Gets the value of the refNum9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNum9() {
        return refNum9;
    }

    /**
     * Sets the value of the refNum9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNum9(String value) {
        this.refNum9 = value;
    }

    /**
     * Gets the value of the refDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDate1() {
        return refDate1;
    }

    /**
     * Sets the value of the refDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDate1(String value) {
        this.refDate1 = value;
    }

    /**
     * Gets the value of the refDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDate2() {
        return refDate2;
    }

    /**
     * Sets the value of the refDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDate2(String value) {
        this.refDate2 = value;
    }

    /**
     * Gets the value of the refDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDate3() {
        return refDate3;
    }

    /**
     * Sets the value of the refDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDate3(String value) {
        this.refDate3 = value;
    }

    /**
     * Gets the value of the refDate4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDate4() {
        return refDate4;
    }

    /**
     * Sets the value of the refDate4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDate4(String value) {
        this.refDate4 = value;
    }

    /**
     * Gets the value of the refDate5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDate5() {
        return refDate5;
    }

    /**
     * Sets the value of the refDate5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDate5(String value) {
        this.refDate5 = value;
    }

    /**
     * Gets the value of the refDate6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDate6() {
        return refDate6;
    }

    /**
     * Sets the value of the refDate6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDate6(String value) {
        this.refDate6 = value;
    }

    /**
     * Gets the value of the refDate7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDate7() {
        return refDate7;
    }

    /**
     * Sets the value of the refDate7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDate7(String value) {
        this.refDate7 = value;
    }

    /**
     * Gets the value of the refDate8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDate8() {
        return refDate8;
    }

    /**
     * Sets the value of the refDate8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDate8(String value) {
        this.refDate8 = value;
    }

    /**
     * Gets the value of the refDate9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDate9() {
        return refDate9;
    }

    /**
     * Sets the value of the refDate9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDate9(String value) {
        this.refDate9 = value;
    }

    /**
     * Gets the value of the refNosDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNosDate() {
        return refNosDate;
    }

    /**
     * Sets the value of the refNosDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNosDate(String value) {
        this.refNosDate = value;
    }

    /**
     * Gets the value of the receiverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * Sets the value of the receiverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverName(String value) {
        this.receiverName = value;
    }

    /**
     * Gets the value of the fraudDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudDesc() {
        return fraudDesc;
    }

    /**
     * Sets the value of the fraudDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudDesc(String value) {
        this.fraudDesc = value;
    }

    /**
     * Gets the value of the share property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShare() {
        return share;
    }

    /**
     * Sets the value of the share property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShare(String value) {
        this.share = value;
    }

}
