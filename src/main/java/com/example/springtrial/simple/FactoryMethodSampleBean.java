package com.example.springtrial.simple;

import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryMethodSampleBean {
	private final double id;

	/**
	 * We set constructor to private, so its bean can not be created from external
	 * class.
	 */
	private FactoryMethodSampleBean() {
		id = Math.random();
	}

	/**
	 * applicationContext defines that to create instance of
	 * FactoryMethodSampleBean<br/>
	 * It has to call this getInstance method.
	 */
	public static FactoryMethodSampleBean getInstance() {
		return new FactoryMethodSampleBean();
	}

	public double getId() {
		return id;
	}

}
