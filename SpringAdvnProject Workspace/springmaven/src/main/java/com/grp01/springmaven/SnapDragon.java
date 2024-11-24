package com.grp01.springmaven;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary  //if there were two classes which implements interface and having ambiquiety by annotaion we use this primary for take this as a preference.
public class SnapDragon implements MobileProcessor {

	@Override
	public void process() {
		System.out.println("world best cpu");
	}

}
