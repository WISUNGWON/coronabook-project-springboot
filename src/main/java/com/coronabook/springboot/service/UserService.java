package com.coronabook.springboot.service;

import java.util.Map;

import com.coronabook.springboot.model.User;

public interface UserService {
	
	public User login(Map<String, String > map) throws Exception;
	
}
