package com.yash.JUnitPrac;

public class JUnitTask1 {
	int sum=0;
	public int sumConsecutiveNo(int startNo) {
		for(int i=startNo;i<startNo+10;i++) {
			sum+=i;
		}
		System.out.println(sum);
		return sum;
	}
	
	public static void main(String[] args) {
		JUnitTask1 obj=new JUnitTask1();
		System.out.println(obj.sumConsecutiveNo(1));
	}
}
