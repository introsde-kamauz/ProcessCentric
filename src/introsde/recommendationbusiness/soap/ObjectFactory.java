
package introsde.recommendationbusiness.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.recommendationbusiness.soap package. 
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

    private final static QName _MalformedURLException_QNAME = new QName("http://soap.recommendationbusiness.introsde/", "MalformedURLException");
    private final static QName _AddArtist_QNAME = new QName("http://soap.recommendationbusiness.introsde/", "addArtist");
    private final static QName _GetRecomSimilarArtistsResponse_QNAME = new QName("http://soap.recommendationbusiness.introsde/", "getRecomSimilarArtistsResponse");
    private final static QName _GetUserArtistsResponse_QNAME = new QName("http://soap.recommendationbusiness.introsde/", "getUserArtistsResponse");
    private final static QName _RemoveArtist_QNAME = new QName("http://soap.recommendationbusiness.introsde/", "removeArtist");
    private final static QName _GetRecomEvents_QNAME = new QName("http://soap.recommendationbusiness.introsde/", "getRecomEvents");
    private final static QName _GetRecomEventsResponse_QNAME = new QName("http://soap.recommendationbusiness.introsde/", "getRecomEventsResponse");
    private final static QName _GetUserArtists_QNAME = new QName("http://soap.recommendationbusiness.introsde/", "getUserArtists");
    private final static QName _GetRecomSimilarArtists_QNAME = new QName("http://soap.recommendationbusiness.introsde/", "getRecomSimilarArtists");
    private final static QName _RemoveArtistResponse_QNAME = new QName("http://soap.recommendationbusiness.introsde/", "removeArtistResponse");
    private final static QName _AddArtistResponse_QNAME = new QName("http://soap.recommendationbusiness.introsde/", "addArtistResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.recommendationbusiness.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRecomSimilarArtistsResponse }
     * 
     */
    public GetRecomSimilarArtistsResponse createGetRecomSimilarArtistsResponse() {
        return new GetRecomSimilarArtistsResponse();
    }

    /**
     * Create an instance of {@link MalformedURLException }
     * 
     */
    public MalformedURLException createMalformedURLException() {
        return new MalformedURLException();
    }

    /**
     * Create an instance of {@link AddArtist }
     * 
     */
    public AddArtist createAddArtist() {
        return new AddArtist();
    }

    /**
     * Create an instance of {@link GetUserArtistsResponse }
     * 
     */
    public GetUserArtistsResponse createGetUserArtistsResponse() {
        return new GetUserArtistsResponse();
    }

    /**
     * Create an instance of {@link RemoveArtist }
     * 
     */
    public RemoveArtist createRemoveArtist() {
        return new RemoveArtist();
    }

    /**
     * Create an instance of {@link GetRecomEvents }
     * 
     */
    public GetRecomEvents createGetRecomEvents() {
        return new GetRecomEvents();
    }

    /**
     * Create an instance of {@link GetRecomEventsResponse }
     * 
     */
    public GetRecomEventsResponse createGetRecomEventsResponse() {
        return new GetRecomEventsResponse();
    }

    /**
     * Create an instance of {@link GetUserArtists }
     * 
     */
    public GetUserArtists createGetUserArtists() {
        return new GetUserArtists();
    }

    /**
     * Create an instance of {@link GetRecomSimilarArtists }
     * 
     */
    public GetRecomSimilarArtists createGetRecomSimilarArtists() {
        return new GetRecomSimilarArtists();
    }

    /**
     * Create an instance of {@link AddArtistResponse }
     * 
     */
    public AddArtistResponse createAddArtistResponse() {
        return new AddArtistResponse();
    }

    /**
     * Create an instance of {@link RemoveArtistResponse }
     * 
     */
    public RemoveArtistResponse createRemoveArtistResponse() {
        return new RemoveArtistResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MalformedURLException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recommendationbusiness.introsde/", name = "MalformedURLException")
    public JAXBElement<MalformedURLException> createMalformedURLException(MalformedURLException value) {
        return new JAXBElement<MalformedURLException>(_MalformedURLException_QNAME, MalformedURLException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddArtist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recommendationbusiness.introsde/", name = "addArtist")
    public JAXBElement<AddArtist> createAddArtist(AddArtist value) {
        return new JAXBElement<AddArtist>(_AddArtist_QNAME, AddArtist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecomSimilarArtistsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recommendationbusiness.introsde/", name = "getRecomSimilarArtistsResponse")
    public JAXBElement<GetRecomSimilarArtistsResponse> createGetRecomSimilarArtistsResponse(GetRecomSimilarArtistsResponse value) {
        return new JAXBElement<GetRecomSimilarArtistsResponse>(_GetRecomSimilarArtistsResponse_QNAME, GetRecomSimilarArtistsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserArtistsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recommendationbusiness.introsde/", name = "getUserArtistsResponse")
    public JAXBElement<GetUserArtistsResponse> createGetUserArtistsResponse(GetUserArtistsResponse value) {
        return new JAXBElement<GetUserArtistsResponse>(_GetUserArtistsResponse_QNAME, GetUserArtistsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveArtist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recommendationbusiness.introsde/", name = "removeArtist")
    public JAXBElement<RemoveArtist> createRemoveArtist(RemoveArtist value) {
        return new JAXBElement<RemoveArtist>(_RemoveArtist_QNAME, RemoveArtist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecomEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recommendationbusiness.introsde/", name = "getRecomEvents")
    public JAXBElement<GetRecomEvents> createGetRecomEvents(GetRecomEvents value) {
        return new JAXBElement<GetRecomEvents>(_GetRecomEvents_QNAME, GetRecomEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecomEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recommendationbusiness.introsde/", name = "getRecomEventsResponse")
    public JAXBElement<GetRecomEventsResponse> createGetRecomEventsResponse(GetRecomEventsResponse value) {
        return new JAXBElement<GetRecomEventsResponse>(_GetRecomEventsResponse_QNAME, GetRecomEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserArtists }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recommendationbusiness.introsde/", name = "getUserArtists")
    public JAXBElement<GetUserArtists> createGetUserArtists(GetUserArtists value) {
        return new JAXBElement<GetUserArtists>(_GetUserArtists_QNAME, GetUserArtists.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecomSimilarArtists }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recommendationbusiness.introsde/", name = "getRecomSimilarArtists")
    public JAXBElement<GetRecomSimilarArtists> createGetRecomSimilarArtists(GetRecomSimilarArtists value) {
        return new JAXBElement<GetRecomSimilarArtists>(_GetRecomSimilarArtists_QNAME, GetRecomSimilarArtists.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveArtistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recommendationbusiness.introsde/", name = "removeArtistResponse")
    public JAXBElement<RemoveArtistResponse> createRemoveArtistResponse(RemoveArtistResponse value) {
        return new JAXBElement<RemoveArtistResponse>(_RemoveArtistResponse_QNAME, RemoveArtistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddArtistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recommendationbusiness.introsde/", name = "addArtistResponse")
    public JAXBElement<AddArtistResponse> createAddArtistResponse(AddArtistResponse value) {
        return new JAXBElement<AddArtistResponse>(_AddArtistResponse_QNAME, AddArtistResponse.class, null, value);
    }

}
