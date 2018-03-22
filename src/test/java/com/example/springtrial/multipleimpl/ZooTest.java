package com.example.springtrial.multipleimpl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * This test shows how can we handle multiple implementations of same type with
 * Spring.
 * 
 * @author inpratik13
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContextTest.xml")
public class ZooTest {

	@Autowired
	private Zoo zoo;

	@Test
	public void isKingAutowired() {
		Assert.assertNotNull(zoo.getKing());
		Assert.assertEquals(zoo.getKing().getName(), "Lion");
	}

	@Test
	public void areThereTwoAnimalsInZoo() {
		Assert.assertNotNull(zoo.getAllAnimals());
		Assert.assertTrue(zoo.getAllAnimals().length == 2);
	}
	
	@Test
	public void autowireByGenericsWorked() {
		Assert.assertNotNull(zoo.getLionCage());
		Assert.assertTrue(zoo.getLionCage().getAnimal() instanceof Lion);
		
		Assert.assertNotNull(zoo.getCowCage());
		Assert.assertTrue(zoo.getCowCage().getAnimal() instanceof Cow);
	}
}
