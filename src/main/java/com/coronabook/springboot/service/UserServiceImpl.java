package com.coronabook.springboot.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coronabook.springboot.mapper.UserMapper;
import com.coronabook.springboot.model.User;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public User login(Map<String, String> map) throws Exception {
		return userMapper.login(map);
	}
	

}
