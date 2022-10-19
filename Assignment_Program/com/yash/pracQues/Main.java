package com.yash.pracQues;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main class");
		
		FirstInterface i1=new InterfaceImpl();
		i1.sayHello();
		
		FirstInterface i2=new FirstInterface() {
			
			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("Anonoyms interface");
			}
		};
		
		i2.sayHello();
		
		FirstInterface i=() -> System.out.println("lambda hello");
		
		i.sayHello();
		
//		SecondInterface s1 = (a,b) -> a+b;
//		
//		System.out.println(s1.sum(5, 5));
		
		SecondInterface s2=(str)-> str.length();
		System.out.println(s2.getMsg("Hi"));
	}

}
