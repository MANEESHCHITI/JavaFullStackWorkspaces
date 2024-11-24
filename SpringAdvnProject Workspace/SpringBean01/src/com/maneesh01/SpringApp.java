package com.maneesh01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//setter injection,constructor injection, annotation alone , annotation and xml mix
public class SpringApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans01.xml");
		/*
		 * Vehicle dov=(Vehicle)context.getBean("id01"); dov.ride(); // dynamic by class
		 * chaging
		 */

		/*
		 * Vehicle dov=(Vehicle)context.getBean("bike"); dov.ride(); // this is by
		 * annotation
		 */

		/*
		 * SpringDov dov=(SpringDov)context.getBean("id01");
		 * System.out.println(dov.getBrand()); //setter injection
		 */

	
		/*
		 * SpringDov dov=(SpringDov)context.getBean("id01");
		 * System.out.println(dov.getBrand()); //constructor injection
		 */	
		
		Car obj=(Car)context.getBean("car");
		obj.ride();

	}

}
