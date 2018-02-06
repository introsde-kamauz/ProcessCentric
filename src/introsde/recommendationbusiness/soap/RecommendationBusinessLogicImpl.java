
package introsde.recommendationbusiness.soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import introsde.resourceadapter.soap.Artist;
import introsde.resourceadapter.soap.Event;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RecommendationBusinessLogicImpl", targetNamespace = "http://soap.recommendationbusiness.introsde/")
@XmlSeeAlso({
    introsde.recommendationbusiness.soap.ObjectFactory.class,
    introsde.resourceadapter.soap.ObjectFactory.class
})
public interface RecommendationBusinessLogicImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<introsde.resourceadapter.soap.Artist>
     * @throws MalformedURLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRecomSimilarArtists", targetNamespace = "http://soap.recommendationbusiness.introsde/", className = "introsde.recommendationbusiness.soap.GetRecomSimilarArtists")
    @ResponseWrapper(localName = "getRecomSimilarArtistsResponse", targetNamespace = "http://soap.recommendationbusiness.introsde/", className = "introsde.recommendationbusiness.soap.GetRecomSimilarArtistsResponse")
    @Action(input = "http://soap.recommendationbusiness.introsde/RecommendationBusinessLogicImpl/getRecomSimilarArtistsRequest", output = "http://soap.recommendationbusiness.introsde/RecommendationBusinessLogicImpl/getRecomSimilarArtistsResponse", fault = {
        @FaultAction(className = MalformedURLException_Exception.class, value = "http://soap.recommendationbusiness.introsde/RecommendationBusinessLogicImpl/getRecomSimilarArtists/Fault/MalformedURLException")
    })
    public List<Artist> getRecomSimilarArtists(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Artist> arg0)
        throws MalformedURLException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<introsde.resourceadapter.soap.Event>
     * @throws MalformedURLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRecomEvents", targetNamespace = "http://soap.recommendationbusiness.introsde/", className = "introsde.recommendationbusiness.soap.GetRecomEvents")
    @ResponseWrapper(localName = "getRecomEventsResponse", targetNamespace = "http://soap.recommendationbusiness.introsde/", className = "introsde.recommendationbusiness.soap.GetRecomEventsResponse")
    @Action(input = "http://soap.recommendationbusiness.introsde/RecommendationBusinessLogicImpl/getRecomEventsRequest", output = "http://soap.recommendationbusiness.introsde/RecommendationBusinessLogicImpl/getRecomEventsResponse", fault = {
        @FaultAction(className = MalformedURLException_Exception.class, value = "http://soap.recommendationbusiness.introsde/RecommendationBusinessLogicImpl/getRecomEvents/Fault/MalformedURLException")
    })
    public List<Event> getRecomEvents(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Artist> arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws MalformedURLException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @throws MalformedURLException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "removeArtist", targetNamespace = "http://soap.recommendationbusiness.introsde/", className = "introsde.recommendationbusiness.soap.RemoveArtist")
    @ResponseWrapper(localName = "removeArtistResponse", targetNamespace = "http://soap.recommendationbusiness.introsde/", className = "introsde.recommendationbusiness.soap.RemoveArtistResponse")
    @Action(input = "http://soap.recommendationbusiness.introsde/RecommendationBusinessLogicImpl/removeArtistRequest", output = "http://soap.recommendationbusiness.introsde/RecommendationBusinessLogicImpl/removeArtistResponse", fault = {
        @FaultAction(className = MalformedURLException_Exception.class, value = "http://soap.recommendationbusiness.introsde/RecommendationBusinessLogicImpl/removeArtist/Fault/MalformedURLException")
    })
    public void removeArtist(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1)
        throws MalformedURLException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @throws MalformedURLException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "addArtist", targetNamespace = "http://soap.recommendationbusiness.introsde/", className = "introsde.recommendationbusiness.soap.AddArtist")
    @ResponseWrapper(localName = "addArtistResponse", targetNamespace = "http://soap.recommendationbusiness.introsde/", className = "introsde.recommendationbusiness.soap.AddArtistResponse")
    @Action(input = "http://soap.recommendationbusiness.introsde/RecommendationBusinessLogicImpl/addArtistRequest", output = "http://soap.recommendationbusiness.introsde/RecommendationBusinessLogicImpl/addArtistResponse", fault = {
        @FaultAction(className = MalformedURLException_Exception.class, value = "http://soap.recommendationbusiness.introsde/RecommendationBusinessLogicImpl/addArtist/Fault/MalformedURLException")
    })
    public void addArtist(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1)
        throws MalformedURLException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<introsde.resourceadapter.soap.Artist>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserArtists", targetNamespace = "http://soap.recommendationbusiness.introsde/", className = "introsde.recommendationbusiness.soap.GetUserArtists")
    @ResponseWrapper(localName = "getUserArtistsResponse", targetNamespace = "http://soap.recommendationbusiness.introsde/", className = "introsde.recommendationbusiness.soap.GetUserArtistsResponse")
    @Action(input = "http://soap.recommendationbusiness.introsde/RecommendationBusinessLogicImpl/getUserArtistsRequest", output = "http://soap.recommendationbusiness.introsde/RecommendationBusinessLogicImpl/getUserArtistsResponse")
    public List<Artist> getUserArtists(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

}
