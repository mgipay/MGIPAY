
package com.mgi.complaintproxyservice.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ac1211.mail.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InsertRecToCRMRequest_QNAME = new QName("http://moneygram.com/service/ComplaintProxyService_v1", "insertRecToCRMRequest");
    private final static QName _InsertRecsIntoCRMExtWebFormRequest_QNAME = new QName("http://moneygram.com/service/ComplaintProxyService_v1", "insertRecsIntoCRMExtWebFormRequest");
    private final static QName _InsertRecsIntoCRMIntWebFormRequest_QNAME = new QName("http://moneygram.com/service/ComplaintProxyService_v1", "insertRecsIntoCRMIntWebFormRequest");
    private final static QName _Error_QNAME = new QName("http://moneygram.com/common_v1", "error");
    private final static QName _InsertRecsIntoCRMIntWebFormResponse_QNAME = new QName("http://moneygram.com/service/ComplaintProxyService_v1", "insertRecsIntoCRMIntWebFormResponse");
    private final static QName _InsertRecsIntoCRMExtWebFormResponse_QNAME = new QName("http://moneygram.com/service/ComplaintProxyService_v1", "insertRecsIntoCRMExtWebFormResponse");
    private final static QName _InsertRecToCRMResponse_QNAME = new QName("http://moneygram.com/service/ComplaintProxyService_v1", "insertRecToCRMResponse");
    private final static QName _Header_QNAME = new QName("http://moneygram.com/common_v1", "header");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ac1211.mail.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceError }
     * 
     */
    public ServiceError createServiceError() {
        return new ServiceError();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link BaseServiceResponseMessage }
     * 
     */
    public BaseServiceResponseMessage createBaseServiceResponseMessage() {
        return new BaseServiceResponseMessage();
    }

    /**
     * Create an instance of {@link SecurityHeader }
     * 
     */
    public SecurityHeader createSecurityHeader() {
        return new SecurityHeader();
    }

    /**
     * Create an instance of {@link Errors }
     * 
     */
    public Errors createErrors() {
        return new Errors();
    }

    /**
     * Create an instance of {@link RelatedError }
     * 
     */
    public RelatedError createRelatedError() {
        return new RelatedError();
    }

    /**
     * Create an instance of {@link BaseServiceRequestMessage }
     * 
     */
    public BaseServiceRequestMessage createBaseServiceRequestMessage() {
        return new BaseServiceRequestMessage();
    }

    /**
     * Create an instance of {@link ClientHeader }
     * 
     */
    public ClientHeader createClientHeader() {
        return new ClientHeader();
    }

    /**
     * Create an instance of {@link RoutingContextHeader }
     * 
     */
    public RoutingContextHeader createRoutingContextHeader() {
        return new RoutingContextHeader();
    }

    /**
     * Create an instance of {@link AgentHeader }
     * 
     */
    public AgentHeader createAgentHeader() {
        return new AgentHeader();
    }

    /**
     * Create an instance of {@link RelatedErrors }
     * 
     */
    public RelatedErrors createRelatedErrors() {
        return new RelatedErrors();
    }

    /**
     * Create an instance of {@link ProcessingInstruction }
     * 
     */
    public ProcessingInstruction createProcessingInstruction() {
        return new ProcessingInstruction();
    }

    /**
     * Create an instance of {@link InsertRecToCRMResponse }
     * 
     */
    public InsertRecToCRMResponse createInsertRecToCRMResponse() {
        return new InsertRecToCRMResponse();
    }

    /**
     * Create an instance of {@link InsertRecsIntoCRMExtWebFormResponse }
     * 
     */
    public InsertRecsIntoCRMExtWebFormResponse createInsertRecsIntoCRMExtWebFormResponse() {
        return new InsertRecsIntoCRMExtWebFormResponse();
    }

    /**
     * Create an instance of {@link InsertRecsIntoCRMIntWebFormResponse }
     * 
     */
    public InsertRecsIntoCRMIntWebFormResponse createInsertRecsIntoCRMIntWebFormResponse() {
        return new InsertRecsIntoCRMIntWebFormResponse();
    }

    /**
     * Create an instance of {@link InsertRecsIntoCRMIntWebFormRequest }
     * 
     */
    public InsertRecsIntoCRMIntWebFormRequest createInsertRecsIntoCRMIntWebFormRequest() {
        return new InsertRecsIntoCRMIntWebFormRequest();
    }

    /**
     * Create an instance of {@link InsertRecsIntoCRMExtWebFormRequest }
     * 
     */
    public InsertRecsIntoCRMExtWebFormRequest createInsertRecsIntoCRMExtWebFormRequest() {
        return new InsertRecsIntoCRMExtWebFormRequest();
    }

    /**
     * Create an instance of {@link InsertRecToCRMRequest }
     * 
     */
    public InsertRecToCRMRequest createInsertRecToCRMRequest() {
        return new InsertRecToCRMRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertRecToCRMRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://moneygram.com/service/ComplaintProxyService_v1", name = "insertRecToCRMRequest")
    public JAXBElement<InsertRecToCRMRequest> createInsertRecToCRMRequest(InsertRecToCRMRequest value) {
        return new JAXBElement<InsertRecToCRMRequest>(_InsertRecToCRMRequest_QNAME, InsertRecToCRMRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertRecsIntoCRMExtWebFormRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://moneygram.com/service/ComplaintProxyService_v1", name = "insertRecsIntoCRMExtWebFormRequest")
    public JAXBElement<InsertRecsIntoCRMExtWebFormRequest> createInsertRecsIntoCRMExtWebFormRequest(InsertRecsIntoCRMExtWebFormRequest value) {
        return new JAXBElement<InsertRecsIntoCRMExtWebFormRequest>(_InsertRecsIntoCRMExtWebFormRequest_QNAME, InsertRecsIntoCRMExtWebFormRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertRecsIntoCRMIntWebFormRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://moneygram.com/service/ComplaintProxyService_v1", name = "insertRecsIntoCRMIntWebFormRequest")
    public JAXBElement<InsertRecsIntoCRMIntWebFormRequest> createInsertRecsIntoCRMIntWebFormRequest(InsertRecsIntoCRMIntWebFormRequest value) {
        return new JAXBElement<InsertRecsIntoCRMIntWebFormRequest>(_InsertRecsIntoCRMIntWebFormRequest_QNAME, InsertRecsIntoCRMIntWebFormRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://moneygram.com/common_v1", name = "error")
    public JAXBElement<ServiceError> createError(ServiceError value) {
        return new JAXBElement<ServiceError>(_Error_QNAME, ServiceError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertRecsIntoCRMIntWebFormResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://moneygram.com/service/ComplaintProxyService_v1", name = "insertRecsIntoCRMIntWebFormResponse")
    public JAXBElement<InsertRecsIntoCRMIntWebFormResponse> createInsertRecsIntoCRMIntWebFormResponse(InsertRecsIntoCRMIntWebFormResponse value) {
        return new JAXBElement<InsertRecsIntoCRMIntWebFormResponse>(_InsertRecsIntoCRMIntWebFormResponse_QNAME, InsertRecsIntoCRMIntWebFormResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertRecsIntoCRMExtWebFormResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://moneygram.com/service/ComplaintProxyService_v1", name = "insertRecsIntoCRMExtWebFormResponse")
    public JAXBElement<InsertRecsIntoCRMExtWebFormResponse> createInsertRecsIntoCRMExtWebFormResponse(InsertRecsIntoCRMExtWebFormResponse value) {
        return new JAXBElement<InsertRecsIntoCRMExtWebFormResponse>(_InsertRecsIntoCRMExtWebFormResponse_QNAME, InsertRecsIntoCRMExtWebFormResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertRecToCRMResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://moneygram.com/service/ComplaintProxyService_v1", name = "insertRecToCRMResponse")
    public JAXBElement<InsertRecToCRMResponse> createInsertRecToCRMResponse(InsertRecToCRMResponse value) {
        return new JAXBElement<InsertRecToCRMResponse>(_InsertRecToCRMResponse_QNAME, InsertRecToCRMResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Header }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://moneygram.com/common_v1", name = "header")
    public JAXBElement<Header> createHeader(Header value) {
        return new JAXBElement<Header>(_Header_QNAME, Header.class, null, value);
    }

}
