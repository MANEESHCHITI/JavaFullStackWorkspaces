package com.grp01.springmaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
// here we created configuration class instead of xml here we used bean annotation,interfaces implemented by two classes ,primary,component,autowired
public class App 
{
    public static void main( String[] args )
    {                    		// here in the below we should give the configuration filr name in for annotation if we have xml we give xml file name
    	ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);//this line is for creating object
    	Samsung s=factory.getBean(Samsung.class);  //here we want obj so in config we wrote obj for samsung
    	s.config();
    	
    }
}
