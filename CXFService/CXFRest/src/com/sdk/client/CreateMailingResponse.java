
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
 *         &lt;element name="resultMailingId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "resultMailingId"
})
@XmlRootElement(name = "createMailingResponse", namespace = "uri:mailing.ws.sdk.edialog.com")
public class CreateMailingResponse {

    @XmlElement(namespace = "uri:mailing.ws.sdk.edialog.com")
    protected int resultMailingId;

    /**
     * Gets the value of the resultMailingId property.
     * 
     */
    public int getResultMailingId() {
        return resultMailingId;
    }

    /**
     * Sets the value of the resultMailingId property.
     * 
     */
    public void setResultMailingId(int value) {
        this.resultMailingId = value;
    }

}
