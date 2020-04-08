
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrintKindEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrintKindEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADDRESS_LABEL"/&gt;
 *     &lt;enumeration value="CUSTOMS_DECLARATION"/&gt;
 *     &lt;enumeration value="ADDRESS_LABEL_FOR_RETURN_DOCUMENTS"/&gt;
 *     &lt;enumeration value="CHECKLIST"/&gt;
 *     &lt;enumeration value="COLLECT_ON_DELIVERY_FORM"/&gt;
 *     &lt;enumeration value="WAYBILL"/&gt;
 *     &lt;enumeration value="REPORT"/&gt;
 *     &lt;enumeration value="ADDRESS_LABEL_FOR_ERETURN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PrintKindEnum")
@XmlEnum
public enum PrintKindEnum {

    ADDRESS_LABEL,
    CUSTOMS_DECLARATION,
    ADDRESS_LABEL_FOR_RETURN_DOCUMENTS,
    CHECKLIST,
    COLLECT_ON_DELIVERY_FORM,
    WAYBILL,
    REPORT,
    ADDRESS_LABEL_FOR_ERETURN;

    public String value() {
        return name();
    }

    public static PrintKindEnum fromValue(String v) {
        return valueOf(v);
    }

}
