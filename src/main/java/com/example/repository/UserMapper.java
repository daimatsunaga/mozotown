package com.example.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.domain.User;

@Mapper
public interface UserMapper {

	//ユーザー登録
	public void insert(User user);
	
	//ユーザー取得（１件）
	public User findByEmail(String email);
	
	//ユーザー取得（１件）
	public User findById(Integer id);
	
	//ユーザー削除
	public void deleteById(Integer id);
	
	//ユーザー更新（基本情報）
	public void updateUserInfo(User user);
	
	//ユーザー更新(メールアドレス)
	public void updateUserEmail(@Param("email")String email, @Param("id")Integer id);
	
	//ユーザー更新(パスワード)
	public void updateUserPassword(@Param("newPassword")String newPassword, @Param("id")Integer id);
}
