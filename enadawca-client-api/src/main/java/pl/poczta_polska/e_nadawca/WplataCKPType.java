
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for wplataCKPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wplataCKPType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="unikalnyIdentyfikatorWplaty" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="numerNadania" use="required" type="{http://e-nadawca.poczta-polska.pl}numerNadaniaType" /&gt;
 *       &lt;attribute name="kwota" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="dataPobrania" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="dataPrzelewu" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="idUmowy" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="tytulPrzelewuZbiorczego" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wplataCKPType")
public class WplataCKPType {

    @XmlAttribute(name = "unikalnyIdentyfikatorWplaty", required = true)
    protected String unikalnyIdentyfikatorWplaty;
    @XmlAttribute(name = "numerNadania", required = true)
    protected String numerNadania;
    @XmlAttribute(name = "kwota", required = true)
    protected int kwota;
    @XmlAttribute(name = "dataPobrania", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataPobrania;
    @XmlAttribute(name = "dataPrzelewu")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataPrzelewu;
    @XmlAttribute(name = "idUmowy", required = true)
    protected int idUmowy;
    @XmlAttribute(name = "tytulPrzelewuZbiorczego", required = true)
    protected String tytulPrzelewuZbiorczego;

    /**
     * Gets the value of the unikalnyIdentyfikatorWplaty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnikalnyIdentyfikatorWplaty() {
        return unikalnyIdentyfikatorWplaty;
    }

    /**
     * Sets the value of the unikalnyIdentyfikatorWplaty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnikalnyIdentyfikatorWplaty(String value) {
        this.unikalnyIdentyfikatorWplaty = value;
    }

    /**
     * Gets the value of the numerNadania property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerNadania() {
        return numerNadania;
    }

    /**
     * Sets the value of the numerNadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerNadania(String value) {
        this.numerNadania = value;
    }

    /**
     * Gets the value of the kwota property.
     * 
     */
    public int getKwota() {
        return kwota;
    }

    /**
     * Sets the value of the kwota property.
     * 
     */
    public void setKwota(int value) {
        this.kwota = value;
    }

    /**
     * Gets the value of the dataPobrania property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPobrania() {
        return dataPobrania;
    }

    /**
     * Sets the value of the dataPobrania property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPobrania(XMLGregorianCalendar value) {
        this.dataPobrania = value;
    }

    /**
     * Gets the value of the dataPrzelewu property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPrzelewu() {
        return dataPrzelewu;
    }

    /**
     * Sets the value of the dataPrzelewu property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPrzelewu(XMLGregorianCalendar value) {
        this.dataPrzelewu = value;
    }

    /**
     * Gets the value of the idUmowy property.
     * 
     */
    public int getIdUmowy() {
        return idUmowy;
    }

    /**
     * Sets the value of the idUmowy property.
     * 
     */
    public void setIdUmowy(int value) {
        this.idUmowy = value;
    }

    /**
     * Gets the value of the tytulPrzelewuZbiorczego property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTytulPrzelewuZbiorczego() {
        return tytulPrzelewuZbiorczego;
    }

    /**
     * Sets the value of the tytulPrzelewuZbiorczego property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTytulPrzelewuZbiorczego(String value) {
        this.tytulPrzelewuZbiorczego = value;
    }

}
