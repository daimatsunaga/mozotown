package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.domain.Item;

@Mapper
public interface ItemMapper {
	
	public List<Item> findAll();
	
	public Item findById(Integer id);
	
	public List<Item> findByShopId(Integer shopId);
	
	public List<Item> searchItems(@Param("keywordList")List<String> keywordList);

}
