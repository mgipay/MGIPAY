
package com.mgi.agentconnect.client;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryOptionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryOptionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dssOption" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deliveryOptionID" type="{http://www.moneygram.com/AgentConnect1211}int3"/>
 *         &lt;element name="deliveryOption" type="{http://www.moneygram.com/AgentConnect1211}deliveryOption"/>
 *         &lt;element name="deliveryOptionName" type="{http://www.moneygram.com/AgentConnect1211}stringMax40"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryOptionInfo", propOrder = {
    "dssOption",
    "deliveryOptionID",
    "deliveryOption",
    "deliveryOptionName"
})
public class DeliveryOptionInfo {

    protected boolean dssOption;
    @XmlElement(required = true)
    protected BigInteger deliveryOptionID;
    @XmlElement(required = true)
    protected String deliveryOption;
    @XmlElement(required = true)
    protected String deliveryOptionName;

    /**
     * Gets the value of the dssOption property.
     * 
     */
    public boolean isDssOption() {
        return dssOption;
    }

    /**
     * Sets the value of the dssOption property.
     * 
     */
    public void setDssOption(boolean value) {
        this.dssOption = value;
    }

    /**
     * Gets the value of the deliveryOptionID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeliveryOptionID() {
        return deliveryOptionID;
    }

    /**
     * Sets the value of the deliveryOptionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeliveryOptionID(BigInteger value) {
        this.deliveryOptionID = value;
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
     * Gets the value of the deliveryOptionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryOptionName() {
        return deliveryOptionName;
    }

    /**
     * Sets the value of the deliveryOptionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryOptionName(String value) {
        this.deliveryOptionName = value;
    }

}
