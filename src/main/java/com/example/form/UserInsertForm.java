package com.example.form;

public class UserInsertForm {

	//性別
	private Integer gender;
	//生年月日　//年
	private String year;
	//生年月日　//月
	private String month;
	//生年月日　//日
	private String day;
	//メールアドレス
	private String email;
	//郵便番号
	private String zipCode;
	//住所
	private String address;
	//パスワード
	private String password;
	//確認用パスワード
	private String confirmPassword;
	
	//ゲッターセッター
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
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
		return "UserInsert [gender=" + gender + ", year=" + year + ", month=" + month + ", day=" + day + ", email="
				+ email + ", zipCode=" + zipCode + ", address=" + address + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + "]";
	}
}
