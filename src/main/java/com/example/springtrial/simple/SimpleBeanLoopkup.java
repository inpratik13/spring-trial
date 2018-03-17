package com.example.springtrial.simple;

/**
 * Lookup in Spring is used specially when you want to inject bean to a
 * different scoped bean.<br/>
 * Although, In this case SimpleBean is same scoped as SimpleBeanLoopkup for
 * simplicity.<br/>
 * Class must not be final so it can be extended by Spring.
 * 
 * @author inpratik13
 *
 */
public class SimpleBeanLoopkup {

	/**
	 * We can leave this method and class abstract if we want.<br/>
	 * As Spring will extend the class and override the method.<br/>
	 * <br/>
	 * Method must be non-final and protected or public.
	 * 
	 * @return
	 */
	protected SimpleBean getSimpleBean() {
		/**
		 * We will force Spring to override this method, with implementation to return a
		 * SimpleBean.
		 */
		return null;
	}

	public String getSimpleBeanName() {
		return getSimpleBean().getName();
	}

}
