
package com.ac1211.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoneyGramConsumerLookupRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoneyGramConsumerLookupRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Request">
 *       &lt;sequence>
 *         &lt;element name="customerPhone" type="{http://www.moneygram.com/AgentConnect1211}phoneType14" minOccurs="0"/>
 *         &lt;element name="freqCustCardNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax20" minOccurs="0"/>
 *         &lt;element name="agentFrequentCustomerNumber" type="{http://www.moneygram.com/AgentConnect1211}agentFrequentCustomerNumber" minOccurs="0"/>
 *         &lt;element name="maxSendersToReturn" type="{http://www.moneygram.com/AgentConnect1211}intMaxToReturn"/>
 *         &lt;element name="maxReceiversToReturn" type="{http://www.moneygram.com/AgentConnect1211}intMaxToReturn"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyGramConsumerLookupRequest", propOrder = {
    "customerPhone",
    "freqCustCardNumber",
    "agentFrequentCustomerNumber",
    "maxSendersToReturn",
    "maxReceiversToReturn"
})
public class MoneyGramConsumerLookupRequest
    extends Request
{

    protected String customerPhone;
    protected String freqCustCardNumber;
    protected String agentFrequentCustomerNumber;
    protected int maxSendersToReturn;
    protected int maxReceiversToReturn;

    /**
     * Gets the value of the customerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * Sets the value of the customerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPhone(String value) {
        this.customerPhone = value;
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
     * Gets the value of the maxSendersToReturn property.
     * 
     */
    public int getMaxSendersToReturn() {
        return maxSendersToReturn;
    }

    /**
     * Sets the value of the maxSendersToReturn property.
     * 
     */
    public void setMaxSendersToReturn(int value) {
        this.maxSendersToReturn = value;
    }

    /**
     * Gets the value of the maxReceiversToReturn property.
     * 
     */
    public int getMaxReceiversToReturn() {
        return maxReceiversToReturn;
    }

    /**
     * Sets the value of the maxReceiversToReturn property.
     * 
     */
    public void setMaxReceiversToReturn(int value) {
        this.maxReceiversToReturn = value;
    }

}
