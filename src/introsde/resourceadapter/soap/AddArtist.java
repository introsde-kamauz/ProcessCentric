
package introsde.resourceadapter.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per addArtist complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="addArtist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://soap.resourceadapter.introsde/}preference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addArtist", propOrder = {
    "arg0"
})
public class AddArtist {

    protected Preference arg0;

    /**
     * Recupera il valore della proprietÓ arg0.
     * 
     * @return
     *     possible object is
     *     {@link Preference }
     *     
     */
    public Preference getArg0() {
        return arg0;
    }

    /**
     * Imposta il valore della proprietÓ arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Preference }
     *     
     */
    public void setArg0(Preference value) {
        this.arg0 = value;
    }

}
