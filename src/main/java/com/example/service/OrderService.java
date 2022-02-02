package com.example.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Order;
import com.example.repository.CartMapper;
import com.example.repository.OrderMapper;

import jp.pay.Payjp;
import jp.pay.model.Charge;

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
		
		//クレジットカードAPI
		if(order.getPaymentMethodId() == 2) {
	        Payjp.apiKey = "sk_test_dff77135059a6ff8b051cd7a";
	        Map<String, Object> chargeMap = new HashMap<String, Object>();
	        chargeMap.put("amount", order.getTotalPrice());
	        chargeMap.put("currency", "jpy");
	        chargeMap.put("card", order.getToken());
	        try {
	            Charge charge = Charge.create(chargeMap);
	            System.out.println(charge);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		}
        
		cartMapper.deleteByUserId(order.getUserId());
		cartService.sumOfCart();
	}
}
