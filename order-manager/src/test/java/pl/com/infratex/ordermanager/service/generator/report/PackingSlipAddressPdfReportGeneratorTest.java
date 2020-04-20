package pl.com.infratex.ordermanager.service.generator.report;

import net.sf.jasperreports.engine.JRException;
import org.junit.jupiter.api.Test;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.SellerOrderReportModel;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

class PackingSlipAddressPdfReportGeneratorTest {

    @Test
    void generatePdf() throws JRException, IOException {

        SellerOrderReportModel sellerOrderReportModel = new SellerOrderReportModel();
        sellerOrderReportModel.setOrders(
                Arrays.asList(
                        new OrderModel(1L, "111", BigDecimal.valueOf(11L), LocalDateTime.now(),
                                2,BigDecimal.valueOf(3.99),"EUR"),
                        new OrderModel(2L, "222", BigDecimal.valueOf(12L),LocalDateTime.now(),
                                5,BigDecimal.valueOf(4.99),"GBP"),
                        new OrderModel(3L, "333", BigDecimal.valueOf(13L),LocalDateTime.now(),
                                1,BigDecimal.valueOf(4.99),"EUR")
                )
        );
        PackingSlipAddressPdfReportGenerator pdfReportGenerator = new PackingSlipAddressPdfReportGenerator();
        List<OrderModel> orders = sellerOrderReportModel.getOrders();

        try (ByteArrayOutputStream outputStream = (ByteArrayOutputStream) pdfReportGenerator.generatePdf(orders, "template.jrxml");
             FileOutputStream fileOutputStream = new FileOutputStream("stream-template.pdf")) {
            outputStream.writeTo(fileOutputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}