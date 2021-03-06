
package introsde.recommendationbusiness.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RecommendationService", targetNamespace = "http://soap.recommendationbusiness.introsde/", wsdlLocation = "http://10.214.206.2:6901/business?wsdl")
public class RecommendationService
    extends Service
{

    private final static URL RECOMMENDATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException RECOMMENDATIONSERVICE_EXCEPTION;
    private final static QName RECOMMENDATIONSERVICE_QNAME = new QName("http://soap.recommendationbusiness.introsde/", "RecommendationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.214.206.2:6901/business?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RECOMMENDATIONSERVICE_WSDL_LOCATION = url;
        RECOMMENDATIONSERVICE_EXCEPTION = e;
    }

    public RecommendationService() {
        super(__getWsdlLocation(), RECOMMENDATIONSERVICE_QNAME);
    }

    public RecommendationService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RECOMMENDATIONSERVICE_QNAME, features);
    }

    public RecommendationService(URL wsdlLocation) {
        super(wsdlLocation, RECOMMENDATIONSERVICE_QNAME);
    }

    public RecommendationService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RECOMMENDATIONSERVICE_QNAME, features);
    }

    public RecommendationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RecommendationService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RecommendationBusinessLogicImpl
     */
    @WebEndpoint(name = "RecommendationBusinessLogicImplPort")
    public RecommendationBusinessLogicImpl getRecommendationBusinessLogicImplPort() {
        return super.getPort(new QName("http://soap.recommendationbusiness.introsde/", "RecommendationBusinessLogicImplPort"), RecommendationBusinessLogicImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RecommendationBusinessLogicImpl
     */
    @WebEndpoint(name = "RecommendationBusinessLogicImplPort")
    public RecommendationBusinessLogicImpl getRecommendationBusinessLogicImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.recommendationbusiness.introsde/", "RecommendationBusinessLogicImplPort"), RecommendationBusinessLogicImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RECOMMENDATIONSERVICE_EXCEPTION!= null) {
            throw RECOMMENDATIONSERVICE_EXCEPTION;
        }
        return RECOMMENDATIONSERVICE_WSDL_LOCATION;
    }

}
