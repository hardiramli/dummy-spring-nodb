package com.dummy.order.service;

import com.dummy.order.entity.Order;

public interface OrderService {

    Order save(Order order);

    Order getOrder(int id);

}