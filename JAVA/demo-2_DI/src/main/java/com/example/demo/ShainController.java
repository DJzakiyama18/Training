package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShainController {

	private final ShainService shainService;

	//shainServiceのDI
	//DI化することによりまだ実装されてないクラスを使用しようちしてもエラーが出ない
	public ShainController(ShainService shainService) {
		this.shainService = shainService;
	}


@ModelAttribute	//@RequestMapping の処理が行われる前に実行される
public ShainForm setUpForm() {
	return new ShainForm();
}

@RequestMapping(value="/") //URL
public String index(){//このURLに飛んだ時に行われる処理
	return "index.html";
}

@RequestMapping(value = "/input")
public String index1() {
	return "index.html";
}

@RequestMapping(value = "/output")
public String result(@Validated ShainForm shainForm, BindingResult bindingResult, Model model) {
	if(bindingResult.hasErrors()) {
		return "index.html";
	}

	String number = shainForm.getNumber();
	String password = shainForm.getPassword();
	String name = shainForm.getName();
	String number1 = shainService.selectNumber(number);

	model.addAttribute("name", name);
	model.addAttribute("number", number);
	model.addAttribute("password", password);
	model.addAttribute("number1", number1);
return "output.html";
}
}