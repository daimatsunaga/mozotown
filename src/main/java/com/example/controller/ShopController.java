package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Shop;
import com.example.service.ShopService;

@Controller
@RequestMapping("/shop")
public class ShopController {
	
	@Autowired 
	private ShopService service;

	
	@GetMapping("/detail")
	public String shopDetail(Integer id, Model model) {
		Shop shop = service.findShop(id);
		model.addAttribute("shop", shop);
		return "shop_detail";
	}
}
