
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sposobPrzekazaniaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="sposobPrzekazaniaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LIST_ZWYKLY_PRIOTYTET"/&gt;
 *     &lt;enumeration value="POCZTEX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "sposobPrzekazaniaType")
@XmlEnum
public enum SposobPrzekazaniaType {

    LIST_ZWYKLY_PRIOTYTET,
    POCZTEX;

    public String value() {
        return name();
    }

    public static SposobPrzekazaniaType fromValue(String v) {
        return valueOf(v);
    }

}
