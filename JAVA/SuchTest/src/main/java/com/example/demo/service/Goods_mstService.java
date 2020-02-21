package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Goods_mstEntity;
import com.example.demo.repojitory.Goods_mstRepojitory;
@Service
public class Goods_mstService {
	public final Goods_mstRepojitory goods_mstRepojitory;

	@Autowired
	public Goods_mstService(Goods_mstRepojitory goods_mstRepojitory) {
		this.goods_mstRepojitory = goods_mstRepojitory;
	}

	public List<Goods_mstEntity> such(Integer goods_id, String goods_name, String price){
		List<Goods_mstEntity> result = goods_mstRepojitory.findAll();
		return result;
	}

}
