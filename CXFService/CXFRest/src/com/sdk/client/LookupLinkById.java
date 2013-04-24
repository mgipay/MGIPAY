
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
 *         &lt;element name="linkId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "linkId"
})
@XmlRootElement(name = "lookupLinkById", namespace = "uri:urlmanagement.ws.sdk.edialog.com")
public class LookupLinkById {

    @XmlElement(namespace = "uri:urlmanagement.ws.sdk.edialog.com")
    protected int linkId;

    /**
     * Gets the value of the linkId property.
     * 
     */
    public int getLinkId() {
        return linkId;
    }

    /**
     * Sets the value of the linkId property.
     * 
     */
    public void setLinkId(int value) {
        this.linkId = value;
    }

}
