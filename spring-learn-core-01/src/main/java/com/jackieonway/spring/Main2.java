package com.jackieonway.spring;

import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

/**
 * @author Jackie
 * @version \$Id: Main2.java, v 0.1 2019-07-26 15:34 Jackie Exp $$
 */
public class Main2 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new GenericGroovyApplicationContext("helloService.groovy");
		HelloService4 helloService4 = applicationContext.getBean(HelloService4.class);
		System.out.println(helloService4.hello());
		System.out.println("--------------");
		GenericApplicationContext context = new GenericApplicationContext();
		new GroovyBeanDefinitionReader(context).loadBeanDefinitions("helloService.groovy");
		context.refresh();
		HelloService4 helloService5 = context.getBean("helloService4", HelloService4.class);
		System.out.println(helloService5.hello());
	}
}
