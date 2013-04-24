
package com.sdk.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="mergeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dropDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
    "mergeDate",
    "dropDate"
})
@XmlRootElement(name = "scheduleCell", namespace = "uri:mailingcontrol.ws.sdk.edialog.com")
public class ScheduleCell {

    @XmlElement(namespace = "uri:mailingcontrol.ws.sdk.edialog.com")
    protected int cellId;
    @XmlElement(namespace = "uri:mailingcontrol.ws.sdk.edialog.com")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mergeDate;
    @XmlElement(namespace = "uri:mailingcontrol.ws.sdk.edialog.com")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dropDate;

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
     * Gets the value of the mergeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMergeDate() {
        return mergeDate;
    }

    /**
     * Sets the value of the mergeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMergeDate(XMLGregorianCalendar value) {
        this.mergeDate = value;
    }

    /**
     * Gets the value of the dropDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDropDate() {
        return dropDate;
    }

    /**
     * Sets the value of the dropDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDropDate(XMLGregorianCalendar value) {
        this.dropDate = value;
    }

}
