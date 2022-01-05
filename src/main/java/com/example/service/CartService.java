package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Cart;
import com.example.repository.CartMapper;

@Service
public class CartService {

	@Autowired
	private CartMapper mapper;
	
	public void addCart(Cart addCart) {
		mapper.addCart(addCart);
	}
	
	public List<Cart> showCart(Integer userId) {
		return mapper.showCart(userId);
	}
}
