package com.cinfy.ams.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import com.cinfy.ams.model.User;
import com.cinfy.ams.services.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class LoginController {
	public static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	
	@Autowired
	UserService userService;
	

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void login(){
		User user=new User();
		user.setUsername("admin");
		user.setPassword("1234");
		user=userService.login(user);
		System.out.println(user);
		
		
	}
	
	
}

