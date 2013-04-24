
package com.sdk.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientIdentifer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientIdentifer"
})
@XmlRootElement(name = "canAccessClient", namespace = "uri:user.ws.sdk.edialog.com")
public class CanAccessClient {

    @XmlElement(namespace = "uri:user.ws.sdk.edialog.com", required = true)
    protected String clientIdentifer;

    /**
     * Gets the value of the clientIdentifer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientIdentifer() {
        return clientIdentifer;
    }

    /**
     * Sets the value of the clientIdentifer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientIdentifer(String value) {
        this.clientIdentifer = value;
    }

}
