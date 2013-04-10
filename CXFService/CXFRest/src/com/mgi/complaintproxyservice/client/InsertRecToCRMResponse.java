
package com.mgi.complaintproxyservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertRecToCRMResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertRecToCRMResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://moneygram.com/common_v1}BaseServiceResponseMessage">
 *       &lt;sequence>
 *         &lt;element name="insertRecToCRMResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertRecToCRMResponse", namespace = "http://moneygram.com/service/ComplaintProxyService_v1", propOrder = {
    "insertRecToCRMResult"
})
public class InsertRecToCRMResponse
    extends BaseServiceResponseMessage
{

    protected String insertRecToCRMResult;

    /**
     * Gets the value of the insertRecToCRMResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertRecToCRMResult() {
        return insertRecToCRMResult;
    }

    /**
     * Sets the value of the insertRecToCRMResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertRecToCRMResult(String value) {
        this.insertRecToCRMResult = value;
    }

}
