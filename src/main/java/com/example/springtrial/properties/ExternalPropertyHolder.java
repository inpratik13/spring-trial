package com.example.springtrial.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalPropertyHolder {

	private final String name;
	// You can also access system environment variables
	private @Value("${PATH}") String path;

	@Autowired
	public ExternalPropertyHolder(@Value("${external.property.name}") String name) {
		super();
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getName() {
		return name;
	}

}
