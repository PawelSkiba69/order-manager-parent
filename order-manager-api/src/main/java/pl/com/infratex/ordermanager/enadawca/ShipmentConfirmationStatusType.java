
package pl.com.infratex.ordermanager.enadawca;

public enum ShipmentConfirmationStatusType {

    NIEPOTWIERDZONA,
    POTWIERDZONA,
    NOWA,
    BRAK;

    public String value() {
        return name();
    }

    public static ShipmentConfirmationStatusType fromValue(String v) {
        return valueOf(v);
    }

}
