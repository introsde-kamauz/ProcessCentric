
package introsde.resourceadapter.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getProfilePreferencesResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getProfilePreferencesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getProfilePreferences" type="{http://soap.resourceadapter.introsde/}preference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProfilePreferencesResponse", propOrder = {
    "getProfilePreferences"
})
public class GetProfilePreferencesResponse {

    protected List<Preference> getProfilePreferences;

    /**
     * Gets the value of the getProfilePreferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getProfilePreferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetProfilePreferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Preference }
     * 
     * 
     */
    public List<Preference> getGetProfilePreferences() {
        if (getProfilePreferences == null) {
            getProfilePreferences = new ArrayList<Preference>();
        }
        return this.getProfilePreferences;
    }

}
