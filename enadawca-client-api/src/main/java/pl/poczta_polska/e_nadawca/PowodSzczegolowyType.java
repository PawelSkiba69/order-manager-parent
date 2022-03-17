
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for powodSzczegolowyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="powodSzczegolowyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="idPowodSzczegolowy" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="powodSzczegolowyOpis" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
