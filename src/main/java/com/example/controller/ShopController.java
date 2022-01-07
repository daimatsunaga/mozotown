package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Item;
import com.example.domain.Shop;
import com.example.domain.User;
import com.example.repository.LikeMapper;
import com.example.service.ItemService;
import com.example.service.ShopService;

@Controller
@RequestMapping("/shop")
public class ShopController {
	
	@Autowired 
	private ShopService shopService;
	@Autowired
	private ItemService itemService;
	@Autowired
	private LikeMapper mapper;
	@Autowired
	private HttpSession session;

	
	@GetMapping("/detail")
	public String shopDetail(Integer id, Model model) {
		Shop shop = shopService.findShop(id);
		List<Item> itemList = itemService.findByShopId(id);
		
		User user = (User) session.getAttribute("user");
		
		//お気に入りに登録しているお店かチェックする 0 = 登録していない、　1 = 登録ずみ
		Integer likes = 0;
		if(user != null && mapper.serchLikeShop(user.getId(), id) != null) {
			likes = 1;
		}
		model.addAttribute("likes", likes);
		model.addAttribute("shop", shop);
		model.addAttribute("itemList", itemList);
		return "shop_detail";
	}
}
