
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
 *         &lt;element name="actionList" type="{uri:customerStatus.ws.sdk.edialog.com}recipientActionType"/>
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
    "actionList"
})
@XmlRootElement(name = "listRecipientCellEventsResponse", namespace = "uri:customerStatus.ws.sdk.edialog.com")
public class ListRecipientCellEventsResponse {

    @XmlElement(namespace = "uri:customerStatus.ws.sdk.edialog.com", required = true)
    protected RecipientActionType actionList;

    /**
     * Gets the value of the actionList property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientActionType }
     *     
     */
    public RecipientActionType getActionList() {
        return actionList;
    }

    /**
     * Sets the value of the actionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientActionType }
     *     
     */
    public void setActionList(RecipientActionType value) {
        this.actionList = value;
    }

}
