package com.mycompany.hr.service;

import org.springframework.stereotype.Service;

@Service 
public class StubHelloService implements HelloService{

	public String sayHello(String msg) {
		return "Hello " + msg;
	}

}
