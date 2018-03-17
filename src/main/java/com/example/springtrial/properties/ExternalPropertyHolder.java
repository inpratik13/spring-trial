package com.example.springtrial.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalPropertyHolder {

	private final String name;
	// You can also access system environment variables
	private @Value("${PATH}") String path;
	// This property will be set automatically, without any annotation, As
	// PropertyOverrideConfigurer is defined in context file, it will detect
	// properties from external_auto_set and set them on this bean
	private String autoSet;

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

	public String getAutoSet() {
		return autoSet;
	}

	public void setAutoSet(String autoSet) {
		this.autoSet = autoSet;
	}

}
