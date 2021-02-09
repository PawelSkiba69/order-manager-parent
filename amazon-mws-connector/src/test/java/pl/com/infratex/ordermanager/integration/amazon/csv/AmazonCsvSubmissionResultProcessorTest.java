package pl.com.infratex.ordermanager.integration.amazon.csv;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import pl.com.infratex.ordermanager.integration.amazon.csv.model.AmazonCsvSubmissionResultModel;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AmazonCsvSubmissionResultProcessorTest {

    @Test
    void givenErrorCsvFile_whenProcessResult_thenResultModelListIsNotEmpty() throws IOException {
        //GIVEN
        ClassPathResource classPathResource = new ClassPathResource("csv/amazon/feedSubmissionResultERROR.csv");
        InputStream inputStream = classPathResource.getInputStream();

        ByteArrayOutputStream processingResult = new ByteArrayOutputStream();
        IOUtils.copy(inputStream, processingResult);
        AmazonCsvSubmissionResultProcessor amazonCsvSubmissionResultProcessor = new AmazonCsvSubmissionResultProcessor();

        //WHEN
        List<AmazonCsvSubmissionResultModel> amazonCsvSubmissionResultModels =
                amazonCsvSubmissionResultProcessor.processResult(processingResult);

        //THEN
        assertTrue(amazonCsvSubmissionResultModels.size() > 0, "Lista jest pusta");

    }

    @Test
    void givenWarningCsvFile_whenProcessResult_thenResultModelListIsNotEmpty() throws IOException {
        //GIVEN
        ClassPathResource classPathResource = new ClassPathResource("csv/amazon/feedSubmissionResultWARNING.csv");
        InputStream inputStream = classPathResource.getInputStream();

        ByteArrayOutputStream processingResult = new ByteArrayOutputStream();
        IOUtils.copy(inputStream, processingResult);
        AmazonCsvSubmissionResultProcessor amazonCsvSubmissionResultProcessor =
                new AmazonCsvSubmissionResultProcessor();

        //WHEN
        List<AmazonCsvSubmissionResultModel> amazonCsvSubmissionResultModels =
                amazonCsvSubmissionResultProcessor.processResult(processingResult);

        //THEN
        assertTrue(amazonCsvSubmissionResultModels.size() > 0, "Lista jest pusta");

    }

    @Test
    void givenOkCsvFile_whenProcessResult_thenResultModelListIsEmpty() throws IOException {
        //GIVEN
        ClassPathResource classPathResource = new ClassPathResource("csv/amazon/feedSubmissionResultOK.csv");
        InputStream inputStream = classPathResource.getInputStream();

        ByteArrayOutputStream processingResult = new ByteArrayOutputStream();
        IOUtils.copy(inputStream, processingResult);
        AmazonCsvSubmissionResultProcessor amazonCsvSubmissionResultProcessor = new AmazonCsvSubmissionResultProcessor();

        //WHEN
        List<AmazonCsvSubmissionResultModel> amazonCsvSubmissionResultModels =
                amazonCsvSubmissionResultProcessor.processResult(processingResult);

        //THEN
        assertTrue(amazonCsvSubmissionResultModels.size() == 0, "Lista nie jest pusta");

    }
}