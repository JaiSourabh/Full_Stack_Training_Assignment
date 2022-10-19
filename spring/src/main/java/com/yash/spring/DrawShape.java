package com.yash.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawShape {
	public static void main(String[] args) {
		Shape s1=new Rectangle();
		//s1.draw();
		
		System.out.println("Shape Demo");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Shape s=(Shape) context.getBean("shapeClass");
		s.draw();
	}
}
