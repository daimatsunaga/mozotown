package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Item;
import com.example.repository.ItemMapper;

@Service
public class ItemService {

	@Autowired
	private ItemMapper mapper;
	
	public List<Item> findAll() {
		return mapper.findAll();
	}
}
