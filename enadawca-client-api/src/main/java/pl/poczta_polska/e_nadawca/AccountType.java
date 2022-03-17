
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for accountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="karta" type="{http://e-nadawca.poczta-polska.pl}kartaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="permision" type="{http://e-nadawca.poczta-polska.pl}permisionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="profil" type="{http://e-nadawca.poczta-polska.pl}profilType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="jednostka" type="{http://e-nadawca.poczta-polska.pl}jednostkaOrganizacyjnaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="domyslnaJednostka" type="{http://e-nadawca.poczta-polska.pl}jednostkaOrganizacyjnaType" minOccurs="0"/&gt;
 *         &lt;element name="domyslnyProfil" type="{http://e-nadawca.poczta-polska.pl}profilType" minOccurs="0"/&gt;
 *         &lt;element name="dostepPoAdresieIP" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="userName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="email" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="status" type="{http://e-nadawca.poczta-polska.pl}statusAccountType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountType", propOrder = {
    "karta",
    "permision",
    "profil",
    "jednostka",
    "domyslnaJednostka",
    "domyslnyProfil",
    "dostepPoAdresieIP"
})
public class AccountType {

    protected List<KartaType> karta;
    @XmlSchemaType(name = "string")
    protected List<PermisionType> permision;
    @XmlElement(required = true)
    protected List<ProfilType> profil;
    protected List<JednostkaOrganizacyjnaType> jednostka;
    protected JednostkaOrganizacyjnaType domyslnaJednostka;
    protected ProfilType domyslnyProfil;
    protected List<String> dostepPoAdresieIP;
    @XmlAttribute(name = "userName")
    protected String userName;
    @XmlAttribute(name = "firstName")
    protected String firstName;
    @XmlAttribute(name = "lastName")
    protected String lastName;
    @XmlAttribute(name = "email")
    protected String email;
    @XmlAttribute(name = "status")
    protected StatusAccountType status;

    /**
     * Gets the value of the karta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the karta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKarta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KartaType }
     * 
     * 
     */
    public List<KartaType> getKarta() {
        if (karta == null) {
            karta = new ArrayList<KartaType>();
        }
        return this.karta;
    }

    /**
     * Gets the value of the permision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermisionType }
     * 
     * 
     */
    public List<PermisionType> getPermision() {
        if (permision == null) {
            permision = new ArrayList<PermisionType>();
        }
        return this.permision;
    }

    /**
     * Gets the value of the profil property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profil property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfil().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfilType }
     * 
     * 
     */
    public List<ProfilType> getProfil() {
        if (profil == null) {
            profil = new ArrayList<ProfilType>();
        }
        return this.profil;
    }

    /**
     * Gets the value of the jednostka property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jednostka property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJednostka().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JednostkaOrganizacyjnaType }
     * 
     * 
     */
    public List<JednostkaOrganizacyjnaType> getJednostka() {
        if (jednostka == null) {
            jednostka = new ArrayList<JednostkaOrganizacyjnaType>();
        }
        return this.jednostka;
    }

    /**
     * Gets the value of the domyslnaJednostka property.
     * 
     * @return
     *     possible object is
     *     {@link JednostkaOrganizacyjnaType }
     *     
     */
    public JednostkaOrganizacyjnaType getDomyslnaJednostka() {
        return domyslnaJednostka;
    }

    /**
     * Sets the value of the domyslnaJednostka property.
     * 
     * @param value
     *     allowed object is
     *     {@link JednostkaOrganizacyjnaType }
     *     
     */
    public void setDomyslnaJednostka(JednostkaOrganizacyjnaType value) {
        this.domyslnaJednostka = value;
    }

    /**
     * Gets the value of the domyslnyProfil property.
     * 
     * @return
     *     possible object is
     *     {@link ProfilType }
     *     
     */
    public ProfilType getDomyslnyProfil() {
        return domyslnyProfil;
    }

    /**
     * Sets the value of the domyslnyProfil property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfilType }
     *     
     */
    public void setDomyslnyProfil(ProfilType value) {
        this.domyslnyProfil = value;
    }

    /**
     * Gets the value of the dostepPoAdresieIP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dostepPoAdresieIP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDostepPoAdresieIP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDostepPoAdresieIP() {
        if (dostepPoAdresieIP == null) {
            dostepPoAdresieIP = new ArrayList<String>();
        }
        return this.dostepPoAdresieIP;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusAccountType }
     *     
     */
    public StatusAccountType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusAccountType }
     *     
     */
    public void setStatus(StatusAccountType value) {
        this.status = value;
    }

}
