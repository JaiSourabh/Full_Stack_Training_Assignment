package com.yash.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Welcome to Spring First Application");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee e1=context.getBean("employee",Employee.class);
		System.out.println(e1);
    }
}
