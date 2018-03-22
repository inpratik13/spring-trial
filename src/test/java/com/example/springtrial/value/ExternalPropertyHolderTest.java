package com.example.springtrial.value;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.springtrial.value.ExternalPropertyHolder;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContextTest.xml")
public class ExternalPropertyHolderTest {

	@Autowired
	private ExternalPropertyHolder bean;

	@Test
	public void testPropertiesSet() {
		Assert.assertNotNull(bean.getPath());
		Assert.assertEquals("test_name", bean.getName());
		Assert.assertEquals("auto_set", bean.getAutoSet());
	}
}
