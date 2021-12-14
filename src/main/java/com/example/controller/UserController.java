package com.example.controller;

import java.sql.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;
import com.example.form.UserInsertForm;
import com.example.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@ModelAttribute
	public UserInsertForm setUpForm() {
		return new UserInsertForm();
	}
	
	@GetMapping("/toInsert")
	public String toInsert() {
		return "register_user";
	}
	
	@GetMapping("/toLogin")
	public String toLogin() {
		return "login";
	}
	
	
	@PostMapping("/insert")
	public String insert(UserInsertForm form) {
		//フォームの値をdomainにコピー
		User user = new User();
		BeanUtils.copyProperties(form, user);
		
		//フォームから送られてきた年月日をDate型に変換しuserにセット
		String date = form.getYear() + "-" + form.getMonth() + "-" + form.getDay();
		Date birthday = Date.valueOf(date);
		user.setBirthday(birthday);
		
		System.out.println(user);
		
		//insertメソッドを呼び出す
		service.insert(user);
		
		return "top_page";
	}
 }
