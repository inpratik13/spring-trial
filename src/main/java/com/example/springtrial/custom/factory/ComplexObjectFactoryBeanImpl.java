package com.example.springtrial.custom.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
/**
 * It defines generation of a bean.</br>
 * By implementing FactoryBean interface. <br/>
 * No xml config required.
 * 
 * @author inpratik13
 *
 */
public class ComplexObjectFactoryBeanImpl implements FactoryBean<ComplexObject> {

	private ComplexObject obj;
	private final Class<ComplexObject> TYPE = ComplexObject.class;

	@Override
	public ComplexObject getObject() throws Exception {
		if (obj == null) {
			obj = new ComplexObject(23.45);
		}
		return obj;
	}

	@Override
	public Class<?> getObjectType() {
		return TYPE;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
