
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
 *         &lt;element name="campaignList" type="{uri:campaign.ws.sdk.edialog.com}campaignListType"/>
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
    "campaignList"
})
@XmlRootElement(name = "listCampaignsResponse", namespace = "uri:campaign.ws.sdk.edialog.com")
public class ListCampaignsResponse {

    @XmlElement(namespace = "uri:campaign.ws.sdk.edialog.com", required = true)
    protected CampaignListType campaignList;

    /**
     * Gets the value of the campaignList property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignListType }
     *     
     */
    public CampaignListType getCampaignList() {
        return campaignList;
    }

    /**
     * Sets the value of the campaignList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignListType }
     *     
     */
    public void setCampaignList(CampaignListType value) {
        this.campaignList = value;
    }

}
