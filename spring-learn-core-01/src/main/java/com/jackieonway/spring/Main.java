package com.jackieonway.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jackie
 * @version \$Id: Main.java, v 0.1 2019-07-26 14:16 Jackie Exp $$
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("hello-service.xml","hello-dao.xml");
		HelloService helloService =  applicationContext.getBean("helloService",HelloService.class);
		helloService.setHelloDao(applicationContext.getBean("helloDao",HelloDao.class));
		System.out.println(helloService.hello());
		System.out.println("----------------");
		ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("hello-service2.xml");
		HelloService2 helloService2 = applicationContext2.getBean("helloService",HelloService2.class);
		System.out.println(helloService2.hello());
		System.out.println("----------------");
		ApplicationContext applicationContext3 = new ClassPathXmlApplicationContext("hello-service3.xml");
		HelloService3 helloService3 = applicationContext3.getBean("helloService",HelloService3.class);
		System.out.println(helloService3.hello());
		System.out.println("***************");
		ApplicationContext applicationContext4 = new ClassPathXmlApplicationContext("hello-service3.xml");
		HelloService3 helloService4 = applicationContext4.getBean(HelloService3.class);
		System.out.println(helloService4.hello());
		System.out.println("***************");
		ApplicationContext applicationContext5 = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloService helloService5 = applicationContext5.getBean("helloService",HelloService.class);
		System.out.println(helloService5.hello());
	}
}
