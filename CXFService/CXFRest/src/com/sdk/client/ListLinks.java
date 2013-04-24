
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
 *         &lt;element name="filterMailingId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filterCellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filterEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="filterExpiresAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="filterExpiresBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sortBy" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "filterMailingId",
    "filterCellId",
    "filterEnabled",
    "filterExpiresAfter",
    "filterExpiresBefore",
    "sortBy",
    "pageSize",
    "pageNumber"
})
@XmlRootElement(name = "listLinks", namespace = "uri:urlmanagement.ws.sdk.edialog.com")
public class ListLinks {

    @XmlElement(namespace = "uri:urlmanagement.ws.sdk.edialog.com", required = true, type = Integer.class, nillable = true)
    protected Integer filterMailingId;
    @XmlElement(namespace = "uri:urlmanagement.ws.sdk.edialog.com", required = true, type = Integer.class, nillable = true)
    protected Integer filterCellId;
    @XmlElement(namespace = "uri:urlmanagement.ws.sdk.edialog.com", required = true, type = Boolean.class, nillable = true)
    protected Boolean filterEnabled;
    @XmlElement(namespace = "uri:urlmanagement.ws.sdk.edialog.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar filterExpiresAfter;
    @XmlElement(namespace = "uri:urlmanagement.ws.sdk.edialog.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar filterExpiresBefore;
    @XmlElement(namespace = "uri:urlmanagement.ws.sdk.edialog.com")
    protected List<String> sortBy;
    @XmlElement(namespace = "uri:urlmanagement.ws.sdk.edialog.com")
    protected int pageSize;
    @XmlElement(namespace = "uri:urlmanagement.ws.sdk.edialog.com")
    protected int pageNumber;

    /**
     * Gets the value of the filterMailingId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFilterMailingId() {
        return filterMailingId;
    }

    /**
     * Sets the value of the filterMailingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFilterMailingId(Integer value) {
        this.filterMailingId = value;
    }

    /**
     * Gets the value of the filterCellId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFilterCellId() {
        return filterCellId;
    }

    /**
     * Sets the value of the filterCellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFilterCellId(Integer value) {
        this.filterCellId = value;
    }

    /**
     * Gets the value of the filterEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilterEnabled() {
        return filterEnabled;
    }

    /**
     * Sets the value of the filterEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilterEnabled(Boolean value) {
        this.filterEnabled = value;
    }

    /**
     * Gets the value of the filterExpiresAfter property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterExpiresAfter() {
        return filterExpiresAfter;
    }

    /**
     * Sets the value of the filterExpiresAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterExpiresAfter(XMLGregorianCalendar value) {
        this.filterExpiresAfter = value;
    }

    /**
     * Gets the value of the filterExpiresBefore property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterExpiresBefore() {
        return filterExpiresBefore;
    }

    /**
     * Sets the value of the filterExpiresBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterExpiresBefore(XMLGregorianCalendar value) {
        this.filterExpiresBefore = value;
    }

    /**
     * Gets the value of the sortBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSortBy() {
        if (sortBy == null) {
            sortBy = new ArrayList<String>();
        }
        return this.sortBy;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

}
