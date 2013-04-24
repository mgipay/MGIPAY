
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
 *         &lt;element name="ProofSampleStatus" type="{uri:mailingcontrol.ws.sdk.edialog.com}ProofSampleStatusType"/>
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
    "proofSampleStatus"
})
@XmlRootElement(name = "getProofSampleStatusResponse", namespace = "uri:mailingcontrol.ws.sdk.edialog.com")
public class GetProofSampleStatusResponse {

    @XmlElement(name = "ProofSampleStatus", namespace = "uri:mailingcontrol.ws.sdk.edialog.com", required = true)
    protected ProofSampleStatusType proofSampleStatus;

    /**
     * Gets the value of the proofSampleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ProofSampleStatusType }
     *     
     */
    public ProofSampleStatusType getProofSampleStatus() {
        return proofSampleStatus;
    }

    /**
     * Sets the value of the proofSampleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProofSampleStatusType }
     *     
     */
    public void setProofSampleStatus(ProofSampleStatusType value) {
        this.proofSampleStatus = value;
    }

}
