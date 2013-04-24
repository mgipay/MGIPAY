
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
 *         &lt;element name="mailingId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="deepCopy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "mailingId",
    "campaignId",
    "deepCopy"
})
@XmlRootElement(name = "cloneMailing", namespace = "uri:mailing.ws.sdk.edialog.com")
public class CloneMailing {

    @XmlElement(namespace = "uri:mailing.ws.sdk.edialog.com")
    protected int mailingId;
    @XmlElement(namespace = "uri:mailing.ws.sdk.edialog.com")
    protected int campaignId;
    @XmlElement(namespace = "uri:mailing.ws.sdk.edialog.com")
    protected boolean deepCopy;

    /**
     * Gets the value of the mailingId property.
     * 
     */
    public int getMailingId() {
        return mailingId;
    }

    /**
     * Sets the value of the mailingId property.
     * 
     */
    public void setMailingId(int value) {
        this.mailingId = value;
    }

    /**
     * Gets the value of the campaignId property.
     * 
     */
    public int getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     */
    public void setCampaignId(int value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the deepCopy property.
     * 
     */
    public boolean isDeepCopy() {
        return deepCopy;
    }

    /**
     * Sets the value of the deepCopy property.
     * 
     */
    public void setDeepCopy(boolean value) {
        this.deepCopy = value;
    }

}
