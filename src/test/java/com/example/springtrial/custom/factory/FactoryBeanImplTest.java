package com.example.springtrial.custom.factory;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContextTest.xml")
public class FactoryBeanImplTest {

	@Autowired
	private ComplexObject bean;

	@Test
	public void testIfBeanCreated() {
		Assert.assertTrue(23.45 == bean.getId());
	}
}