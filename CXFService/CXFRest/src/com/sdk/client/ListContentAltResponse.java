
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
 *         &lt;element name="contentAltList" type="{uri:content.ws.sdk.edialog.com}contentListItemAltType"/>
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
    "contentAltList"
})
@XmlRootElement(name = "listContentAltResponse", namespace = "uri:content.ws.sdk.edialog.com")
public class ListContentAltResponse {

    @XmlElement(namespace = "uri:content.ws.sdk.edialog.com", required = true)
    protected ContentListItemAltType contentAltList;

    /**
     * Gets the value of the contentAltList property.
     * 
     * @return
     *     possible object is
     *     {@link ContentListItemAltType }
     *     
     */
    public ContentListItemAltType getContentAltList() {
        return contentAltList;
    }

    /**
     * Sets the value of the contentAltList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentListItemAltType }
     *     
     */
    public void setContentAltList(ContentListItemAltType value) {
        this.contentAltList = value;
    }

}
