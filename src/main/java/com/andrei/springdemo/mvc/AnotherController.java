package com.andrei.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnotherController {
	
	@RequestMapping("/showForm")
	public String anotherShowForm() {
		
		return "helloworld-form";
	}

}
