
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="cellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalHours" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="eventTypeName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
    "cellId",
    "totalHours",
    "eventTypeName"
})
@XmlRootElement(name = "retrievePulseReport", namespace = "uri:ereport.ws.sdk.edialog.com")
public class RetrievePulseReport {

    @XmlElement(namespace = "uri:ereport.ws.sdk.edialog.com")
    protected int cellId;
    @XmlElement(namespace = "uri:ereport.ws.sdk.edialog.com")
    protected int totalHours;
    @XmlElement(namespace = "uri:ereport.ws.sdk.edialog.com", required = true)
    protected List<String> eventTypeName;

    /**
     * Gets the value of the cellId property.
     * 
     */
    public int getCellId() {
        return cellId;
    }

    /**
     * Sets the value of the cellId property.
     * 
     */
    public void setCellId(int value) {
        this.cellId = value;
    }

    /**
     * Gets the value of the totalHours property.
     * 
     */
    public int getTotalHours() {
        return totalHours;
    }

    /**
     * Sets the value of the totalHours property.
     * 
     */
    public void setTotalHours(int value) {
        this.totalHours = value;
    }

    /**
     * Gets the value of the eventTypeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventTypeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventTypeName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEventTypeName() {
        if (eventTypeName == null) {
            eventTypeName = new ArrayList<String>();
        }
        return this.eventTypeName;
    }

}
