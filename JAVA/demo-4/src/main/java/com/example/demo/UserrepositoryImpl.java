package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class UserrepositoryImpl implements UserRepository1 {
	public final JdbcTemplate jdbcTemplate;
	@Autowired
	 public UserrepositoryImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	@Override
	public List<UserEntity> userSelectList() {
		String sql = "select id, user_name, password from user";
		List<Map<String ,Object>> resultList = jdbcTemplate.queryForList(sql);
		List<UserEntity> list = new ArrayList<>();
		for(Map<String ,Object> result : resultList) {
			UserEntity userEntity = new UserEntity();
			userEntity.setId((int) result.get("id"));
			userEntity.setUser_name((String) result.get("user_name"));
			userEntity.setPassword((String) result.get("password"));
			list.add(userEntity);
		}


		return list;
	}

}
