package com.yash.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterMessageMain {
	public static void main(String[] args) {
		System.out.println("Setter Injection");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		SetterMesage sm=(SetterMesage)context.getBean("setterMsg");
		System.out.println(sm);
	}
}
