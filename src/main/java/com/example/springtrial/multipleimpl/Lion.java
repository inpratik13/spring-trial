package com.example.springtrial.multipleimpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * If we do not use @Primary annotation, then applicationContext will not
 * load<br/>
 * As there are 2 implementations of same type Animal (cow and lion).<br/>
 * Defining @Primary denotes that Lion has to be injected when there is singular
 * Injection required.
 *
 */
@Primary
@Component
public class Lion implements Animal {

	@Override
	public String getName() {
		return "Lion";
	}

	@Override
	public boolean isWild() {
		return true;
	}

}
