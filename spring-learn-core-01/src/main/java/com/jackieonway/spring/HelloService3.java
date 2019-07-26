
package com.jackieonway.spring;

/**
 * @author Jackie
 * @version \$Id: HelloService3.java, v 0.1 2019-07-26 14:48 Jackie Exp $$
 */
public class HelloService3 {

	private HelloDao3 helloDao;

	public void setHelloDao(HelloDao3 helloDao) {
		this.helloDao = helloDao;
	}

	public String hello(){
		System.out.println("Hello Service 3");
		return "Hello Service 3 调用 Hello Dao 3 方法返回结果是: " + helloDao.hello();
	}
}
