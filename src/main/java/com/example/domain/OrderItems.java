package com.example.domain;

public class OrderItems {

	private Integer id;
	
	private Integer userId;
	
	private Integer itemId;
	
	private Integer colorId;
	
	private Integer sizeId;
	
	private Integer orderId;
	
	private Integer quantity;

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

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderItems [id=" + id + ", userId=" + userId + ", itemId=" + itemId + ", colorId=" + colorId
				+ ", sizeId=" + sizeId + ", orderId=" + orderId + ", quantity=" + quantity + "]";
	}
	
	
}
