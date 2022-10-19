package com.yash.JUnitPrac;

public class JUnitTask6 {
	int sum=0;
	public int sumAndAdd() {
		for(int i=100;i<200;i++) {
			if(i%7==0) {
				sum+=i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		JUnitTask6 obj=new JUnitTask6();
		System.out.println(obj.sumAndAdd());
	}
}
