
package introsde.recommendationbusiness.soap;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "MalformedURLException", targetNamespace = "http://soap.recommendationbusiness.introsde/")
public class MalformedURLException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private MalformedURLException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public MalformedURLException_Exception(String message, MalformedURLException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public MalformedURLException_Exception(String message, MalformedURLException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: introsde.recommendationbusiness.soap.MalformedURLException
     */
    public MalformedURLException getFaultInfo() {
        return faultInfo;
    }

}
