package com.example.demo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface Userservice {


		  Page<UserEntity> findAll(Pageable pageable);


		  	List<UserEntity> userSelectList();

		  	List<UserEntity> findAllList();
}
