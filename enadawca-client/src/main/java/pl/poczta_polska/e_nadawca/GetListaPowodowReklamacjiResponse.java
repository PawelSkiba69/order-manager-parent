
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="kategoriePowodowReklamacji" type="{http://e-nadawca.poczta-polska.pl}kategoriePowodowReklamacjiType" maxOccurs="unbounded"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "kategoriePowodowReklamacji"
})
@XmlRootElement(name = "getListaPowodowReklamacjiResponse")
public class GetListaPowodowReklamacjiResponse {

    @XmlElement(required = true)
    protected List<KategoriePowodowReklamacjiType> kategoriePowodowReklamacji;

    /**
     * Gets the value of the kategoriePowodowReklamacji property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the kategoriePowodowReklamacji property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getKategoriePowodowReklamacji().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link KategoriePowodowReklamacjiType }
     * 
     * 
     */
    public List<KategoriePowodowReklamacjiType> getKategoriePowodowReklamacji() {
        if (kategoriePowodowReklamacji == null) {
            kategoriePowodowReklamacji = new ArrayList<KategoriePowodowReklamacjiType>();
        }
        return this.kategoriePowodowReklamacji;
    }

}
