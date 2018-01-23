
package introsde.resourceadapter.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getRecommendedSimilarArtistsResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getRecommendedSimilarArtistsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recommendedSimilarArtistList" type="{http://soap.resourceadapter.introsde/}artist" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRecommendedSimilarArtistsResponse", propOrder = {
    "recommendedSimilarArtistList"
})
public class GetRecommendedSimilarArtistsResponse {

    protected List<Artist> recommendedSimilarArtistList;

    /**
     * Gets the value of the recommendedSimilarArtistList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recommendedSimilarArtistList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecommendedSimilarArtistList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Artist }
     * 
     * 
     */
    public List<Artist> getRecommendedSimilarArtistList() {
        if (recommendedSimilarArtistList == null) {
            recommendedSimilarArtistList = new ArrayList<Artist>();
        }
        return this.recommendedSimilarArtistList;
    }

}
