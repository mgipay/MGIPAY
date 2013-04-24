
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Complex type that describes a list of grids and includes a list/array of grid structures.
 * 
 * <p>Java class for gridListAfterFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gridListAfterFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentPageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalNumberOfRows" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalNumberOfPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="grid" type="{uri:grid.ws.sdk.edialog.com}GridEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gridListAfterFilterType", namespace = "uri:grid.ws.sdk.edialog.com", propOrder = {
    "currentPageNumber",
    "totalNumberOfRows",
    "totalNumberOfPages",
    "grid"
})
public class GridListAfterFilterType {

    protected int currentPageNumber;
    protected int totalNumberOfRows;
    protected int totalNumberOfPages;
    protected List<GridEntryType> grid;

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
     * Gets the value of the grid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GridEntryType }
     * 
     * 
     */
    public List<GridEntryType> getGrid() {
        if (grid == null) {
            grid = new ArrayList<GridEntryType>();
        }
        return this.grid;
    }

}
