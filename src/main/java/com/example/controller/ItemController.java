package com.example.controller;

import java.util.Arrays;
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
//		service.findAll().forEach(i -> System.out.println(i));
		List<Item> itemList = service.findAll();
		model.addAttribute("itemList", itemList);
		return "top_page";
	}
	
	@GetMapping("/detail")
	public String itemDetail(Integer id, Model model) {
		Item item = service.findById(id);
		model.addAttribute("item", item);
		return "item_detail";
	}
	
	@GetMapping("/search")
	public String searchItems(String keyword, Model model) {
		String[] keywords = keyword.replace("　", " ").replaceAll("\\s{2,}", " ").trim().split(" ");
		List<String> keywordList = Arrays.asList(keywords);
		List<Item> itemList = service.searchItems(keywordList);
		if(itemList == null) {
			model.addAttribute("error", "該当の商品はございません。");
		} else {
			model.addAttribute("itemList", itemList);
		}
		return "top_page";
	}
}