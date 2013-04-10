
package com.mgi.complaintproxyservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertRecsIntoCRMExtWebFormRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertRecsIntoCRMExtWebFormRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://moneygram.com/common_v1}BaseServiceRequestMessage">
 *       &lt;sequence>
 *         &lt;element name="LegacyGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="whoCompletingForm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityTown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="webFormRecDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Jurisdictioncountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trnRefNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MONbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rewardsnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preferContMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complaintRequestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppealFollowUp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiveCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="investigateNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resolutionNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complainingabout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedcasenumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complaintrefnbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertRecsIntoCRMExtWebFormRequest", namespace = "http://moneygram.com/service/ComplaintProxyService_v1", propOrder = {
    "legacyGUID",
    "whoCompletingForm",
    "title",
    "firstname",
    "lastname",
    "addr1",
    "addr2",
    "cityTown",
    "state",
    "postalcode",
    "country",
    "webFormRecDate",
    "jurisdictioncountry",
    "telephone",
    "emailaddress",
    "trnRefNbr",
    "moNbr",
    "rewardsnumber",
    "preferContMethod",
    "complaintRequestType",
    "appealFollowUp",
    "sendCountry",
    "receiveCountry",
    "description",
    "investigateNotes",
    "actionNotes",
    "resolutionNotes",
    "complainingabout",
    "relatedcasenumber",
    "complaintrefnbr"
})
public class InsertRecsIntoCRMExtWebFormRequest
    extends BaseServiceRequestMessage
{

    @XmlElement(name = "LegacyGUID")
    protected String legacyGUID;
    @XmlElement(required = true)
    protected String whoCompletingForm;
    protected String title;
    protected String firstname;
    protected String lastname;
    protected String addr1;
    protected String addr2;
    protected String cityTown;
    protected String state;
    protected String postalcode;
    protected String country;
    protected String webFormRecDate;
    @XmlElement(name = "Jurisdictioncountry")
    protected String jurisdictioncountry;
    protected String telephone;
    protected String emailaddress;
    protected String trnRefNbr;
    @XmlElement(name = "MONbr")
    protected String moNbr;
    protected String rewardsnumber;
    protected String preferContMethod;
    protected String complaintRequestType;
    @XmlElement(name = "AppealFollowUp")
    protected String appealFollowUp;
    protected String sendCountry;
    protected String receiveCountry;
    protected String description;
    protected String investigateNotes;
    protected String actionNotes;
    protected String resolutionNotes;
    protected String complainingabout;
    protected String relatedcasenumber;
    protected String complaintrefnbr;

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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Gets the value of the cityTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityTown() {
        return cityTown;
    }

    /**
     * Sets the value of the cityTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityTown(String value) {
        this.cityTown = value;
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
     * Gets the value of the webFormRecDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebFormRecDate() {
        return webFormRecDate;
    }

    /**
     * Sets the value of the webFormRecDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebFormRecDate(String value) {
        this.webFormRecDate = value;
    }

    /**
     * Gets the value of the jurisdictioncountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdictioncountry() {
        return jurisdictioncountry;
    }

    /**
     * Sets the value of the jurisdictioncountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdictioncountry(String value) {
        this.jurisdictioncountry = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
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
     * Gets the value of the trnRefNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnRefNbr() {
        return trnRefNbr;
    }

    /**
     * Sets the value of the trnRefNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnRefNbr(String value) {
        this.trnRefNbr = value;
    }

    /**
     * Gets the value of the moNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMONbr() {
        return moNbr;
    }

    /**
     * Sets the value of the moNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMONbr(String value) {
        this.moNbr = value;
    }

    /**
     * Gets the value of the rewardsnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardsnumber() {
        return rewardsnumber;
    }

    /**
     * Sets the value of the rewardsnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardsnumber(String value) {
        this.rewardsnumber = value;
    }

    /**
     * Gets the value of the preferContMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferContMethod() {
        return preferContMethod;
    }

    /**
     * Sets the value of the preferContMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferContMethod(String value) {
        this.preferContMethod = value;
    }

    /**
     * Gets the value of the complaintRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplaintRequestType() {
        return complaintRequestType;
    }

    /**
     * Sets the value of the complaintRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplaintRequestType(String value) {
        this.complaintRequestType = value;
    }

    /**
     * Gets the value of the appealFollowUp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppealFollowUp() {
        return appealFollowUp;
    }

    /**
     * Sets the value of the appealFollowUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppealFollowUp(String value) {
        this.appealFollowUp = value;
    }

    /**
     * Gets the value of the sendCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendCountry() {
        return sendCountry;
    }

    /**
     * Sets the value of the sendCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendCountry(String value) {
        this.sendCountry = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the investigateNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvestigateNotes() {
        return investigateNotes;
    }

    /**
     * Sets the value of the investigateNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvestigateNotes(String value) {
        this.investigateNotes = value;
    }

    /**
     * Gets the value of the actionNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionNotes() {
        return actionNotes;
    }

    /**
     * Sets the value of the actionNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionNotes(String value) {
        this.actionNotes = value;
    }

    /**
     * Gets the value of the resolutionNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolutionNotes() {
        return resolutionNotes;
    }

    /**
     * Sets the value of the resolutionNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolutionNotes(String value) {
        this.resolutionNotes = value;
    }

    /**
     * Gets the value of the complainingabout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplainingabout() {
        return complainingabout;
    }

    /**
     * Sets the value of the complainingabout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplainingabout(String value) {
        this.complainingabout = value;
    }

    /**
     * Gets the value of the relatedcasenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedcasenumber() {
        return relatedcasenumber;
    }

    /**
     * Sets the value of the relatedcasenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedcasenumber(String value) {
        this.relatedcasenumber = value;
    }

    /**
     * Gets the value of the complaintrefnbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplaintrefnbr() {
        return complaintrefnbr;
    }

    /**
     * Sets the value of the complaintrefnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplaintrefnbr(String value) {
        this.complaintrefnbr = value;
    }

}
