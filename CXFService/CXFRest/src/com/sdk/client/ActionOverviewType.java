
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Complex type. A list/array of event elements.
 * 
 * <p>Java class for actionOverviewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="actionOverviewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mailgroupId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="eventgroup" type="{uri:customerStatus.ws.sdk.edialog.com}eventGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actionOverviewType", namespace = "uri:customerStatus.ws.sdk.edialog.com", propOrder = {
    "mailgroupId",
    "eventgroup"
})
public class ActionOverviewType {

    protected int mailgroupId;
    protected List<EventGroupType> eventgroup;

    /**
     * Gets the value of the mailgroupId property.
     * 
     */
    public int getMailgroupId() {
        return mailgroupId;
    }

    /**
     * Sets the value of the mailgroupId property.
     * 
     */
    public void setMailgroupId(int value) {
        this.mailgroupId = value;
    }

    /**
     * Gets the value of the eventgroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventgroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventgroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventGroupType }
     * 
     * 
     */
    public List<EventGroupType> getEventgroup() {
        if (eventgroup == null) {
            eventgroup = new ArrayList<EventGroupType>();
        }
        return this.eventgroup;
    }

}
