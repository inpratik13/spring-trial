package com.example.springtrial.custom.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "timely", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class TimelyScopedBean {
	private final double id;
	
	public TimelyScopedBean() {
		id = Math.random() * 100; 
	}
	
	public double getId() {
		return id;
	}
}
