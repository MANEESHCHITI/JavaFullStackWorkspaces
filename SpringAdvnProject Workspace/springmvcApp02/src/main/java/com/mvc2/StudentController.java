 package com.mvc2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

			/*here from web.xml execution starts
			by class using dispatcher
			servlet  it redirects to
			index page by defauult mapping
			from there by submit button it			
			redirects to addstudent annotation
			there it adds to the pojo class of
			student by modelattribute annotation
			and hold object by student1 and it does
			to result page for futher to display.*/
@Controller
public class StudentController {
	
	@RequestMapping("/")
	public String welcome() {
		return "index";
	}
	
	@ModelAttribute("course")
	public String hello() {
		return "java";
	}

	@RequestMapping("addStudent")
	String addStudent(@ModelAttribute("student1") Student student) { 
		return "Success";
	}
}
