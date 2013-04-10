
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiverInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiverInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNickname" type="{http://www.moneygram.com/AgentConnect1211}accountNickname" minOccurs="0"/>
 *         &lt;element name="receiverPhoneNumber" type="{http://www.moneygram.com/AgentConnect1211}phoneTypeLong" minOccurs="0"/>
 *         &lt;element name="receiverFirstName" type="{http://www.moneygram.com/AgentConnect1211}fNameLong"/>
 *         &lt;element name="receiverLastName" type="{http://www.moneygram.com/AgentConnect1211}lNameLong"/>
 *         &lt;element name="mgCustomerReceiveNumber" type="{http://www.moneygram.com/AgentConnect1211}customerReceiveNumber"/>
 *         &lt;element name="accountNumberLastFour" type="{http://www.moneygram.com/AgentConnect1211}stringMax4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiverInfo", propOrder = {
    "accountNickname",
    "receiverPhoneNumber",
    "receiverFirstName",
    "receiverLastName",
    "mgCustomerReceiveNumber",
    "accountNumberLastFour"
})
public class ReceiverInfo {

    protected String accountNickname;
    protected String receiverPhoneNumber;
    @XmlElement(required = true)
    protected String receiverFirstName;
    @XmlElement(required = true)
    protected String receiverLastName;
    @XmlElement(required = true)
    protected String mgCustomerReceiveNumber;
    protected String accountNumberLastFour;

    /**
     * Gets the value of the accountNickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNickname() {
        return accountNickname;
    }

    /**
     * Sets the value of the accountNickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNickname(String value) {
        this.accountNickname = value;
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
     * Gets the value of the accountNumberLastFour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumberLastFour() {
        return accountNumberLastFour;
    }

    /**
     * Sets the value of the accountNumberLastFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumberLastFour(String value) {
        this.accountNumberLastFour = value;
    }

}
