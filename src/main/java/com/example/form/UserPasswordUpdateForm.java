package com.example.form;

public class UserPasswordUpdateForm {

	//パスワード
	private String password;
	//確認用パスワード
	private String confirmPassword;
	
	//ゲッターセッター
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	//toStringのオーバーライド
	@Override
	public String toString() {
		return "UserPasswordUpdateForm [password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}
}