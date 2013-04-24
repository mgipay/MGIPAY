
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
 *         &lt;element name="masterInfo" type="{uri:customerStatus.ws.sdk.edialog.com}LookupRecipientProfileType"/>
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
    "masterInfo"
})
@XmlRootElement(name = "lookupRecipientProfileResponse", namespace = "uri:customerStatus.ws.sdk.edialog.com")
public class LookupRecipientProfileResponse {

    @XmlElement(namespace = "uri:customerStatus.ws.sdk.edialog.com", required = true)
    protected LookupRecipientProfileType masterInfo;

    /**
     * Gets the value of the masterInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LookupRecipientProfileType }
     *     
     */
    public LookupRecipientProfileType getMasterInfo() {
        return masterInfo;
    }

    /**
     * Sets the value of the masterInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupRecipientProfileType }
     *     
     */
    public void setMasterInfo(LookupRecipientProfileType value) {
        this.masterInfo = value;
    }

}
