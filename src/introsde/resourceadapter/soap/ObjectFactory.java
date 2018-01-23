
package introsde.resourceadapter.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.resourceadapter.soap package. 
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

    private final static QName _GetArtistNameFromExternalId_QNAME = new QName("http://soap.resourceadapter.introsde/", "getArtistNameFromExternalId");
    private final static QName _GetEvaluationsByUserResponse_QNAME = new QName("http://soap.resourceadapter.introsde/", "getEvaluationsByUserResponse");
    private final static QName _GetEvaluationsByUser_QNAME = new QName("http://soap.resourceadapter.introsde/", "getEvaluationsByUser");
    private final static QName _RecommendEventsResponse_QNAME = new QName("http://soap.resourceadapter.introsde/", "recommendEventsResponse");
    private final static QName _Evaluation_QNAME = new QName("http://soap.resourceadapter.introsde/", "evaluation");
    private final static QName _GetRecommendedSimilarArtists_QNAME = new QName("http://soap.resourceadapter.introsde/", "getRecommendedSimilarArtists");
    private final static QName _GetMotivationResponse_QNAME = new QName("http://soap.resourceadapter.introsde/", "getMotivationResponse");
    private final static QName _GetMotivation_QNAME = new QName("http://soap.resourceadapter.introsde/", "getMotivation");
    private final static QName _GetProfilePreferences_QNAME = new QName("http://soap.resourceadapter.introsde/", "getProfilePreferences");
    private final static QName _GetArtistExternalId_QNAME = new QName("http://soap.resourceadapter.introsde/", "getArtistExternalId");
    private final static QName _RecommendEvents_QNAME = new QName("http://soap.resourceadapter.introsde/", "recommendEvents");
    private final static QName _GetArtistNameFromExternalIdResponse_QNAME = new QName("http://soap.resourceadapter.introsde/", "getArtistNameFromExternalIdResponse");
    private final static QName _GetAllUsers_QNAME = new QName("http://soap.resourceadapter.introsde/", "getAllUsers");
    private final static QName _GetRecommendedSimilarArtistsResponse_QNAME = new QName("http://soap.resourceadapter.introsde/", "getRecommendedSimilarArtistsResponse");
    private final static QName _RemoveArtist_QNAME = new QName("http://soap.resourceadapter.introsde/", "removeArtist");
    private final static QName _Preference_QNAME = new QName("http://soap.resourceadapter.introsde/", "preference");
    private final static QName _EvaluateArtistRecommendationResponse_QNAME = new QName("http://soap.resourceadapter.introsde/", "evaluateArtistRecommendationResponse");
    private final static QName _GetArtistExternalIdResponse_QNAME = new QName("http://soap.resourceadapter.introsde/", "getArtistExternalIdResponse");
    private final static QName _RemoveArtistResponse_QNAME = new QName("http://soap.resourceadapter.introsde/", "removeArtistResponse");
    private final static QName _EvaluateArtistRecommendation_QNAME = new QName("http://soap.resourceadapter.introsde/", "evaluateArtistRecommendation");
    private final static QName _AddArtist_QNAME = new QName("http://soap.resourceadapter.introsde/", "addArtist");
    private final static QName _GetAllUsersResponse_QNAME = new QName("http://soap.resourceadapter.introsde/", "getAllUsersResponse");
    private final static QName _GetPersonByUser_QNAME = new QName("http://soap.resourceadapter.introsde/", "getPersonByUser");
    private final static QName _Person_QNAME = new QName("http://soap.resourceadapter.introsde/", "person");
    private final static QName _RegisterResponse_QNAME = new QName("http://soap.resourceadapter.introsde/", "registerResponse");
    private final static QName _GetPersonByUserResponse_QNAME = new QName("http://soap.resourceadapter.introsde/", "getPersonByUserResponse");
    private final static QName _GetProfilePreferencesResponse_QNAME = new QName("http://soap.resourceadapter.introsde/", "getProfilePreferencesResponse");
    private final static QName _AddArtistResponse_QNAME = new QName("http://soap.resourceadapter.introsde/", "addArtistResponse");
    private final static QName _Register_QNAME = new QName("http://soap.resourceadapter.introsde/", "register");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.resourceadapter.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEvaluationsByUserResponse }
     * 
     */
    public GetEvaluationsByUserResponse createGetEvaluationsByUserResponse() {
        return new GetEvaluationsByUserResponse();
    }

    /**
     * Create an instance of {@link GetArtistNameFromExternalId }
     * 
     */
    public GetArtistNameFromExternalId createGetArtistNameFromExternalId() {
        return new GetArtistNameFromExternalId();
    }

    /**
     * Create an instance of {@link GetEvaluationsByUser }
     * 
     */
    public GetEvaluationsByUser createGetEvaluationsByUser() {
        return new GetEvaluationsByUser();
    }

    /**
     * Create an instance of {@link RecommendEventsResponse }
     * 
     */
    public RecommendEventsResponse createRecommendEventsResponse() {
        return new RecommendEventsResponse();
    }

    /**
     * Create an instance of {@link Evaluation }
     * 
     */
    public Evaluation createEvaluation() {
        return new Evaluation();
    }

    /**
     * Create an instance of {@link GetRecommendedSimilarArtists }
     * 
     */
    public GetRecommendedSimilarArtists createGetRecommendedSimilarArtists() {
        return new GetRecommendedSimilarArtists();
    }

    /**
     * Create an instance of {@link GetMotivationResponse }
     * 
     */
    public GetMotivationResponse createGetMotivationResponse() {
        return new GetMotivationResponse();
    }

    /**
     * Create an instance of {@link GetArtistExternalId }
     * 
     */
    public GetArtistExternalId createGetArtistExternalId() {
        return new GetArtistExternalId();
    }

    /**
     * Create an instance of {@link GetMotivation }
     * 
     */
    public GetMotivation createGetMotivation() {
        return new GetMotivation();
    }

    /**
     * Create an instance of {@link GetProfilePreferences }
     * 
     */
    public GetProfilePreferences createGetProfilePreferences() {
        return new GetProfilePreferences();
    }

    /**
     * Create an instance of {@link GetArtistNameFromExternalIdResponse }
     * 
     */
    public GetArtistNameFromExternalIdResponse createGetArtistNameFromExternalIdResponse() {
        return new GetArtistNameFromExternalIdResponse();
    }

    /**
     * Create an instance of {@link RecommendEvents }
     * 
     */
    public RecommendEvents createRecommendEvents() {
        return new RecommendEvents();
    }

    /**
     * Create an instance of {@link GetAllUsers }
     * 
     */
    public GetAllUsers createGetAllUsers() {
        return new GetAllUsers();
    }

    /**
     * Create an instance of {@link GetRecommendedSimilarArtistsResponse }
     * 
     */
    public GetRecommendedSimilarArtistsResponse createGetRecommendedSimilarArtistsResponse() {
        return new GetRecommendedSimilarArtistsResponse();
    }

    /**
     * Create an instance of {@link RemoveArtist }
     * 
     */
    public RemoveArtist createRemoveArtist() {
        return new RemoveArtist();
    }

    /**
     * Create an instance of {@link EvaluateArtistRecommendationResponse }
     * 
     */
    public EvaluateArtistRecommendationResponse createEvaluateArtistRecommendationResponse() {
        return new EvaluateArtistRecommendationResponse();
    }

    /**
     * Create an instance of {@link Preference }
     * 
     */
    public Preference createPreference() {
        return new Preference();
    }

    /**
     * Create an instance of {@link GetArtistExternalIdResponse }
     * 
     */
    public GetArtistExternalIdResponse createGetArtistExternalIdResponse() {
        return new GetArtistExternalIdResponse();
    }

    /**
     * Create an instance of {@link RemoveArtistResponse }
     * 
     */
    public RemoveArtistResponse createRemoveArtistResponse() {
        return new RemoveArtistResponse();
    }

    /**
     * Create an instance of {@link EvaluateArtistRecommendation }
     * 
     */
    public EvaluateArtistRecommendation createEvaluateArtistRecommendation() {
        return new EvaluateArtistRecommendation();
    }

    /**
     * Create an instance of {@link AddArtist }
     * 
     */
    public AddArtist createAddArtist() {
        return new AddArtist();
    }

    /**
     * Create an instance of {@link GetAllUsersResponse }
     * 
     */
    public GetAllUsersResponse createGetAllUsersResponse() {
        return new GetAllUsersResponse();
    }

    /**
     * Create an instance of {@link GetPersonByUser }
     * 
     */
    public GetPersonByUser createGetPersonByUser() {
        return new GetPersonByUser();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link GetPersonByUserResponse }
     * 
     */
    public GetPersonByUserResponse createGetPersonByUserResponse() {
        return new GetPersonByUserResponse();
    }

    /**
     * Create an instance of {@link GetProfilePreferencesResponse }
     * 
     */
    public GetProfilePreferencesResponse createGetProfilePreferencesResponse() {
        return new GetProfilePreferencesResponse();
    }

    /**
     * Create an instance of {@link AddArtistResponse }
     * 
     */
    public AddArtistResponse createAddArtistResponse() {
        return new AddArtistResponse();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link Artist }
     * 
     */
    public Artist createArtist() {
        return new Artist();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArtistNameFromExternalId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "getArtistNameFromExternalId")
    public JAXBElement<GetArtistNameFromExternalId> createGetArtistNameFromExternalId(GetArtistNameFromExternalId value) {
        return new JAXBElement<GetArtistNameFromExternalId>(_GetArtistNameFromExternalId_QNAME, GetArtistNameFromExternalId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEvaluationsByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "getEvaluationsByUserResponse")
    public JAXBElement<GetEvaluationsByUserResponse> createGetEvaluationsByUserResponse(GetEvaluationsByUserResponse value) {
        return new JAXBElement<GetEvaluationsByUserResponse>(_GetEvaluationsByUserResponse_QNAME, GetEvaluationsByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEvaluationsByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "getEvaluationsByUser")
    public JAXBElement<GetEvaluationsByUser> createGetEvaluationsByUser(GetEvaluationsByUser value) {
        return new JAXBElement<GetEvaluationsByUser>(_GetEvaluationsByUser_QNAME, GetEvaluationsByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecommendEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "recommendEventsResponse")
    public JAXBElement<RecommendEventsResponse> createRecommendEventsResponse(RecommendEventsResponse value) {
        return new JAXBElement<RecommendEventsResponse>(_RecommendEventsResponse_QNAME, RecommendEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Evaluation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "evaluation")
    public JAXBElement<Evaluation> createEvaluation(Evaluation value) {
        return new JAXBElement<Evaluation>(_Evaluation_QNAME, Evaluation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecommendedSimilarArtists }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "getRecommendedSimilarArtists")
    public JAXBElement<GetRecommendedSimilarArtists> createGetRecommendedSimilarArtists(GetRecommendedSimilarArtists value) {
        return new JAXBElement<GetRecommendedSimilarArtists>(_GetRecommendedSimilarArtists_QNAME, GetRecommendedSimilarArtists.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMotivationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "getMotivationResponse")
    public JAXBElement<GetMotivationResponse> createGetMotivationResponse(GetMotivationResponse value) {
        return new JAXBElement<GetMotivationResponse>(_GetMotivationResponse_QNAME, GetMotivationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMotivation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "getMotivation")
    public JAXBElement<GetMotivation> createGetMotivation(GetMotivation value) {
        return new JAXBElement<GetMotivation>(_GetMotivation_QNAME, GetMotivation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfilePreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "getProfilePreferences")
    public JAXBElement<GetProfilePreferences> createGetProfilePreferences(GetProfilePreferences value) {
        return new JAXBElement<GetProfilePreferences>(_GetProfilePreferences_QNAME, GetProfilePreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArtistExternalId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "getArtistExternalId")
    public JAXBElement<GetArtistExternalId> createGetArtistExternalId(GetArtistExternalId value) {
        return new JAXBElement<GetArtistExternalId>(_GetArtistExternalId_QNAME, GetArtistExternalId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecommendEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "recommendEvents")
    public JAXBElement<RecommendEvents> createRecommendEvents(RecommendEvents value) {
        return new JAXBElement<RecommendEvents>(_RecommendEvents_QNAME, RecommendEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArtistNameFromExternalIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "getArtistNameFromExternalIdResponse")
    public JAXBElement<GetArtistNameFromExternalIdResponse> createGetArtistNameFromExternalIdResponse(GetArtistNameFromExternalIdResponse value) {
        return new JAXBElement<GetArtistNameFromExternalIdResponse>(_GetArtistNameFromExternalIdResponse_QNAME, GetArtistNameFromExternalIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "getAllUsers")
    public JAXBElement<GetAllUsers> createGetAllUsers(GetAllUsers value) {
        return new JAXBElement<GetAllUsers>(_GetAllUsers_QNAME, GetAllUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecommendedSimilarArtistsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "getRecommendedSimilarArtistsResponse")
    public JAXBElement<GetRecommendedSimilarArtistsResponse> createGetRecommendedSimilarArtistsResponse(GetRecommendedSimilarArtistsResponse value) {
        return new JAXBElement<GetRecommendedSimilarArtistsResponse>(_GetRecommendedSimilarArtistsResponse_QNAME, GetRecommendedSimilarArtistsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveArtist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "removeArtist")
    public JAXBElement<RemoveArtist> createRemoveArtist(RemoveArtist value) {
        return new JAXBElement<RemoveArtist>(_RemoveArtist_QNAME, RemoveArtist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Preference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "preference")
    public JAXBElement<Preference> createPreference(Preference value) {
        return new JAXBElement<Preference>(_Preference_QNAME, Preference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateArtistRecommendationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "evaluateArtistRecommendationResponse")
    public JAXBElement<EvaluateArtistRecommendationResponse> createEvaluateArtistRecommendationResponse(EvaluateArtistRecommendationResponse value) {
        return new JAXBElement<EvaluateArtistRecommendationResponse>(_EvaluateArtistRecommendationResponse_QNAME, EvaluateArtistRecommendationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArtistExternalIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "getArtistExternalIdResponse")
    public JAXBElement<GetArtistExternalIdResponse> createGetArtistExternalIdResponse(GetArtistExternalIdResponse value) {
        return new JAXBElement<GetArtistExternalIdResponse>(_GetArtistExternalIdResponse_QNAME, GetArtistExternalIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveArtistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "removeArtistResponse")
    public JAXBElement<RemoveArtistResponse> createRemoveArtistResponse(RemoveArtistResponse value) {
        return new JAXBElement<RemoveArtistResponse>(_RemoveArtistResponse_QNAME, RemoveArtistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateArtistRecommendation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "evaluateArtistRecommendation")
    public JAXBElement<EvaluateArtistRecommendation> createEvaluateArtistRecommendation(EvaluateArtistRecommendation value) {
        return new JAXBElement<EvaluateArtistRecommendation>(_EvaluateArtistRecommendation_QNAME, EvaluateArtistRecommendation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddArtist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "addArtist")
    public JAXBElement<AddArtist> createAddArtist(AddArtist value) {
        return new JAXBElement<AddArtist>(_AddArtist_QNAME, AddArtist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "getAllUsersResponse")
    public JAXBElement<GetAllUsersResponse> createGetAllUsersResponse(GetAllUsersResponse value) {
        return new JAXBElement<GetAllUsersResponse>(_GetAllUsersResponse_QNAME, GetAllUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "getPersonByUser")
    public JAXBElement<GetPersonByUser> createGetPersonByUser(GetPersonByUser value) {
        return new JAXBElement<GetPersonByUser>(_GetPersonByUser_QNAME, GetPersonByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "getPersonByUserResponse")
    public JAXBElement<GetPersonByUserResponse> createGetPersonByUserResponse(GetPersonByUserResponse value) {
        return new JAXBElement<GetPersonByUserResponse>(_GetPersonByUserResponse_QNAME, GetPersonByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfilePreferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "getProfilePreferencesResponse")
    public JAXBElement<GetProfilePreferencesResponse> createGetProfilePreferencesResponse(GetProfilePreferencesResponse value) {
        return new JAXBElement<GetProfilePreferencesResponse>(_GetProfilePreferencesResponse_QNAME, GetProfilePreferencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddArtistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "addArtistResponse")
    public JAXBElement<AddArtistResponse> createAddArtistResponse(AddArtistResponse value) {
        return new JAXBElement<AddArtistResponse>(_AddArtistResponse_QNAME, AddArtistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.resourceadapter.introsde/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

}
