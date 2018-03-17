package com.example.springtrial.lifecycle;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContextTest.xml")
public class LifeCycleAwareBeanTest {

	@Autowired
	private LifeCycleAwareBean bean;

	@Test
	public void testApplicationContextAwareness() {
		Assert.assertTrue(bean.isInitialized());
	}
}
