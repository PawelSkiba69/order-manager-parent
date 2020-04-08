
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adresType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="nazwa" type="{http://e-nadawca.poczta-polska.pl}nazwaType" /&gt;
 *       &lt;attribute name="nazwa2" type="{http://e-nadawca.poczta-polska.pl}nazwa2Type" /&gt;
 *       &lt;attribute name="ulica" type="{http://e-nadawca.poczta-polska.pl}ulicaType" /&gt;
 *       &lt;attribute name="numerDomu" type="{http://e-nadawca.poczta-polska.pl}numerDomuType" /&gt;
 *       &lt;attribute name="numerLokalu" type="{http://e-nadawca.poczta-polska.pl}numerLokaluType" /&gt;
 *       &lt;attribute name="miejscowosc" type="{http://e-nadawca.poczta-polska.pl}miejscowoscType" /&gt;
 *       &lt;attribute name="kodPocztowy" type="{http://e-nadawca.poczta-polska.pl}kodPocztowyType" /&gt;
 *       &lt;attribute name="kraj" type="{http://e-nadawca.poczta-polska.pl}krajType" default="Polska" /&gt;
 *       &lt;attribute name="telefon" type="{http://e-nadawca.poczta-polska.pl}telefonType" /&gt;
 *       &lt;attribute name="email" type="{http://e-nadawca.poczta-polska.pl}emailType" /&gt;
 *       &lt;attribute name="mobile" type="{http://e-nadawca.poczta-polska.pl}mobileType" /&gt;
 *       &lt;attribute name="osobaKontaktowa" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="nip" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresType")
@XmlSeeAlso({
    ProfilType.class
})
public class AdresType {

    @XmlAttribute(name = "nazwa")
    protected String nazwa;
    @XmlAttribute(name = "nazwa2")
    protected String nazwa2;
    @XmlAttribute(name = "ulica")
    protected String ulica;
    @XmlAttribute(name = "numerDomu")
    protected String numerDomu;
    @XmlAttribute(name = "numerLokalu")
    protected String numerLokalu;
    @XmlAttribute(name = "miejscowosc")
    protected String miejscowosc;
    @XmlAttribute(name = "kodPocztowy")
    protected String kodPocztowy;
    @XmlAttribute(name = "kraj")
    protected String kraj;
    @XmlAttribute(name = "telefon")
    protected String telefon;
    @XmlAttribute(name = "email")
    protected String email;
    @XmlAttribute(name = "mobile")
    protected String mobile;
    @XmlAttribute(name = "osobaKontaktowa")
    protected String osobaKontaktowa;
    @XmlAttribute(name = "nip")
    protected String nip;

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
     * Gets the value of the nazwa2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwa2() {
        return nazwa2;
    }

    /**
     * Sets the value of the nazwa2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwa2(String value) {
        this.nazwa2 = value;
    }

    /**
     * Gets the value of the ulica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlica() {
        return ulica;
    }

    /**
     * Sets the value of the ulica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlica(String value) {
        this.ulica = value;
    }

    /**
     * Gets the value of the numerDomu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerDomu() {
        return numerDomu;
    }

    /**
     * Sets the value of the numerDomu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerDomu(String value) {
        this.numerDomu = value;
    }

    /**
     * Gets the value of the numerLokalu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerLokalu() {
        return numerLokalu;
    }

    /**
     * Sets the value of the numerLokalu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerLokalu(String value) {
        this.numerLokalu = value;
    }

    /**
     * Gets the value of the miejscowosc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiejscowosc() {
        return miejscowosc;
    }

    /**
     * Sets the value of the miejscowosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiejscowosc(String value) {
        this.miejscowosc = value;
    }

    /**
     * Gets the value of the kodPocztowy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodPocztowy() {
        return kodPocztowy;
    }

    /**
     * Sets the value of the kodPocztowy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodPocztowy(String value) {
        this.kodPocztowy = value;
    }

    /**
     * Gets the value of the kraj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKraj() {
        if (kraj == null) {
            return "Polska";
        } else {
            return kraj;
        }
    }

    /**
     * Sets the value of the kraj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKraj(String value) {
        this.kraj = value;
    }

    /**
     * Gets the value of the telefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Sets the value of the telefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefon(String value) {
        this.telefon = value;
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
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the osobaKontaktowa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsobaKontaktowa() {
        return osobaKontaktowa;
    }

    /**
     * Sets the value of the osobaKontaktowa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsobaKontaktowa(String value) {
        this.osobaKontaktowa = value;
    }

    /**
     * Gets the value of the nip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNip() {
        return nip;
    }

    /**
     * Sets the value of the nip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNip(String value) {
        this.nip = value;
    }

}
