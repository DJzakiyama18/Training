package com.example.demo.inquiry;



import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.Inquiry;
import com.example.demo.service.InquriryService;
@Controller
@RequestMapping("/inquiry")
public class InquiryController {

	private final InquriryService service;
	@Autowired
	 public InquiryController(InquriryService service) {
		this.service = service;
	}
	@GetMapping
	public String index(Model model) {
		List<Inquiry> inquiryList = new ArrayList<Inquiry>();
		inquiryList = service.getAllInquiry();
		model.addAttribute("inquiryList", inquiryList);
		return "/inquiry/index";
	}

	@GetMapping("/form")
	public String form(InquiryForm inquiryForm, Model model, @ModelAttribute("complete") String complite) {
		return "/inquiry/form";
	}

	@GetMapping("/confirm")
	public String confirm(@Validated InquiryForm inquiryForm, BindingResult bindingResult,Model model) {
		if (bindingResult.hasErrors()) {
			return "/inquiry/form";
		}
		return "/inquiry/confirm";
	}
	@GetMapping("/complete")
	public String complete(@Validated InquiryForm inquiryForm, BindingResult bindingResult,Model model, RedirectAttributes redirectAttributes) {
		if(bindingResult.hasErrors()) {
			return "/inquiry/form";
		}

		Inquiry inquiry = new Inquiry();
		inquiry.setName(inquiryForm.getName());
		inquiry.setEmail(inquiryForm.getEmail());
		inquiry.setContent(inquiryForm.getContent());
		inquiry.setCreated(LocalDateTime.now().toString());
		service.insertInquiry(inquiry);
		redirectAttributes.addAttribute("complete", "成功");//RedirectAttributesフラッシュスコープ
		return "redirect:/inquiry/form";//redirect:をわすれない
	}

}
