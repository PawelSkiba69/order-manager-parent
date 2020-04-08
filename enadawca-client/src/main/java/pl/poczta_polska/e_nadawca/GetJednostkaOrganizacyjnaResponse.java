
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
 *         &lt;element name="jednostkaOrganizacyjna" type="{http://e-nadawca.poczta-polska.pl}jednostkaOrganizacyjnaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="error" type="{http://e-nadawca.poczta-polska.pl}errorType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "jednostkaOrganizacyjna",
    "error"
})
@XmlRootElement(name = "getJednostkaOrganizacyjnaResponse")
public class GetJednostkaOrganizacyjnaResponse {

    protected List<JednostkaOrganizacyjnaType> jednostkaOrganizacyjna;
    protected List<ErrorType> error;

    /**
     * Gets the value of the jednostkaOrganizacyjna property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jednostkaOrganizacyjna property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJednostkaOrganizacyjna().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JednostkaOrganizacyjnaType }
     * 
     * 
     */
    public List<JednostkaOrganizacyjnaType> getJednostkaOrganizacyjna() {
        if (jednostkaOrganizacyjna == null) {
            jednostkaOrganizacyjna = new ArrayList<JednostkaOrganizacyjnaType>();
        }
        return this.jednostkaOrganizacyjna;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorType }
     * 
     * 
     */
    public List<ErrorType> getError() {
        if (error == null) {
            error = new ArrayList<ErrorType>();
        }
        return this.error;
    }

}
