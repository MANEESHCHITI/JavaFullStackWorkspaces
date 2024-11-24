package springmvc03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//  not working same as done like springmvcApp02 .actually we used dipatcher servlet,srikanth-servlet,
@Controller
public class HomeController {
	@ModelAttribute("course")
	public String courseName() {
		return "Java";
	}
	@RequestMapping("/")
	public String home() {
		System.out.println("Home method called");
		return "index";
	}
	@RequestMapping("addCustomer")
//	public String addCustomer(Customer cust) {
		public String addCustomer(@ModelAttribute("customer1") Customer cust) {
		return "result";
	}
}

