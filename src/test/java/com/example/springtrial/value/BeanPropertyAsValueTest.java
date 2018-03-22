package com.example.springtrial.value;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.springtrial.value.ExternalPropertyHolder;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContextTest.xml")
public class BeanPropertyAsValueTest {

	@Autowired
	private ExternalPropertyHolder bean;

	private @Value("#{externalPropertyHolder.name}") String name;

	@Test
	public void testPropertiesSet() {
		Assert.assertEquals(bean.getName(), name);
	}
}
