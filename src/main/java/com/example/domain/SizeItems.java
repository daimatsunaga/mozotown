package com.example.domain;

public class SizeItems {

	private Integer id;
	
	private Integer itemId;
	
	private Integer SizeId;

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

	public Integer getSizeId() {
		return SizeId;
	}

	public void setSizeId(Integer sizeId) {
		SizeId = sizeId;
	}

	@Override
	public String toString() {
		return "SizeItems [id=" + id + ", itemId=" + itemId + ", SizeId=" + SizeId + "]";
	}
	
	
}
