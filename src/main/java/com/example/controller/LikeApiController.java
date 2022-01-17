package com.example.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.LikesItem;
import com.example.domain.User;
import com.example.repository.LikeMapper;

@RestController
@RequestMapping("/like")
public class LikeApiController {
	
	@Autowired
	private LikeMapper mapper;
	@Autowired
	private HttpSession session;

	@PostMapping("/shop")
	public void likeShop(Integer userId, Integer shopId) {
		mapper.likeShop(userId, shopId);
	}
	
	@DeleteMapping("/shop")
	public void deleteLikeShop(Integer userId, Integer shopId, Model model) {
		mapper.deleteLikeShop(userId, shopId);
	}
	
	@PostMapping("/item")
	public void likeItem(Integer stockId) {
		LikesItem likeItem = mapper.serchStock(stockId);
		User user = (User) session.getAttribute("user");
		likeItem.setUserId(user.getId());
		mapper.likeItem(likeItem);
	}
}
