package com.example.domain;

import java.util.Date;

public class User {
	//ID
	private Integer id;
	//ユーザー氏名
	private Integer gender;
	//生年月日
	private Date birthday;
	//メールアドレス
	private String email;
	//郵便番号
	private String zipCode;
	//住所
	private String address;
	//パスワード
	private String password;
	
	//引数なしコンストラクタ
	public User() {}

	//引数ありコンストラクタ
	public User(Integer id, Integer gender, Date birthday, String email, String zipCode, String address,
			String password) {
		super();
		this.id = id;
		this.gender = gender;
		this.birthday = birthday;
		this.email = email;
		this.zipCode = zipCode;
		this.address = address;
		this.password = password;
	}

	//getter及びsetter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
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

	//toStringメソッド
	@Override
	public String toString() {
		return "User [id=" + id + ", gender=" + gender + ", birthday=" + birthday + ", email=" + email + ", zipCode="
				+ zipCode + ", address=" + address + ", password=" + password + "]";
	}
}