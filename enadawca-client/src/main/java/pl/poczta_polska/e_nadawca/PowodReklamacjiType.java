
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for powodReklamacjiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="powodReklamacjiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="powodSzczegolowy" type="{http://e-nadawca.poczta-polska.pl}powodSzczegolowyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="idPowodGlowny" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="powodGlownyOpis" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the powodSzczegolowy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowodSzczegolowy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
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
