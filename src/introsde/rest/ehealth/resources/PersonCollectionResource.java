package introsde.rest.ehealth.resources;

import introsde.recommendationbusiness.soap.MalformedURLException_Exception;
import introsde.recommendationbusiness.soap.RecommendationBusinessLogicImpl;
import introsde.recommendationbusiness.soap.RecommendationService;
import introsde.resourceadapter.soap.Artist;
import introsde.resourceadapter.soap.Evaluation;
import introsde.resourceadapter.soap.Event;
import introsde.resourceadapter.soap.Person;
import introsde.resourceadapter.soap.ResourceAdapterLogic;
import introsde.resourceadapter.soap.ResourceService;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.json.simple.JSONObject;

/*
 * TODO 
 * - There is a problem with the EntityManager injection through @PersistenceUnit or @PersistenceContext
 * - will look into it later
 */

@Stateless
@LocalBean//Will map the resource to the URL /ehealth/v2
@Path("/")
public class PersonCollectionResource {

	// Allows to insert contextual objects into the class,
	// e.g. ServletContext, Request, Response, UriInfo
	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	
	@GET
	@Produces({MediaType.TEXT_XML,  MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	@Consumes({MediaType.TEXT_XML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("/user/")
	public Response getAllUsers() throws IOException {
		System.out.println("Getting all users...");		
		// SOAP CALL: addArtist(name,id)
		try {
			
	        ResourceService ss = new ResourceService();
	        ResourceAdapterLogic resource = ss.getResourceAdapterLogicImplPort();
		
			List<Person> list = resource.getAllUsers();
			GenericEntity entity = new GenericEntity<List<Person>>(list) {};
			return Response.ok(list).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Response.status(Response.Status.BAD_REQUEST).build();
	}
	
	@POST
	@Produces({MediaType.TEXT_XML,  MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	@Consumes({MediaType.TEXT_XML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("/user/")
	public Response register(JSONObject obj) throws IOException {
		System.out.println("Registering user...");		
		// SOAP CALL: addArtist(name,id)
		try {
			ResourceService ss = new ResourceService();
	        ResourceAdapterLogic resource = ss.getResourceAdapterLogicImplPort();
			resource.register(obj.get("name").toString());
			return Response.status(Response.Status.OK).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Response.status(Response.Status.BAD_REQUEST).build();
	}
	
	@POST
	@Produces({MediaType.TEXT_XML,  MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	@Consumes({MediaType.TEXT_XML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("/user/{id}/artist/")
	public Response addArtistToThePreferences(@PathParam("id") int id, JSONObject obj) throws IOException {
		System.out.println("Adding artist to the preferences...");		
		// SOAP CALL: addArtist(name,id)
		try {
			
	        RecommendationService rr = new RecommendationService();
			RecommendationBusinessLogicImpl resource = rr.getRecommendationBusinessLogicImplPort();
		
			resource.addArtist(obj.get("name").toString(), id);
			return Response.status(Response.Status.OK).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Response.status(Response.Status.BAD_REQUEST).build();
	}
	
	@DELETE
	@Produces({MediaType.TEXT_XML,  MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	@Consumes({MediaType.TEXT_XML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("/user/{id}/artist/{name}")
	public Response remArtistToThePreferences(@PathParam("id") int id, @PathParam("name") String name) throws IOException, MalformedURLException_Exception {
		System.out.println("Removing artist to the preferences...");		
		// SOAP CALL: remArtist(name,id)
		
		try {
			RecommendationService rr = new RecommendationService();
			RecommendationBusinessLogicImpl resource = rr.getRecommendationBusinessLogicImplPort();
			
			resource.removeArtist(name, id);
			
			return Response.status(Response.Status.OK).build();
		} catch (Exception err) {
			err.printStackTrace();
		}
		
		return Response.status(Response.Status.BAD_REQUEST).build();
	}

	// Return the list of people to the user in the browser
	@GET
	@Produces({MediaType.TEXT_XML,  MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	@Consumes({MediaType.TEXT_XML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("/user/{id}/artist/recom")
	public Response getRecommendSimilarArtists(@PathParam("id") int id) throws MalformedURLException {
		System.out.println("getting recommended similar artists...");		
		// SOAP CALL: getUserArtists(id)
		// SOAP CALL: getRecommSimilarArtists(List<Artist> artists)
		
		try {
			RecommendationService rr = new RecommendationService();
			RecommendationBusinessLogicImpl resource = rr.getRecommendationBusinessLogicImplPort();
	        
			List<Artist> artists = resource.getUserArtists(id);
		
			List<Artist> allArtists = resource.getRecomSimilarArtists(artists);
			GenericEntity entity = new GenericEntity<List<Artist>>(allArtists) {};
			return Response.ok(entity).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GenericEntity entity = new GenericEntity<List<Artist>>(new ArrayList<Artist>()) {};
		return Response.ok(entity).build();
	}	
	
	@GET
	@Produces({MediaType.TEXT_XML,  MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	@Consumes({MediaType.TEXT_XML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("/user/{id}/event/{origin}")
	public Response getRecommendEvents(@PathParam("id") int id, @PathParam("origin") String origin) throws MalformedURLException {
		System.out.println("getting recommended events...");		
		// SOAP CALL: getUserArtists(id)
		// SOAP CALL: getRecommEvents(List<Artist> artists)
		try {
			RecommendationService rr = new RecommendationService();
			RecommendationBusinessLogicImpl resource = rr.getRecommendationBusinessLogicImplPort();
			
			List<Artist> artists = resource.getUserArtists(id);
			System.out.println("ARTISTS: "+artists.size());
		
			List<Event> events = resource.getRecomEvents(artists, origin);
			GenericEntity entity = new GenericEntity<List<Event>>(events) {};
			return Response.ok(entity).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		GenericEntity entity = new GenericEntity<List<Event>>(new ArrayList<Event>()) {};
		return Response.ok(entity).build();
	}	
	
	@GET
	@Produces({MediaType.TEXT_XML,  MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	@Consumes({MediaType.TEXT_XML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("/motivation")
	public Response getMotivation() throws MalformedURLException {
		try {
			System.out.println("getting motivation...");		
			// SOAP CALL: getUserArtists(id)
			// SOAP CALL: getRecommEvents(List<Artist> artists)
			ResourceService ss = new ResourceService();
	        ResourceAdapterLogic resource = ss.getResourceAdapterLogicImplPort();
			
			String motivation = resource.getMotivation();
			
			return Response.ok(motivation).build();
		} catch (Exception err) {
			err.printStackTrace();
		}
		return Response.status(Response.Status.BAD_REQUEST).build();
	}	

	@GET
	@Produces({MediaType.TEXT_XML,  MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	@Consumes({MediaType.TEXT_XML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("/user/{id}/artist")
	public Response getPreferences(@PathParam("id") int id) throws MalformedURLException {
		System.out.println("getting preferences...");		
		// SOAP CALL: getUserArtists(id)
		
		try {
			RecommendationService rr = new RecommendationService();
			RecommendationBusinessLogicImpl resource = rr.getRecommendationBusinessLogicImplPort();
        
	        List<Artist> artists = resource.getUserArtists(id);
	        System.out.println("getUserArtists: "+artists.size());
	        GenericEntity entity = new GenericEntity<List<Artist>>(artists) {};
			return Response.ok(entity).build();
	
        } catch (Exception err) {
        	err.printStackTrace();
        }
		GenericEntity entity = new GenericEntity<List<Artist>>(new ArrayList<Artist>()) {};
		return Response.ok(entity).build();
	}	
	
	@POST
	@Produces({MediaType.TEXT_XML,  MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	@Consumes({MediaType.TEXT_XML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("/user/{id}/evaluate")
	public Response evaluateArtistRecommendation(@PathParam("id") String id, JSONObject obj) throws MalformedURLException {
		System.out.println("evaluateRecommendation...");		
		// SOAP CALL: getUserArtists(id)
		
		try {
			ResourceService ss = new ResourceService();
	        ResourceAdapterLogic resource = ss.getResourceAdapterLogicImplPort();
	        
	        resource.evaluateArtistRecommendation(obj.get("aid").toString(), obj.get("artistName").toString(), id, Integer.parseInt(obj.get("rate").toString()));
			return Response.status(Response.Status.OK).build();
	
        } catch (Exception err) {
        	return Response.status(Response.Status.BAD_REQUEST).build();
        }
	}	
	
	@GET
	@Produces({MediaType.TEXT_XML,  MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	@Consumes({MediaType.TEXT_XML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("/user/{id}/evaluate")
	public Response getEvaluationsByUser(@PathParam("id") String id) throws MalformedURLException {
		System.out.println("get Evaluations...");		
		// SOAP CALL: getUserArtists(id)
		
		try {
			ResourceService ss = new ResourceService();
	        ResourceAdapterLogic resource = ss.getResourceAdapterLogicImplPort();
        
	        List<Evaluation> list = resource.getEvaluationsByUser(id);
	        System.out.println("getEvaluations: "+list.size());
	        GenericEntity entity = new GenericEntity<List<Evaluation>>(list) {};
			return Response.ok(entity).build();
	
        } catch (Exception err) {
        	return Response.status(Response.Status.BAD_REQUEST).build();
        }
	}	
	
}
