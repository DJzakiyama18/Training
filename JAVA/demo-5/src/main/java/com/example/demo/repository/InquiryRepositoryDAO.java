package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Inquiry;

public interface InquiryRepositoryDAO {

	void insertInquiry(Inquiry inquiry);

	List<Inquiry> getAllInquiry();
}
