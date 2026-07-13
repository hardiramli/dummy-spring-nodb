package com.dummy.order.service.impl;

import com.dummy.order.service.OrderService;
import com.dummy.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepo;
	
	@Override
	public Order save(Order order){
		orderRepo.save(order);
		return order;
	}
	
	@Override
	public Order getOrder(int id){
		orderRepo.get(id);
		return order;
	}
	
}
