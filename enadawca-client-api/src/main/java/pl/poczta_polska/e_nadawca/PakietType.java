
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pakietType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pakietType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kierunek" type="{http://e-nadawca.poczta-polska.pl}kierunekType" minOccurs="0"/&gt;
 *         &lt;element name="opakowanie" type="{http://e-nadawca.poczta-polska.pl}opakowanieType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="czynnoscUpustowa" type="{http://e-nadawca.poczta-polska.pl}czynnoscUpustowaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="pakietGuid" type="{http://e-nadawca.poczta-polska.pl}guidType" /&gt;
 *       &lt;attribute name="miejsceOdbioru" type="{http://e-nadawca.poczta-polska.pl}miejsceOdbioruType" default="URZAD_NADANIA" /&gt;
 *       &lt;attribute name="sposobNadania" type="{http://e-nadawca.poczta-polska.pl}sposobNadaniaType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pakietType", propOrder = {
    "kierunek",
    "opakowanie",
    "czynnoscUpustowa"
})
public class PakietType {

    protected KierunekType kierunek;
    protected List<OpakowanieType> opakowanie;
    @XmlSchemaType(name = "string")
    protected List<CzynnoscUpustowaType> czynnoscUpustowa;
    @XmlAttribute(name = "pakietGuid")
    protected String pakietGuid;
    @XmlAttribute(name = "miejsceOdbioru")
    protected MiejsceOdbioruType miejsceOdbioru;
    @XmlAttribute(name = "sposobNadania")
    protected SposobNadaniaType sposobNadania;

    /**
     * Gets the value of the kierunek property.
     * 
     * @return
     *     possible object is
     *     {@link KierunekType }
     *     
     */
    public KierunekType getKierunek() {
        return kierunek;
    }

    /**
     * Sets the value of the kierunek property.
     * 
     * @param value
     *     allowed object is
     *     {@link KierunekType }
     *     
     */
    public void setKierunek(KierunekType value) {
        this.kierunek = value;
    }

    /**
     * Gets the value of the opakowanie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opakowanie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpakowanie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpakowanieType }
     * 
     * 
     */
    public List<OpakowanieType> getOpakowanie() {
        if (opakowanie == null) {
            opakowanie = new ArrayList<OpakowanieType>();
        }
        return this.opakowanie;
    }

    /**
     * Gets the value of the czynnoscUpustowa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the czynnoscUpustowa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCzynnoscUpustowa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CzynnoscUpustowaType }
     * 
     * 
     */
    public List<CzynnoscUpustowaType> getCzynnoscUpustowa() {
        if (czynnoscUpustowa == null) {
            czynnoscUpustowa = new ArrayList<CzynnoscUpustowaType>();
        }
        return this.czynnoscUpustowa;
    }

    /**
     * Gets the value of the pakietGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPakietGuid() {
        return pakietGuid;
    }

    /**
     * Sets the value of the pakietGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPakietGuid(String value) {
        this.pakietGuid = value;
    }

    /**
     * Gets the value of the miejsceOdbioru property.
     * 
     * @return
     *     possible object is
     *     {@link MiejsceOdbioruType }
     *     
     */
    public MiejsceOdbioruType getMiejsceOdbioru() {
        if (miejsceOdbioru == null) {
            return MiejsceOdbioruType.URZAD_NADANIA;
        } else {
            return miejsceOdbioru;
        }
    }

    /**
     * Sets the value of the miejsceOdbioru property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiejsceOdbioruType }
     *     
     */
    public void setMiejsceOdbioru(MiejsceOdbioruType value) {
        this.miejsceOdbioru = value;
    }

    /**
     * Gets the value of the sposobNadania property.
     * 
     * @return
     *     possible object is
     *     {@link SposobNadaniaType }
     *     
     */
    public SposobNadaniaType getSposobNadania() {
        return sposobNadania;
    }

    /**
     * Sets the value of the sposobNadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link SposobNadaniaType }
     *     
     */
    public void setSposobNadania(SposobNadaniaType value) {
        this.sposobNadania = value;
    }

}
