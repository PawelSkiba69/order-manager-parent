
package pl.poczta_polska.e_nadawca;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for daneSentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="daneSentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kluczPrzewoznika" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="kodCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="kodPKWiU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="masa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="proceduraAwaryjna" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "daneSentType", propOrder = {
    "numer",
    "kluczPrzewoznika",
    "kodCN",
    "kodPKWiU",
    "masa",
    "proceduraAwaryjna"
})
public class DaneSentType {

    @XmlElement(required = true)
    protected String numer;
    @XmlElement(required = true)
    protected String kluczPrzewoznika;
    protected String kodCN;
    protected String kodPKWiU;
    protected BigDecimal masa;
    protected Boolean proceduraAwaryjna;

    /**
     * Gets the value of the numer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumer() {
        return numer;
    }

    /**
     * Sets the value of the numer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumer(String value) {
        this.numer = value;
    }

    /**
     * Gets the value of the kluczPrzewoznika property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKluczPrzewoznika() {
        return kluczPrzewoznika;
    }

    /**
     * Sets the value of the kluczPrzewoznika property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKluczPrzewoznika(String value) {
        this.kluczPrzewoznika = value;
    }

    /**
     * Gets the value of the kodCN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodCN() {
        return kodCN;
    }

    /**
     * Sets the value of the kodCN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodCN(String value) {
        this.kodCN = value;
    }

    /**
     * Gets the value of the kodPKWiU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodPKWiU() {
        return kodPKWiU;
    }

    /**
     * Sets the value of the kodPKWiU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodPKWiU(String value) {
        this.kodPKWiU = value;
    }

    /**
     * Gets the value of the masa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMasa() {
        return masa;
    }

    /**
     * Sets the value of the masa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMasa(BigDecimal value) {
        this.masa = value;
    }

    /**
     * Gets the value of the proceduraAwaryjna property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProceduraAwaryjna() {
        return proceduraAwaryjna;
    }

    /**
     * Sets the value of the proceduraAwaryjna property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProceduraAwaryjna(Boolean value) {
        this.proceduraAwaryjna = value;
    }

}
