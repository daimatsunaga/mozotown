package com.example.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.Cart;

@Mapper
public interface CartMapper {
	
	//カートに追加（1件）
	public void addCart(Cart addCart);

}
