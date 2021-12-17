package com.example.domain;

public class Image {

	//id
	private Integer id;
	//イメージパス
	private String imagePass;
	//紐づくアイテムid（外部キー）
	private Integer itemId;
	
	//ゲッターセッター
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImagePass() {
		return imagePass;
	}
	public void setImagePass(String imagePass) {
		this.imagePass = imagePass;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	
	//toStirngのオーバーライド
	@Override
	public String toString() {
		return "Image [id=" + id + ", imagePass=" + imagePass + ", itemId=" + itemId + "]";
	}
}