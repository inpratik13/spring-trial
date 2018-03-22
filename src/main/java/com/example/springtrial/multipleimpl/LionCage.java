package com.example.springtrial.multipleimpl;

import org.springframework.stereotype.Component;

@Component
public class LionCage implements Cage<Lion> {

	@Override
	public String getName() {
		return "Lion cage";
	}

	@Override
	public Lion getAnimal() {
		return new Lion();
	}

}
