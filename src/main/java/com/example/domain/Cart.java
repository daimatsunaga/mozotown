package com.example.domain;

public class Cart {

	private Integer id;
	
	private Integer userId;
	
	private Integer itemId;
	
	private Integer colorId;
	
	private Integer sizeId;
	
	private Integer totalPrice;
	
	private Integer quantity;
	
	private User user;
	
	private Item item;
	
	private Color color;
	
	private Size size;

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

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
		return "Cart [id=" + id + ", userId=" + userId + ", itemId=" + itemId + ", colorId=" + colorId + ", sizeId="
				+ sizeId + ", totalPrice=" + totalPrice + ", quantity=" + quantity + ", user=" + user + ", item=" + item
				+ ", color=" + color + ", size=" + size + "]";
	}
	
	
	
	
}
