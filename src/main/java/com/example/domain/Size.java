package com.example.domain;

public class Size {

	//id
	private Integer id;
	//サイズ
	private String size;
	
	//ゲッターセッター
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	//toStringのオーバーライド
	@Override
	public String toString() {
		return "Size [id=" + id + ", size=" + size + "]";
	}

}