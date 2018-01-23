
package introsde.resourceadapter.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getArtistNameFromExternalIdResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getArtistNameFromExternalIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getArtistNameFromExternalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getArtistNameFromExternalIdResponse", propOrder = {
    "getArtistNameFromExternalId"
})
public class GetArtistNameFromExternalIdResponse {

    protected String getArtistNameFromExternalId;

    /**
     * Recupera il valore della proprietà getArtistNameFromExternalId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetArtistNameFromExternalId() {
        return getArtistNameFromExternalId;
    }

    /**
     * Imposta il valore della proprietà getArtistNameFromExternalId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetArtistNameFromExternalId(String value) {
        this.getArtistNameFromExternalId = value;
    }

}
