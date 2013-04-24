
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="udfValueList" type="{uri:udf.ws.sdk.edialog.com}udfValueListType" maxOccurs="5" minOccurs="5"/>
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
    "udfValueList"
})
@XmlRootElement(name = "listContentUdfsResponse", namespace = "uri:udf.ws.sdk.edialog.com")
public class ListContentUdfsResponse {

    @XmlElement(namespace = "uri:udf.ws.sdk.edialog.com", required = true)
    protected List<UdfValueListType> udfValueList;

    /**
     * Gets the value of the udfValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udfValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUdfValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UdfValueListType }
     * 
     * 
     */
    public List<UdfValueListType> getUdfValueList() {
        if (udfValueList == null) {
            udfValueList = new ArrayList<UdfValueListType>();
        }
        return this.udfValueList;
    }

}
