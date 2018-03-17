package com.example.springtrial.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class LifeCycleAwareBean {
	private boolean initialized = false;

	@PostConstruct
	public void init() {
		System.out.println("LifeCycleAwareBean.init");
		initialized = true;
	}

	@PreDestroy
	public void cleanup() {
		System.out.println("LifeCycleAwareBean.cleanup");
		initialized = false;
	}

	public boolean isInitialized() {
		return initialized;
	}

}
