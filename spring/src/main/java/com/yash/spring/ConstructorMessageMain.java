package com.yash.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorMessageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Constructorn Injection");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		ConstructorMessage cm=(ConstructorMessage)context.getBean("cm");
		System.out.println(cm);
	}

}
