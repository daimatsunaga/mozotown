package com.example.domain;

import java.sql.Timestamp;

public class Order {

	private Integer id;
	
	private Integer userId;
	
	private Integer status;
	
	private Integer totalPrice;
	
	private Timestamp orderDate;
	
	private String destinationName;
	
	private String destinationNameKana;
	
	private String destinationZipCode;
	
	private String destinationAddress;
	
	private String destinationPhonenumber;
	
	private Timestamp deliveryDatetime;
	
	private Integer paymentMethodId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Timestamp getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
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

	public Timestamp getDeliveryDatetime() {
		return deliveryDatetime;
	}

	public void setDeliveryDatetime(Timestamp deliveryDatetime) {
		this.deliveryDatetime = deliveryDatetime;
	}

	public Integer getPaymentMethodId() {
		return paymentMethodId;
	}

	public void setPaymentMethodId(Integer paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", status=" + status + ", totalPrice=" + totalPrice
				+ ", orderDate=" + orderDate + ", destinationName=" + destinationName + ", destinationNameKana="
				+ destinationNameKana + ", destinationZipCode=" + destinationZipCode + ", destinationAddress="
				+ destinationAddress + ", destinationPhonenumber=" + destinationPhonenumber + ", deliveryDatetime="
				+ deliveryDatetime + ", paymentMethodId=" + paymentMethodId + "]";
	}
	
	
}
