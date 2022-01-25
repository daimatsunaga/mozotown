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
	
	public Item findById(Integer id) {
		return mapper.findById(id);
	}
	
	public List<Item> findByShopId(Integer id) {
		return mapper.findByShopId(id);
	}
	
	public List<Item> searchItems(List<String> keywordList) {
		try {
			List<Item> itemList = mapper.searchItems(keywordList);
			if(itemList.size() == 0) {
				return null;
			} else {
				return itemList;
			}
		} catch (Exception e) {
			return null;
		}
	}
}
