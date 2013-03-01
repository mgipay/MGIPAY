
package com.paypal.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						The sender identifier type contains information
 * 						to identify a PayPal account.
 * 					
 * 
 * <p>Java class for SenderIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SenderIdentifier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://svcs.paypal.com/types/common}AccountIdentifier">
 *       &lt;sequence>
 *         &lt;element name="useCredentials" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="taxIdDetails" type="{http://svcs.paypal.com/types/ap}TaxIdDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SenderIdentifier", propOrder = {
    "useCredentials",
    "taxIdDetails"
})
public class SenderIdentifier
    extends AccountIdentifier
{

    protected Boolean useCredentials;
    protected TaxIdDetails taxIdDetails;

    /**
     * Gets the value of the useCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCredentials() {
        return useCredentials;
    }

    /**
     * Sets the value of the useCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCredentials(Boolean value) {
        this.useCredentials = value;
    }

    /**
     * Gets the value of the taxIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdDetails }
     *     
     */
    public TaxIdDetails getTaxIdDetails() {
        return taxIdDetails;
    }

    /**
     * Sets the value of the taxIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdDetails }
     *     
     */
    public void setTaxIdDetails(TaxIdDetails value) {
        this.taxIdDetails = value;
    }

}
