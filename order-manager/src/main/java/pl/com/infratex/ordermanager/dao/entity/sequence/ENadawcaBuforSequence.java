package pl.com.infratex.ordermanager.dao.entity.sequence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import static pl.com.infratex.ordermanager.dao.utils.SequenceIdGenerator.ENADAWCA_BUFOR_ID_SEQ;

@Entity
public class ENadawcaBuforSequence {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ENADAWCA_BUFOR_ID_GENERATOR")
    @SequenceGenerator(name = "ENADAWCA_BUFOR_ID_GENERATOR", sequenceName = ENADAWCA_BUFOR_ID_SEQ,allocationSize = 1)
    private Integer id;
}
