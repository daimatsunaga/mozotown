package com.example.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.LikesShop;
import com.example.domain.User;
import com.example.repository.CartMapper;
import com.example.repository.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper mapper;
	@Autowired
	private CartMapper cartMapper;
	
	@Autowired
	private HttpSession session;
	
	public void insert(User user) {
		mapper.insert(user);
	}
	
	public User login(String email) {
		User user = mapper.findByEmail(email);
		Integer sumOfCart = cartMapper.sumCart(user.getId());
		session.setAttribute("sumOfCart", sumOfCart);
		return user;
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
	
	public void updatePassword(String newPassword, Integer id) {
		mapper.updateUserPassword(newPassword, id);
		session.setAttribute("user", mapper.findById(id));
	}
	
	public List<LikesShop> getLikesShop(Integer userId) {
		return mapper.getLikesShop(userId);
	}
}
