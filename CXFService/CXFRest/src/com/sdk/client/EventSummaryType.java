
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Counts by hour of a specifc event type.
 * 			
 * 
 * <p>Java class for EventSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hourlyEventSummary" type="{uri:ereport.ws.sdk.edialog.com}HourlyCountType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventSummaryType", namespace = "uri:ereport.ws.sdk.edialog.com", propOrder = {
    "eventTypeName",
    "hourlyEventSummary"
})
public class EventSummaryType {

    @XmlElement(required = true)
    protected String eventTypeName;
    @XmlElement(required = true, nillable = true)
    protected List<HourlyCountType> hourlyEventSummary;

    /**
     * Gets the value of the eventTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTypeName() {
        return eventTypeName;
    }

    /**
     * Sets the value of the eventTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTypeName(String value) {
        this.eventTypeName = value;
    }

    /**
     * Gets the value of the hourlyEventSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hourlyEventSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHourlyEventSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HourlyCountType }
     * 
     * 
     */
    public List<HourlyCountType> getHourlyEventSummary() {
        if (hourlyEventSummary == null) {
            hourlyEventSummary = new ArrayList<HourlyCountType>();
        }
        return this.hourlyEventSummary;
    }

}
