package com.alice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller	
public class HelloWorld {

	@RequestMapping("/welcome")
	public ModelAndView helloworld(){
		String message = "Hello world,this is Spring MVC Tutorial.";
		return new ModelAndView("welcome","message",message);
	}
}
