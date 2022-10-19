package com.yash.JUnitPrac;

public class FibonacciSeries {

	public String fibonacciSeries(int num) {
		int n1=0;				
		int n2=1;
        int n3=0;  
        
        String str=n1+" "+n2;  
		    
		 for(int i=2;i<num;++i)  
		 {    
		  n3=n1+n2;   
		  str+=" "+n3;   
		  n1=n2;//1    
		  n2=n3;//1    
		 } 
		 
		 return str;
	}
}
