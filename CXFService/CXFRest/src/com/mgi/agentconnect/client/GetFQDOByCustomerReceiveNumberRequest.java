
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFQDOByCustomerReceiveNumberRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFQDOByCustomerReceiveNumberRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Request">
 *       &lt;sequence>
 *         &lt;element name="mgCustomerReceiveNumber" type="{http://www.moneygram.com/AgentConnect1211}customerReceiveNumber"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFQDOByCustomerReceiveNumberRequest", propOrder = {
    "mgCustomerReceiveNumber"
})
public class GetFQDOByCustomerReceiveNumberRequest
    extends Request
{

    @XmlElement(required = true)
    protected String mgCustomerReceiveNumber;

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

}
