
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eZwrotTypZgodyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="eZwrotTypZgodyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ZGODA_BRAK"/&gt;
 *     &lt;enumeration value="ZGODA_AUTOMATYCZNA"/&gt;
 *     &lt;enumeration value="ZGODA_INDYWIDUALNA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "eZwrotTypZgodyType")
@XmlEnum
public enum EZwrotTypZgodyType {

    ZGODA_BRAK,
    ZGODA_AUTOMATYCZNA,
    ZGODA_INDYWIDUALNA;

    public String value() {
        return name();
    }

    public static EZwrotTypZgodyType fromValue(String v) {
        return valueOf(v);
    }

}
