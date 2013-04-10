
package com.mgi.agentconnect.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SenderLookupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SenderLookupInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="senderFirstName" type="{http://www.moneygram.com/AgentConnect1211}fNameLong" minOccurs="0"/>
 *         &lt;element name="senderMiddleName" type="{http://www.moneygram.com/AgentConnect1211}mNameLong" minOccurs="0"/>
 *         &lt;element name="senderLastName" type="{http://www.moneygram.com/AgentConnect1211}lNameLong" minOccurs="0"/>
 *         &lt;element name="senderLastName2" type="{http://www.moneygram.com/AgentConnect1211}lNameLong" minOccurs="0"/>
 *         &lt;element name="senderAddress" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="senderAddress2" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="senderAddress3" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="senderAddress4" type="{http://www.moneygram.com/AgentConnect1211}addressTypeXLong" minOccurs="0"/>
 *         &lt;element name="senderCity" type="{http://www.moneygram.com/AgentConnect1211}cityTypeLong" minOccurs="0"/>
 *         &lt;element name="senderState" type="{http://www.moneygram.com/AgentConnect1211}stateType" minOccurs="0"/>
 *         &lt;element name="senderZipCode" type="{http://www.moneygram.com/AgentConnect1211}zipType" minOccurs="0"/>
 *         &lt;element name="senderCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="senderHomePhone" type="{http://www.moneygram.com/AgentConnect1211}phoneType14" minOccurs="0"/>
 *         &lt;element name="freqCustCardNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax20" minOccurs="0"/>
 *         &lt;element name="agentFrequentCustomerNumber" type="{http://www.moneygram.com/AgentConnect1211}agentFrequentCustomerNumber" minOccurs="0"/>
 *         &lt;element name="consumerId" type="{http://www.moneygram.com/AgentConnect1211}consumerId" minOccurs="0"/>
 *         &lt;element name="receiverInfo" type="{http://www.moneygram.com/AgentConnect1211}ReceiverLookupInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billerInfo" type="{http://www.moneygram.com/AgentConnect1211}BillerLookupInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SenderLookupInfo", propOrder = {
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
    "freqCustCardNumber",
    "agentFrequentCustomerNumber",
    "consumerId",
    "receiverInfo",
    "billerInfo"
})
public class SenderLookupInfo {

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
    protected String freqCustCardNumber;
    protected String agentFrequentCustomerNumber;
    protected String consumerId;
    protected List<ReceiverLookupInfo> receiverInfo;
    protected List<BillerLookupInfo> billerInfo;

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
     * Gets the value of the agentFrequentCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentFrequentCustomerNumber() {
        return agentFrequentCustomerNumber;
    }

    /**
     * Sets the value of the agentFrequentCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentFrequentCustomerNumber(String value) {
        this.agentFrequentCustomerNumber = value;
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
     * Gets the value of the receiverInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiverInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiverInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiverLookupInfo }
     * 
     * 
     */
    public List<ReceiverLookupInfo> getReceiverInfo() {
        if (receiverInfo == null) {
            receiverInfo = new ArrayList<ReceiverLookupInfo>();
        }
        return this.receiverInfo;
    }

    /**
     * Gets the value of the billerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillerLookupInfo }
     * 
     * 
     */
    public List<BillerLookupInfo> getBillerInfo() {
        if (billerInfo == null) {
            billerInfo = new ArrayList<BillerLookupInfo>();
        }
        return this.billerInfo;
    }

}
