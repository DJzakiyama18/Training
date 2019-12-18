package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShainController {

@RequestMapping("/inout")
public String index() {
	return "index.html";
}

@RequestMapping("/output")
public String result(@RequestParam("nubmer") String number, Model model) {
String name = "コントローラー太郎";
model.addAttribute("namber", number);
model.addAttribute("name", name);
return "output.html";
}
}