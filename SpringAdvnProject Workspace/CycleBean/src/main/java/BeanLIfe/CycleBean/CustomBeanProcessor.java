package BeanLIfe.CycleBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanProcessor implements BeanPostProcessor {
	
	public  Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("userService1")) {
			System.out.println("before initialization");
		}
		return bean;
	}
	
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("userService1")) {
			System.out.println("after initialization");
		}	
		return bean;
	}
	
	

}