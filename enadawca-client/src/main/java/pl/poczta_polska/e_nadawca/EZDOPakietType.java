
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for EZDOPakietType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EZDOPakietType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="idEZDOPakiet" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="exported" type="{http://www.w3.org/2001/XMLSchema}date" /&amp;gt;
 *       &amp;lt;attribute name="idEZDOFile" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EZDOPakietType")
public class EZDOPakietType {

    @XmlAttribute(name = "idEZDOPakiet")
    protected Integer idEZDOPakiet;
    @XmlAttribute(name = "exported")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exported;
    @XmlAttribute(name = "idEZDOFile")
    protected String idEZDOFile;

    /**
     * Gets the value of the idEZDOPakiet property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdEZDOPakiet() {
        return idEZDOPakiet;
    }

    /**
     * Sets the value of the idEZDOPakiet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdEZDOPakiet(Integer value) {
        this.idEZDOPakiet = value;
    }

    /**
     * Gets the value of the exported property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExported() {
        return exported;
    }

    /**
     * Sets the value of the exported property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExported(XMLGregorianCalendar value) {
        this.exported = value;
    }

    /**
     * Gets the value of the idEZDOFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEZDOFile() {
        return idEZDOFile;
    }

    /**
     * Sets the value of the idEZDOFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEZDOFile(String value) {
        this.idEZDOFile = value;
    }

}
