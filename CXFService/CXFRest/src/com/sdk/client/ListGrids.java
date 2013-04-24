
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
 *         &lt;element name="filterGridName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filterGridDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filterAddDateStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="filterAddDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="filterUpdateDateStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="filterUpdateDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "filterGridName",
    "filterGridDescription",
    "filterAddDateStart",
    "filterAddDateEnd",
    "filterUpdateDateStart",
    "filterUpdateDateEnd",
    "sortBy",
    "pageSize",
    "pageNumber"
})
@XmlRootElement(name = "listGrids", namespace = "uri:grid.ws.sdk.edialog.com")
public class ListGrids {

    @XmlElement(namespace = "uri:grid.ws.sdk.edialog.com", required = true, nillable = true)
    protected String filterGridName;
    @XmlElement(namespace = "uri:grid.ws.sdk.edialog.com", required = true, nillable = true)
    protected String filterGridDescription;
    @XmlElement(namespace = "uri:grid.ws.sdk.edialog.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar filterAddDateStart;
    @XmlElement(namespace = "uri:grid.ws.sdk.edialog.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar filterAddDateEnd;
    @XmlElement(namespace = "uri:grid.ws.sdk.edialog.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar filterUpdateDateStart;
    @XmlElement(namespace = "uri:grid.ws.sdk.edialog.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar filterUpdateDateEnd;
    @XmlElement(namespace = "uri:grid.ws.sdk.edialog.com")
    protected List<String> sortBy;
    @XmlElement(namespace = "uri:grid.ws.sdk.edialog.com")
    protected int pageSize;
    @XmlElement(namespace = "uri:grid.ws.sdk.edialog.com")
    protected int pageNumber;

    /**
     * Gets the value of the filterGridName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterGridName() {
        return filterGridName;
    }

    /**
     * Sets the value of the filterGridName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterGridName(String value) {
        this.filterGridName = value;
    }

    /**
     * Gets the value of the filterGridDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterGridDescription() {
        return filterGridDescription;
    }

    /**
     * Sets the value of the filterGridDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterGridDescription(String value) {
        this.filterGridDescription = value;
    }

    /**
     * Gets the value of the filterAddDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterAddDateStart() {
        return filterAddDateStart;
    }

    /**
     * Sets the value of the filterAddDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterAddDateStart(XMLGregorianCalendar value) {
        this.filterAddDateStart = value;
    }

    /**
     * Gets the value of the filterAddDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterAddDateEnd() {
        return filterAddDateEnd;
    }

    /**
     * Sets the value of the filterAddDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterAddDateEnd(XMLGregorianCalendar value) {
        this.filterAddDateEnd = value;
    }

    /**
     * Gets the value of the filterUpdateDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterUpdateDateStart() {
        return filterUpdateDateStart;
    }

    /**
     * Sets the value of the filterUpdateDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterUpdateDateStart(XMLGregorianCalendar value) {
        this.filterUpdateDateStart = value;
    }

    /**
     * Gets the value of the filterUpdateDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterUpdateDateEnd() {
        return filterUpdateDateEnd;
    }

    /**
     * Sets the value of the filterUpdateDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterUpdateDateEnd(XMLGregorianCalendar value) {
        this.filterUpdateDateEnd = value;
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
