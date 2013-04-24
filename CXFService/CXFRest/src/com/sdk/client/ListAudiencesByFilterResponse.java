
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
 *         &lt;element name="audienceList" type="{uri:audience.ws.sdk.edialog.com}audienceListWithStatusType"/>
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
    "audienceList"
})
@XmlRootElement(name = "listAudiencesByFilterResponse", namespace = "uri:audience.ws.sdk.edialog.com")
public class ListAudiencesByFilterResponse {

    @XmlElement(namespace = "uri:audience.ws.sdk.edialog.com", required = true)
    protected AudienceListWithStatusType audienceList;

    /**
     * Gets the value of the audienceList property.
     * 
     * @return
     *     possible object is
     *     {@link AudienceListWithStatusType }
     *     
     */
    public AudienceListWithStatusType getAudienceList() {
        return audienceList;
    }

    /**
     * Sets the value of the audienceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudienceListWithStatusType }
     *     
     */
    public void setAudienceList(AudienceListWithStatusType value) {
        this.audienceList = value;
    }

}
