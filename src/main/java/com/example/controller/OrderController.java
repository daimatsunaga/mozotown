package com.example.controller;

import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Cart;
import com.example.domain.Order;
import com.example.domain.User;
import com.example.form.OrderForm;
import com.example.service.CartService;
import com.example.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private OrderService orderService;

	@GetMapping("/toOrder")
	public String toOrder(Model model) {
		
		//セッションに保存しているユーザー情報を取得
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/user/toLogin";
		}
		
		List<Cart> cartList = cartService.showCart(user.getId());
		
		//カート内の商品の合計金額を計算
		Integer totalPrice = 0;
		for(Cart cart : cartList) {
			totalPrice += cart.getPrice() * cart.getQuantity();
		}
		model.addAttribute("cartList", cartList);
		model.addAttribute("totalPrice", totalPrice);
		return "order";
	}
	
	@SuppressWarnings("deprecation")
	@PostMapping("/confirm")
	public String orderConfirm(OrderForm form) {
		Order order = new Order();
		BeanUtils.copyProperties(form, order);
		
		//orderDateとorderTimeをtimestamp型に変換しorderドメインにセット
		Timestamp timestamp = new Timestamp(form.getDeliveryDate().getTime());
		timestamp.setHours(form.getDeliveryTime());
		order.setDeliveryDatetime(timestamp);
		
		orderService.orderConfirm(order);
		
		return "redirect:/order/finished";
	}
	
	@GetMapping("/finished")
	public String OrderFinished() {
		return "order_finished";
	}
}
