package com.vcube.SpringDiApp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//setter injection.constructor of 1  value ,2 value ,3 value with index and if if we want int we take type=int


public class MainApp1 {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/vcube/SpringDiApp2/beans.xml");
//		HelloWorld1 obj = (HelloWorld1) context.getBean("helloWorld");
//		
//		System.out.println(obj.getMessage());
//		System.out.println(obj.getName());


		
		HelloWorld1 obj3 = (HelloWorld1) context.getBean("helloWorld1");
		System.out.println(obj3.getName());
		
		
		
		HelloWorld1 obj4 = (HelloWorld1) context.getBean("helloWorld2");
		System.out.println(obj4.getName());
		System.out.println(obj4.getMessage());
		//System.out.println(obj4.getAge());
		
		HelloWorld1 obj = (HelloWorld1) context.getBean("helloWorld3");
		System.out.println(obj.getName());
		System.out.println(obj.getMessage());
		System.out.println(obj.getAge());
	}
	

}
