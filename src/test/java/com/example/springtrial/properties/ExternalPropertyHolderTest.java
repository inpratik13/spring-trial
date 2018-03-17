package com.example.springtrial.properties;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContextTest.xml")
public class ExternalPropertyHolderTest {

	@Autowired
	private ExternalPropertyHolder bean;

	@Test
	public void testPropertiesSet() {
		Assert.assertNotNull(bean.getPath());
		Assert.assertEquals("test_name", bean.getName());
	}
}
