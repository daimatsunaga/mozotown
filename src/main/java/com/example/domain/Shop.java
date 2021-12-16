package com.example.domain;

public class Shop {

	//id
	private Integer id; 
	//ショップ名
	private String shopName;
	//ショップ名のふりがな
	private String shopNameKane;
	//ショップ詳細
	private String shopDetail;
	//イメージパス
	private String imagePass;
	//削除フラグ
	private boolean deleted;
	
	//ゲッターセッター
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopNameKane() {
		return shopNameKane;
	}
	public void setShopNameKane(String shopNameKane) {
		this.shopNameKane = shopNameKane;
	}
	public String getShopDetail() {
		return shopDetail;
	}
	public void setShopDetail(String shopDetail) {
		this.shopDetail = shopDetail;
	}
	public String getImagePass() {
		return imagePass;
	}
	public void setImagePass(String imagePass) {
		this.imagePass = imagePass;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	//toStringのオーバーライド
	@Override
	public String toString() {
		return "Shop [id=" + id + ", shopName=" + shopName + ", shopNameKane=" + shopNameKane + ", shopDetail="
				+ shopDetail + ", imagePass=" + imagePass + ", deleted=" + deleted + "]";
	}
}
