
package com.ac1211.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFQDOByCustomerReceiveNumberResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFQDOByCustomerReceiveNumberResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Response">
 *       &lt;sequence>
 *         &lt;element name="fqdoInfo" type="{http://www.moneygram.com/AgentConnect1211}FQDOInfo"/>
 *         &lt;element name="registrationStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFQDOByCustomerReceiveNumberResponse", propOrder = {
    "fqdoInfo",
    "registrationStatusCode"
})
public class GetFQDOByCustomerReceiveNumberResponse
    extends Response
{

    @XmlElement(required = true)
    protected FQDOInfo fqdoInfo;
    @XmlElement(required = true)
    protected String registrationStatusCode;

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

    /**
     * Gets the value of the registrationStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationStatusCode() {
        return registrationStatusCode;
    }

    /**
     * Sets the value of the registrationStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationStatusCode(String value) {
        this.registrationStatusCode = value;
    }

}
