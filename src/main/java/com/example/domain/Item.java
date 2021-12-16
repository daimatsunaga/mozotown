package com.example.domain;

public class Item {
	
	//id
	private Integer id;
	//名前
	private String name;
	//値段
	private Integer price;
	//商品情報
	private String itemInfo;
	//対象の性別
	private Integer gender;
	//カテゴリー（外部キー）
	private Integer categoryId;
	//カラー（外部キー）
	private Integer colorId;
	//サイズ（外部キー）
	private Integer sizeId;
	//取り扱いショップ（外部キー）
	private Integer shopId;
	//在庫数
	private Integer stock;
	//削除フラグ
	private boolean deleted;
	
	//ゲッターセッター
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getItemInfo() {
		return itemInfo;
	}
	public void setItemInfo(String itemInfo) {
		this.itemInfo = itemInfo;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
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
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
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
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", itemInfo=" + itemInfo + ", gender="
				+ gender + ", categoryId=" + categoryId + ", colorId=" + colorId + ", sizeId=" + sizeId + ", shopId="
				+ shopId + ", stock=" + stock + ", deleted=" + deleted + "]";
	}

}
