package pl.com.infratex.ordermanager.service.enadawca;

import org.springframework.stereotype.Service;
import pl.com.infratex.ordermanager.dao.utils.SequenceIdGenerator;
import pl.com.infratex.ordermanager.integration.enadawca.ENadawcaManager;
import pl.com.infratex.ordermanager.integration.enadawca.exception.ENadawcaException;
import pl.com.infratex.ordermanager.service.mapper.ENadawcaMapper;
import pl.com.infratex.ordermanager.web.model.AddressModel;
import pl.poczta_polska.e_nadawca.PrzesylkaType;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Logger;

import static pl.com.infratex.ordermanager.dao.utils.SequenceIdGenerator.ENADAWCA_BUFOR_ID_SEQ;

@Service
public class ENadawcaService {

    private static final Logger LOGGER = Logger.getLogger(ENadawcaService.class.getName());

    private ENadawcaMapper eNadawcaMapper;
    private SequenceIdGenerator sequenceIdGenerator;

    public ENadawcaService(ENadawcaMapper eNadawcaMapper, SequenceIdGenerator sequenceIdGenerator) {
        this.eNadawcaMapper = eNadawcaMapper;
        this.sequenceIdGenerator = sequenceIdGenerator;
    }

    public void send(List<AddressModel> addresses, LocalDate sendDate) {
        GregorianCalendar dataNadania = new GregorianCalendar();
        dataNadania.setTime(Date.from(sendDate.atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant()));
        ENadawcaManager eNadawcaManager= new ENadawcaManager();
        //FIXME rzucić wyjątek biznesowy
        try {
            Integer generateId = sequenceIdGenerator.generateId(ENADAWCA_BUFOR_ID_SEQ);
            eNadawcaManager.elektronicznyNadawcaProperties(dataNadania, generateId,
                    "Amazon"+ dataNadania.toZonedDateTime().format(DateTimeFormatter.BASIC_ISO_DATE));
            List<PrzesylkaType> przesylkaTypes = eNadawcaMapper.shipmentsSet(addresses);
            eNadawcaManager.addShipment(przesylkaTypes, generateId);
            LOGGER.info("####GeneratedID= "+generateId);
            LOGGER.info("####BuforName= "+"Amazon_"+dataNadania.toZonedDateTime().format(DateTimeFormatter.BASIC_ISO_DATE));
        } catch (ENadawcaException e) {
            e.printStackTrace();
        }

    }


}
