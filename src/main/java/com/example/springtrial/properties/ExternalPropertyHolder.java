package com.example.springtrial.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalPropertyHolder {

	private final String name;

	@Autowired
	public ExternalPropertyHolder(@Value("${external.property.name}") String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
