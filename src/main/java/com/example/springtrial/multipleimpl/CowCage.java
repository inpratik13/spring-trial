package com.example.springtrial.multipleimpl;

import org.springframework.stereotype.Component;

@Component
public class CowCage implements Cage<Cow> {

	@Override
	public String getName() {
		return "Cow cage";
	}

	@Override
	public Cow getAnimal() {
		return new Cow();
	}

}
