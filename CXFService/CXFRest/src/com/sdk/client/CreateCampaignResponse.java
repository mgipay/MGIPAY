
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
 *         &lt;element name="resultCampaignId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "resultCampaignId"
})
@XmlRootElement(name = "createCampaignResponse", namespace = "uri:campaign.ws.sdk.edialog.com")
public class CreateCampaignResponse {

    @XmlElement(namespace = "uri:campaign.ws.sdk.edialog.com")
    protected int resultCampaignId;

    /**
     * Gets the value of the resultCampaignId property.
     * 
     */
    public int getResultCampaignId() {
        return resultCampaignId;
    }

    /**
     * Sets the value of the resultCampaignId property.
     * 
     */
    public void setResultCampaignId(int value) {
        this.resultCampaignId = value;
    }

}
