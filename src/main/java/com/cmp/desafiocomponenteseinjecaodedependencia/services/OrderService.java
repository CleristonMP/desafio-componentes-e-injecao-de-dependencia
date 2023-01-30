package com.cmp.desafiocomponenteseinjecaodedependencia.services;

import com.cmp.desafiocomponenteseinjecaodedependencia.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        return order.getBasic() - (order.getDiscount() * order.getBasic() / 100.0) + shippingService.shipment(order);
    }
}
