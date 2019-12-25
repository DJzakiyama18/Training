package com.example.demo.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Inquiry;
@Repository
public class InquiryRepositoryDAOImpl implements InquiryRepositoryDAO {

	private final JdbcTemplate jdbcTemplete;
	@Autowired //コンストラクタインジェクション
	public InquiryRepositoryDAOImpl(JdbcTemplate jdbcTemplete) {
		this.jdbcTemplete = jdbcTemplete;
	}
	@Override
	public void insertInquiry(Inquiry inquiry) {
		jdbcTemplete.update("insert into inquiry(name, email, content, created) values(?,?,?,?)",
				inquiry.getName(), inquiry.getEmail(),inquiry.getContent(),inquiry.getCreated());
	}
	@Override
	public List<Inquiry> getAllInquiry() {
		String sql = "select id, name, email, content , created from inquiry";
		List<Map<String ,Object>> resultList = jdbcTemplete.queryForList(sql);//String キー
		List<Inquiry> list = new ArrayList<Inquiry>();
		for(Map<String,Object> result: resultList) {
			Inquiry inquiry = new Inquiry();
			inquiry.setId((int) result.get("id"));//受け取った値はobject型なので
			inquiry.setName((String) result.get("name"));
			inquiry.setEmail((String) result.get("email"));
			inquiry.setContent((String) result.get("content"));
			inquiry.setCreated( (String) result.get("created").toString() );
			list.add(inquiry);
		}
		return list;
	}

}
