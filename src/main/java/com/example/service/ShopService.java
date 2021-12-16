package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Shop;
import com.example.repository.ShopMapper;

@Service
public class ShopService {

	@Autowired ShopMapper mapper;
	
	public Shop findShop(Integer id) {
		return mapper.findShop(id);
	}
	
}
