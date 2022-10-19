package com.yash.JUnitPrac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JUnitTask7 {
	int rem;
	List<Integer> list=new ArrayList<Integer>();
	public String binaryEqui(int num) {
		String s="";
	    while(num>0) {
	    	rem=num%2;
	    	num=num/2;
	    	list.add(rem);
	    }
	    Collections.reverse(list);
	    for(Integer a:list) {
//	    	System.out.print(a);
	    	s+=a;
	    }
	    return s;
	}
	
	public static void main(String[] args) {
		JUnitTask7 obj=new JUnitTask7();
		obj.binaryEqui(21);
	}
}
