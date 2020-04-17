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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Logger;

@Service
public class ENadawcaService {

    private static final Logger LOGGER = Logger.getLogger(ENadawcaService.class.getName());

    private ENadawcaMapper eNadawcaMapper;
    private SequenceIdGenerator sequenceIdGenerator;

    public ENadawcaService(ENadawcaMapper eNadawcaMapper, SequenceIdGenerator sequenceIdGenerator) {
        this.eNadawcaMapper = eNadawcaMapper;
        this.sequenceIdGenerator = sequenceIdGenerator;
    }

    public void send(List<AddressModel> addresses, String sendDate) {
        GregorianCalendar dataNadania = format(sendDate);
        ENadawcaManager eNadawcaManager= new ENadawcaManager();
        //FIXME rzucić wyjątek biznesowy
        try {
            Integer generateId = sequenceIdGenerator.generateId();
            eNadawcaManager.elektronicznyNadawcaProperties(dataNadania, generateId,"Amazon"+format(dataNadania));
            List<PrzesylkaType> przesylkaTypes = eNadawcaMapper.shipmentsSet(addresses);
            eNadawcaManager.addShipment(przesylkaTypes, generateId);
            LOGGER.info("####GeneratedID= "+generateId);
            LOGGER.info("####BuforName= "+"Amazon_"+format(dataNadania));
        } catch (ENadawcaException e) {
            e.printStackTrace();
        }

    }

    public static String format(GregorianCalendar calendar) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        fmt.setCalendar(calendar);
        String dateFormatted = fmt.format(calendar.getTime());
        return dateFormatted;
    }

    public static GregorianCalendar format(String data)  {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date date = null;
        GregorianCalendar calendar=new GregorianCalendar();
        try {
            date = df.parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        LOGGER.info("####date= "+date);
        calendar.setTime(date);
        return calendar;
    }

}
