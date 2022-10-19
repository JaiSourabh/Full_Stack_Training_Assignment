package com.yash.JUnitPrac;

public class JUnitTask4 {
	int res=0,rem;
	public int sumOfDigits(int num) {
		while(num>0) {
			rem=num%10;
			res=res+rem;
			num=num/10;
		}
		return res;
	}
	
}
