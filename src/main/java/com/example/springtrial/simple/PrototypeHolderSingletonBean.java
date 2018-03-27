package com.example.springtrial.simple;

import javax.inject.Inject;
import javax.inject.Provider;

import org.springframework.stereotype.Component;

@Component
public class PrototypeHolderSingletonBean {

	/**
	 * Will be a proxy as PrototypeBean declares proxyMode = ScopedProxyMode.TARGET_CLASS
	 */
	private final PrototypeBean bean;

	/*
	 * You can use @Inject or @Autowired on method, property or constructor to make Spring inject a bean.<br/>
	 * But using @Inject you can inject Provider of Bean, which is useful when accessing bean of different type,<br/>
	 * Or while you want to have Lazy access to the bean etc.
	 */
	@Inject
	public PrototypeHolderSingletonBean(Provider<PrototypeBean> beanProvider) {
		super();
		this.bean = beanProvider.get();
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
