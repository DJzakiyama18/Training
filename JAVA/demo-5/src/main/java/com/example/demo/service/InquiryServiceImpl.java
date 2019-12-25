package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Inquiry;
import com.example.demo.repository.InquiryRepositoryDAO;
@Service
public class InquiryServiceImpl implements InquriryService {

	private final InquiryRepositoryDAO dao;
	@Autowired
	public InquiryServiceImpl(InquiryRepositoryDAO dao) {
		this.dao = dao;
	}


	@Override
	public void insertInquiry(Inquiry inquiry) {
		dao.insertInquiry(inquiry);
	}

	@Override
	public List<Inquiry> getAllInquiry() {

		return dao.getAllInquiry();
	}

}
