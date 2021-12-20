package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Item;
import com.example.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService service;
	
	@GetMapping("")
	public String toTopPage(Model model) {
		service.findAll().forEach(i -> System.out.println(i));
		List<Item> itemList = service.findAll();
		model.addAttribute("itemList", itemList);
		return "top_page";
	}
	
	@GetMapping("/detail")
	public String itemDetail(Integer id, Model model) {
		Item item = service.findById(id);
		System.out.println(service.findById(1));
		model.addAttribute("item", item);
		return "item_detail";
	}
}