
package com.sdk.client;

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
 *         &lt;element name="cell" type="{uri:cell.ws.sdk.edialog.com}cellAdvancedDetailType"/>
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
    "cell"
})
@XmlRootElement(name = "lookupCellAdvancedOptionsByIdResponse")
public class LookupCellAdvancedOptionsByIdResponse {

    @XmlElement(required = true)
    protected CellAdvancedDetailType cell;

    /**
     * Gets the value of the cell property.
     * 
     * @return
     *     possible object is
     *     {@link CellAdvancedDetailType }
     *     
     */
    public CellAdvancedDetailType getCell() {
        return cell;
    }

    /**
     * Sets the value of the cell property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellAdvancedDetailType }
     *     
     */
    public void setCell(CellAdvancedDetailType value) {
        this.cell = value;
    }

}
