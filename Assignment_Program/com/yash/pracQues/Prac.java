package com.yash.pracQues;

interface A{
	String test(String str);
}

public class Prac implements A {
	
	public static void main(String[] args) {

	}

	@Override
	public String test(String str) {
		
		return "Hello"+str;
	}
}
