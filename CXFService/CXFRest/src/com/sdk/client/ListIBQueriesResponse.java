
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
 *         &lt;element name="currentPageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalNumberOfRows" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalNumberOfPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IBQuery" type="{uri:insightbuilder.ws.sdk.edialog.com}IBQueryType" maxOccurs="unbounded" minOccurs="0"/>
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
    "currentPageNumber",
    "totalNumberOfRows",
    "totalNumberOfPages",
    "ibQuery"
})
@XmlRootElement(name = "listIBQueriesResponse", namespace = "uri:insightbuilder.ws.sdk.edialog.com")
public class ListIBQueriesResponse {

    @XmlElement(namespace = "uri:insightbuilder.ws.sdk.edialog.com")
    protected int currentPageNumber;
    @XmlElement(namespace = "uri:insightbuilder.ws.sdk.edialog.com")
    protected int totalNumberOfRows;
    @XmlElement(namespace = "uri:insightbuilder.ws.sdk.edialog.com")
    protected int totalNumberOfPages;
    @XmlElement(name = "IBQuery", namespace = "uri:insightbuilder.ws.sdk.edialog.com")
    protected List<IBQueryType> ibQuery;

    /**
     * Gets the value of the currentPageNumber property.
     * 
     */
    public int getCurrentPageNumber() {
        return currentPageNumber;
    }

    /**
     * Sets the value of the currentPageNumber property.
     * 
     */
    public void setCurrentPageNumber(int value) {
        this.currentPageNumber = value;
    }

    /**
     * Gets the value of the totalNumberOfRows property.
     * 
     */
    public int getTotalNumberOfRows() {
        return totalNumberOfRows;
    }

    /**
     * Sets the value of the totalNumberOfRows property.
     * 
     */
    public void setTotalNumberOfRows(int value) {
        this.totalNumberOfRows = value;
    }

    /**
     * Gets the value of the totalNumberOfPages property.
     * 
     */
    public int getTotalNumberOfPages() {
        return totalNumberOfPages;
    }

    /**
     * Sets the value of the totalNumberOfPages property.
     * 
     */
    public void setTotalNumberOfPages(int value) {
        this.totalNumberOfPages = value;
    }

    /**
     * Gets the value of the ibQuery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ibQuery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIBQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBQueryType }
     * 
     * 
     */
    public List<IBQueryType> getIBQuery() {
        if (ibQuery == null) {
            ibQuery = new ArrayList<IBQueryType>();
        }
        return this.ibQuery;
    }

}
