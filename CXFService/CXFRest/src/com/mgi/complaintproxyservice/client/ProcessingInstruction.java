
package com.mgi.complaintproxyservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingInstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessingInstruction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invocationMethod" type="{http://moneygram.com/common_v1}InvocationMethodCode" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="readOnlyFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="faultHandling" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="echoRequestFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="simulatedModeAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnErrorsAsException" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rollbackTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingInstruction", propOrder = {
    "action",
    "readOnlyFlag",
    "language",
    "echoRequestFlag",
    "simulatedModeAction",
    "returnErrorsAsException",
    "rollbackTransaction"
})
public class ProcessingInstruction {

    @XmlElement(required = true)
    protected String action;
    protected Boolean readOnlyFlag;
    protected String language;
    protected Boolean echoRequestFlag;
    protected String simulatedModeAction;
    protected Boolean returnErrorsAsException;
    protected boolean rollbackTransaction;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the readOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadOnlyFlag() {
        return readOnlyFlag;
    }

    /**
     * Sets the value of the readOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadOnlyFlag(Boolean value) {
        this.readOnlyFlag = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the echoRequestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEchoRequestFlag() {
        return echoRequestFlag;
    }

    /**
     * Sets the value of the echoRequestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEchoRequestFlag(Boolean value) {
        this.echoRequestFlag = value;
    }

    /**
     * Gets the value of the simulatedModeAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimulatedModeAction() {
        return simulatedModeAction;
    }

    /**
     * Sets the value of the simulatedModeAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimulatedModeAction(String value) {
        this.simulatedModeAction = value;
    }

    /**
     * Gets the value of the returnErrorsAsException property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnErrorsAsException() {
        return returnErrorsAsException;
    }

    /**
     * Sets the value of the returnErrorsAsException property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnErrorsAsException(Boolean value) {
        this.returnErrorsAsException = value;
    }

    /**
     * Gets the value of the rollbackTransaction property.
     * 
     */
    public boolean isRollbackTransaction() {
        return rollbackTransaction;
    }

    /**
     * Sets the value of the rollbackTransaction property.
     * 
     */
    public void setRollbackTransaction(boolean value) {
        this.rollbackTransaction = value;
    }

}
