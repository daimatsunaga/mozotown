package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Item;
import com.example.domain.Shop;
import com.example.service.ItemService;
import com.example.service.ShopService;

@Controller
@RequestMapping("/shop")
public class ShopController {
	
	@Autowired 
	private ShopService shopService;
	@Autowired
	private ItemService itemService;

	
	@GetMapping("/detail")
	public String shopDetail(Integer id, Model model) {
		Shop shop = shopService.findShop(id);
		List<Item> itemList = itemService.findByShopId(id);
		model.addAttribute("shop", shop);
		model.addAttribute("itemList", itemList);
		return "shop_detail";
	}
}
