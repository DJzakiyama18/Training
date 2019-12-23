package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
public class Controller {

@RequestMapping("/")
public String index(Model model) {
	//TestForm testForm = null;
	String name = "zakiyma";
	model.addAttribute("name", name);
	model.addAttribute("testForm",new TestForm());
	return "index.html";
}


@RequestMapping("/one")
public String one(TestForm testForm, Model Model) {

	//String number = testForm.getNumber();
	//String password = testForm.getPassword();
	Model.addAttribute("number", testForm);
	Model.addAttribute("password", testForm);
	return "one.html";
}


@RequestMapping("/two")
public String two() {
	return "two.html";
}
}
