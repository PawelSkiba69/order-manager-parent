
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kartaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kartaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adresKorespondencyjny" type="{http://e-nadawca.poczta-polska.pl}adresKorespondencyjny" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="idKarta" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="opis" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="aktywna" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="typ" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kartaType", propOrder = {
    "adresKorespondencyjny"
})
public class KartaType {

    protected List<AdresKorespondencyjny> adresKorespondencyjny;
    @XmlAttribute(name = "idKarta")
    protected Integer idKarta;
    @XmlAttribute(name = "opis")
    protected String opis;
    @XmlAttribute(name = "aktywna")
    protected Boolean aktywna;
    @XmlAttribute(name = "typ")
    protected Integer typ;

    /**
     * Gets the value of the adresKorespondencyjny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adresKorespondencyjny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdresKorespondencyjny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresKorespondencyjny }
     * 
     * 
     */
    public List<AdresKorespondencyjny> getAdresKorespondencyjny() {
        if (adresKorespondencyjny == null) {
            adresKorespondencyjny = new ArrayList<AdresKorespondencyjny>();
        }
        return this.adresKorespondencyjny;
    }

    /**
     * Gets the value of the idKarta property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdKarta() {
        return idKarta;
    }

    /**
     * Sets the value of the idKarta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdKarta(Integer value) {
        this.idKarta = value;
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
     * Gets the value of the aktywna property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAktywna() {
        return aktywna;
    }

    /**
     * Sets the value of the aktywna property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAktywna(Boolean value) {
        this.aktywna = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTyp(Integer value) {
        this.typ = value;
    }

}
