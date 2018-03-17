package com.example.springtrial.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrototypeHolderSingletonBean {

	/**
	 * Will be a proxy as PrototypeBean declares proxyMode = ScopedProxyMode.TARGET_CLASS
	 */
	private final PrototypeBean bean;

	@Autowired
	public PrototypeHolderSingletonBean(PrototypeBean bean) {
		super();
		this.bean = bean;
	}

	public double getPrototypeBeanId() {
		/**
		 * Each call to getId will be routed to a new PrototypeBean,<br/>
		 * As PrototypeBean declares proxyMode = ScopedProxyMode.TARGET_CLASS
		 * 
		 */
		return bean.getId();
	}
}
