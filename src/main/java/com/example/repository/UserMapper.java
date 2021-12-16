package com.example.repository;

import org.apache.ibatis.annotations.Mapper;
import com.example.domain.User;

@Mapper
public interface UserMapper {

	//ユーザー登録
	public void insert(User user);
	
	//ユーザー取得（１件）
	public User findByEmail(String email);
	
	//ユーザー削除
	public void deleteById(Integer id);
}
