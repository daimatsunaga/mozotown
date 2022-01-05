package com.example.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@PostMapping("")
	public String toCart(Model model, Integer userId) {
		if(userId == null) {
			return "redirect:/user/toLogin";
		}
		
		List<Cart> cartList = service.showCart(userId);
//		service.showCart(1).forEach(i -> System.out.println(userId));
		
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
