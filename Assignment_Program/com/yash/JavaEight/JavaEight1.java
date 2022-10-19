package com.yash.JavaEight;

import java.util.Scanner;

public class JavaEight1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string/no. you wanna check palindrom");
        String str1=sc.next();
        
    PalindromeInterface p=    (str)->
        {
            
            String rev="";
             for(int i=str.length()-1;i>=0;i--)
                 rev+=str.charAt(i);
             
             if(str.equals(rev))
                 System.out.println("given string is palindrom");
             else
                 System.out.println("given string is not palindrom");
            
        };
        p.isPalindrom(str1);
	}
}
