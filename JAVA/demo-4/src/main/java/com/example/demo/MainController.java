package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {


@Autowired
private UserRepository userRepository;//new してくれる

@Autowired
JdbcTemplate jdbcTemplate;

@RequestMapping("/")
public String index() {
	return "index.html";
}
@RequestMapping("/one")
public String one(Model model) {
	List<UserEntity> user = (List<UserEntity>) userRepository.findAll();//なんとなく理解やってることはわかる
     model.addAttribute("user", user);

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
