package org.webservice.demo;
import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
	public class HelloWorldService {
	public HelloWorldService() {
	System.out.println("HelloWorldService Object Has Been Created");
	}
	@WebMethod
	public String sayHello(String name) {
	return "Hello! "+name+"Welcome to Test Service";
		}
	}
