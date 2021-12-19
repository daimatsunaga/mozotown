package com.example.domain;

public class ColorItems {

	private Integer id;
	
	private Integer itemId;
	
	private Integer colorId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "ColorItems [id=" + id + ", itemId=" + itemId + ", colorId=" + colorId + "]";
	}
	
	
}
