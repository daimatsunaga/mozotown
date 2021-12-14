package com.example.controller;

import java.sql.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;
import com.example.form.UserInsertForm;
import com.example.form.UserLoginForm;
import com.example.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private UserService service;
	
	@ModelAttribute
	public UserInsertForm setUpInsertForm() {
		return new UserInsertForm();
	}
	
	@ModelAttribute
	public UserLoginForm setUpLoginForm() {
		return new UserLoginForm();
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
		
		//insertメソッドを呼び出す
		service.insert(user);
		
		return "redirect:/item";
	}
	
	@PostMapping("/login")
	public String login(UserLoginForm form) {
		User user = service.login(form.getEmail());
		int index = form.getEmail().indexOf("@");
		String userName = form.getEmail().substring(0, index);
		session.setAttribute("userName", userName);
		session.setAttribute("user", user);
		return "redirect:/item";
	}
 }
