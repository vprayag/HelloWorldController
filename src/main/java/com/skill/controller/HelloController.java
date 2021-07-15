package com.skill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {
	

	@RequestMapping("/hello")
	public String sayHello(ModelMap map) {

		String message = "Welcome to Spring-MVC app";
		
		map.addAttribute("msg", message);

		return "hello";
}
}
