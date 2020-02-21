package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Goods_mstEntity;
import com.example.demo.service.Goods_mstService;

@Controller
public class SuchController {

	public final Goods_mstService goods_mstService;

	@Autowired

	public SuchController(Goods_mstService goods_mstService) {
		this.goods_mstService = goods_mstService;
	}

	@RequestMapping("/")
	public String index() {
	return "index";
	}

	@RequestMapping(value = "testForm" ,method = RequestMethod.POST)
	public ModelAndView such(ModelAndView mav, @RequestParam("goods_id") Integer goods_id, @RequestParam("goods_name") String goods_name, @RequestParam("price") String price) {

		mav.setViewName("index");
		mav.addObject("goods_id", goods_id);
		mav.addObject("goods_name", goods_name);
		mav.addObject("price", price);
		List<Goods_mstEntity>  result = goods_mstService.such(goods_id, goods_name, price);
		mav.addObject("result", result);

		return mav;
	}
}
