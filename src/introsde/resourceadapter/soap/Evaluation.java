
package introsde.resourceadapter.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per evaluation complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="evaluation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="artistId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="artistName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "evaluation", propOrder = {
    "artistId",
    "artistName",
    "rate",
    "userId"
})
public class Evaluation {

    protected String artistId;
    protected String artistName;
    protected Integer rate;
    protected String userId;

    /**
     * Recupera il valore della proprietà artistId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtistId() {
        return artistId;
    }

    /**
     * Imposta il valore della proprietà artistId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtistId(String value) {
        this.artistId = value;
    }

    /**
     * Recupera il valore della proprietà artistName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * Imposta il valore della proprietà artistName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtistName(String value) {
        this.artistName = value;
    }

    /**
     * Recupera il valore della proprietà rate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRate() {
        return rate;
    }

    /**
     * Imposta il valore della proprietà rate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRate(Integer value) {
        this.rate = value;
    }

    /**
     * Recupera il valore della proprietà userId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Imposta il valore della proprietà userId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
