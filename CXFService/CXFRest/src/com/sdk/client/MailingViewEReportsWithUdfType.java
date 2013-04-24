
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mailingViewEReportsWithUdfType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mailingViewEReportsWithUdfType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mailings" type="{uri:ereport.ws.sdk.edialog.com}MailingViewWithUdfType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mailingsInfo" type="{uri:ereport.ws.sdk.edialog.com}eReportsMailingOverviewWithUdfType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mailingViewEReportsWithUdfType", namespace = "uri:ereport.ws.sdk.edialog.com", propOrder = {
    "mailings",
    "mailingsInfo",
    "responseCode"
})
public class MailingViewEReportsWithUdfType {

    protected List<MailingViewWithUdfType> mailings;
    protected List<EReportsMailingOverviewWithUdfType> mailingsInfo;
    protected int responseCode;

    /**
     * Gets the value of the mailings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mailings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMailings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MailingViewWithUdfType }
     * 
     * 
     */
    public List<MailingViewWithUdfType> getMailings() {
        if (mailings == null) {
            mailings = new ArrayList<MailingViewWithUdfType>();
        }
        return this.mailings;
    }

    /**
     * Gets the value of the mailingsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mailingsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMailingsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EReportsMailingOverviewWithUdfType }
     * 
     * 
     */
    public List<EReportsMailingOverviewWithUdfType> getMailingsInfo() {
        if (mailingsInfo == null) {
            mailingsInfo = new ArrayList<EReportsMailingOverviewWithUdfType>();
        }
        return this.mailingsInfo;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     */
    public int getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     */
    public void setResponseCode(int value) {
        this.responseCode = value;
    }

}
