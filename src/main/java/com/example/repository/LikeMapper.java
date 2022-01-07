package com.example.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.domain.LikesShop;

@Mapper
public interface LikeMapper {

	//いいねの追加（ショップ）
	public void likeShop(@Param("userId")Integer userId, @Param("shopId")Integer shopId);
	//いいねの削除（ショップ）
	public void deleteLikeShop(@Param("userId")Integer userId, @Param("shopId")Integer shopId);
	//お気に入りをしているか検索
	public LikesShop serchLikeShop(@Param("userId")Integer userId, @Param("shopId")Integer shopId);
}
