
package com.ac1211.mail.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgentHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mainOfficeId" type="{http://moneygram.com/common_v1}AgentID" minOccurs="0"/>
 *         &lt;element name="legacyMainOfficeId" type="{http://moneygram.com/common_v1}AgentID" minOccurs="0"/>
 *         &lt;element name="agentId" type="{http://moneygram.com/common_v1}AgentID" minOccurs="0"/>
 *         &lt;element name="legacyAgentId" type="{http://moneygram.com/common_v1}AgentID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentHeader", propOrder = {
    "mainOfficeId",
    "legacyMainOfficeId",
    "agentId",
    "legacyAgentId"
})
public class AgentHeader {

    protected String mainOfficeId;
    protected String legacyMainOfficeId;
    protected String agentId;
    protected String legacyAgentId;

    /**
     * Gets the value of the mainOfficeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainOfficeId() {
        return mainOfficeId;
    }

    /**
     * Sets the value of the mainOfficeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainOfficeId(String value) {
        this.mainOfficeId = value;
    }

    /**
     * Gets the value of the legacyMainOfficeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyMainOfficeId() {
        return legacyMainOfficeId;
    }

    /**
     * Sets the value of the legacyMainOfficeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyMainOfficeId(String value) {
        this.legacyMainOfficeId = value;
    }

    /**
     * Gets the value of the agentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * Sets the value of the agentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentId(String value) {
        this.agentId = value;
    }

    /**
     * Gets the value of the legacyAgentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyAgentId() {
        return legacyAgentId;
    }

    /**
     * Sets the value of the legacyAgentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyAgentId(String value) {
        this.legacyAgentId = value;
    }

}
