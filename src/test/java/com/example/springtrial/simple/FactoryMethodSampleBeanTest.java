package com.example.springtrial.simple;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContextTest.xml")
public class FactoryMethodSampleBeanTest {

	@Autowired
	private FactoryMethodSampleBean bean;

	@Test
	public void testIfBeanCreated() {
		/**
		 * If bean was not initialized by Spring, it will throw error.
		 */
		Assert.assertNotNull(bean.getId());
	}
}
