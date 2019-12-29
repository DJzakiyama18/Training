package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements Userservice{
	public final UserRepository1 userRepository1;

	public final UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository,UserRepository1 userRepository1) {
		this.userRepository1 = userRepository1;
		this.userRepository = userRepository;
	}





	@Override
	public List<UserEntity> userSelectList() {
		return userRepository1.userSelectList();
	}


	public List<UserEntity> findAllList(){
		return userRepository.findAllList();
	}


	@Override
	public Page<UserEntity> findAll(Pageable pageable) {
		return userRepository.findAll(pageable);
	}




}
