
package com.paypal.adaptivepayment.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundingConstraint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundingConstraint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowedFundingType" type="{http://svcs.paypal.com/types/ap}FundingTypeList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundingConstraint", propOrder = {
    "allowedFundingType"
})
public class FundingConstraint {

    protected FundingTypeList allowedFundingType;

    /**
     * Gets the value of the allowedFundingType property.
     * 
     * @return
     *     possible object is
     *     {@link FundingTypeList }
     *     
     */
    public FundingTypeList getAllowedFundingType() {
        return allowedFundingType;
    }

    /**
     * Sets the value of the allowedFundingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingTypeList }
     *     
     */
    public void setAllowedFundingType(FundingTypeList value) {
        this.allowedFundingType = value;
    }

}
