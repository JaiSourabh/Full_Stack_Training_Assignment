package com.yash.arraybasics;
//You are given a sequence of Character in the form of Array. Now you have to put all vowels and 
//consonants together in the array
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayTask8 {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a String input");
		    String input=sc.nextLine();

		    String allVowel="a,e,i,o,u,A,E,I,O,U";
		    List<String> vowelList=new ArrayList<>();
		    List<String> constantList=new ArrayList<>();

		    input.chars().mapToObj(c -> String.valueOf((char) c)).forEach(c->{
		     if(allVowel.contains(c)){
		       vowelList.add(c);
		      }
		     else if(!c.equals(" ")){
		       constantList.add(c);
		     }
		    });

		    String[] constantArray=constantList.toArray(new String[0]);
		    String[] vowelArray=vowelList.toArray(new String[0]);
		    System.out.println("Constants : "+Arrays.toString(constantArray));
		    System.out.println("Vowel : "+Arrays.toString(vowelArray));
	}
}
