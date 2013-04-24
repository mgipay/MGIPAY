
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
 *         &lt;element name="firstMailSent" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="pulseReport" type="{uri:ereport.ws.sdk.edialog.com}EventSummaryType" maxOccurs="unbounded"/>
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
    "firstMailSent",
    "pulseReport"
})
@XmlRootElement(name = "retrievePulseReportResponse", namespace = "uri:ereport.ws.sdk.edialog.com")
public class RetrievePulseReportResponse {

    @XmlElement(namespace = "uri:ereport.ws.sdk.edialog.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstMailSent;
    @XmlElement(namespace = "uri:ereport.ws.sdk.edialog.com", required = true)
    protected List<EventSummaryType> pulseReport;

    /**
     * Gets the value of the firstMailSent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstMailSent() {
        return firstMailSent;
    }

    /**
     * Sets the value of the firstMailSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstMailSent(XMLGregorianCalendar value) {
        this.firstMailSent = value;
    }

    /**
     * Gets the value of the pulseReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pulseReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPulseReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventSummaryType }
     * 
     * 
     */
    public List<EventSummaryType> getPulseReport() {
        if (pulseReport == null) {
            pulseReport = new ArrayList<EventSummaryType>();
        }
        return this.pulseReport;
    }

}
