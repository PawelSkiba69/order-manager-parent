
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jednostkaOrganizacyjnaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jednostkaOrganizacyjnaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="account" type="{http://e-nadawca.poczta-polska.pl}accountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="jednostkaNadrzedna" type="{http://e-nadawca.poczta-polska.pl}jednostkaOrganizacyjnaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="nazwa"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="255"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="opis"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="0"/&gt;
 *             &lt;maxLength value="4000"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="mpk" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jednostkaOrganizacyjnaType", propOrder = {
    "account",
    "jednostkaNadrzedna"
})
public class JednostkaOrganizacyjnaType {

    protected List<AccountType> account;
    protected JednostkaOrganizacyjnaType jednostkaNadrzedna;
    @XmlAttribute(name = "id")
    protected Integer id;
    @XmlAttribute(name = "nazwa")
    protected String nazwa;
    @XmlAttribute(name = "opis")
    protected String opis;
    @XmlAttribute(name = "mpk")
    protected String mpk;

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountType }
     * 
     * 
     */
    public List<AccountType> getAccount() {
        if (account == null) {
            account = new ArrayList<AccountType>();
        }
        return this.account;
    }

    /**
     * Gets the value of the jednostkaNadrzedna property.
     * 
     * @return
     *     possible object is
     *     {@link JednostkaOrganizacyjnaType }
     *     
     */
    public JednostkaOrganizacyjnaType getJednostkaNadrzedna() {
        return jednostkaNadrzedna;
    }

    /**
     * Sets the value of the jednostkaNadrzedna property.
     * 
     * @param value
     *     allowed object is
     *     {@link JednostkaOrganizacyjnaType }
     *     
     */
    public void setJednostkaNadrzedna(JednostkaOrganizacyjnaType value) {
        this.jednostkaNadrzedna = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the nazwa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwa() {
        return nazwa;
    }

    /**
     * Sets the value of the nazwa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwa(String value) {
        this.nazwa = value;
    }

    /**
     * Gets the value of the opis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpis() {
        return opis;
    }

    /**
     * Sets the value of the opis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpis(String value) {
        this.opis = value;
    }

    /**
     * Gets the value of the mpk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpk() {
        return mpk;
    }

    /**
     * Sets the value of the mpk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpk(String value) {
        this.mpk = value;
    }

}
