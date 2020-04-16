package pl.com.infratex.ordermanager.dao.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import pl.com.infratex.ordermanager.service.OrderManagerService;

import javax.sql.DataSource;
import java.util.logging.Logger;

@Component
public class SequenceIdGenerator {

    private static final Logger LOGGER = Logger.getLogger(SequenceIdGenerator.class.getName());

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Integer generateId() {
        String sql = "SELECT NEXTVAL ('ENADAWCA_BUFOR_ID_SEQ')";
        return jdbcTemplate.queryForObject(sql, new Object[] {}, Integer.class);
    }
}
