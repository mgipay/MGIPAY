
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryCode" type="{http://www.moneygram.com/AgentConnect1211}countryType"/>
 *         &lt;element name="countryName" type="{http://www.moneygram.com/AgentConnect1211}stringMax50"/>
 *         &lt;element name="countryLegacyCode" type="{http://www.moneygram.com/AgentConnect1211}stringMax2"/>
 *         &lt;element name="sendActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="receiveActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="directedSendCountry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mgDirectedSendCountry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="baseReceiveCurrency" type="{http://www.moneygram.com/AgentConnect1211}currencyCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryInfo", propOrder = {
    "countryCode",
    "countryName",
    "countryLegacyCode",
    "sendActive",
    "receiveActive",
    "directedSendCountry",
    "mgDirectedSendCountry",
    "baseReceiveCurrency"
})
public class CountryInfo {

    @XmlElement(required = true)
    protected String countryCode;
    @XmlElement(required = true)
    protected String countryName;
    @XmlElement(required = true)
    protected String countryLegacyCode;
    protected boolean sendActive;
    protected boolean receiveActive;
    protected boolean directedSendCountry;
    protected boolean mgDirectedSendCountry;
    protected String baseReceiveCurrency;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the countryLegacyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryLegacyCode() {
        return countryLegacyCode;
    }

    /**
     * Sets the value of the countryLegacyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryLegacyCode(String value) {
        this.countryLegacyCode = value;
    }

    /**
     * Gets the value of the sendActive property.
     * 
     */
    public boolean isSendActive() {
        return sendActive;
    }

    /**
     * Sets the value of the sendActive property.
     * 
     */
    public void setSendActive(boolean value) {
        this.sendActive = value;
    }

    /**
     * Gets the value of the receiveActive property.
     * 
     */
    public boolean isReceiveActive() {
        return receiveActive;
    }

    /**
     * Sets the value of the receiveActive property.
     * 
     */
    public void setReceiveActive(boolean value) {
        this.receiveActive = value;
    }

    /**
     * Gets the value of the directedSendCountry property.
     * 
     */
    public boolean isDirectedSendCountry() {
        return directedSendCountry;
    }

    /**
     * Sets the value of the directedSendCountry property.
     * 
     */
    public void setDirectedSendCountry(boolean value) {
        this.directedSendCountry = value;
    }

    /**
     * Gets the value of the mgDirectedSendCountry property.
     * 
     */
    public boolean isMgDirectedSendCountry() {
        return mgDirectedSendCountry;
    }

    /**
     * Sets the value of the mgDirectedSendCountry property.
     * 
     */
    public void setMgDirectedSendCountry(boolean value) {
        this.mgDirectedSendCountry = value;
    }

    /**
     * Gets the value of the baseReceiveCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseReceiveCurrency() {
        return baseReceiveCurrency;
    }

    /**
     * Sets the value of the baseReceiveCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseReceiveCurrency(String value) {
        this.baseReceiveCurrency = value;
    }

}
