package com.example.springtrial.simple;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SimpleBean implements ApplicationContextAware {
	private int order;
	private final String name;
	private ApplicationContext applicationContext;

	/**
	 * Name will be injected into constructor.
	 * 
	 * @param name
	 */
	public SimpleBean(String name) {
		super();
		this.name = name;
	}

	public int getOrder() {
		return order;
	}

	/**
	 * Order will be set by Spring after creating the bean.
	 * 
	 * @param order
	 */
	public void setOrder(int order) {
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public boolean hasApplicationContext() {
		return this.applicationContext != null;
	}

	/**
	 * Spring will find that this bean implements ApplicationContextAware,<br/>
	 * And it will trigger this setter with applicationContext.<br/>
	 * This can be used as a workaround to 'look-up' method, <br/>
	 * for getting bean of different scope.
	 * 
	 */
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.applicationContext = arg0;
	}

}
