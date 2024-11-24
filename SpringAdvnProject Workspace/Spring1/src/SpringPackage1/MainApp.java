package SpringPackage1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// setter injection in spring
public class MainApp {

	public static void main(String[] args) {

		System.out.println("main method started");
	
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		
		System.out.println(obj.getMessage());
		System.out.println(obj.getName());
		
	}

}
