package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.User;
import com.example.repository.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper mapper;
	
	public void insert(User user) {
		mapper.insert(user);
	}
}
