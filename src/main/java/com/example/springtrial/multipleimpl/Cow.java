package com.example.springtrial.multipleimpl;

import org.springframework.stereotype.Component;

@Component
public class Cow implements Animal {

	@Override
	public String getName() {
		return "Cow";
	}

	@Override
	public boolean isWild() {
		return false;
	}

}
