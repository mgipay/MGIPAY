
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaveRewardsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveRewardsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Response">
 *       &lt;sequence>
 *         &lt;element name="freqCustCardNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax20"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveRewardsResponse", propOrder = {
    "freqCustCardNumber"
})
public class SaveRewardsResponse
    extends Response
{

    @XmlElement(required = true)
    protected String freqCustCardNumber;

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

}
