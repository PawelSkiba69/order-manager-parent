
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for infoPaczkaKorzysciType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="infoPaczkaKorzysciType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="iloscStandardDo5kg" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="iloscPobranieDo5kg" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="iloscOdbiorWPunkcieDo5kg" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="iloscPobranieOdbiorWPunkcieDo5kg" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="iloscStandardDo30kg" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="iloscPobranieDo30kg" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="iloscOdbiorWPunkcieDo30kg" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="iloscPobranieOdbiorWPunkcieDo30kg" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="dataWaznosciUmowy" type="{http://www.w3.org/2001/XMLSchema}date" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoPaczkaKorzysciType")
public class InfoPaczkaKorzysciType {

    @XmlAttribute(name = "iloscStandardDo5kg")
    protected Integer iloscStandardDo5Kg;
    @XmlAttribute(name = "iloscPobranieDo5kg")
    protected Integer iloscPobranieDo5Kg;
    @XmlAttribute(name = "iloscOdbiorWPunkcieDo5kg")
    protected Integer iloscOdbiorWPunkcieDo5Kg;
    @XmlAttribute(name = "iloscPobranieOdbiorWPunkcieDo5kg")
    protected Integer iloscPobranieOdbiorWPunkcieDo5Kg;
    @XmlAttribute(name = "iloscStandardDo30kg")
    protected Integer iloscStandardDo30Kg;
    @XmlAttribute(name = "iloscPobranieDo30kg")
    protected Integer iloscPobranieDo30Kg;
    @XmlAttribute(name = "iloscOdbiorWPunkcieDo30kg")
    protected Integer iloscOdbiorWPunkcieDo30Kg;
    @XmlAttribute(name = "iloscPobranieOdbiorWPunkcieDo30kg")
    protected Integer iloscPobranieOdbiorWPunkcieDo30Kg;
    @XmlAttribute(name = "dataWaznosciUmowy")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataWaznosciUmowy;

    /**
     * Gets the value of the iloscStandardDo5Kg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIloscStandardDo5Kg() {
        return iloscStandardDo5Kg;
    }

    /**
     * Sets the value of the iloscStandardDo5Kg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIloscStandardDo5Kg(Integer value) {
        this.iloscStandardDo5Kg = value;
    }

    /**
     * Gets the value of the iloscPobranieDo5Kg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIloscPobranieDo5Kg() {
        return iloscPobranieDo5Kg;
    }

    /**
     * Sets the value of the iloscPobranieDo5Kg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIloscPobranieDo5Kg(Integer value) {
        this.iloscPobranieDo5Kg = value;
    }

    /**
     * Gets the value of the iloscOdbiorWPunkcieDo5Kg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIloscOdbiorWPunkcieDo5Kg() {
        return iloscOdbiorWPunkcieDo5Kg;
    }

    /**
     * Sets the value of the iloscOdbiorWPunkcieDo5Kg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIloscOdbiorWPunkcieDo5Kg(Integer value) {
        this.iloscOdbiorWPunkcieDo5Kg = value;
    }

    /**
     * Gets the value of the iloscPobranieOdbiorWPunkcieDo5Kg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIloscPobranieOdbiorWPunkcieDo5Kg() {
        return iloscPobranieOdbiorWPunkcieDo5Kg;
    }

    /**
     * Sets the value of the iloscPobranieOdbiorWPunkcieDo5Kg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIloscPobranieOdbiorWPunkcieDo5Kg(Integer value) {
        this.iloscPobranieOdbiorWPunkcieDo5Kg = value;
    }

    /**
     * Gets the value of the iloscStandardDo30Kg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIloscStandardDo30Kg() {
        return iloscStandardDo30Kg;
    }

    /**
     * Sets the value of the iloscStandardDo30Kg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIloscStandardDo30Kg(Integer value) {
        this.iloscStandardDo30Kg = value;
    }

    /**
     * Gets the value of the iloscPobranieDo30Kg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIloscPobranieDo30Kg() {
        return iloscPobranieDo30Kg;
    }

    /**
     * Sets the value of the iloscPobranieDo30Kg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIloscPobranieDo30Kg(Integer value) {
        this.iloscPobranieDo30Kg = value;
    }

    /**
     * Gets the value of the iloscOdbiorWPunkcieDo30Kg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIloscOdbiorWPunkcieDo30Kg() {
        return iloscOdbiorWPunkcieDo30Kg;
    }

    /**
     * Sets the value of the iloscOdbiorWPunkcieDo30Kg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIloscOdbiorWPunkcieDo30Kg(Integer value) {
        this.iloscOdbiorWPunkcieDo30Kg = value;
    }

    /**
     * Gets the value of the iloscPobranieOdbiorWPunkcieDo30Kg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIloscPobranieOdbiorWPunkcieDo30Kg() {
        return iloscPobranieOdbiorWPunkcieDo30Kg;
    }

    /**
     * Sets the value of the iloscPobranieOdbiorWPunkcieDo30Kg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIloscPobranieOdbiorWPunkcieDo30Kg(Integer value) {
        this.iloscPobranieOdbiorWPunkcieDo30Kg = value;
    }

    /**
     * Gets the value of the dataWaznosciUmowy property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataWaznosciUmowy() {
        return dataWaznosciUmowy;
    }

    /**
     * Sets the value of the dataWaznosciUmowy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataWaznosciUmowy(XMLGregorianCalendar value) {
        this.dataWaznosciUmowy = value;
    }

}
