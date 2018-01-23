package introsde.document.client;
import introsde.resourceadapter.soap.*;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import introsde.recommendationbusiness.soap.RecommendationBusinessLogicImpl;
import introsde.recommendationbusiness.soap.RecommendationService;

public class Client {
    public static void main(String[] args) throws Exception {
    	RecommendationService busS = new RecommendationService();
        RecommendationBusinessLogicImpl resource = busS.getRecommendationBusinessLogicImplPort();
 
        resource.addArtist("Metallica", 1);
        
        List<Artist> a = resource.getUserArtists(1);
        System.out.println("GET USER ARTISTS: "+a.size());
        for (Artist aa : a) {
        	System.out.println(aa.getName());
        }
        List<Artist> ab = resource.getRecomSimilarArtists(a);
        System.out.println("SIMILAR ARTISTS: "+ab.size());
        for (Artist aa : ab) {
        	System.out.println(aa.getName());
        }
        List<Event> ev = resource.getRecomEvents(a, "Rovereto Trento");
        System.out.println("RESULTS: "+ev.size());
        for (Event e : ev) {
        	System.out.println("NAME: "+e.getName()+" CITY: "+e.getCity()+" DATE: "+e.getStartdate()+" LAT: "+e.getLatitude()+" LONG: "+e.getLongitude()+" TYPE: "+e.getType()+
        			" VENUE: "+e.getVenue());
        	if(e.getDistance() != null && e.getDuration() != null) {
        		if (e.getDistance() != "not found" && e.getDuration() != "not found")
        		System.out.println(e.getDistance()+"  "+e.getDuration()+"  "+e.getPrecipitations()+"  "+e.getMaxTemperature()+"  "+e.getMinTemperature());
        	}
        	System.out.println("\n\n");
        }
        
        resource.addArtist("Arctic Monkeys", 1);
       
        
    }
}