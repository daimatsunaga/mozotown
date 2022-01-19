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
	
	//カート内の商品削除
	public void deleteById(Integer id);
	
	//カート内の商品検索
	public Integer CountInCart(Cart sertchCart);
	
	//カート内に同じ評品があった場合、数（quantity）を1増やす。
	public void updateQuantity(Cart updateCart);
	
	//カート内の商品数
	public Integer sumCart(Integer userId);
	
	//注文後カートの中身を削除
	public void deleteByUserId(Integer userId);
}
