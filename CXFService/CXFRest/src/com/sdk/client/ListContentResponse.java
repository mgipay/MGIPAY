
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
 *         &lt;element name="contentList" type="{uri:content.ws.sdk.edialog.com}contentListType"/>
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
    "contentList"
})
@XmlRootElement(name = "listContentResponse", namespace = "uri:content.ws.sdk.edialog.com")
public class ListContentResponse {

    @XmlElement(namespace = "uri:content.ws.sdk.edialog.com", required = true)
    protected ContentListType contentList;

    /**
     * Gets the value of the contentList property.
     * 
     * @return
     *     possible object is
     *     {@link ContentListType }
     *     
     */
    public ContentListType getContentList() {
        return contentList;
    }

    /**
     * Sets the value of the contentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentListType }
     *     
     */
    public void setContentList(ContentListType value) {
        this.contentList = value;
    }

}
