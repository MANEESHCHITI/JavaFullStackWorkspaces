package BeanLIfe.CycleBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
       // ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BeanLIfe/CycleBean/beans.xml");
    	ApplicationContext context = new ClassPathXmlApplicationContext("BeanLIfe/CycleBean/beans.xml");
//         context.close();
    	 ((AbstractApplicationContext) context).close();
    	
    	
       
    }
}
