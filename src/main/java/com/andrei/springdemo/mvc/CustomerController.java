package com.andrei.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		model.addAttribute("customer", new Customer());
		
		return "customer-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processFrom(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		
		System.out.println("Last name: |" + customer.getLastName() +"|");
		
		System.out.println("Binding result: " + bindingResult);		
		//show the error code type, so we know what error type to override if we want to create a personal error,
		//and we add error code type and our message in the messages.properties file.
		
		
		if(bindingResult.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirmation";
		}	
	}
	
	//add initBinder to convert trim input strings
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	

}
