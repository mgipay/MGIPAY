
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
 *         &lt;element name="audience" type="{uri:audience.ws.sdk.edialog.com}audienceDetailType"/>
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
    "audience"
})
@XmlRootElement(name = "lookupAudienceByIdResponse", namespace = "uri:audience.ws.sdk.edialog.com")
public class LookupAudienceByIdResponse {

    @XmlElement(namespace = "uri:audience.ws.sdk.edialog.com", required = true)
    protected AudienceDetailType audience;

    /**
     * Gets the value of the audience property.
     * 
     * @return
     *     possible object is
     *     {@link AudienceDetailType }
     *     
     */
    public AudienceDetailType getAudience() {
        return audience;
    }

    /**
     * Sets the value of the audience property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudienceDetailType }
     *     
     */
    public void setAudience(AudienceDetailType value) {
        this.audience = value;
    }

}
