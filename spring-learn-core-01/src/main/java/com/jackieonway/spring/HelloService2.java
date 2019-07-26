
package com.jackieonway.spring;

/**
 * @author Jackie
 * @version \$Id: HelloService2.java, v 0.1 2019-07-26 14:38 Jackie Exp $$
 */
public class HelloService2 {

	private HelloDao2 helloDao;

	public void setHelloDao(HelloDao2 helloDao) {
		this.helloDao = helloDao;
	}

	public String hello(){
		System.out.println("Hello Service 2");
		return "Hello Service 2 调用 Hello Dao 2 方法返回结果是: " + helloDao.hello();
	}
}
