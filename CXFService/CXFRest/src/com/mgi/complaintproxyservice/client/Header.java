
package com.mgi.complaintproxyservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Header complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Header">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="security" type="{http://moneygram.com/common_v1}SecurityHeader" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="routingContext" type="{http://moneygram.com/common_v1}RoutingContextHeader" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="processingInstruction" type="{http://moneygram.com/common_v1}ProcessingInstruction" minOccurs="0"/>
 *         &lt;element name="clientHeader" type="{http://moneygram.com/common_v1}ClientHeader" minOccurs="0"/>
 *         &lt;element name="agent" type="{http://moneygram.com/common_v1}AgentHeader" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header", propOrder = {
    "processingInstruction",
    "clientHeader",
    "agent"
})
public class Header {

    protected ProcessingInstruction processingInstruction;
    protected ClientHeader clientHeader;
    protected AgentHeader agent;

    /**
     * Gets the value of the processingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingInstruction }
     *     
     */
    public ProcessingInstruction getProcessingInstruction() {
        return processingInstruction;
    }

    /**
     * Sets the value of the processingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingInstruction }
     *     
     */
    public void setProcessingInstruction(ProcessingInstruction value) {
        this.processingInstruction = value;
    }

    /**
     * Gets the value of the clientHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ClientHeader }
     *     
     */
    public ClientHeader getClientHeader() {
        return clientHeader;
    }

    /**
     * Sets the value of the clientHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientHeader }
     *     
     */
    public void setClientHeader(ClientHeader value) {
        this.clientHeader = value;
    }

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link AgentHeader }
     *     
     */
    public AgentHeader getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentHeader }
     *     
     */
    public void setAgent(AgentHeader value) {
        this.agent = value;
    }

}
