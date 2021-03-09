
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for powodReklamacjiType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="powodReklamacjiType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="powodSzczegolowy" type="{http://e-nadawca.poczta-polska.pl}powodSzczegolowyType" maxOccurs="unbounded"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="idPowodGlowny" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="powodGlownyOpis" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "powodReklamacjiType", propOrder = {
    "powodSzczegolowy"
})
public class PowodReklamacjiType {

    @XmlElement(required = true)
    protected List<PowodSzczegolowyType> powodSzczegolowy;
    @XmlAttribute(name = "idPowodGlowny")
    protected Integer idPowodGlowny;
    @XmlAttribute(name = "powodGlownyOpis")
    protected String powodGlownyOpis;

    /**
     * Gets the value of the powodSzczegolowy property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the powodSzczegolowy property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPowodSzczegolowy().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link PowodSzczegolowyType }
     * 
     * 
     */
    public List<PowodSzczegolowyType> getPowodSzczegolowy() {
        if (powodSzczegolowy == null) {
            powodSzczegolowy = new ArrayList<PowodSzczegolowyType>();
        }
        return this.powodSzczegolowy;
    }

    /**
     * Gets the value of the idPowodGlowny property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdPowodGlowny() {
        return idPowodGlowny;
    }

    /**
     * Sets the value of the idPowodGlowny property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdPowodGlowny(Integer value) {
        this.idPowodGlowny = value;
    }

    /**
     * Gets the value of the powodGlownyOpis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowodGlownyOpis() {
        return powodGlownyOpis;
    }

    /**
     * Sets the value of the powodGlownyOpis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowodGlownyOpis(String value) {
        this.powodGlownyOpis = value;
    }

}
