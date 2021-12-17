package com.example.domain;

public class Category {

	//id
	private Integer id;
	//カテゴリー
	private String category;
	
	//ゲッターセッター
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	//toStringのオーバーライド
	@Override
	public String toString() {
		return "Category [id=" + id + ", category=" + category + "]";
	}
	
	
}
