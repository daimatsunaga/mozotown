package com.example.form;

public class CartForm {

	private Integer userId;
	
	private Integer itemId;
	
	private Integer colorId;
	
	private Integer sizeId;
	
	private Integer price;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CartForm [userId=" + userId + ", itemId=" + itemId + ", colorId=" + colorId + ", sizeId=" + sizeId
				+ ", price=" + price + "]";
	}
	
	
}
