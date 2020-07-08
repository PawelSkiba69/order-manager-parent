
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for przesylkaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="przesylkaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="guid" use="required" type="{http://e-nadawca.poczta-polska.pl}guidType" /&gt;
 *       &lt;attribute name="pakietGuid" type="{http://e-nadawca.poczta-polska.pl}guidType" /&gt;
 *       &lt;attribute name="opakowanieGuid" type="{http://e-nadawca.poczta-polska.pl}guidType" /&gt;
 *       &lt;attribute name="opis" type="{http://e-nadawca.poczta-polska.pl}opisType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaType")
@XmlSeeAlso({
    SubPrzesylkaBiznesowaType.class,
    SubPrzesylkaBiznesowaPlusType.class,
    SubPrzesylkaPaletowaType.class,
    SubUslugaPaczkowaType.class,
    SubUslugaKurierskaType.class,
    PrzesylkaNieRejestrowanaType.class,
    PrzesylkaRejestrowanaType.class
})
public abstract class PrzesylkaType {

    @XmlAttribute(name = "guid", required = true)
    protected String guid;
    @XmlAttribute(name = "pakietGuid")
    protected String pakietGuid;
    @XmlAttribute(name = "opakowanieGuid")
    protected String opakowanieGuid;
    @XmlAttribute(name = "opis")
    protected String opis;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
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
     * Gets the value of the opakowanieGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpakowanieGuid() {
        return opakowanieGuid;
    }

    /**
     * Sets the value of the opakowanieGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpakowanieGuid(String value) {
        this.opakowanieGuid = value;
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

}
