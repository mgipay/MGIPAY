
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
 *         &lt;element name="mailingKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "mailingKey"
})
@XmlRootElement(name = "lookupMailingByAlternateKey", namespace = "uri:mailing.ws.sdk.edialog.com")
public class LookupMailingByAlternateKey {

    @XmlElement(namespace = "uri:mailing.ws.sdk.edialog.com", required = true)
    protected String mailingKey;

    /**
     * Gets the value of the mailingKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingKey() {
        return mailingKey;
    }

    /**
     * Sets the value of the mailingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingKey(String value) {
        this.mailingKey = value;
    }

}
