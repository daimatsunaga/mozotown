package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Order;
import com.example.repository.CartMapper;
import com.example.repository.OrderMapper;

@Service
public class OrderService {

	@Autowired
	private OrderMapper orderMapper;
	
	@Autowired
	private CartMapper cartMapper;

	@Autowired
	private CartService cartService;
	
	public void orderConfirm(Order order) {
		orderMapper.orderConfirm(order);
		cartMapper.deleteByUserId(order.getUserId());
		cartService.sumOfCart();
	}
}
