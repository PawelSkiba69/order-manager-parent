package pl.com.infratex.ordermanager.dao.utils;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SequenceIdGeneratorTest {
    @Autowired
    private SequenceIdGenerator sequenceIdGenerator;

    @Test
    void generateId() {
//        given
//        when
        Integer generateId = sequenceIdGenerator.generateId();
        System.out.println(generateId);
//        then
    }
}