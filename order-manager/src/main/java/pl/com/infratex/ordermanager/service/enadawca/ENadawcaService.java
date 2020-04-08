package pl.com.infratex.ordermanager.service.enadawca;

import org.springframework.stereotype.Service;
import pl.com.infratex.ordermanager.integration.enadawca.ENadawcaManager;
import pl.com.infratex.ordermanager.integration.enadawca.exception.ENadawcaException;
import pl.com.infratex.ordermanager.service.mapper.ENadawcaMapper;
import pl.com.infratex.ordermanager.web.model.AddressModel;
import pl.poczta_polska.e_nadawca.PrzesylkaType;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Logger;

@Service
public class ENadawcaService {

    private static final Logger LOGGER = Logger.getLogger(ENadawcaService.class.getName());
    public static final int ID_BUFOR = 999;

    private ENadawcaMapper eNadawcaMapper;

    public ENadawcaService(ENadawcaMapper eNadawcaMapper) {
        this.eNadawcaMapper = eNadawcaMapper;
    }

    public void send(List<AddressModel> addresses) {
        GregorianCalendar dataNadania = new GregorianCalendar(2020, Calendar.APRIL, 15);
        ENadawcaManager eNadawcaManager= new ENadawcaManager();
        //FIXME rzucić wyjątek biznesowy
        try {
            eNadawcaManager.elektronicznyNadawcaProperties(dataNadania, ID_BUFOR,"ZBIOR");
            List<PrzesylkaType> przesylkaTypes = eNadawcaMapper.shipmentsSet(addresses);
            eNadawcaManager.addShipment(przesylkaTypes, ID_BUFOR);
        } catch (ENadawcaException e) {
            e.printStackTrace();
        }

    }


}
