package com.example.springtrial.componentscan;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContextTest.xml")
public class ExcludedInScanTest {

	/*
	 * required = false, so that Spring does not fail when bean not found.
	 */
	@Autowired(required = false)
	private ExcludedInScan bean;

	@Test
	public void testExclusion() {
		Assert.assertNull(bean);
	}
}
