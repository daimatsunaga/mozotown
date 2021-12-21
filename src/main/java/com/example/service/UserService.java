package com.example.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.User;
import com.example.repository.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper mapper;
	
	@Autowired
	private HttpSession session;
	
	public void insert(User user) {
		mapper.insert(user);
	}
	
	public User login(String email) {
		return mapper.findByEmail(email);
	}
	
	public void deleteById(Integer id) {
		mapper.deleteById(id);
	}
	
	public void updateInfo(User user) {
		mapper.updateUserInfo(user);
		session.setAttribute("user", mapper.findById(user.getId()));
	}
	
	public void updateEmail(String email, Integer id) {
		mapper.updateUserEmail(email, id);
		User user = mapper.findById(id);
		//emailの＠以前を切り出し
		int index = user.getEmail().indexOf("@");
		String userName = user.getEmail().substring(0, index);
		//セッションを更新
		session.setAttribute("userName", userName);
		session.setAttribute("user", user);
	}
}
