package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.repository.LikeMapper;

@RestController
@RequestMapping("/like")
public class LikeApiController {
	
	@Autowired
	private LikeMapper mapper;

	@PostMapping("/shop")
	public void likeShop(Integer userId, Integer shopId) {
		mapper.likeShop(userId, shopId);
	}
	
}
