package com.example.form;

public class UserEmailUpdateForm {

	//id
	private Integer id;
	//メールアドレス
	private String email;
	
	//ゲッターセッター
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	//toStringのオーバーライド
	@Override
	public String toString() {
		return "UserEmailUpdateForm [id=" + id + ", email=" + email + "]";
	}
}
