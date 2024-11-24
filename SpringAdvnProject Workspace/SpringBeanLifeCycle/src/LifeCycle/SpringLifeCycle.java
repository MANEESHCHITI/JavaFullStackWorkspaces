package LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLifeCycle {
	public static void main(String args[]) {

		ApplicationContext context=new ClassPathXmlApplicationContext("/SpringBeanLifeCycle/src/LifeCycle/beans.xml");

	}
}
