package com.example.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String toCart(Model model) {
		List<Cart> cartList = service.showCart(1);
		service.showCart(1).forEach(i -> System.out.println(i));
		
		//カート内の商品の合計金額を計算
		Integer totalPrice = 0;
		for(Cart cart : cartList) {
			totalPrice += cart.getPrice();
		}
		model.addAttribute("cartList", cartList);
		model.addAttribute("totalPrice", totalPrice);
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
