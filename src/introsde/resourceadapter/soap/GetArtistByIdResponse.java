
package introsde.resourceadapter.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getArtistByIdResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getArtistByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getArtistById" type="{http://soap.resourceadapter.introsde/}artist" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getArtistByIdResponse", propOrder = {
    "getArtistById"
})
public class GetArtistByIdResponse {

    protected Artist getArtistById;

    /**
     * Recupera il valore della proprietà getArtistById.
     * 
     * @return
     *     possible object is
     *     {@link Artist }
     *     
     */
    public Artist getGetArtistById() {
        return getArtistById;
    }

    /**
     * Imposta il valore della proprietà getArtistById.
     * 
     * @param value
     *     allowed object is
     *     {@link Artist }
     *     
     */
    public void setGetArtistById(Artist value) {
        this.getArtistById = value;
    }

}
