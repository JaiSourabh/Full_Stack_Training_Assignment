package com.yash.JUnitPrac;

public class Factorial {
	public int fact(int num) {
		int res=1;
		for(int i=num;i>0;i--) {
			res=(res*i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		Factorial f =new Factorial();
		System.out.println(f.fact(5));
	}
}
