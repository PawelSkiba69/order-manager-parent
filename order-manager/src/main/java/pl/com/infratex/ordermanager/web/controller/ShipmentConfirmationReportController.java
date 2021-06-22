package pl.com.infratex.ordermanager.web.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.com.infratex.ordermanager.api.exception.ShipmentConfirmationReportException;
import pl.com.infratex.ordermanager.service.ShipmentConfirmationReportService;
import pl.com.infratex.ordermanager.web.model.ShipmentConfirmationReportModel;

import java.util.List;
import java.util.logging.Logger;

import static pl.com.infratex.ordermanager.web.controller.ControllerConstants.SHIPMENT_CONFIRMATION_REPORTS_URI;
import static pl.com.infratex.ordermanager.web.controller.ControllerConstants.SHIPMENT_CONFIRMATION_REPORTS_VIEW;

@Controller
@RequestMapping(value = SHIPMENT_CONFIRMATION_REPORTS_URI)
public class ShipmentConfirmationReportController {
    private static final Logger LOGGER = Logger.getLogger(ShipmentConfirmationReportController.class.getName());

    private final ShipmentConfirmationReportService shipmentConfirmationReportService;

    public ShipmentConfirmationReportController(ShipmentConfirmationReportService shipmentConfirmationReportService) {
        this.shipmentConfirmationReportService = shipmentConfirmationReportService;
    }

    @GetMapping
    public String shipmentConfirmationReportsView(ModelMap model) {
        LOGGER.info("shipmentConfirmationReportsView(...)");
        List<ShipmentConfirmationReportModel> shipmentConfirmationReports = shipmentConfirmationReportService.list();
        model.addAttribute("shipmentConfirmationReports", shipmentConfirmationReports);
        return SHIPMENT_CONFIRMATION_REPORTS_VIEW;
    }

    @GetMapping(value = "/download/{fileId}", produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public ResponseEntity<byte[]> download(@PathVariable(name = "fileId") Long id) throws ShipmentConfirmationReportException {
        LOGGER.info("download(" + id + ")");
        ShipmentConfirmationReportModel shipmentConfirmationReportModel = shipmentConfirmationReportService.read(id);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        String filename = "output_" + id + ".txt";
        headers.setContentDispositionFormData(filename, filename);
        headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
        ResponseEntity<byte[]> response = new ResponseEntity<>(shipmentConfirmationReportModel.getFile(), headers, HttpStatus.OK);
        return response;
    }
}
