
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
 *         &lt;element name="campaign" type="{uri:campaign.ws.sdk.edialog.com}campaignDetailType"/>
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
    "campaign"
})
@XmlRootElement(name = "lookupCampaignByIdResponse", namespace = "uri:campaign.ws.sdk.edialog.com")
public class LookupCampaignByIdResponse {

    @XmlElement(namespace = "uri:campaign.ws.sdk.edialog.com", required = true)
    protected CampaignDetailType campaign;

    /**
     * Gets the value of the campaign property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignDetailType }
     *     
     */
    public CampaignDetailType getCampaign() {
        return campaign;
    }

    /**
     * Sets the value of the campaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignDetailType }
     *     
     */
    public void setCampaign(CampaignDetailType value) {
        this.campaign = value;
    }

}
