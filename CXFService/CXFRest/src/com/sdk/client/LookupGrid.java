
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
 *         &lt;element name="gridId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "gridId"
})
@XmlRootElement(name = "lookupGrid", namespace = "uri:grid.ws.sdk.edialog.com")
public class LookupGrid {

    @XmlElement(namespace = "uri:grid.ws.sdk.edialog.com")
    protected int gridId;

    /**
     * Gets the value of the gridId property.
     * 
     */
    public int getGridId() {
        return gridId;
    }

    /**
     * Sets the value of the gridId property.
     * 
     */
    public void setGridId(int value) {
        this.gridId = value;
    }

}
