
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terminRodzajPlusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="terminRodzajPlusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PORANEK"/&gt;
 *     &lt;enumeration value="POLUDNIE"/&gt;
 *     &lt;enumeration value="STANDARD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
