
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
 *         &lt;element name="cellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="includeUnsupportedSymbols" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "cellId",
    "includeUnsupportedSymbols"
})
@XmlRootElement(name = "clearSymbolMap", namespace = "uri:cp.ws.sdk.edialog.com")
public class ClearSymbolMap {

    @XmlElement(namespace = "uri:cp.ws.sdk.edialog.com")
    protected int cellId;
    @XmlElement(namespace = "uri:cp.ws.sdk.edialog.com")
    protected boolean includeUnsupportedSymbols;

    /**
     * Gets the value of the cellId property.
     * 
     */
    public int getCellId() {
        return cellId;
    }

    /**
     * Sets the value of the cellId property.
     * 
     */
    public void setCellId(int value) {
        this.cellId = value;
    }

    /**
     * Gets the value of the includeUnsupportedSymbols property.
     * 
     */
    public boolean isIncludeUnsupportedSymbols() {
        return includeUnsupportedSymbols;
    }

    /**
     * Sets the value of the includeUnsupportedSymbols property.
     * 
     */
    public void setIncludeUnsupportedSymbols(boolean value) {
        this.includeUnsupportedSymbols = value;
    }

}
