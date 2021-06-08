package pl.com.infratex.ordermanager.web.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

import static pl.com.infratex.ordermanager.web.controller.ControllerConstants.ORDER_MANAGER_VIEW;

public class ShipmentConfirmationReportController {
    private static final Logger LOGGER = Logger.getLogger(ShipmentConfirmationReportController.class.getName());

    @GetMapping
    public String shipmentConfirmationReportsView(ModelMap model) {
        LOGGER.info("shipmentConfirmationReportsView(...)");

        return ORDER_MANAGER_VIEW;
    }
}
