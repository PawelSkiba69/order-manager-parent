
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrintMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrintMethodEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EACH_PARCEL_SEPARATELY"/&gt;
 *     &lt;enumeration value="ALL_PARCELS_IN_ONE_FILE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PrintMethodEnum")
@XmlEnum
public enum PrintMethodEnum {

    EACH_PARCEL_SEPARATELY,
    ALL_PARCELS_IN_ONE_FILE;

    public String value() {
        return name();
    }

    public static PrintMethodEnum fromValue(String v) {
        return valueOf(v);
    }

}
