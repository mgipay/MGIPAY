
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmendTransactionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmendTransactionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Request">
 *       &lt;sequence>
 *         &lt;element name="referenceNumber" type="{http://www.moneygram.com/AgentConnect1211}referenceNumber"/>
 *         &lt;element name="operatorName" type="{http://www.moneygram.com/AgentConnect1211}stringMax7"/>
 *         &lt;element name="receiverFirstName" type="{http://www.moneygram.com/AgentConnect1211}fNameLong"/>
 *         &lt;element name="receiverLastName" type="{http://www.moneygram.com/AgentConnect1211}lNameLong"/>
 *         &lt;element name="receiverLastName2" type="{http://www.moneygram.com/AgentConnect1211}lNameLong" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendTransactionRequest", propOrder = {
    "referenceNumber",
    "operatorName",
    "receiverFirstName",
    "receiverLastName",
    "receiverLastName2"
})
public class AmendTransactionRequest
    extends Request
{

    @XmlElement(required = true)
    protected String referenceNumber;
    @XmlElement(required = true)
    protected String operatorName;
    @XmlElement(required = true)
    protected String receiverFirstName;
    @XmlElement(required = true)
    protected String receiverLastName;
    protected String receiverLastName2;

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the operatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * Sets the value of the operatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorName(String value) {
        this.operatorName = value;
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
     * Gets the value of the receiverLastName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverLastName2() {
        return receiverLastName2;
    }

    /**
     * Sets the value of the receiverLastName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverLastName2(String value) {
        this.receiverLastName2 = value;
    }

}
