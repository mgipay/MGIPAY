
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Complex type. A sequence of campaignOverviewType elements arranged  in pages. Each use gets the next page.
 * 
 * <p>Java class for campaignListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="campaignListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentPageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalNumberOfRows" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalNumberOfPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="campaign" type="{uri:campaign.ws.sdk.edialog.com}campaignOverviewType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "campaignListType", namespace = "uri:campaign.ws.sdk.edialog.com", propOrder = {
    "currentPageNumber",
    "totalNumberOfRows",
    "totalNumberOfPages",
    "campaign"
})
public class CampaignListType {

    protected int currentPageNumber;
    protected int totalNumberOfRows;
    protected int totalNumberOfPages;
    protected List<CampaignOverviewType> campaign;

    /**
     * Gets the value of the currentPageNumber property.
     * 
     */
    public int getCurrentPageNumber() {
        return currentPageNumber;
    }

    /**
     * Sets the value of the currentPageNumber property.
     * 
     */
    public void setCurrentPageNumber(int value) {
        this.currentPageNumber = value;
    }

    /**
     * Gets the value of the totalNumberOfRows property.
     * 
     */
    public int getTotalNumberOfRows() {
        return totalNumberOfRows;
    }

    /**
     * Sets the value of the totalNumberOfRows property.
     * 
     */
    public void setTotalNumberOfRows(int value) {
        this.totalNumberOfRows = value;
    }

    /**
     * Gets the value of the totalNumberOfPages property.
     * 
     */
    public int getTotalNumberOfPages() {
        return totalNumberOfPages;
    }

    /**
     * Sets the value of the totalNumberOfPages property.
     * 
     */
    public void setTotalNumberOfPages(int value) {
        this.totalNumberOfPages = value;
    }

    /**
     * Gets the value of the campaign property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaign property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaign().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignOverviewType }
     * 
     * 
     */
    public List<CampaignOverviewType> getCampaign() {
        if (campaign == null) {
            campaign = new ArrayList<CampaignOverviewType>();
        }
        return this.campaign;
    }

}
