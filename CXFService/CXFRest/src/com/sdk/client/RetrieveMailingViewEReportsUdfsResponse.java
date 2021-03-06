
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
 *         &lt;element name="mailingView" type="{uri:ereport.ws.sdk.edialog.com}mailingViewEReportsWithUdfType"/>
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
    "mailingView"
})
@XmlRootElement(name = "retrieveMailingViewEReportsUdfsResponse", namespace = "uri:ereport.ws.sdk.edialog.com")
public class RetrieveMailingViewEReportsUdfsResponse {

    @XmlElement(namespace = "uri:ereport.ws.sdk.edialog.com", required = true)
    protected MailingViewEReportsWithUdfType mailingView;

    /**
     * Gets the value of the mailingView property.
     * 
     * @return
     *     possible object is
     *     {@link MailingViewEReportsWithUdfType }
     *     
     */
    public MailingViewEReportsWithUdfType getMailingView() {
        return mailingView;
    }

    /**
     * Sets the value of the mailingView property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailingViewEReportsWithUdfType }
     *     
     */
    public void setMailingView(MailingViewEReportsWithUdfType value) {
        this.mailingView = value;
    }

}
