
package com.jackieonway.spring;

/**
 * @author Jackie
 * @version \$Id: HelloService4.java, v 0.1 2019-07-26 14:48 Jackie Exp $$
 */
public class HelloService4 {

	private HelloDao4 helloDao;

	public void setHelloDao(HelloDao4 helloDao4) {
		this.helloDao = helloDao4;
	}

	public String hello(){
		System.out.println("Hello Service 4");
		return "Hello Service 4 调用 Hello Dao 4 方法返回结果是: " + helloDao.hello();
	}
}
