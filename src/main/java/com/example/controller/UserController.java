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

import com.example.domain.LikesItem;
import com.example.domain.LikesShop;
import com.example.domain.User;
import com.example.form.UserEmailUpdateForm;
import com.example.form.UserInfoUpdateForm;
import com.example.form.UserInsertForm;
import com.example.form.UserLoginForm;
import com.example.form.UserPasswordUpdateForm;
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
	
	@ModelAttribute
	public UserEmailUpdateForm setUpEmailUpdateForm() {
		return new UserEmailUpdateForm();
	}
	
	@ModelAttribute
	public UserPasswordUpdateForm setUpPasswordUpdateForm() {
		return new UserPasswordUpdateForm();
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
	
	@PostMapping("/updateInfo")
	public String userUpdate(UserInfoUpdateForm form) {
		User user = new User();
		BeanUtils.copyProperties(form, user);
		
		//フォームから送られてきた年月日をDate型に変換しuserにセット
		String date = form.getYear() + "-" + form.getMonth() + "-" + form.getDay();
		Date birthday = Date.valueOf(date);
		user.setBirthday(birthday);
		
		service.updateInfo(user);
		return "redirect:/user/detail";
	}
	
	@PostMapping("/updateEmail")
	public String userUpdateEmail(UserEmailUpdateForm form) {
		service.updateEmail(form.getEmail(), form.getId());
		return "redirect:/user/detail";
	}
	
	@PostMapping("/updatePassword")
	public String userUpdatePassword(UserPasswordUpdateForm form, Model model) {
		User user = (User) session.getAttribute("user");
		if(!user.getEmail().equals(form.getCurrentPassword())) {
			model.addAttribute("error", "現在のパスワードが正しくありません");
			return "change_user_password";
		}
		
		service.updatePassword(form.getNewPassword(), form.getId());
		return "redirect:/user/detail";
	}
	
	@GetMapping("/likes")
	public String toLikes(Model model) {
		User user = (User) session.getAttribute("user");
		//ログインしていない場合にはログイン画面に遷移
		if(user == null) {
			return "redirect:/user/toLogin";
		}
		//お気に入りショップをスコープに格納
		List<LikesShop> listLikesShop = service.getLikesShop(user.getId());
		model.addAttribute("listLikesShop", listLikesShop);
		
		//お気に入りアイテムをスコープに格納
		System.out.println(service.getLikesItem(user.getId()));
		List<LikesItem> listLikesItem = service.getLikesItem(user.getId());
		model.addAttribute("listLikesItem", listLikesItem);
		return "like";
	}
  }
