package com.grp01.springmaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("samsung") // we can write @Component instead @Component("samsung") by default it takes decaptaliaze classname
public class Samsung {

	@Autowired
	MobileProcessor cpu; /*
							 * //here autowired means it checks the configuration but here we didnt wrote
							 * xml but appconfig is the coonfiguration here it checks only return type for
							 * object created
							 */
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("octa core,1gb");
		cpu.process();
	}
}
