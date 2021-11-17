package pl.com.infratex.ordermanager.dao.entity.sequence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import static pl.com.infratex.ordermanager.dao.utils.SequenceIdGenerator.MERCHANT_FULFILLMENT_ORDER_ID_SEQ;

@Entity
public class MultiChannelFulfillmentIdSequence {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MERCHANT_FULFILLMENT_ORDER_ID_GENERATOR")
    @SequenceGenerator(name = "MERCHANT_FULFILLMENT_ORDER_ID_GENERATOR", sequenceName = MERCHANT_FULFILLMENT_ORDER_ID_SEQ, allocationSize = 1)
    private Integer id;
}
