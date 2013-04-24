
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
 *         &lt;element name="proofGroupOptions" type="{uri:mailingcontrol.ws.sdk.edialog.com}ProofGroupOptionsType"/>
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
    "proofGroupOptions"
})
@XmlRootElement(name = "getProofGroupOptionsResponse", namespace = "uri:mailingcontrol.ws.sdk.edialog.com")
public class GetProofGroupOptionsResponse {

    @XmlElement(namespace = "uri:mailingcontrol.ws.sdk.edialog.com", required = true)
    protected ProofGroupOptionsType proofGroupOptions;

    /**
     * Gets the value of the proofGroupOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ProofGroupOptionsType }
     *     
     */
    public ProofGroupOptionsType getProofGroupOptions() {
        return proofGroupOptions;
    }

    /**
     * Sets the value of the proofGroupOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProofGroupOptionsType }
     *     
     */
    public void setProofGroupOptions(ProofGroupOptionsType value) {
        this.proofGroupOptions = value;
    }

}
