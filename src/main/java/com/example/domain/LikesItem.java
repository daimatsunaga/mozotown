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
	//結合用
	private Item item;
	//結合用
	private Color color;
	//結合用
	private Size size;
	
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
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "LikesItem [id=" + id + ", userId=" + userId + ", ItemId=" + ItemId + ", colorId=" + colorId
				+ ", sizeId=" + sizeId + ", item=" + item + ", color=" + color + ", size=" + size + "]";
	}
	
}
