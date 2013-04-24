
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
 *         &lt;element name="contentItem" type="{uri:content.ws.sdk.edialog.com}contentItemType"/>
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
    "contentItem"
})
@XmlRootElement(name = "lookupContentByAlternateKeyResponse", namespace = "uri:content.ws.sdk.edialog.com")
public class LookupContentByAlternateKeyResponse {

    @XmlElement(namespace = "uri:content.ws.sdk.edialog.com", required = true)
    protected ContentItemType contentItem;

    /**
     * Gets the value of the contentItem property.
     * 
     * @return
     *     possible object is
     *     {@link ContentItemType }
     *     
     */
    public ContentItemType getContentItem() {
        return contentItem;
    }

    /**
     * Sets the value of the contentItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentItemType }
     *     
     */
    public void setContentItem(ContentItemType value) {
        this.contentItem = value;
    }

}
