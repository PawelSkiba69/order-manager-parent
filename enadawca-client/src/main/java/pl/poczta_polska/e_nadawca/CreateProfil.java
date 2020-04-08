
package pl.poczta_polska.e_nadawca;

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
 *         &lt;element name="profil" type="{http://e-nadawca.poczta-polska.pl}profilType"/&gt;
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
    "profil"
})
@XmlRootElement(name = "createProfil")
public class CreateProfil {

    @XmlElement(required = true)
    protected ProfilType profil;

    /**
     * Gets the value of the profil property.
     * 
     * @return
     *     possible object is
     *     {@link ProfilType }
     *     
     */
    public ProfilType getProfil() {
        return profil;
    }

    /**
     * Sets the value of the profil property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfilType }
     *     
     */
    public void setProfil(ProfilType value) {
        this.profil = value;
    }

}
