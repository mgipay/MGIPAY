
package com.sdk.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Complex type that includes values for a row in a
 * 				custom column.
 * 
 * <p>Java class for CustomExtType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomExtType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cntResponse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pctResponse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomExtType", namespace = "uri:ereport.ws.sdk.edialog.com", propOrder = {
    "cntResponse",
    "pctResponse"
})
public class CustomExtType {

    @XmlElement(required = true, nillable = true)
    protected String cntResponse;
    @XmlElement(required = true, nillable = true)
    protected String pctResponse;

    /**
     * Gets the value of the cntResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntResponse() {
        return cntResponse;
    }

    /**
     * Sets the value of the cntResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntResponse(String value) {
        this.cntResponse = value;
    }

    /**
     * Gets the value of the pctResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPctResponse() {
        return pctResponse;
    }

    /**
     * Sets the value of the pctResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPctResponse(String value) {
        this.pctResponse = value;
    }

}
