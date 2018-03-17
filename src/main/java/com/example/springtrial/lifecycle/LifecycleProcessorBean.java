package com.example.springtrial.lifecycle;

import org.springframework.context.LifecycleProcessor;
import org.springframework.stereotype.Component;

@Component
public class LifecycleProcessorBean implements LifecycleProcessor {

	@Override
	public void start() {
		System.out.println("LifecycleProcessorBean.start");
	}

	@Override
	public void stop() {
		System.out.println("LifecycleProcessorBean.stop");
	}

	@Override
	public boolean isRunning() {
		System.out.println("LifecycleProcessorBean.isRunning");
		return false;
	}

	@Override
	public void onRefresh() {
		System.out.println("LifecycleProcessorBean.onRefresh");
	}

	@Override
	public void onClose() {
		System.out.println("LifecycleProcessorBean.onClose");
	}

}
