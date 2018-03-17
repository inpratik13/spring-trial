package com.example.springtrial.custom.scope;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContextTest.xml")
public class TimelyScopedBeanTest {

	@Autowired
	private TimelyScopedBean bean;

	@Test
	public void testInTime() {
		double id1 = bean.getId();
		double id2 = bean.getId();
		Assert.assertTrue(id1 == id2);
	}
	
	@Test
	public void testNotInTime() {
		double id1 = bean.getId();
		
		try {
			System.out.println("sleeping for 5sec");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		double id2 = bean.getId();
		Assert.assertTrue(id1 != id2);
	}
	
}
