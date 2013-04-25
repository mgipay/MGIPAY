package com.sdk.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2013-04-18T16:51:59.412-04:00
 * Generated source version: 2.7.4
 * 
 */
@WebServiceClient(name = "SdkService", 
                  wsdlLocation = "sdkservice3.wsdl",
                  targetNamespace = "uri:ws.sdk.edialog.com") 
public class SdkService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("uri:ws.sdk.edialog.com", "SdkService");
    public final static QName EDialogWebServicesSoap11 = new QName("uri:ws.sdk.edialog.com", "eDialogWebServicesSoap11");
    static {
        URL url = SdkService.class.getResource("sdkservice3.wsdl");
        if (url == null) {
            url = SdkService.class.getClassLoader().getResource("sdkservice3.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(SdkService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "sdkservice3.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public SdkService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SdkService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SdkService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns EDialogWebServices
     */
    @WebEndpoint(name = "eDialogWebServicesSoap11")
    public EDialogWebServices getEDialogWebServicesSoap11() {
        return super.getPort(EDialogWebServicesSoap11, EDialogWebServices.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EDialogWebServices
     */
    @WebEndpoint(name = "eDialogWebServicesSoap11")
    public EDialogWebServices getEDialogWebServicesSoap11(WebServiceFeature... features) {
        return super.getPort(EDialogWebServicesSoap11, EDialogWebServices.class, features);
    }

}