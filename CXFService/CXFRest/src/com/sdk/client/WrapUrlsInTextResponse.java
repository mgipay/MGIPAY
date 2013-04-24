
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
 *         &lt;element name="wrappedData" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "wrappedData"
})
@XmlRootElement(name = "wrapUrlsInTextResponse", namespace = "uri:content.ws.sdk.edialog.com")
public class WrapUrlsInTextResponse {

    @XmlElement(namespace = "uri:content.ws.sdk.edialog.com", required = true)
    protected String wrappedData;

    /**
     * Gets the value of the wrappedData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrappedData() {
        return wrappedData;
    }

    /**
     * Sets the value of the wrappedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrappedData(String value) {
        this.wrappedData = value;
    }

}
