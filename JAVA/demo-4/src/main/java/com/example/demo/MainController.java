package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {


@Autowired
private UserRepository userRepository;//new してくれる


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
}
