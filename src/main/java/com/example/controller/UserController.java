package com.example.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;
import com.example.form.UserInfoUpdateForm;
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
	
	@ModelAttribute
	public UserInfoUpdateForm setUpInfoUpdateForm() {
		return new UserInfoUpdateForm();
	}
	
	@GetMapping("/toInsert")
	public String toInsert(Model model) {
		List<Integer> year = new ArrayList<>();
		List<Integer> month = new ArrayList<>();
		List<Integer> day = new ArrayList<>();
		for(int i = 1920; i <= 2021; i++) {
			year.add(i);
		}
		for(int i = 1; i <= 12; i++) {
			month.add(i);
		}
		for(int i = 1; i <= 31; i++) {
			day.add(i);
		}
		model.addAttribute("years", year);
		model.addAttribute("months", month);
		model.addAttribute("days", day);
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
		//emailの＠以前を切り出し
		int index = user.getEmail().indexOf("@");
		String userName = user.getEmail().substring(0, index);
		//セッションにそれぞれ保存
		session.setAttribute("userName", userName);
		session.setAttribute("user", user);
		return "redirect:/item";
	}
	
	@GetMapping("/logout")
	public String logout() {
		session.invalidate();
		return "redirect:/item";
	}
	
	@GetMapping("/detail")
	public String detail() {
		return "user_detail";
	}
	
	@GetMapping("/toLeave")
	public String leave() {
		return "leave";
	}
	
	@GetMapping("/delete")
	public String deleteUser(Integer id) {
		service.deleteById(id);
		session.invalidate();
		return "redirect:/item";
	}
	
	@GetMapping("/toChangeInfo")
	public String toChangeInfo(Model model) {
		List<Integer> year = new ArrayList<>();
		List<Integer> month = new ArrayList<>();
		List<Integer> day = new ArrayList<>();
		for(int i = 1920; i <= 2021; i++) {
			year.add(i);
		}
		for(int i = 1; i <= 12; i++) {
			month.add(i);
		}
		for(int i = 1; i <= 31; i++) {
			day.add(i);
		}
		model.addAttribute("years", year);
		model.addAttribute("months", month);
		model.addAttribute("days", day);
		
		
		return "change_user_info";
	}
	
	@GetMapping("/toChangeEmail")
	public String toChangeEmail() {
		return "change_user_email";
	}
	
	@GetMapping("/toChangePassword")
	public String toChangePassword() {
		return "change_user_password";
	}
	
	@PostMapping("/update")
	public String userUpdate(UserInfoUpdateForm form) {
		User user = new User();
		BeanUtils.copyProperties(form, user);
		
		//フォームから送られてきた年月日をDate型に変換しuserにセット
		String date = form.getYear() + "-" + form.getMonth() + "-" + form.getDay();
		Date birthday = Date.valueOf(date);
		user.setBirthday(birthday);
		
		service.update(user);
		
		return "redirect:/user/detail";
	}
  }
