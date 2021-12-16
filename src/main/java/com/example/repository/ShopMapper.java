package com.example.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.Shop;

@Mapper
public interface ShopMapper {
	
	//ショップ情報取得（１件）
	public Shop findShop(Integer id);
}
