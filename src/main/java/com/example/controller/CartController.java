package com.example.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Cart;
import com.example.form.CartForm;
import com.example.service.CartService;

@Controller
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartService service;
	
	@GetMapping("")
	public String toCart() {
		return "cart";
	}
	
	@PostMapping("/add") 
	public String addCart(CartForm form) {
		Cart cart = new Cart();
		BeanUtils.copyProperties(form, cart);
		service.addCart(cart);
		return "redirect:/cart";
	}
}
