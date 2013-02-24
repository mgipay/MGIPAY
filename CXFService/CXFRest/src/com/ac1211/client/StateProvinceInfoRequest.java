
package com.ac1211.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StateProvinceInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StateProvinceInfoRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Request">
 *       &lt;sequence>
 *         &lt;element name="stateProvinceFilter" type="{http://www.moneygram.com/AgentConnect1211}stateProvinceFilterType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateProvinceInfoRequest", propOrder = {
    "stateProvinceFilter"
})
public class StateProvinceInfoRequest
    extends Request
{

    protected StateProvinceFilterType stateProvinceFilter;

    /**
     * Gets the value of the stateProvinceFilter property.
     * 
     * @return
     *     possible object is
     *     {@link StateProvinceFilterType }
     *     
     */
    public StateProvinceFilterType getStateProvinceFilter() {
        return stateProvinceFilter;
    }

    /**
     * Sets the value of the stateProvinceFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvinceFilterType }
     *     
     */
    public void setStateProvinceFilter(StateProvinceFilterType value) {
        this.stateProvinceFilter = value;
    }

}
