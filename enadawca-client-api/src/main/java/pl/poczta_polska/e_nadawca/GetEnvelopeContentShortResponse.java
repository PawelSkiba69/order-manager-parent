
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="przesylka" type="{http://e-nadawca.poczta-polska.pl}przesylkaShortType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "przesylka"
})
@XmlRootElement(name = "getEnvelopeContentShortResponse")
public class GetEnvelopeContentShortResponse {

    protected List<PrzesylkaShortType> przesylka;

    /**
     * Gets the value of the przesylka property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the przesylka property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrzesylka().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrzesylkaShortType }
     * 
     * 
     */
    public List<PrzesylkaShortType> getPrzesylka() {
        if (przesylka == null) {
            przesylka = new ArrayList<PrzesylkaShortType>();
        }
        return this.przesylka;
    }

}
