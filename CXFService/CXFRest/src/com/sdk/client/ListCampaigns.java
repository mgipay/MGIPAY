
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
 *         &lt;element name="filterNameExpression" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filterCreateDateStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="filterCreateDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "filterNameExpression",
    "filterCreateDateStart",
    "filterCreateDateEnd",
    "sortBy",
    "pageSize",
    "pageNumber"
})
@XmlRootElement(name = "listCampaigns", namespace = "uri:campaign.ws.sdk.edialog.com")
public class ListCampaigns {

    @XmlElement(namespace = "uri:campaign.ws.sdk.edialog.com", required = true, nillable = true)
    protected String filterNameExpression;
    @XmlElement(namespace = "uri:campaign.ws.sdk.edialog.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar filterCreateDateStart;
    @XmlElement(namespace = "uri:campaign.ws.sdk.edialog.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar filterCreateDateEnd;
    @XmlElement(namespace = "uri:campaign.ws.sdk.edialog.com")
    protected List<String> sortBy;
    @XmlElement(namespace = "uri:campaign.ws.sdk.edialog.com")
    protected int pageSize;
    @XmlElement(namespace = "uri:campaign.ws.sdk.edialog.com")
    protected int pageNumber;

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
     * Gets the value of the filterCreateDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterCreateDateStart() {
        return filterCreateDateStart;
    }

    /**
     * Sets the value of the filterCreateDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterCreateDateStart(XMLGregorianCalendar value) {
        this.filterCreateDateStart = value;
    }

    /**
     * Gets the value of the filterCreateDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterCreateDateEnd() {
        return filterCreateDateEnd;
    }

    /**
     * Sets the value of the filterCreateDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterCreateDateEnd(XMLGregorianCalendar value) {
        this.filterCreateDateEnd = value;
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
