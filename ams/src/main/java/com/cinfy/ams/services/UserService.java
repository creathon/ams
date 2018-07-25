package com.cinfy.ams.services;

import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinfy.ams.controller.LoginController;
import com.cinfy.ams.model.User;
import com.cinfy.ams.repositories.UserRepositary;


@Service
public class UserService {
	public static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	
	@Autowired
	private UserRepositary userRepositary;
	
	public User login(User user){
		
		return userRepositary.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		
	}

}
