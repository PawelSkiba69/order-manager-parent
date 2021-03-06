package pl.com.infratex.ordermanager.service.generator.report;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.OrderReportModel;
import pl.com.infratex.ordermanager.web.model.coverter.OrderModelConverter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Component
public class PackingSlipAddressPdfReportGenerator {

    private static final Logger LOGGER = Logger.getLogger(PackingSlipAddressPdfReportGenerator.class.getName());

    //FIXME: custom exceptions
    public OutputStream generatePdf(List<OrderModel> orders, String jasperReportFileName) throws JRException, IOException {

        ClassPathResource classPathResource = new ClassPathResource("reports/" + jasperReportFileName);
        InputStream orderReportStream = classPathResource.getInputStream();
        JasperReport jasperReport = JasperCompileManager.compileReport(orderReportStream);

        List<OrderReportModel> orderReportModels=new ArrayList<>();
        for (OrderModel order:orders) {
            orderReportModels.add(new OrderReportModel(order));
        }

        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(orderReportModels);

        Map<String, Object> parameters = new HashMap<>();

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        JasperExportManager.exportReportToPdfFile(jasperPrint, "order-manager/src/main/resources/template.pdf");
        OutputStream outputStream = new ByteArrayOutputStream();
        JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
        return outputStream;
    }
}
