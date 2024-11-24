package com.grp01.springmaven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration              // here configuration means adding dependencies(assumption)
@ComponentScan(basePackages="com.grp01.springmaven")   //we used this line to remove bean of below

public class AppConfig {
	
	
//	  @Bean 					//bean in xml ,here also annotaion it looks same 
//	  public Samsung getPhone() 
//	  { 
//	  return new Samsung(); 
//	  }
	                  //here without   bean configuration we can execute by basescan,component,primary(if there is two classes implement interface)
//	  @Bean public MobileProcessor getProcessor() {
//	   return new SnapDragon(); 
//	   }
//	 

}
