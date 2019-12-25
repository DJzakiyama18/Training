package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Inquiry;

public interface InquriryService {

	void insertInquiry(Inquiry inquiry);

	List<Inquiry> getAllInquiry();
}
