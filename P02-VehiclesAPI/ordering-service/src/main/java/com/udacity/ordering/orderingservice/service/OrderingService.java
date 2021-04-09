package com.udacity.ordering.orderingservice.service;

import com.udacity.ordering.orderingservice.order.Order;
import com.udacity.ordering.orderingservice.order.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class OrderingService {
    @Autowired
    private OrderRepository orderRepository;

    public Order findByVehicleId(Long vehicleId) throws OrderException {

        List<Order> orders = orderRepository.findAll();
        for(Order order : orders){
            if(order.getVehicleId() == vehicleId)
                return order;
        }
        throw new OrderException("Order not found");
    }

    public Order save(Order order) {
        if(order.getId() != null){
            return orderRepository.findById(order.getId())
                    .map(orderToBeUpdated->{


                    });
        }
    }


}
