
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
 *         &lt;element name="filterType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filterNameExpression" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filterStartCreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="filterEndCreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="filterStartUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="filterEndUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "filterType",
    "filterNameExpression",
    "filterStartCreateDate",
    "filterEndCreateDate",
    "filterStartUpdateDate",
    "filterEndUpdateDate",
    "sortBy",
    "pageSize",
    "pageNumber"
})
@XmlRootElement(name = "listAudiencesByFilter", namespace = "uri:audience.ws.sdk.edialog.com")
public class ListAudiencesByFilter {

    @XmlElement(namespace = "uri:audience.ws.sdk.edialog.com", required = true, nillable = true)
    protected String filterType;
    @XmlElement(namespace = "uri:audience.ws.sdk.edialog.com", required = true, nillable = true)
    protected String filterNameExpression;
    @XmlElement(namespace = "uri:audience.ws.sdk.edialog.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar filterStartCreateDate;
    @XmlElement(namespace = "uri:audience.ws.sdk.edialog.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar filterEndCreateDate;
    @XmlElement(namespace = "uri:audience.ws.sdk.edialog.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar filterStartUpdateDate;
    @XmlElement(namespace = "uri:audience.ws.sdk.edialog.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar filterEndUpdateDate;
    @XmlElement(namespace = "uri:audience.ws.sdk.edialog.com")
    protected List<String> sortBy;
    @XmlElement(namespace = "uri:audience.ws.sdk.edialog.com")
    protected int pageSize;
    @XmlElement(namespace = "uri:audience.ws.sdk.edialog.com")
    protected int pageNumber;

    /**
     * Gets the value of the filterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterType() {
        return filterType;
    }

    /**
     * Sets the value of the filterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterType(String value) {
        this.filterType = value;
    }

    /**
     * Gets the value of the filterNameExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterNameExpression() {
        return filterNameExpression;
    }

    /**
     * Sets the value of the filterNameExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterNameExpression(String value) {
        this.filterNameExpression = value;
    }

    /**
     * Gets the value of the filterStartCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterStartCreateDate() {
        return filterStartCreateDate;
    }

    /**
     * Sets the value of the filterStartCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterStartCreateDate(XMLGregorianCalendar value) {
        this.filterStartCreateDate = value;
    }

    /**
     * Gets the value of the filterEndCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterEndCreateDate() {
        return filterEndCreateDate;
    }

    /**
     * Sets the value of the filterEndCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterEndCreateDate(XMLGregorianCalendar value) {
        this.filterEndCreateDate = value;
    }

    /**
     * Gets the value of the filterStartUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterStartUpdateDate() {
        return filterStartUpdateDate;
    }

    /**
     * Sets the value of the filterStartUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterStartUpdateDate(XMLGregorianCalendar value) {
        this.filterStartUpdateDate = value;
    }

    /**
     * Gets the value of the filterEndUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterEndUpdateDate() {
        return filterEndUpdateDate;
    }

    /**
     * Sets the value of the filterEndUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterEndUpdateDate(XMLGregorianCalendar value) {
        this.filterEndUpdateDate = value;
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
