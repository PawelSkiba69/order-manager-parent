package pl.com.infratex.ordermanager.dao.entity.sequence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import static pl.com.infratex.ordermanager.dao.utils.SequenceIdGenerator.ORDER_BATCH_ID_SEQ;

@Entity
public class OrderBatchSequence {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORDER_BATCH_ID_GENERATOR")
    @SequenceGenerator(name = "ORDER_BATCH_ID_GENERATOR", sequenceName = ORDER_BATCH_ID_SEQ, allocationSize = 1)
    private Integer id;
}
