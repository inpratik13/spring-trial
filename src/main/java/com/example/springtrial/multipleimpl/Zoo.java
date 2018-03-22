package com.example.springtrial.multipleimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Zoo {

	/**
	 * All implementation of Animal will be injected in this array.<br/>
	 * We can use any standard Java collection instead of an array too.
	 */
	@Autowired
	private Animal[] allAnimals;

	/**
	 * As there are multiple implementations of Animal,<br/>
	 * the one with @primary annotation will be injected here.<br/>
	 * Or applicationContext will fail to load if @Primary is not given to any bean
	 * or multiple bean are defined as @primary.<br/>
	 * Instead of using @primary on any bean, you can simply provide<br/>
	 * 
	 * @Qualifier("lion")<br/>
	 * Annotation on following property to tell Spring to use "Lion" implementation
	 * of animal to inject here.<br/>
	 * 
	 * Here "lion" is name of bean (as it is default).<br/>
	 * But if you have set custom name for bean Lion by using<br/>
	 * 
	 * @Component("lionKing")<br/>
	 * Then "lionKing" name has to be used in @Qualifier annotation on this
	 * property.
	 */
	@Autowired
	private Animal king;

	/**
	 * Using generics as qualifiers.
	 */
	@Autowired
	private Cage<Lion> lionCage;
	@Autowired
	private Cage<Cow> cowCage;

	public Animal[] getAllAnimals() {
		return allAnimals;
	}

	public void setAllAnimals(Animal[] allAnimals) {
		this.allAnimals = allAnimals;
	}

	public Animal getKing() {
		return king;
	}

	public void setKing(Animal king) {
		this.king = king;
	}

	public Cage<Lion> getLionCage() {
		return lionCage;
	}

	public void setLionCage(Cage<Lion> lionCage) {
		this.lionCage = lionCage;
	}

	public Cage<Cow> getCowCage() {
		return cowCage;
	}

	public void setCowCage(Cage<Cow> cowCage) {
		this.cowCage = cowCage;
	}

}
