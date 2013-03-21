
package com.ac1211.client;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormFreeTranLookupRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormFreeTranLookupRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Request">
 *       &lt;sequence>
 *         &lt;element name="freqCustCardNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax20" minOccurs="0"/>
 *         &lt;element name="senderPhoneNumber" type="{http://www.moneygram.com/AgentConnect1211}phoneTypeShort" minOccurs="0"/>
 *         &lt;element name="senderFirstName" type="{http://www.moneygram.com/AgentConnect1211}fNameLong" minOccurs="0"/>
 *         &lt;element name="senderLastName" type="{http://www.moneygram.com/AgentConnect1211}lNameLong" minOccurs="0"/>
 *         &lt;element name="billerAccountNumber" type="{http://www.moneygram.com/AgentConnect1211}billerAccountNumber" minOccurs="0"/>
 *         &lt;element name="tranType" type="{http://www.moneygram.com/AgentConnect1211}stringMax4"/>
 *         &lt;element name="thisLocationOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="maxRowsToReturn" type="{http://www.moneygram.com/AgentConnect1211}int3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormFreeTranLookupRequest", propOrder = {
    "freqCustCardNumber",
    "senderPhoneNumber",
    "senderFirstName",
    "senderLastName",
    "billerAccountNumber",
    "tranType",
    "thisLocationOnly",
    "maxRowsToReturn"
})
public class FormFreeTranLookupRequest
    extends Request
{

    protected String freqCustCardNumber;
    protected String senderPhoneNumber;
    protected String senderFirstName;
    protected String senderLastName;
    protected String billerAccountNumber;
    @XmlElement(required = true)
    protected String tranType;
    protected boolean thisLocationOnly;
    protected BigInteger maxRowsToReturn;

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
     * Gets the value of the senderPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderPhoneNumber() {
        return senderPhoneNumber;
    }

    /**
     * Sets the value of the senderPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderPhoneNumber(String value) {
        this.senderPhoneNumber = value;
    }

    /**
     * Gets the value of the senderFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderFirstName() {
        return senderFirstName;
    }

    /**
     * Sets the value of the senderFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderFirstName(String value) {
        this.senderFirstName = value;
    }

    /**
     * Gets the value of the senderLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderLastName() {
        return senderLastName;
    }

    /**
     * Sets the value of the senderLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderLastName(String value) {
        this.senderLastName = value;
    }

    /**
     * Gets the value of the billerAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillerAccountNumber() {
        return billerAccountNumber;
    }

    /**
     * Sets the value of the billerAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillerAccountNumber(String value) {
        this.billerAccountNumber = value;
    }

    /**
     * Gets the value of the tranType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranType() {
        return tranType;
    }

    /**
     * Sets the value of the tranType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranType(String value) {
        this.tranType = value;
    }

    /**
     * Gets the value of the thisLocationOnly property.
     * 
     */
    public boolean isThisLocationOnly() {
        return thisLocationOnly;
    }

    /**
     * Sets the value of the thisLocationOnly property.
     * 
     */
    public void setThisLocationOnly(boolean value) {
        this.thisLocationOnly = value;
    }

    /**
     * Gets the value of the maxRowsToReturn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxRowsToReturn() {
        return maxRowsToReturn;
    }

    /**
     * Sets the value of the maxRowsToReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxRowsToReturn(BigInteger value) {
        this.maxRowsToReturn = value;
    }

}
