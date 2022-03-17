
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="statusZgody" type="{http://e-nadawca.poczta-polska.pl}statusZgodyEZwrotType" maxOccurs="unbounded"/&gt;
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
    "statusZgody"
})
@XmlRootElement(name = "setStatusZgodyNaEZwrot")
public class SetStatusZgodyNaEZwrot {

    @XmlElement(required = true)
    protected List<StatusZgodyEZwrotType> statusZgody;

    /**
     * Gets the value of the statusZgody property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusZgody property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusZgody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusZgodyEZwrotType }
     * 
     * 
     */
    public List<StatusZgodyEZwrotType> getStatusZgody() {
        if (statusZgody == null) {
            statusZgody = new ArrayList<StatusZgodyEZwrotType>();
        }
        return this.statusZgody;
    }

}
