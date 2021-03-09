
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for terminRodzajPlusType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="terminRodzajPlusType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="PORANEK"/&amp;gt;
 *     &amp;lt;enumeration value="POLUDNIE"/&amp;gt;
 *     &amp;lt;enumeration value="STANDARD"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "terminRodzajPlusType")
@XmlEnum
public enum TerminRodzajPlusType {

    PORANEK,
    POLUDNIE,
    STANDARD;

    public String value() {
        return name();
    }

    public static TerminRodzajPlusType fromValue(String v) {
        return valueOf(v);
    }

}
