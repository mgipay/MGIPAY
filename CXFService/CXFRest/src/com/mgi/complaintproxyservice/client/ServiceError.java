
package com.mgi.complaintproxyservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorStackTrace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorHandlingCode" type="{http://moneygram.com/common_v1}ErrorHandlingCode" minOccurs="0"/>
 *         &lt;element name="errorCategoryCode" type="{http://moneygram.com/common_v1}ErrorCategoryCode" minOccurs="0"/>
 *         &lt;element name="relatedErrors" type="{http://moneygram.com/common_v1}RelatedErrors" minOccurs="0"/>
 *         &lt;element name="offendingField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceError", propOrder = {
    "errorCode",
    "errorSource",
    "errorMessage",
    "errorStackTrace",
    "errorLocation",
    "errorHandlingCode",
    "errorCategoryCode",
    "relatedErrors",
    "offendingField"
})
public class ServiceError {

    @XmlElement(required = true)
    protected String errorCode;
    @XmlElement(required = true)
    protected String errorSource;
    protected String errorMessage;
    protected String errorStackTrace;
    protected String errorLocation;
    protected ErrorHandlingCode errorHandlingCode;
    protected ErrorCategoryCode errorCategoryCode;
    protected RelatedErrors relatedErrors;
    protected String offendingField;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSource() {
        return errorSource;
    }

    /**
     * Sets the value of the errorSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSource(String value) {
        this.errorSource = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the errorStackTrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorStackTrace() {
        return errorStackTrace;
    }

    /**
     * Sets the value of the errorStackTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorStackTrace(String value) {
        this.errorStackTrace = value;
    }

    /**
     * Gets the value of the errorLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorLocation() {
        return errorLocation;
    }

    /**
     * Sets the value of the errorLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorLocation(String value) {
        this.errorLocation = value;
    }

    /**
     * Gets the value of the errorHandlingCode property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandlingCode }
     *     
     */
    public ErrorHandlingCode getErrorHandlingCode() {
        return errorHandlingCode;
    }

    /**
     * Sets the value of the errorHandlingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandlingCode }
     *     
     */
    public void setErrorHandlingCode(ErrorHandlingCode value) {
        this.errorHandlingCode = value;
    }

    /**
     * Gets the value of the errorCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorCategoryCode }
     *     
     */
    public ErrorCategoryCode getErrorCategoryCode() {
        return errorCategoryCode;
    }

    /**
     * Sets the value of the errorCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorCategoryCode }
     *     
     */
    public void setErrorCategoryCode(ErrorCategoryCode value) {
        this.errorCategoryCode = value;
    }

    /**
     * Gets the value of the relatedErrors property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedErrors }
     *     
     */
    public RelatedErrors getRelatedErrors() {
        return relatedErrors;
    }

    /**
     * Sets the value of the relatedErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedErrors }
     *     
     */
    public void setRelatedErrors(RelatedErrors value) {
        this.relatedErrors = value;
    }

    /**
     * Gets the value of the offendingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffendingField() {
        return offendingField;
    }

    /**
     * Sets the value of the offendingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffendingField(String value) {
        this.offendingField = value;
    }

}
