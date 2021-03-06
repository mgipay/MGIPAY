
package com.sdk.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RTMVariationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTMVariationType">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:realtimemessagingconfiguration.ws.sdk.edialog.com}RTMVariationEntryType">
 *       &lt;sequence>
 *         &lt;element name="productionCellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTMVariationType", namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com", propOrder = {
    "productionCellId"
})
public class RTMVariationType
    extends RTMVariationEntryType
{

    protected Integer productionCellId;

    /**
     * Gets the value of the productionCellId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductionCellId() {
        return productionCellId;
    }

    /**
     * Sets the value of the productionCellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductionCellId(Integer value) {
        this.productionCellId = value;
    }

}
