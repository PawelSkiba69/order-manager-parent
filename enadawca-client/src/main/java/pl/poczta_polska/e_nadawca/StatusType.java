
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NIEPOTWIERDZONA"/&gt;
 *     &lt;enumeration value="POTWIERDZONA"/&gt;
 *     &lt;enumeration value="NOWA"/&gt;
 *     &lt;enumeration value="BRAK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusType")
@XmlEnum
public enum StatusType {

    NIEPOTWIERDZONA,
    POTWIERDZONA,
    NOWA,
    BRAK;

    public String value() {
        return name();
    }

    public static StatusType fromValue(String v) {
        return valueOf(v);
    }

}
