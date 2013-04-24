
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="recipientProfileKeys" type="{uri:customerStatus.ws.sdk.edialog.com}SimplePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="filterEventDateStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="filterEventDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "recipientProfileKeys",
    "filterEventDateStart",
    "filterEventDateEnd"
})
@XmlRootElement(name = "listRecipientHistory", namespace = "uri:customerStatus.ws.sdk.edialog.com")
public class ListRecipientHistory {

    @XmlElement(namespace = "uri:customerStatus.ws.sdk.edialog.com")
    protected List<SimplePropertyType> recipientProfileKeys;
    @XmlElement(namespace = "uri:customerStatus.ws.sdk.edialog.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar filterEventDateStart;
    @XmlElement(namespace = "uri:customerStatus.ws.sdk.edialog.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar filterEventDateEnd;

    /**
     * Gets the value of the recipientProfileKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipientProfileKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipientProfileKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplePropertyType }
     * 
     * 
     */
    public List<SimplePropertyType> getRecipientProfileKeys() {
        if (recipientProfileKeys == null) {
            recipientProfileKeys = new ArrayList<SimplePropertyType>();
        }
        return this.recipientProfileKeys;
    }

    /**
     * Gets the value of the filterEventDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterEventDateStart() {
        return filterEventDateStart;
    }

    /**
     * Sets the value of the filterEventDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterEventDateStart(XMLGregorianCalendar value) {
        this.filterEventDateStart = value;
    }

    /**
     * Gets the value of the filterEventDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterEventDateEnd() {
        return filterEventDateEnd;
    }

    /**
     * Sets the value of the filterEventDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterEventDateEnd(XMLGregorianCalendar value) {
        this.filterEventDateEnd = value;
    }

}
