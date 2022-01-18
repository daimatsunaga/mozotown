package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Order;
import com.example.repository.OrderMapper;

@Service
public class OrderService {

	@Autowired
	private OrderMapper mapper;
	
	public void orderConfirm(Order order) {
		mapper.orderConfirm(order);
	}
}
