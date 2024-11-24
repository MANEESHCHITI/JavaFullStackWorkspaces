package com.vcube.SpringDiApp2;

public class HelloWorld1 {

	

	private String name;
	private String message;
	private int age;

	HelloWorld1(){
		
	}
	HelloWorld1(String name){
		this.name=name;
	}
	
	HelloWorld1(String name,String message){
		this.name=name;
		this.message=message;
	}
	
	HelloWorld1(String name ,String message,int age){
		
		this.name=name;
		this.message=message;
		this.age=age;
	}
	
	
	

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
