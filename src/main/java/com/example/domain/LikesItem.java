package com.example.domain;

public class LikesItem {
	//id
	private Integer id;
	//どのユーザーが
	private Integer userId;
	//どのアイテムを
	private Integer ItemId;
	
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
	public Integer getItemId() {
		return ItemId;
	}
	public void setItemId(Integer itemId) {
		ItemId = itemId;
	}
	
	//toStringのオーバーライド
	@Override
	public String toString() {
		return "LikesItem [id=" + id + ", userId=" + userId + ", ItemId=" + ItemId + "]";
	}
}
