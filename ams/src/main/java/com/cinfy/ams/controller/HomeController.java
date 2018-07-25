package com.cinfy.ams.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)  
	public ModelAndView get_Department_Page_ViewLoad(HttpServletRequest request) {
	
		ModelAndView mav =new ModelAndView("login");
		
		return mav;
	}
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)  
	public ModelAndView dashboard(HttpServletRequest request) {
	
		ModelAndView mav =new ModelAndView("dashboard");
		
		return mav;
	}
	
	

}
