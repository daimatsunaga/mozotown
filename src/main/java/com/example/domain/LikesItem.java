package com.example.domain;

public class LikesItem {
	//id
	private Integer id;
	//どのユーザーが
	private Integer userId;
	//どのアイテムを
	private Integer ItemId;
	//どの色
	private Integer colorId;
	//どのサイズ
	private Integer sizeId;
	
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
	public Integer getColorId() {
		return colorId;
	}
	public void setColorId(Integer colorId) {
		this.colorId = colorId;
	}
	public Integer getSizeId() {
		return sizeId;
	}
	public void setSizeId(Integer sizeId) {
		this.sizeId = sizeId;
	}
	
	@Override
	public String toString() {
		return "LikesItem [id=" + id + ", userId=" + userId + ", ItemId=" + ItemId + ", colorId=" + colorId
				+ ", sizeId=" + sizeId + "]";
	}
}
