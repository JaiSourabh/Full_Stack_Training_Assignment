package com.yash.aopconcpet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.aopconcpet.services.PaymentService;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/yash/aopconcpet/config.xml");
        PaymentService pService= context.getBean("paymentService",PaymentService.class);
        pService.makePayment(5000);
    }
}
