
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unitProfileID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="agentID" type="{http://www.moneygram.com/AgentConnect1211}agentID"/>
 *         &lt;element name="agentSequence" type="{http://www.moneygram.com/AgentConnect1211}stringMax2"/>
 *         &lt;element name="agentName" type="{http://www.moneygram.com/AgentConnect1211}agentName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileInfo", propOrder = {
    "unitProfileID",
    "agentID",
    "agentSequence",
    "agentName"
})
public class ProfileInfo {

    protected int unitProfileID;
    @XmlElement(required = true)
    protected String agentID;
    @XmlElement(required = true)
    protected String agentSequence;
    @XmlElement(required = true)
    protected String agentName;

    /**
     * Gets the value of the unitProfileID property.
     * 
     */
    public int getUnitProfileID() {
        return unitProfileID;
    }

    /**
     * Sets the value of the unitProfileID property.
     * 
     */
    public void setUnitProfileID(int value) {
        this.unitProfileID = value;
    }

    /**
     * Gets the value of the agentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentID() {
        return agentID;
    }

    /**
     * Sets the value of the agentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentID(String value) {
        this.agentID = value;
    }

    /**
     * Gets the value of the agentSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentSequence() {
        return agentSequence;
    }

    /**
     * Sets the value of the agentSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentSequence(String value) {
        this.agentSequence = value;
    }

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

}
