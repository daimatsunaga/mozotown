package com.example.form;

public class UserLoginForm {
	
	//メールアドレス
	private String email;
	//パスワード
	private String password;
	
	//ゲッターセッター
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//toStringのオーバーライド
	@Override
	public String toString() {
		return "UserLoginForm [email=" + email + ", password=" + password + "]";
	}
}
