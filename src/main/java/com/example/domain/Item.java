package com.example.domain;

import java.util.List;

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
	//取り扱いショップ（外部キー）
	private Integer shopId;
	//在庫数
	private Integer stock;
	//削除フラグ
	private boolean deleted;
	//結合用　画像
	private List<Image> imageList;
	//結合用　カラー
	private List<Color> colorList;
	//結合用　カテゴリー
	private Category category;
	//結合用　ショップ
	private Shop shop;
	//結合用　サイズ
	private List<Size> sizeList;
	
	
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
	public List<Image> getImageList() {
		return imageList;
	}
	public void setImageList(List<Image> imageList) {
		this.imageList = imageList;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public List<Color> getColorList() {
		return colorList;
	}
	public void setColorList(List<Color> colorList) {
		this.colorList = colorList;
	}
	public List<Size> getSizeList() {
		return sizeList;
	}
	public void setSizeList(List<Size> sizeList) {
		this.sizeList = sizeList;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", itemInfo=" + itemInfo + ", gender="
				+ gender + ", categoryId=" + categoryId + ", shopId="
				+ shopId + ", stock=" + stock + ", deleted=" + deleted + ", imageList=" + imageList + ", colorList="
				+ colorList + ", category=" + category + ", shop=" + shop + ", sizeList=" + sizeList + "]";
	}
}