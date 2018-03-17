package com.example.springtrial.simple;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContextTest.xml")
public class SimpleBeanWithAnnotationTest {

	@Autowired
	private SimpleBeanWithAnnotation bean;

	@Test
	public void testIfAutowireWorkedOnBean() {
		// Any exception will denote problem with dependency injection
		// which will cause this test case to fail
		bean.check();
	}
}
