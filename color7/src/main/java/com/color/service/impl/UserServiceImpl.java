package com.color.service.impl;

import org.springframework.stereotype.Service;

import com.color.service.UserService;
@Service("UserService")
public class UserServiceImpl implements UserService {

	@Override
	public void sayHello() {
		System.out.println("hello...");

	}

}
