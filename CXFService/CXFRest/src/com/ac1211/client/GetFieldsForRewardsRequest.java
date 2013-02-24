
package com.ac1211.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFieldsForRewardsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFieldsForRewardsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Request">
 *       &lt;sequence>
 *         &lt;element name="cardTypeCode" type="{http://www.moneygram.com/AgentConnect1211}stringMax4"/>
 *         &lt;element name="programType" type="{http://www.moneygram.com/AgentConnect1211}stringMax3"/>
 *         &lt;element name="rewardsRequestType" type="{http://www.moneygram.com/AgentConnect1211}rewardsRequestType"/>
 *         &lt;element name="freqCustCardNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax20" minOccurs="0"/>
 *         &lt;element name="senderCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFieldsForRewardsRequest", propOrder = {
    "cardTypeCode",
    "programType",
    "rewardsRequestType",
    "freqCustCardNumber",
    "senderCountry"
})
public class GetFieldsForRewardsRequest
    extends Request
{

    @XmlElement(required = true)
    protected String cardTypeCode;
    @XmlElement(required = true)
    protected String programType;
    @XmlElement(required = true)
    protected RewardsRequestType rewardsRequestType;
    protected String freqCustCardNumber;
    protected String senderCountry;

    /**
     * Gets the value of the cardTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTypeCode() {
        return cardTypeCode;
    }

    /**
     * Sets the value of the cardTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTypeCode(String value) {
        this.cardTypeCode = value;
    }

    /**
     * Gets the value of the programType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramType() {
        return programType;
    }

    /**
     * Sets the value of the programType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramType(String value) {
        this.programType = value;
    }

    /**
     * Gets the value of the rewardsRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link RewardsRequestType }
     *     
     */
    public RewardsRequestType getRewardsRequestType() {
        return rewardsRequestType;
    }

    /**
     * Sets the value of the rewardsRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RewardsRequestType }
     *     
     */
    public void setRewardsRequestType(RewardsRequestType value) {
        this.rewardsRequestType = value;
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

}
