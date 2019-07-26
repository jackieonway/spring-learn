
package com.jackieonway.spring;

/**
 * @author Jackie
 * @version \$Id: HelloService.java, v 0.1 2019-07-26 14:15 Jackie Exp $$
 */
public class HelloService {

	private HelloDao helloDao;

	public void setHelloDao(HelloDao helloDao) {
		this.helloDao = helloDao;
	}

	public String hello(){
		System.out.println("Hello Service");
		return "Hello Service 调用 Hello Dao 方法返回结果是: " + helloDao.hello();
	}
}
