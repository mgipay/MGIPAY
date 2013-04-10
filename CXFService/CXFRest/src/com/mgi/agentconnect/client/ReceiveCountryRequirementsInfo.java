
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiveCountryRequirementsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiveCountryRequirementsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="receiveCountry" type="{http://www.moneygram.com/AgentConnect1211}countryType"/>
 *         &lt;element name="deliveryOption" type="{http://www.moneygram.com/AgentConnect1211}deliveryOption"/>
 *         &lt;element name="receiverAddressRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="receiver2ndLastNameRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="questionRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="questionRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="receiveActiveForAgent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiveCountryRequirementsInfo", propOrder = {
    "receiveCountry",
    "deliveryOption",
    "receiverAddressRequired",
    "receiver2NdLastNameRequired",
    "questionRestricted",
    "questionRequired",
    "receiveActiveForAgent"
})
public class ReceiveCountryRequirementsInfo {

    @XmlElement(required = true)
    protected String receiveCountry;
    @XmlElement(required = true)
    protected String deliveryOption;
    protected boolean receiverAddressRequired;
    @XmlElement(name = "receiver2ndLastNameRequired")
    protected boolean receiver2NdLastNameRequired;
    protected boolean questionRestricted;
    protected boolean questionRequired;
    protected boolean receiveActiveForAgent;

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
     * Gets the value of the receiverAddressRequired property.
     * 
     */
    public boolean isReceiverAddressRequired() {
        return receiverAddressRequired;
    }

    /**
     * Sets the value of the receiverAddressRequired property.
     * 
     */
    public void setReceiverAddressRequired(boolean value) {
        this.receiverAddressRequired = value;
    }

    /**
     * Gets the value of the receiver2NdLastNameRequired property.
     * 
     */
    public boolean isReceiver2NdLastNameRequired() {
        return receiver2NdLastNameRequired;
    }

    /**
     * Sets the value of the receiver2NdLastNameRequired property.
     * 
     */
    public void setReceiver2NdLastNameRequired(boolean value) {
        this.receiver2NdLastNameRequired = value;
    }

    /**
     * Gets the value of the questionRestricted property.
     * 
     */
    public boolean isQuestionRestricted() {
        return questionRestricted;
    }

    /**
     * Sets the value of the questionRestricted property.
     * 
     */
    public void setQuestionRestricted(boolean value) {
        this.questionRestricted = value;
    }

    /**
     * Gets the value of the questionRequired property.
     * 
     */
    public boolean isQuestionRequired() {
        return questionRequired;
    }

    /**
     * Sets the value of the questionRequired property.
     * 
     */
    public void setQuestionRequired(boolean value) {
        this.questionRequired = value;
    }

    /**
     * Gets the value of the receiveActiveForAgent property.
     * 
     */
    public boolean isReceiveActiveForAgent() {
        return receiveActiveForAgent;
    }

    /**
     * Sets the value of the receiveActiveForAgent property.
     * 
     */
    public void setReceiveActiveForAgent(boolean value) {
        this.receiveActiveForAgent = value;
    }

}
