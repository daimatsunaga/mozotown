package com.example.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.domain.LikesItem;
import com.example.domain.LikesShop;

@Mapper
public interface LikeMapper {

	//いいねの追加（ショップ）
	public void likeShop(@Param("userId")Integer userId, @Param("shopId")Integer shopId);
	//いいねの削除（ショップ）
	public void deleteLikeShop(@Param("userId")Integer userId, @Param("shopId")Integer shopId);
	//お気に入りをしているか検索（ショップ）
	public LikesShop serchLikeShop(@Param("userId")Integer userId, @Param("shopId")Integer shopId);
	//お気に入りに追加（アイテム）
	public void likeItem(LikesItem likesItem);
	//お気に入りの削除
	public void deleteLikeItem(LikesItem likesItem);
	//stockテーブルから情報を入手しLikesItemドメインに値をセット
	public LikesItem serchStock(Integer stockId);
}
