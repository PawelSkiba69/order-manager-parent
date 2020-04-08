
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
 *         &lt;element name="urzadNadania" type="{http://e-nadawca.poczta-polska.pl}urzadNadaniaType" minOccurs="0"/&gt;
 *         &lt;element name="pakiet" type="{http://e-nadawca.poczta-polska.pl}pakietType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="idBufor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="profil" type="{http://e-nadawca.poczta-polska.pl}profilType" minOccurs="0"/&gt;
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
    "urzadNadania",
    "pakiet",
    "idBufor",
    "profil"
})
@XmlRootElement(name = "sendEnvelope")
public class SendEnvelope {

    protected Integer urzadNadania;
    protected List<PakietType> pakiet;
    protected Integer idBufor;
    protected ProfilType profil;

    /**
     * Gets the value of the urzadNadania property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUrzadNadania() {
        return urzadNadania;
    }

    /**
     * Sets the value of the urzadNadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUrzadNadania(Integer value) {
        this.urzadNadania = value;
    }

    /**
     * Gets the value of the pakiet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pakiet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPakiet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PakietType }
     * 
     * 
     */
    public List<PakietType> getPakiet() {
        if (pakiet == null) {
            pakiet = new ArrayList<PakietType>();
        }
        return this.pakiet;
    }

    /**
     * Gets the value of the idBufor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdBufor() {
        return idBufor;
    }

    /**
     * Sets the value of the idBufor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdBufor(Integer value) {
        this.idBufor = value;
    }

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
