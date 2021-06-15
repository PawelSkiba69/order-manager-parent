package pl.com.infratex.ordermanager.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
