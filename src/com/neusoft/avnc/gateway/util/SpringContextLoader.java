/**
 * Create Date:2013-3-8
 */
package com.neusoft.avnc.gateway.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <br>Title:Spring Context loader
 * <br>Description:读取Spring配置
 * <br>Author:曲锐(qur@neusoft.com)
 * <br>Date:2013-3-8
 */
public class SpringContextLoader {
	
	public static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	
	public SpringContextLoader(){
		
	}

	/**
	 * @return the context
	 */
	public static ClassPathXmlApplicationContext getContext() {
		return context;
	}

	/**
	 * @param context the context to set
	 */
	public static void setContext(ClassPathXmlApplicationContext context) {
		SpringContextLoader.context = context;
	}
	
}
