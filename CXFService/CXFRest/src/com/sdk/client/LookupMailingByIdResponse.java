
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
 *         &lt;element name="mailing" type="{uri:mailing.ws.sdk.edialog.com}mailingDetailType"/>
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
    "mailing"
})
@XmlRootElement(name = "lookupMailingByIdResponse", namespace = "uri:mailing.ws.sdk.edialog.com")
public class LookupMailingByIdResponse {

    @XmlElement(namespace = "uri:mailing.ws.sdk.edialog.com", required = true)
    protected MailingDetailType mailing;

    /**
     * Gets the value of the mailing property.
     * 
     * @return
     *     possible object is
     *     {@link MailingDetailType }
     *     
     */
    public MailingDetailType getMailing() {
        return mailing;
    }

    /**
     * Sets the value of the mailing property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailingDetailType }
     *     
     */
    public void setMailing(MailingDetailType value) {
        this.mailing = value;
    }

}
