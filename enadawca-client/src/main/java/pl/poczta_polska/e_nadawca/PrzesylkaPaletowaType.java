
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for przesylkaPaletowaType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="przesylkaPaletowaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="miejsceOdbioru" type="{http://e-nadawca.poczta-polska.pl}adresType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="miejsceDoreczenia" type="{http://e-nadawca.poczta-polska.pl}adresType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="paleta" type="{http://e-nadawca.poczta-polska.pl}paletaType"/&amp;gt;
 *         &amp;lt;element name="platnik" type="{http://e-nadawca.poczta-polska.pl}platnikType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="pobranie" type="{http://e-nadawca.poczta-polska.pl}pobranieType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="subPaleta" type="{http://e-nadawca.poczta-polska.pl}subPrzesylkaPaletowaType" maxOccurs="32" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="daneSent" type="{http://e-nadawca.poczta-polska.pl}daneSentType" maxOccurs="10" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="awizacja" type="{http://e-nadawca.poczta-polska.pl}awizacjaType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="zawartosc" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" /&amp;gt;
 *       &amp;lt;attribute name="dataZaladunku" type="{http://www.w3.org/2001/XMLSchema}date" /&amp;gt;
 *       &amp;lt;attribute name="dataDostawy" type="{http://www.w3.org/2001/XMLSchema}date" /&amp;gt;
 *       &amp;lt;attribute name="wartosc" type="{http://e-nadawca.poczta-polska.pl}wartoscType" /&amp;gt;
 *       &amp;lt;attribute name="iloscZwracanychPaletEUR" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="zalaczonaFV" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="zalaczonyWZ" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="zalaczoneInne" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="zwracanaFV" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="zwracanyWZ" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="zwracaneInne" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="powiadomienieNadawcy" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="powiadomienieOdbiorcy" type="{http://e-nadawca.poczta-polska.pl}eSposobPowiadomieniaType" /&amp;gt;
 *       &amp;lt;attribute name="dostawaWSobote" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="przygotowanieDokumentowPrzewozowych" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="dostawaSamochodemDedykowanym" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="zmianaDanychAdresowych" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="ustalenieTerminuDostawy" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="samochodZWinda" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="zabranieOpakowania" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="wniesienie" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="awizoSMS" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaPaletowaType", propOrder = {
    "miejsceOdbioru",
    "miejsceDoreczenia",
    "paleta",
    "platnik",
    "pobranie",
    "subPaleta",
    "daneSent",
    "awizacja"
})
public class PrzesylkaPaletowaType
    extends PrzesylkaRejestrowanaType
{

    protected AdresType miejsceOdbioru;
    protected AdresType miejsceDoreczenia;
    @XmlElement(required = true)
    protected PaletaType paleta;
    protected PlatnikType platnik;
    protected PobranieType pobranie;
    protected List<SubPrzesylkaPaletowaType> subPaleta;
    protected List<DaneSentType> daneSent;
    protected AwizacjaType awizacja;
    @XmlAttribute(name = "zawartosc")
    protected String zawartosc;
    @XmlAttribute(name = "masa")
    protected Integer masa;
    @XmlAttribute(name = "dataZaladunku")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataZaladunku;
    @XmlAttribute(name = "dataDostawy")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataDostawy;
    @XmlAttribute(name = "wartosc")
    protected Integer wartosc;
    @XmlAttribute(name = "iloscZwracanychPaletEUR")
    protected Integer iloscZwracanychPaletEUR;
    @XmlAttribute(name = "zalaczonaFV")
    protected String zalaczonaFV;
    @XmlAttribute(name = "zalaczonyWZ")
    protected String zalaczonyWZ;
    @XmlAttribute(name = "zalaczoneInne")
    protected String zalaczoneInne;
    @XmlAttribute(name = "zwracanaFV")
    protected String zwracanaFV;
    @XmlAttribute(name = "zwracanyWZ")
    protected String zwracanyWZ;
    @XmlAttribute(name = "zwracaneInne")
    protected String zwracaneInne;
    @XmlAttribute(name = "powiadomienieNadawcy")
    protected String powiadomienieNadawcy;
    @XmlAttribute(name = "powiadomienieOdbiorcy")
    protected ESposobPowiadomieniaType powiadomienieOdbiorcy;
    @XmlAttribute(name = "dostawaWSobote")
    protected Boolean dostawaWSobote;
    @XmlAttribute(name = "przygotowanieDokumentowPrzewozowych")
    protected Boolean przygotowanieDokumentowPrzewozowych;
    @XmlAttribute(name = "dostawaSamochodemDedykowanym")
    protected Boolean dostawaSamochodemDedykowanym;
    @XmlAttribute(name = "zmianaDanychAdresowych")
    protected Boolean zmianaDanychAdresowych;
    @XmlAttribute(name = "ustalenieTerminuDostawy")
    protected Boolean ustalenieTerminuDostawy;
    @XmlAttribute(name = "samochodZWinda")
    protected Boolean samochodZWinda;
    @XmlAttribute(name = "zabranieOpakowania")
    protected Boolean zabranieOpakowania;
    @XmlAttribute(name = "wniesienie")
    protected Boolean wniesienie;
    @XmlAttribute(name = "awizoSMS")
    protected Boolean awizoSMS;

    /**
     * Gets the value of the miejsceOdbioru property.
     * 
     * @return
     *     possible object is
     *     {@link AdresType }
     *     
     */
    public AdresType getMiejsceOdbioru() {
        return miejsceOdbioru;
    }

    /**
     * Sets the value of the miejsceOdbioru property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresType }
     *     
     */
    public void setMiejsceOdbioru(AdresType value) {
        this.miejsceOdbioru = value;
    }

    /**
     * Gets the value of the miejsceDoreczenia property.
     * 
     * @return
     *     possible object is
     *     {@link AdresType }
     *     
     */
    public AdresType getMiejsceDoreczenia() {
        return miejsceDoreczenia;
    }

    /**
     * Sets the value of the miejsceDoreczenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresType }
     *     
     */
    public void setMiejsceDoreczenia(AdresType value) {
        this.miejsceDoreczenia = value;
    }

    /**
     * Gets the value of the paleta property.
     * 
     * @return
     *     possible object is
     *     {@link PaletaType }
     *     
     */
    public PaletaType getPaleta() {
        return paleta;
    }

    /**
     * Sets the value of the paleta property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaletaType }
     *     
     */
    public void setPaleta(PaletaType value) {
        this.paleta = value;
    }

    /**
     * Gets the value of the platnik property.
     * 
     * @return
     *     possible object is
     *     {@link PlatnikType }
     *     
     */
    public PlatnikType getPlatnik() {
        return platnik;
    }

    /**
     * Sets the value of the platnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatnikType }
     *     
     */
    public void setPlatnik(PlatnikType value) {
        this.platnik = value;
    }

    /**
     * Gets the value of the pobranie property.
     * 
     * @return
     *     possible object is
     *     {@link PobranieType }
     *     
     */
    public PobranieType getPobranie() {
        return pobranie;
    }

    /**
     * Sets the value of the pobranie property.
     * 
     * @param value
     *     allowed object is
     *     {@link PobranieType }
     *     
     */
    public void setPobranie(PobranieType value) {
        this.pobranie = value;
    }

    /**
     * Gets the value of the subPaleta property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the subPaleta property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSubPaleta().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link SubPrzesylkaPaletowaType }
     * 
     * 
     */
    public List<SubPrzesylkaPaletowaType> getSubPaleta() {
        if (subPaleta == null) {
            subPaleta = new ArrayList<SubPrzesylkaPaletowaType>();
        }
        return this.subPaleta;
    }

    /**
     * Gets the value of the daneSent property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the daneSent property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getDaneSent().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link DaneSentType }
     * 
     * 
     */
    public List<DaneSentType> getDaneSent() {
        if (daneSent == null) {
            daneSent = new ArrayList<DaneSentType>();
        }
        return this.daneSent;
    }

    /**
     * Gets the value of the awizacja property.
     * 
     * @return
     *     possible object is
     *     {@link AwizacjaType }
     *     
     */
    public AwizacjaType getAwizacja() {
        return awizacja;
    }

    /**
     * Sets the value of the awizacja property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwizacjaType }
     *     
     */
    public void setAwizacja(AwizacjaType value) {
        this.awizacja = value;
    }

    /**
     * Gets the value of the zawartosc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZawartosc() {
        return zawartosc;
    }

    /**
     * Sets the value of the zawartosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZawartosc(String value) {
        this.zawartosc = value;
    }

    /**
     * Gets the value of the masa property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMasa() {
        return masa;
    }

    /**
     * Sets the value of the masa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMasa(Integer value) {
        this.masa = value;
    }

    /**
     * Gets the value of the dataZaladunku property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataZaladunku() {
        return dataZaladunku;
    }

    /**
     * Sets the value of the dataZaladunku property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataZaladunku(XMLGregorianCalendar value) {
        this.dataZaladunku = value;
    }

    /**
     * Gets the value of the dataDostawy property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDostawy() {
        return dataDostawy;
    }

    /**
     * Sets the value of the dataDostawy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDostawy(XMLGregorianCalendar value) {
        this.dataDostawy = value;
    }

    /**
     * Gets the value of the wartosc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWartosc() {
        return wartosc;
    }

    /**
     * Sets the value of the wartosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWartosc(Integer value) {
        this.wartosc = value;
    }

    /**
     * Gets the value of the iloscZwracanychPaletEUR property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIloscZwracanychPaletEUR() {
        return iloscZwracanychPaletEUR;
    }

    /**
     * Sets the value of the iloscZwracanychPaletEUR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIloscZwracanychPaletEUR(Integer value) {
        this.iloscZwracanychPaletEUR = value;
    }

    /**
     * Gets the value of the zalaczonaFV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZalaczonaFV() {
        return zalaczonaFV;
    }

    /**
     * Sets the value of the zalaczonaFV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZalaczonaFV(String value) {
        this.zalaczonaFV = value;
    }

    /**
     * Gets the value of the zalaczonyWZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZalaczonyWZ() {
        return zalaczonyWZ;
    }

    /**
     * Sets the value of the zalaczonyWZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZalaczonyWZ(String value) {
        this.zalaczonyWZ = value;
    }

    /**
     * Gets the value of the zalaczoneInne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZalaczoneInne() {
        return zalaczoneInne;
    }

    /**
     * Sets the value of the zalaczoneInne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZalaczoneInne(String value) {
        this.zalaczoneInne = value;
    }

    /**
     * Gets the value of the zwracanaFV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZwracanaFV() {
        return zwracanaFV;
    }

    /**
     * Sets the value of the zwracanaFV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZwracanaFV(String value) {
        this.zwracanaFV = value;
    }

    /**
     * Gets the value of the zwracanyWZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZwracanyWZ() {
        return zwracanyWZ;
    }

    /**
     * Sets the value of the zwracanyWZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZwracanyWZ(String value) {
        this.zwracanyWZ = value;
    }

    /**
     * Gets the value of the zwracaneInne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZwracaneInne() {
        return zwracaneInne;
    }

    /**
     * Sets the value of the zwracaneInne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZwracaneInne(String value) {
        this.zwracaneInne = value;
    }

    /**
     * Gets the value of the powiadomienieNadawcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowiadomienieNadawcy() {
        return powiadomienieNadawcy;
    }

    /**
     * Sets the value of the powiadomienieNadawcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowiadomienieNadawcy(String value) {
        this.powiadomienieNadawcy = value;
    }

    /**
     * Gets the value of the powiadomienieOdbiorcy property.
     * 
     * @return
     *     possible object is
     *     {@link ESposobPowiadomieniaType }
     *     
     */
    public ESposobPowiadomieniaType getPowiadomienieOdbiorcy() {
        return powiadomienieOdbiorcy;
    }

    /**
     * Sets the value of the powiadomienieOdbiorcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESposobPowiadomieniaType }
     *     
     */
    public void setPowiadomienieOdbiorcy(ESposobPowiadomieniaType value) {
        this.powiadomienieOdbiorcy = value;
    }

    /**
     * Gets the value of the dostawaWSobote property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDostawaWSobote() {
        return dostawaWSobote;
    }

    /**
     * Sets the value of the dostawaWSobote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDostawaWSobote(Boolean value) {
        this.dostawaWSobote = value;
    }

    /**
     * Gets the value of the przygotowanieDokumentowPrzewozowych property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrzygotowanieDokumentowPrzewozowych() {
        return przygotowanieDokumentowPrzewozowych;
    }

    /**
     * Sets the value of the przygotowanieDokumentowPrzewozowych property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrzygotowanieDokumentowPrzewozowych(Boolean value) {
        this.przygotowanieDokumentowPrzewozowych = value;
    }

    /**
     * Gets the value of the dostawaSamochodemDedykowanym property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDostawaSamochodemDedykowanym() {
        return dostawaSamochodemDedykowanym;
    }

    /**
     * Sets the value of the dostawaSamochodemDedykowanym property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDostawaSamochodemDedykowanym(Boolean value) {
        this.dostawaSamochodemDedykowanym = value;
    }

    /**
     * Gets the value of the zmianaDanychAdresowych property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZmianaDanychAdresowych() {
        return zmianaDanychAdresowych;
    }

    /**
     * Sets the value of the zmianaDanychAdresowych property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZmianaDanychAdresowych(Boolean value) {
        this.zmianaDanychAdresowych = value;
    }

    /**
     * Gets the value of the ustalenieTerminuDostawy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUstalenieTerminuDostawy() {
        return ustalenieTerminuDostawy;
    }

    /**
     * Sets the value of the ustalenieTerminuDostawy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUstalenieTerminuDostawy(Boolean value) {
        this.ustalenieTerminuDostawy = value;
    }

    /**
     * Gets the value of the samochodZWinda property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSamochodZWinda() {
        return samochodZWinda;
    }

    /**
     * Sets the value of the samochodZWinda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSamochodZWinda(Boolean value) {
        this.samochodZWinda = value;
    }

    /**
     * Gets the value of the zabranieOpakowania property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZabranieOpakowania() {
        return zabranieOpakowania;
    }

    /**
     * Sets the value of the zabranieOpakowania property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZabranieOpakowania(Boolean value) {
        this.zabranieOpakowania = value;
    }

    /**
     * Gets the value of the wniesienie property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWniesienie() {
        return wniesienie;
    }

    /**
     * Sets the value of the wniesienie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWniesienie(Boolean value) {
        this.wniesienie = value;
    }

    /**
     * Gets the value of the awizoSMS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAwizoSMS() {
        return awizoSMS;
    }

    /**
     * Sets the value of the awizoSMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAwizoSMS(Boolean value) {
        this.awizoSMS = value;
    }

}
