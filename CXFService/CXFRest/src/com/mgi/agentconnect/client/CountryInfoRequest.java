
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryInfoRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Request">
 *       &lt;sequence>
 *         &lt;element name="countryFilter" type="{http://www.moneygram.com/AgentConnect1211}countryFilterType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryInfoRequest", propOrder = {
    "countryFilter"
})
public class CountryInfoRequest
    extends Request
{

    protected CountryFilterType countryFilter;

    /**
     * Gets the value of the countryFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CountryFilterType }
     *     
     */
    public CountryFilterType getCountryFilter() {
        return countryFilter;
    }

    /**
     * Sets the value of the countryFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryFilterType }
     *     
     */
    public void setCountryFilter(CountryFilterType value) {
        this.countryFilter = value;
    }

}
