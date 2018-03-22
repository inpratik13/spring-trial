package com.example.springtrial.simple;

import org.springframework.stereotype.Component;

@Component
public class FactoryObject {

	/**
	 * applicationContext defines that to create instance of
	 * FactoryGeneratedObject<br/>
	 * It has to call this {@link FactoryObject#generateFactoryGeneratedObject} method.<br/><br/>
	 * You can also declare this method with @Bean annotation and aforementioned xml config is not required.<br/>
	 * @Scope and @Qualifier("name") also can be used with @Bean annotation.
	 */
	public FactoryGeneratedObject generateFactoryGeneratedObject() {
		FactoryGeneratedObject obj = new FactoryGeneratedObject();
		obj.setId(88.99);
		return obj;
	}
}
