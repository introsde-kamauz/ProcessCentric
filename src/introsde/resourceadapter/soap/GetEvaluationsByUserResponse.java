
package introsde.resourceadapter.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getEvaluationsByUserResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getEvaluationsByUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getEvaluationsByUser" type="{http://soap.resourceadapter.introsde/}evaluation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEvaluationsByUserResponse", propOrder = {
    "getEvaluationsByUser"
})
public class GetEvaluationsByUserResponse {

    protected List<Evaluation> getEvaluationsByUser;

    /**
     * Gets the value of the getEvaluationsByUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getEvaluationsByUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetEvaluationsByUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Evaluation }
     * 
     * 
     */
    public List<Evaluation> getGetEvaluationsByUser() {
        if (getEvaluationsByUser == null) {
            getEvaluationsByUser = new ArrayList<Evaluation>();
        }
        return this.getEvaluationsByUser;
    }

}
