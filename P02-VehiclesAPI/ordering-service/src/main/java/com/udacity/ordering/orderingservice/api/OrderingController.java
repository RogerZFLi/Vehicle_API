package com.udacity.ordering.orderingservice.api;

import com.udacity.ordering.orderingservice.order.Order;
import com.udacity.ordering.orderingservice.service.OrderException;
import com.udacity.ordering.orderingservice.service.OrderingService;
import com.udacity.pricing.service.PriceException;
import com.udacity.pricing.service.PricingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

/**
 * Implements a REST-based controller for the pricing service.
 */
@RestController
@RequestMapping("/services/price")
public class OrderingController {

    private OrderingService orderingService;
    public OrderingController(OrderingService orderingService){
        this.orderingService = orderingService;
    }
    @GetMapping
    public Order get(@RequestParam Long vehicleId) {
        try {
            return orderingService.get(vehicleId);
        } catch (OrderException ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Price Not Found", ex);
        }

    }
    //To remove the price assigned to the vehicle to be removed
    @DeleteMapping ("/id")
    public void delete(@RequestParam Long vehicleId) throws PriceException {
        try {
            PricingService.deletePrice(vehicleId);
        } catch (PriceException ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Price Not Found", ex);
        }

    }

}
