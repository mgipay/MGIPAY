
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
 *         &lt;element name="mailingIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mailingNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cellIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cellNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="filterMailedDateStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="filterMailedDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="filterUdf" type="{uri:common.ws.sdk.edialog.com}UDFFilterType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="reportType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "mailingIds",
    "mailingNames",
    "cellIds",
    "cellNames",
    "filterMailedDateStart",
    "filterMailedDateEnd",
    "filterUdf",
    "reportType"
})
@XmlRootElement(name = "retrieveCellViewEReports", namespace = "uri:ereport.ws.sdk.edialog.com")
public class RetrieveCellViewEReports {

    @XmlElement(namespace = "uri:ereport.ws.sdk.edialog.com", type = Integer.class)
    protected List<Integer> mailingIds;
    @XmlElement(namespace = "uri:ereport.ws.sdk.edialog.com")
    protected List<String> mailingNames;
    @XmlElement(namespace = "uri:ereport.ws.sdk.edialog.com", type = Integer.class)
    protected List<Integer> cellIds;
    @XmlElement(namespace = "uri:ereport.ws.sdk.edialog.com")
    protected List<String> cellNames;
    @XmlElement(namespace = "uri:ereport.ws.sdk.edialog.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar filterMailedDateStart;
    @XmlElement(namespace = "uri:ereport.ws.sdk.edialog.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar filterMailedDateEnd;
    @XmlElement(namespace = "uri:ereport.ws.sdk.edialog.com")
    protected List<UDFFilterType> filterUdf;
    @XmlElement(namespace = "uri:ereport.ws.sdk.edialog.com", required = true)
    protected String reportType;

    /**
     * Gets the value of the mailingIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mailingIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMailingIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getMailingIds() {
        if (mailingIds == null) {
            mailingIds = new ArrayList<Integer>();
        }
        return this.mailingIds;
    }

    /**
     * Gets the value of the mailingNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mailingNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMailingNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMailingNames() {
        if (mailingNames == null) {
            mailingNames = new ArrayList<String>();
        }
        return this.mailingNames;
    }

    /**
     * Gets the value of the cellIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cellIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCellIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getCellIds() {
        if (cellIds == null) {
            cellIds = new ArrayList<Integer>();
        }
        return this.cellIds;
    }

    /**
     * Gets the value of the cellNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cellNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCellNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCellNames() {
        if (cellNames == null) {
            cellNames = new ArrayList<String>();
        }
        return this.cellNames;
    }

    /**
     * Gets the value of the filterMailedDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterMailedDateStart() {
        return filterMailedDateStart;
    }

    /**
     * Sets the value of the filterMailedDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterMailedDateStart(XMLGregorianCalendar value) {
        this.filterMailedDateStart = value;
    }

    /**
     * Gets the value of the filterMailedDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterMailedDateEnd() {
        return filterMailedDateEnd;
    }

    /**
     * Sets the value of the filterMailedDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterMailedDateEnd(XMLGregorianCalendar value) {
        this.filterMailedDateEnd = value;
    }

    /**
     * Gets the value of the filterUdf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterUdf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterUdf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDFFilterType }
     * 
     * 
     */
    public List<UDFFilterType> getFilterUdf() {
        if (filterUdf == null) {
            filterUdf = new ArrayList<UDFFilterType>();
        }
        return this.filterUdf;
    }

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportType(String value) {
        this.reportType = value;
    }

}
