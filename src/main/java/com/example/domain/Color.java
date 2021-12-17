package com.example.domain;

public class Color {

	//id
	private Integer id;
	//color
	private String color;
	
	//ゲッターセッター
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//toStringのオーバーライド
	@Override
	public String toString() {
		return "Color [id=" + id + ", color=" + color + "]";
	}
}
