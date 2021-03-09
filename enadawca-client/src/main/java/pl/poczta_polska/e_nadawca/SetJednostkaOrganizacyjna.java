
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
 *         &amp;lt;element name="jednostkaOrganizacyjna" type="{http://e-nadawca.poczta-polska.pl}jednostkaOrganizacyjnaType" maxOccurs="unbounded"/&amp;gt;
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
    "jednostkaOrganizacyjna"
})
@XmlRootElement(name = "setJednostkaOrganizacyjna")
public class SetJednostkaOrganizacyjna {

    @XmlElement(required = true)
    protected List<JednostkaOrganizacyjnaType> jednostkaOrganizacyjna;

    /**
     * Gets the value of the jednostkaOrganizacyjna property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the jednostkaOrganizacyjna property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getJednostkaOrganizacyjna().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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

}
