package com.example.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.Order;

@Mapper
public interface OrderMapper {

	//注文確定
	public void orderConfirm(Order order);
}
