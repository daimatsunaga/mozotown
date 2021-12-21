package com.example.form;

public class UserInfoUpdateForm {

	//id
	private Integer id;
	//性別
	private Integer gender;
	//生年月日　//年
	private String year;
	//生年月日　//月
	private String month;
	//生年月日　//日
	private String day;
	//郵便番号
	private String zipCode;
	//住所
	private String address;
	
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	//toStringのオーバーライド
	@Override
	public String toString() {
		return "UserInfoUpdateForm [id=" + id + ", gender=" + gender + ", year=" + year + ", month=" + month + ", day="
				+ day + ", zipCode=" + zipCode + ", address=" + address + "]";
	}
}
