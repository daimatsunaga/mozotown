package com.example.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Cart;
import com.example.domain.User;
import com.example.repository.CartMapper;

@Service
public class CartService {

	@Autowired
	private CartMapper mapper;
	@Autowired
	private HttpSession session;
	
	public void addCart(Cart addCart) {
		mapper.addCart(addCart);
		sumOfCart();
	}
	
	public List<Cart> showCart(Integer userId) {
		return mapper.showCart(userId);
	}
	
	public void deleteById(Integer id) {
		mapper.deleteById(id);
		sumOfCart();
	}
	
	public Integer CountInCart(Cart sertchCart) {
		return mapper.CountInCart(sertchCart);
	}
	
	public void updateQuantity(Cart updateCart) {
		mapper.updateQuantity(updateCart);
		sumOfCart();
	}
	/**
	 * セッションにカートの中身の数（quantity）の合計をセット
	 */
	public void sumOfCart() {
		User user = (User) session.getAttribute("user");
		Integer sumOfCart = mapper.sumCart(user.getId());
		session.setAttribute("sumOfCart", sumOfCart);
	}

}
