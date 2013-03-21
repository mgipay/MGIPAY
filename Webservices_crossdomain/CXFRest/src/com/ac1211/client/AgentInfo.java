
package com.ac1211.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agentName" type="{http://www.moneygram.com/AgentConnect1211}agentName"/>
 *         &lt;element name="address" type="{http://www.moneygram.com/AgentConnect1211}addressType" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.moneygram.com/AgentConnect1211}agentCityType" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.moneygram.com/AgentConnect1211}stateType" minOccurs="0"/>
 *         &lt;element name="receiveCapability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sendCapability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="agentPhone" type="{http://www.moneygram.com/AgentConnect1211}phoneType" minOccurs="0"/>
 *         &lt;element name="storeHours" type="{http://www.moneygram.com/AgentConnect1211}StoreHourInfo" maxOccurs="7"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentInfo", propOrder = {
    "agentName",
    "address",
    "city",
    "state",
    "receiveCapability",
    "sendCapability",
    "agentPhone",
    "storeHours"
})
public class AgentInfo {

    @XmlElement(required = true)
    protected String agentName;
    protected String address;
    protected String city;
    protected String state;
    protected Boolean receiveCapability;
    protected Boolean sendCapability;
    protected String agentPhone;
    @XmlElement(required = true)
    protected List<StoreHourInfo> storeHours;

    /**
     * Gets the value of the agentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * Sets the value of the agentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentName(String value) {
        this.agentName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the receiveCapability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceiveCapability() {
        return receiveCapability;
    }

    /**
     * Sets the value of the receiveCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceiveCapability(Boolean value) {
        this.receiveCapability = value;
    }

    /**
     * Gets the value of the sendCapability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendCapability() {
        return sendCapability;
    }

    /**
     * Sets the value of the sendCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendCapability(Boolean value) {
        this.sendCapability = value;
    }

    /**
     * Gets the value of the agentPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentPhone() {
        return agentPhone;
    }

    /**
     * Sets the value of the agentPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentPhone(String value) {
        this.agentPhone = value;
    }

    /**
     * Gets the value of the storeHours property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storeHours property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoreHours().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoreHourInfo }
     * 
     * 
     */
    public List<StoreHourInfo> getStoreHours() {
        if (storeHours == null) {
            storeHours = new ArrayList<StoreHourInfo>();
        }
        return this.storeHours;
    }

}
