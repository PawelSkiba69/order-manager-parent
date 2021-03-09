
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for powodSzczegolowyType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="powodSzczegolowyType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="idPowodSzczegolowy" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="powodSzczegolowyOpis" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "powodSzczegolowyType")
public class PowodSzczegolowyType {

    @XmlAttribute(name = "idPowodSzczegolowy")
    protected Integer idPowodSzczegolowy;
    @XmlAttribute(name = "powodSzczegolowyOpis")
    protected String powodSzczegolowyOpis;

    /**
     * Gets the value of the idPowodSzczegolowy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdPowodSzczegolowy() {
        return idPowodSzczegolowy;
    }

    /**
     * Sets the value of the idPowodSzczegolowy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdPowodSzczegolowy(Integer value) {
        this.idPowodSzczegolowy = value;
    }

    /**
     * Gets the value of the powodSzczegolowyOpis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowodSzczegolowyOpis() {
        return powodSzczegolowyOpis;
    }

    /**
     * Sets the value of the powodSzczegolowyOpis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowodSzczegolowyOpis(String value) {
        this.powodSzczegolowyOpis = value;
    }

}
