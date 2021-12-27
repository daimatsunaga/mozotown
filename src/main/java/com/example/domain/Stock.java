package com.example.domain;

public class Stock {
	
	private Integer itemId;
	
	private String color;
	
	private String size;
	
	private Integer stock;

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Stock [itemId=" + itemId + ", color=" + color + ", size=" + size + ", stock=" + stock
				+ "]";
	}
}
