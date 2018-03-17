package com.example.springtrial.custom.scope;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class TimelyScope implements Scope {

	private final long lifeTime;
	private final Map<String, TimeAndBean> store = new HashMap<>();

	public TimelyScope(long lifeTime) {
		this.lifeTime = lifeTime;
	}

	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		TimeAndBean tab = store.get(name);
		if (tab == null || hasDied(tab)) {
			tab = new TimeAndBean(new Date(), objectFactory.getObject());
			store.put(name, tab);
		}

		return tab.getBean();
	}

	@Override
	public Object remove(String name) {
		return store.remove(name);
	}

	@Override
	public void registerDestructionCallback(String name, Runnable callback) {
		// TODO NOT IMPLEMENTED NOW
	}

	@Override
	public Object resolveContextualObject(String key) {
		// TODO NOT IMPLEMENTED NOW
		return null;
	}

	@Override
	public String getConversationId() {
		return "timely";
	}

	private boolean hasDied(TimeAndBean tab) {
		long age = System.currentTimeMillis() - tab.getDate().getTime();
		return age > lifeTime;
	}

	private static class TimeAndBean {
		private final Date date;
		private final Object bean;

		public TimeAndBean(Date date, Object bean) {
			super();
			this.date = date;
			this.bean = bean;
		}

		public Date getDate() {
			return date;
		}

		public Object getBean() {
			return bean;
		}

	}
}
