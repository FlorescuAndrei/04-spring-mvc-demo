package com.andrei.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String helloWorld(){
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String helloWorldTwo(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("theName");
		
		String result = name.toUpperCase();
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	
	public String helloWorldThree(@RequestParam("theName") String theName, Model model) {
	
		
		String result ="Hey from v3 " + theName.toUpperCase();
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	

}
