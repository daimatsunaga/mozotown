package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Cart;
import com.example.domain.User;
import com.example.form.CartForm;
import com.example.service.CartService;

@Controller
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartService service;
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String toCart(Model model) {
		//セッションに保存しているユーザー情報を取得
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/user/toLogin";
		}
		
		List<Cart> cartList = service.showCart(user.getId());
		
		//カート内の商品の合計金額を計算
		Integer totalPrice = 0;
		for(Cart cart : cartList) {
			totalPrice += cart.getPrice();
		}
		model.addAttribute("cartList", cartList);
		model.addAttribute("totalPrice", totalPrice);
		System.out.println(cartList);
		return "cart";
	}
	
	@PostMapping("/add") 
	public String addCart(CartForm form) {
		//ログインしていない場合にはログイン画面に遷移
		if(form.getUserId() == null) {
			return "redirect:/user/toLogin";
		}
		
		Cart cart = new Cart();
		BeanUtils.copyProperties(form, cart);
		//カート内に同一商品があれば、update文を実行
		if(service.CountInCart(cart) == null) {
			service.addCart(cart);
		} else {
			service.updateQuantity(cart);
		}
		return "redirect:/cart";
	}
	
	@PostMapping("/delete")
	public String deleteCart(Integer id) {
		service.deleteById(id);
		return "redirect:/cart";
	}
}
