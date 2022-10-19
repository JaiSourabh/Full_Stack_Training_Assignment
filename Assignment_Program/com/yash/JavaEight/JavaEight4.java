package com.yash.JavaEight;

import java.util.Scanner;

public class JavaEight4 {
	
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	      System.out.println("Initial String");
	      String str=sc.nextLine();
	      
	      System.out.println("Index where new string will be inserted  ");
	      int index=sc.nextInt();
	                            
	      System.out.println("String which you want to insert into first string ");
	      String newSub=sc.next();
	      
	      StringInterface si = (str1,newSub1,index1) -> {
	    	  StringBuffer resString1 = new StringBuffer(str);
		      resString1.insert(index + 1, newSub);
	    	  return resString1;
	      };
	      
	      StringBuffer s= si.stringIntoOtherString(str, newSub, index);
	      
	      System.out.println(s);
	}
}
