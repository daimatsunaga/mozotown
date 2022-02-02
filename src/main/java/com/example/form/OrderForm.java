package com.example.form;

import java.sql.Date;


public class OrderForm {
	
	private Integer userId;
	
	private Integer totalPrice;
	
	private String destinationName;
	
	private String destinationNameKana;
	
	private String destinationZipCode;
	
	private String destinationAddress;
	
	private String destinationPhonenumber;
	
	private Date deliveryDate;
	
	private Integer deliveryTime;
	
	private Integer paymentMethodId;
	
	private String token;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public String getDestinationNameKana() {
		return destinationNameKana;
	}

	public void setDestinationNameKana(String destinationNameKana) {
		this.destinationNameKana = destinationNameKana;
	}

	public String getDestinationZipCode() {
		return destinationZipCode;
	}

	public void setDestinationZipCode(String destinationZipCode) {
		this.destinationZipCode = destinationZipCode;
	}

	public String getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	public String getDestinationPhonenumber() {
		return destinationPhonenumber;
	}

	public void setDestinationPhonenumber(String destinationPhonenumber) {
		this.destinationPhonenumber = destinationPhonenumber;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Integer getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Integer deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public Integer getPaymentMethodId() {
		return paymentMethodId;
	}

	public void setPaymentMethodId(Integer paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "OrderForm [userId=" + userId + ", totalPrice=" + totalPrice + ", destinationName=" + destinationName
				+ ", destinationNameKana=" + destinationNameKana + ", destinationZipCode=" + destinationZipCode
				+ ", destinationAddress=" + destinationAddress + ", destinationPhonenumber=" + destinationPhonenumber
				+ ", deliveryDate=" + deliveryDate + ", deliveryTime=" + deliveryTime + ", paymentMethodId="
				+ paymentMethodId + ", token=" + token + "]";
	}


	
	
}
