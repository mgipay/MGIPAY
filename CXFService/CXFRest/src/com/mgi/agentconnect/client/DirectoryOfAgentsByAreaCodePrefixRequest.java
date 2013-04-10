
package com.mgi.agentconnect.client;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectoryOfAgentsByAreaCodePrefixRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectoryOfAgentsByAreaCodePrefixRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Request">
 *       &lt;sequence>
 *         &lt;element name="areaCodePrefix" type="{http://www.moneygram.com/AgentConnect1211}areaCodePrefixType"/>
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
@XmlType(name = "DirectoryOfAgentsByAreaCodePrefixRequest", propOrder = {
    "areaCodePrefix",
    "country",
    "maxRowsToReturn"
})
public class DirectoryOfAgentsByAreaCodePrefixRequest
    extends Request
{

    @XmlElement(required = true)
    protected String areaCodePrefix;
    protected String country;
    protected BigInteger maxRowsToReturn;

    /**
     * Gets the value of the areaCodePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCodePrefix() {
        return areaCodePrefix;
    }

    /**
     * Sets the value of the areaCodePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCodePrefix(String value) {
        this.areaCodePrefix = value;
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
