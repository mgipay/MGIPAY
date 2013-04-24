
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
 *         &lt;element name="proofSampleSetting" type="{uri:mailingcontrol.ws.sdk.edialog.com}ProofSampleSettingType"/>
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
    "proofSampleSetting"
})
@XmlRootElement(name = "getProofSampleSettingResponse", namespace = "uri:mailingcontrol.ws.sdk.edialog.com")
public class GetProofSampleSettingResponse {

    @XmlElement(namespace = "uri:mailingcontrol.ws.sdk.edialog.com", required = true)
    protected ProofSampleSettingType proofSampleSetting;

    /**
     * Gets the value of the proofSampleSetting property.
     * 
     * @return
     *     possible object is
     *     {@link ProofSampleSettingType }
     *     
     */
    public ProofSampleSettingType getProofSampleSetting() {
        return proofSampleSetting;
    }

    /**
     * Sets the value of the proofSampleSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProofSampleSettingType }
     *     
     */
    public void setProofSampleSetting(ProofSampleSettingType value) {
        this.proofSampleSetting = value;
    }

}
