
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Complex type that contains eReports rollup data
 * 				for the mailing.
 * 
 * <p>Java class for RollupCountsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RollupCountsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalMailed" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="netDelivered" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="undeliverable" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="unSubscribe" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalOpen" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalClick" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="uniqueClick" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalConversion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="uniqueConversion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="revenue" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="viewedImages" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="spamComplaints" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="customExt" type="{uri:ereport.ws.sdk.edialog.com}CustomExtType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RollupCountsType", namespace = "uri:ereport.ws.sdk.edialog.com", propOrder = {
    "totalMailed",
    "netDelivered",
    "undeliverable",
    "unSubscribe",
    "totalOpen",
    "totalClick",
    "uniqueClick",
    "totalConversion",
    "uniqueConversion",
    "revenue",
    "viewedImages",
    "spamComplaints",
    "customExt"
})
public class RollupCountsType {

    protected long totalMailed;
    protected long netDelivered;
    protected long undeliverable;
    protected long unSubscribe;
    protected long totalOpen;
    protected long totalClick;
    protected long uniqueClick;
    protected long totalConversion;
    protected long uniqueConversion;
    protected long revenue;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long viewedImages;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long spamComplaints;
    protected List<CustomExtType> customExt;

    /**
     * Gets the value of the totalMailed property.
     * 
     */
    public long getTotalMailed() {
        return totalMailed;
    }

    /**
     * Sets the value of the totalMailed property.
     * 
     */
    public void setTotalMailed(long value) {
        this.totalMailed = value;
    }

    /**
     * Gets the value of the netDelivered property.
     * 
     */
    public long getNetDelivered() {
        return netDelivered;
    }

    /**
     * Sets the value of the netDelivered property.
     * 
     */
    public void setNetDelivered(long value) {
        this.netDelivered = value;
    }

    /**
     * Gets the value of the undeliverable property.
     * 
     */
    public long getUndeliverable() {
        return undeliverable;
    }

    /**
     * Sets the value of the undeliverable property.
     * 
     */
    public void setUndeliverable(long value) {
        this.undeliverable = value;
    }

    /**
     * Gets the value of the unSubscribe property.
     * 
     */
    public long getUnSubscribe() {
        return unSubscribe;
    }

    /**
     * Sets the value of the unSubscribe property.
     * 
     */
    public void setUnSubscribe(long value) {
        this.unSubscribe = value;
    }

    /**
     * Gets the value of the totalOpen property.
     * 
     */
    public long getTotalOpen() {
        return totalOpen;
    }

    /**
     * Sets the value of the totalOpen property.
     * 
     */
    public void setTotalOpen(long value) {
        this.totalOpen = value;
    }

    /**
     * Gets the value of the totalClick property.
     * 
     */
    public long getTotalClick() {
        return totalClick;
    }

    /**
     * Sets the value of the totalClick property.
     * 
     */
    public void setTotalClick(long value) {
        this.totalClick = value;
    }

    /**
     * Gets the value of the uniqueClick property.
     * 
     */
    public long getUniqueClick() {
        return uniqueClick;
    }

    /**
     * Sets the value of the uniqueClick property.
     * 
     */
    public void setUniqueClick(long value) {
        this.uniqueClick = value;
    }

    /**
     * Gets the value of the totalConversion property.
     * 
     */
    public long getTotalConversion() {
        return totalConversion;
    }

    /**
     * Sets the value of the totalConversion property.
     * 
     */
    public void setTotalConversion(long value) {
        this.totalConversion = value;
    }

    /**
     * Gets the value of the uniqueConversion property.
     * 
     */
    public long getUniqueConversion() {
        return uniqueConversion;
    }

    /**
     * Sets the value of the uniqueConversion property.
     * 
     */
    public void setUniqueConversion(long value) {
        this.uniqueConversion = value;
    }

    /**
     * Gets the value of the revenue property.
     * 
     */
    public long getRevenue() {
        return revenue;
    }

    /**
     * Sets the value of the revenue property.
     * 
     */
    public void setRevenue(long value) {
        this.revenue = value;
    }

    /**
     * Gets the value of the viewedImages property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getViewedImages() {
        return viewedImages;
    }

    /**
     * Sets the value of the viewedImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setViewedImages(Long value) {
        this.viewedImages = value;
    }

    /**
     * Gets the value of the spamComplaints property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSpamComplaints() {
        return spamComplaints;
    }

    /**
     * Sets the value of the spamComplaints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSpamComplaints(Long value) {
        this.spamComplaints = value;
    }

    /**
     * Gets the value of the customExt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customExt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomExt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomExtType }
     * 
     * 
     */
    public List<CustomExtType> getCustomExt() {
        if (customExt == null) {
            customExt = new ArrayList<CustomExtType>();
        }
        return this.customExt;
    }

}
