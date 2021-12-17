package com.example.domain;

public class LikesShop {
	
	//id
	private Integer id;
	//誰が
	private Integer userId;
	//どのお店を
	private Integer shopId;
	
	//ゲッターセッター
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	
	//toStringのオーバーライド
	@Override
	public String toString() {
		return "LikesShop [id=" + id + ", userId=" + userId + ", shopId=" + shopId + "]";
	}
}
