package com.yash.arraybasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumber {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(10,5,2,79,15);
		List<Integer> list2=new ArrayList<>();
		for(Integer a : list1) {
			if(a%2==0)
				list2.add(a);
		}
		System.out.println(list2);
		
		List<Integer> newList=list1.stream().filter(i -> i%2!=0).collect(Collectors.toList());
		System.out.println(newList);
		List<Integer> list22=list1.stream().filter(i -> i > 50).collect(Collectors.toList());
		System.out.println(list22);
		
		//
		List<String> names=Arrays.asList("Anuj","Naman","Aman","Raj");
		names.stream().filter(e -> e.startsWith("A")).forEach(s -> {
			System.out.println(s);
		});
		
		List<Integer> nList=list1.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println(nList);
		
		list1.stream().sorted().forEach(e -> {
			System.out.println(e);
		});
		
		Integer item =list1.stream().max((x,y)-> x.compareTo(y)).get();
		System.out.println(item);
	}
}
