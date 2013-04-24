
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Complex type. A list/array of cellOverviewType elements arranged in pages. Each use gets the next page.
 * 
 * <p>Java class for cellListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cellListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentPageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalNumberOfRows" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalNumberOfPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cell" type="{uri:cell.ws.sdk.edialog.com}cellOverviewType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cellListType", propOrder = {
    "currentPageNumber",
    "totalNumberOfRows",
    "totalNumberOfPages",
    "cell"
})
public class CellListType {

    protected int currentPageNumber;
    protected int totalNumberOfRows;
    protected int totalNumberOfPages;
    protected List<CellOverviewType> cell;

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
     * Gets the value of the cell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CellOverviewType }
     * 
     * 
     */
    public List<CellOverviewType> getCell() {
        if (cell == null) {
            cell = new ArrayList<CellOverviewType>();
        }
        return this.cell;
    }

}
