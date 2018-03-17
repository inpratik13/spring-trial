package com.example.springtrial.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * This bean is not declared in applicationContext directly. <br/>
 * but it is detected by spring due to <context:component-scan...<br/>
 * 
 * @author inpratik13
 *
 */
@Component
public class SimpleBeanWithAnnotation {

	private final SimpleBean simpleBean;

	@Autowired
	private SimpleBeanLoopkup lookup;

	@Autowired
	public SimpleBeanWithAnnotation(SimpleBean simpleBean) {
		this.simpleBean = simpleBean;
	}

	public boolean check() {
		return lookup.getSimpleBeanName().equals(simpleBean.getName());
	}
}
