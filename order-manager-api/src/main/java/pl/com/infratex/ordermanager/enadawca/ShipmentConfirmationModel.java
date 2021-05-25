package pl.com.infratex.ordermanager.enadawca;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShipmentConfirmationModel {
    // PrzesylkaShortType
    /** tracking-number - numerNadania */
    private String numerNadania;
    private String guid;
    /** ship-date - dataNadania */
    private LocalDate dataNadania;
    private ShipmentConfirmationStatusType status;

    // pozostałe
    private String orderId;
    private String orderItemId;
    private String quantity;
    private String carrierCode;
    private String carrierName;
    private String shipMethod;

    //techniczne
    private Long oId;
}
