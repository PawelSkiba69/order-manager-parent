package pl.com.infratex.ordermanager.service.enadawca;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.com.infratex.ordermanager.web.model.AddressModel;

import java.util.List;

import static java.util.Arrays.asList;

@SpringBootTest
class ENadawcaServiceTest {

    private static final long O_ID_1 = 1L;
    private static final long O_ID_2 = 2L;
    private static final long O_ID_3 = 3L;
    private static final String GUID_1 = "92ry298n9820";
    private static final String GUID_2 = "iuahe938dn24";
    private static final String GUID_3 = "1sry138nfs20";

    @Autowired
    private ENadawcaService eNadawcaService;

    @Test
    void send() {
    //given
        List<AddressModel> addresses = asList(
                AddressModel.builder().oId(O_ID_1).guid(GUID_1).build(),
                AddressModel.builder().oId(O_ID_2).guid(GUID_2).build(),
                AddressModel.builder().oId(O_ID_3).guid(GUID_3).build());
    // when
        eNadawcaService.send(addresses);
    // then

    }
}