
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillerLookupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillerLookupInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="receiveCode" type="{http://www.moneygram.com/AgentConnect1211}receiveCodeType" minOccurs="0"/>
 *         &lt;element name="receiveAgentID" type="{http://www.moneygram.com/AgentConnect1211}agentID" minOccurs="0"/>
 *         &lt;element name="billerAccountNumber" type="{http://www.moneygram.com/AgentConnect1211}billerAccountNumber" minOccurs="0"/>
 *         &lt;element name="billerName" type="{http://www.moneygram.com/AgentConnect1211}stringMax25" minOccurs="0"/>
 *         &lt;element name="billerAddress" type="{http://www.moneygram.com/AgentConnect1211}billerAddress" minOccurs="0"/>
 *         &lt;element name="billerAddress2" type="{http://www.moneygram.com/AgentConnect1211}billerAddress" minOccurs="0"/>
 *         &lt;element name="billerCity" type="{http://www.moneygram.com/AgentConnect1211}cityTypeLong" minOccurs="0"/>
 *         &lt;element name="billerState" type="{http://www.moneygram.com/AgentConnect1211}stateTypeLong" minOccurs="0"/>
 *         &lt;element name="productVariant" type="{http://www.moneygram.com/AgentConnect1211}productVariant"/>
 *         &lt;element name="receiverFirstName" type="{http://www.moneygram.com/AgentConnect1211}fNameLong" minOccurs="0"/>
 *         &lt;element name="receiverMiddleName" type="{http://www.moneygram.com/AgentConnect1211}mNameLong" minOccurs="0"/>
 *         &lt;element name="receiverLastName" type="{http://www.moneygram.com/AgentConnect1211}lNameLong" minOccurs="0"/>
 *         &lt;element name="receiverLastName2" type="{http://www.moneygram.com/AgentConnect1211}lNameLong" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillerLookupInfo", propOrder = {
    "receiveCode",
    "receiveAgentID",
    "billerAccountNumber",
    "billerName",
    "billerAddress",
    "billerAddress2",
    "billerCity",
    "billerState",
    "productVariant",
    "receiverFirstName",
    "receiverMiddleName",
    "receiverLastName",
    "receiverLastName2"
})
public class BillerLookupInfo {

    protected String receiveCode;
    protected String receiveAgentID;
    protected String billerAccountNumber;
    protected String billerName;
    protected String billerAddress;
    protected String billerAddress2;
    protected String billerCity;
    protected String billerState;
    @XmlElement(required = true)
    protected ProductVariant productVariant;
    protected String receiverFirstName;
    protected String receiverMiddleName;
    protected String receiverLastName;
    protected String receiverLastName2;

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
     * Gets the value of the billerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillerAddress() {
        return billerAddress;
    }

    /**
     * Sets the value of the billerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillerAddress(String value) {
        this.billerAddress = value;
    }

    /**
     * Gets the value of the billerAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillerAddress2() {
        return billerAddress2;
    }

    /**
     * Sets the value of the billerAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillerAddress2(String value) {
        this.billerAddress2 = value;
    }

    /**
     * Gets the value of the billerCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillerCity() {
        return billerCity;
    }

    /**
     * Sets the value of the billerCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillerCity(String value) {
        this.billerCity = value;
    }

    /**
     * Gets the value of the billerState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillerState() {
        return billerState;
    }

    /**
     * Sets the value of the billerState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillerState(String value) {
        this.billerState = value;
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

}
