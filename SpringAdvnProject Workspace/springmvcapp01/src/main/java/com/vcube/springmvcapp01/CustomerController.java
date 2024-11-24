package com.vcube.springmvcapp01;

/* // it showing it was not getting correct path for addCustomer.but same as springmvcApp02
*/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

	
	@ModelAttribute("course")
	public String courseName() {
	return "Java";
	}
	@RequestMapping("/")
	public String home() {
	System.out.println("Home method called");
	return "index";
	}
	
	@RequestMapping("m")
//	public String addCustomer(Customer cust) {
	public String addCustomer(@ModelAttribute("customer1") Customer cust) {
	return "result";
	}
	
}
