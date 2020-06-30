package pl.com.infratex.ordermanager.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.com.infratex.ordermanager.web.model.OrderModel;

import javax.persistence.GeneratedValue;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @GetMapping("/unshipped/oldest")
    public OrderModel oldest(){
        return null;
    }
}
