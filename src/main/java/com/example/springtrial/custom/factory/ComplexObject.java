package com.example.springtrial.custom.factory;

/**
 * Any Stereotype annotation is not required as ComplexObjectFactoryBeanImpl
 * reveals that ComplexObject is a bean. No xml config required.
 * 
 * @author inpratik13
 *
 */
public class ComplexObject {
	private final double id;

	public ComplexObject(double id) {
		this.id = id;
	}

	public double getId() {
		return id;
	}

}
