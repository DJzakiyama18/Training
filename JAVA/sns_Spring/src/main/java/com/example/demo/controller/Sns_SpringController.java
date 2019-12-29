package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.ContentEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.form.LoginForm;
import com.example.demo.repojitory.UserRepojitory;
import com.example.demo.service.ContentServiceImpl;
import com.example.demo.service.UserServiceImpl;
import com.example.demo.session.Loginsession;

@Controller
public class Sns_SpringController {
	public final ContentServiceImpl contentServiceImpl;
	public final UserServiceImpl userServiceImpl;
	public final UserRepojitory userRepojitory;
	@Autowired
	public Sns_SpringController(ContentServiceImpl contentServiceImpl,UserServiceImpl userServiceImpl,UserRepojitory userRepojitory) {
		this.contentServiceImpl = contentServiceImpl;
		this.userServiceImpl = userServiceImpl;
		this.userRepojitory = userRepojitory;
	}

	@Autowired
	Loginsession loginsession;

	@RequestMapping("/home")
	public String home(@ModelAttribute LoginForm loginForm , Model model) {
		List<ContentEntity> contentList = contentServiceImpl.findAll();
		model.addAttribute("contentList", contentList);
		return "/index";
	}
	@RequestMapping("/mypage")
	public String mypage(@ModelAttribute LoginForm loginForm,Model model) {
		UserEntity userEntity = userRepojitory.loginSelect(loginForm.getUser_name(), loginForm.getPassword());

		if(userEntity == null) {
			model.addAttribute("message", "ログイン失敗");
			List<ContentEntity> contentList = contentServiceImpl.findAll();
			model.addAttribute("contentList", contentList);
			return "/index";
		}
		loginsession.setId(userEntity.getUser_id());
		loginsession.setUser_name(userEntity.getUser_name());
		model.addAttribute("name", userEntity.getUser_name());
	    model.addAttribute("password", userEntity.getPassword());
		return "/mypage";

	}


}
