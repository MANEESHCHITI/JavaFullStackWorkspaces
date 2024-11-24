package com.maneesh01;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	@Override
	public void ride() {
		System.out.println("Bike is to ride");
	}

}
