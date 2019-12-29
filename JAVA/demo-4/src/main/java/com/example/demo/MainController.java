package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
public final Userservice userService;


@Autowired
public UserRepository userRepository;//new してくれる

public final UserRepository1 userRepository1;
@Autowired
public MainController(UserRepository1 userRepository1,Userservice userService) {
	this.userRepository1 = userRepository1;
	this.userService = userService;
}
@Autowired
JdbcTemplate jdbcTemplate;


@RequestMapping("/")
public String index(Model model) {
	List<UserEntity> userEntityList = userService.findAllList();
	//userEntityList = userRepository1.userSelectList();
	model.addAttribute("userEntityList", userEntityList);
	return "index.html";
}
@RequestMapping("/one")
public String one(Model model,Pageable pageable) {
	Page<UserEntity> user =  userService.findAll( pageable);//なんとなく理解やってることはわかる
     model.addAttribute("user", user);
     model.addAttribute("page", user);
     model.addAttribute("words", user.getContent());
     model.addAttribute("url", "/one");

	return "one.html";
}
@RequestMapping("/two")
public String two(Model model) {
	String sql = "select id, user_name, password from user where id = 1";
	Map<String, Object> map = jdbcTemplate.queryForMap(sql);
	model.addAttribute("id", map.get("id"));//map.get(カラム名)
	model.addAttribute("user_name", map.get("user_name"));
	model.addAttribute("password", map.get("password"));
	return "two.html";

}
}
