
package com.mgi.agentconnect.client;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectoryOfAgentsByZipRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectoryOfAgentsByZipRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Request">
 *       &lt;sequence>
 *         &lt;element name="zipCode" type="{http://www.moneygram.com/AgentConnect1211}zipType"/>
 *         &lt;element name="country" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *         &lt;element name="maxRowsToReturn" type="{http://www.moneygram.com/AgentConnect1211}int4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectoryOfAgentsByZipRequest", propOrder = {
    "zipCode",
    "country",
    "maxRowsToReturn"
})
public class DirectoryOfAgentsByZipRequest
    extends Request
{

    @XmlElement(required = true)
    protected String zipCode;
    protected String country;
    protected BigInteger maxRowsToReturn;

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
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
     * Gets the value of the maxRowsToReturn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxRowsToReturn() {
        return maxRowsToReturn;
    }

    /**
     * Sets the value of the maxRowsToReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxRowsToReturn(BigInteger value) {
        this.maxRowsToReturn = value;
    }

}
