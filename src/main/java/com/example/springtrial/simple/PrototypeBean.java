package com.example.springtrial.simple;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
/**
 * proxyMode = ScopedProxyMode.TARGET_CLASS will force injecting proxy of this class,
 * so it is not required to use lookup method or ApplicationContextAware bean to get a different scoped bean.
 * 
 * @author inpratik13
 *
 */
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PrototypeBean {
	private final double id;
	
	public PrototypeBean() {
		id = Math.random() * 100; 
	}
	
	public double getId() {
		return id;
	}
}
