package com.yash.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrintMessageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print Message main");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		PrintMessage msg=(PrintMessage)context.getBean("m1");
		System.out.println(msg);
	}

}
