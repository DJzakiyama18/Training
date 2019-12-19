package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShainController {

//@ModelAttribute
//public ShainForm setUpForm() {
//	return new ShainForm();
//}


@RequestMapping("/input")
public String index() {
	return "index.html";
}

@RequestMapping("/output")
public String result(Model model) {
	ShainForm  shainForm = new ShainForm ();
	String number = shainForm.getNumber();
	String name = "コントローラー太郎";

model.addAttribute("shainForm", shainForm);
model.addAttribute("number", number);
model.addAttribute("name", name);
//model.addAttribute("password", password);
return "output.html";
}
}