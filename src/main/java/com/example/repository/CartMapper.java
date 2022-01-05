package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.Cart;

@Mapper
public interface CartMapper {
	
	//カートに追加（1件）
	public void addCart(Cart addCart);

	//カートの表示
	public List<Cart> showCart(Integer userId);
}
