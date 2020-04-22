package pl.com.infratex.ordermanager.service.enadawca;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.com.infratex.ordermanager.web.model.AddressModel;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import static java.util.Arrays.asList;

@SpringBootTest
class ENadawcaServiceTest {

    private static final long O_ID_1 = 1L;
    private static final long O_ID_2 = 2L;
    private static final long O_ID_3 = 3L;
    private static final String GUID_1 = "7BBA92F56D7D30DFD9BACD6FC8D61560";
    private static final String GUID_2 = "7D9757C5EC1B6FBB0D35382B0A8E5433";
    private static final String GUID_3 = "16C3680EBA194523F528504A4449288D";
    private static final String NAZWA_1 = "Andrzej";
    private static final String NAZWA_2 = "Mariusz";
    private static final String NAZWA_3 = "Krysztof";
    private static final String ULICA_1 = "PIERWSZA 1";
    private static final String ULICA_2 = "DRUGA 2";
    private static final String ULICA_3 = "TRZECIA 3";
    private static final String KOD_1= "11111";
    private static final String KOD_2 = "22222";
    private static final String KOD_3 = "33333";
    private static final String MIASTO_1= "JEDYNKOW";
    private static final String MIASTO_2= "DWOJKOW";
    private static final String MIASTO_3 = "TROJKOW";
    private static final String KRAJ= "NIEMCY";

    @Autowired
    private ENadawcaService eNadawcaService;

    @Test
    void send() {
    //given
        List<AddressModel> addresses = asList(
                AddressModel.builder().oId(O_ID_1).guid(GUID_1).recipientName(NAZWA_1).shipAddress2(ULICA_1)
                        .shipPostalCode(KOD_1).shipCity(MIASTO_1).shipCountry(KRAJ).build(),
                AddressModel.builder().oId(O_ID_2).guid(GUID_2).recipientName(NAZWA_2).shipAddress2(ULICA_2)
                        .shipPostalCode(KOD_2).shipCity(MIASTO_2).shipCountry(KRAJ).build(),
                AddressModel.builder().oId(O_ID_3).guid(GUID_3).recipientName(NAZWA_3).shipAddress2(ULICA_3)
                        .shipPostalCode(KOD_3).shipCity(MIASTO_3).shipCountry(KRAJ).build());
    // when
        eNadawcaService.send(addresses, LocalDate.now());
    // then

    }
}