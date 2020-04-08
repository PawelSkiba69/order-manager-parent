package pl.com.infratex.ordermanager.integration.enadawca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ENadawcaCredentialsManagerTest {

    @Test
    void geteNadawcaCredentials() {
        //given
        ENadawcaCredentialsManager eNadawcaCredentialsManager=new ENadawcaCredentialsManager();

        //when
        ENadawcaCredentials eNadawcaCredentials = eNadawcaCredentialsManager.geteNadawcaCredentials();
        //then
        assertAll(
                () -> assertEquals("xyz",eNadawcaCredentials.getLogin(),"incorrect login"),
                () -> assertEquals("123",eNadawcaCredentials.getPassword(),"incorrect password")
        );
    }
}