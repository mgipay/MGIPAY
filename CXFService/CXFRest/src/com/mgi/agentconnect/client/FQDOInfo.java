
package com.mgi.agentconnect.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FQDOInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FQDOInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="receiveCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType"/>
 *         &lt;element name="deliveryOption" type="{http://www.moneygram.com/AgentConnect1211}deliveryOption"/>
 *         &lt;element name="receiveAgentID" type="{http://www.moneygram.com/AgentConnect1211}agentID" minOccurs="0"/>
 *         &lt;element name="receiveCurrency" type="{http://www.moneygram.com/AgentConnect1211}currencyCode" minOccurs="0"/>
 *         &lt;element name="receiveAgentName" type="{http://www.moneygram.com/AgentConnect1211}stringMax40" minOccurs="0"/>
 *         &lt;element name="receiveAgentAbbreviation" type="{http://www.moneygram.com/AgentConnect1211}stringMax10" minOccurs="0"/>
 *         &lt;element name="deliveryOptionDisplayName" type="{http://www.moneygram.com/AgentConnect1211}deliveryOptionDisplayName"/>
 *         &lt;element name="registrationAuthorizationText" type="{http://www.moneygram.com/AgentConnect1211}stringMax40" minOccurs="0"/>
 *         &lt;element name="speedOfDeliveryText" type="{http://www.moneygram.com/AgentConnect1211}stringMax40" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FQDOInfo", propOrder = {
    "receiveCountry",
    "deliveryOption",
    "receiveAgentID",
    "receiveCurrency",
    "receiveAgentName",
    "receiveAgentAbbreviation",
    "deliveryOptionDisplayName",
    "registrationAuthorizationText",
    "speedOfDeliveryText"
})
public class FQDOInfo {

    @XmlElement(required = true)
    protected String receiveCountry;
    @XmlElement(required = true)
    protected String deliveryOption;
    protected String receiveAgentID;
    protected String receiveCurrency;
    protected String receiveAgentName;
    protected String receiveAgentAbbreviation;
    @XmlElement(required = true)
    protected String deliveryOptionDisplayName;
    protected String registrationAuthorizationText;
    @XmlElementRef(name = "speedOfDeliveryText", namespace = "http://www.moneygram.com/AgentConnect1211", type = JAXBElement.class)
    protected JAXBElement<String> speedOfDeliveryText;

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
     * Gets the value of the receiveAgentAbbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveAgentAbbreviation() {
        return receiveAgentAbbreviation;
    }

    /**
     * Sets the value of the receiveAgentAbbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveAgentAbbreviation(String value) {
        this.receiveAgentAbbreviation = value;
    }

    /**
     * Gets the value of the deliveryOptionDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryOptionDisplayName() {
        return deliveryOptionDisplayName;
    }

    /**
     * Sets the value of the deliveryOptionDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryOptionDisplayName(String value) {
        this.deliveryOptionDisplayName = value;
    }

    /**
     * Gets the value of the registrationAuthorizationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationAuthorizationText() {
        return registrationAuthorizationText;
    }

    /**
     * Sets the value of the registrationAuthorizationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationAuthorizationText(String value) {
        this.registrationAuthorizationText = value;
    }

    /**
     * Gets the value of the speedOfDeliveryText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpeedOfDeliveryText() {
        return speedOfDeliveryText;
    }

    /**
     * Sets the value of the speedOfDeliveryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpeedOfDeliveryText(JAXBElement<String> value) {
        this.speedOfDeliveryText = value;
    }

}
