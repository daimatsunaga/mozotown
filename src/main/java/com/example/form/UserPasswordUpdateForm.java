package com.example.form;

public class UserPasswordUpdateForm {

	//id
	private Integer id;
	//新しいパスワード
	private String newPassword;
	//古いパスワード
	private String currentPassword;
	
	//ゲッターセッター
	public String getCurrentPassword() {
		return currentPassword;
	}
	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
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
		return "UserPasswordUpdateForm [id=" + id + ", newPassword=" + newPassword + ", currentPassword="
				+ currentPassword + "]";
	}
	
}