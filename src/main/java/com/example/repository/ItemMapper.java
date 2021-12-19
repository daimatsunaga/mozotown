package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.Item;

@Mapper
public interface ItemMapper {
	
	public List<Item> findAll();

}
