
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for awizoPrzesylkiType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="awizoPrzesylkiType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="dataPierwszegoAwizowania" type="{http://www.w3.org/2001/XMLSchema}date" /&amp;gt;
 *       &amp;lt;attribute name="dataDrugiegoAwizowania" type="{http://www.w3.org/2001/XMLSchema}date" /&amp;gt;
 *       &amp;lt;attribute name="miejscePozostawienia" type="{http://e-nadawca.poczta-polska.pl}miejscaPozostawieniaAwizoEnum" /&amp;gt;
 *       &amp;lt;attribute name="idPlacowkaPocztowaWydajaca" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "awizoPrzesylkiType")
public class AwizoPrzesylkiType {

    @XmlAttribute(name = "dataPierwszegoAwizowania")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataPierwszegoAwizowania;
    @XmlAttribute(name = "dataDrugiegoAwizowania")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataDrugiegoAwizowania;
    @XmlAttribute(name = "miejscePozostawienia")
    protected MiejscaPozostawieniaAwizoEnum miejscePozostawienia;
    @XmlAttribute(name = "idPlacowkaPocztowaWydajaca")
    protected Integer idPlacowkaPocztowaWydajaca;

    /**
     * Gets the value of the dataPierwszegoAwizowania property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPierwszegoAwizowania() {
        return dataPierwszegoAwizowania;
    }

    /**
     * Sets the value of the dataPierwszegoAwizowania property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPierwszegoAwizowania(XMLGregorianCalendar value) {
        this.dataPierwszegoAwizowania = value;
    }

    /**
     * Gets the value of the dataDrugiegoAwizowania property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDrugiegoAwizowania() {
        return dataDrugiegoAwizowania;
    }

    /**
     * Sets the value of the dataDrugiegoAwizowania property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDrugiegoAwizowania(XMLGregorianCalendar value) {
        this.dataDrugiegoAwizowania = value;
    }

    /**
     * Gets the value of the miejscePozostawienia property.
     * 
     * @return
     *     possible object is
     *     {@link MiejscaPozostawieniaAwizoEnum }
     *     
     */
    public MiejscaPozostawieniaAwizoEnum getMiejscePozostawienia() {
        return miejscePozostawienia;
    }

    /**
     * Sets the value of the miejscePozostawienia property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiejscaPozostawieniaAwizoEnum }
     *     
     */
    public void setMiejscePozostawienia(MiejscaPozostawieniaAwizoEnum value) {
        this.miejscePozostawienia = value;
    }

    /**
     * Gets the value of the idPlacowkaPocztowaWydajaca property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdPlacowkaPocztowaWydajaca() {
        return idPlacowkaPocztowaWydajaca;
    }

    /**
     * Sets the value of the idPlacowkaPocztowaWydajaca property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdPlacowkaPocztowaWydajaca(Integer value) {
        this.idPlacowkaPocztowaWydajaca = value;
    }

}
