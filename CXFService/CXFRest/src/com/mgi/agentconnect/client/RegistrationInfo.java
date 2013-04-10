
package com.mgi.agentconnect.client;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mgCustomerReceiveNumber" type="{http://www.moneygram.com/AgentConnect1211}customerReceiveNumber"/>
 *         &lt;element name="mgCustomerReceiveNumberVersion" type="{http://www.moneygram.com/AgentConnect1211}int3"/>
 *         &lt;element name="receiverFirstName" type="{http://www.moneygram.com/AgentConnect1211}fNameLong"/>
 *         &lt;element name="receiverLastName" type="{http://www.moneygram.com/AgentConnect1211}lNameLong"/>
 *         &lt;element name="receiverPhoneNumber" type="{http://www.moneygram.com/AgentConnect1211}phoneTypeLong"/>
 *         &lt;element name="creatorFirstName" type="{http://www.moneygram.com/AgentConnect1211}fNameLong"/>
 *         &lt;element name="creatorLastName" type="{http://www.moneygram.com/AgentConnect1211}lNameLong"/>
 *         &lt;element name="fqdoInfo" type="{http://www.moneygram.com/AgentConnect1211}FQDOInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationInfo", propOrder = {
    "mgCustomerReceiveNumber",
    "mgCustomerReceiveNumberVersion",
    "receiverFirstName",
    "receiverLastName",
    "receiverPhoneNumber",
    "creatorFirstName",
    "creatorLastName",
    "fqdoInfo"
})
public class RegistrationInfo {

    @XmlElement(required = true)
    protected String mgCustomerReceiveNumber;
    @XmlElement(required = true)
    protected BigInteger mgCustomerReceiveNumberVersion;
    @XmlElement(required = true)
    protected String receiverFirstName;
    @XmlElement(required = true)
    protected String receiverLastName;
    @XmlElement(required = true)
    protected String receiverPhoneNumber;
    @XmlElement(required = true)
    protected String creatorFirstName;
    @XmlElement(required = true)
    protected String creatorLastName;
    @XmlElement(required = true)
    protected FQDOInfo fqdoInfo;

    /**
     * Gets the value of the mgCustomerReceiveNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMgCustomerReceiveNumber() {
        return mgCustomerReceiveNumber;
    }

    /**
     * Sets the value of the mgCustomerReceiveNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMgCustomerReceiveNumber(String value) {
        this.mgCustomerReceiveNumber = value;
    }

    /**
     * Gets the value of the mgCustomerReceiveNumberVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMgCustomerReceiveNumberVersion() {
        return mgCustomerReceiveNumberVersion;
    }

    /**
     * Sets the value of the mgCustomerReceiveNumberVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMgCustomerReceiveNumberVersion(BigInteger value) {
        this.mgCustomerReceiveNumberVersion = value;
    }

    /**
     * Gets the value of the receiverFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverFirstName() {
        return receiverFirstName;
    }

    /**
     * Sets the value of the receiverFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverFirstName(String value) {
        this.receiverFirstName = value;
    }

    /**
     * Gets the value of the receiverLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverLastName() {
        return receiverLastName;
    }

    /**
     * Sets the value of the receiverLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverLastName(String value) {
        this.receiverLastName = value;
    }

    /**
     * Gets the value of the receiverPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverPhoneNumber() {
        return receiverPhoneNumber;
    }

    /**
     * Sets the value of the receiverPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverPhoneNumber(String value) {
        this.receiverPhoneNumber = value;
    }

    /**
     * Gets the value of the creatorFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorFirstName() {
        return creatorFirstName;
    }

    /**
     * Sets the value of the creatorFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorFirstName(String value) {
        this.creatorFirstName = value;
    }

    /**
     * Gets the value of the creatorLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorLastName() {
        return creatorLastName;
    }

    /**
     * Sets the value of the creatorLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorLastName(String value) {
        this.creatorLastName = value;
    }

    /**
     * Gets the value of the fqdoInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FQDOInfo }
     *     
     */
    public FQDOInfo getFqdoInfo() {
        return fqdoInfo;
    }

    /**
     * Sets the value of the fqdoInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FQDOInfo }
     *     
     */
    public void setFqdoInfo(FQDOInfo value) {
        this.fqdoInfo = value;
    }

}
