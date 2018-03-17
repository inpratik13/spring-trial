package com.example.springtrial.simple;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContextTest.xml")
public class PrototypeHolderSingletonBeanTest {

	@Autowired
	private PrototypeHolderSingletonBean bean;

	@Test
	public void checkIfLookupWorked() {
		double id1 = bean.getPrototypeBeanId();
		double id2 = bean.getPrototypeBeanId();
		Assert.assertNotEquals(id1, id2);
	}
}
