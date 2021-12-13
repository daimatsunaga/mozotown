package com.example.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.User;

@Mapper
public interface UserMapper {

	//ユーザー登録
	public void insert(User user);
}
