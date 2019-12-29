package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ContentEntity;
import com.example.demo.repojitory.ContentRepojitory;

@Service
public class ContentServiceImpl {

	public final ContentRepojitory contentRepojitory;
	@Autowired

	public ContentServiceImpl(ContentRepojitory contentRepojitory) {
		this.contentRepojitory = contentRepojitory;
	}

	public List<ContentEntity> findAll(){
		return contentRepojitory.findAll();
	}

	public ContentEntity save(ContentEntity contentEntity) {
		return contentRepojitory.save(contentEntity);
	}

	public void delet(Integer user_id) {
		contentRepojitory.deleteById(user_id);
	}

	public ContentEntity find_by(Integer user_id) {
		return contentRepojitory.getOne(user_id);
	}

}
