//Program to store data in hashmap. Keys are the city name and values are the population. 
//Now you have to sort the all elements (on the basis of city name ) in hashmap and 
//print the detail

package com.yash.collectionProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionTask6 {
	static Map<String,Integer> hmap=new HashMap<>();

	public static void main(String[] args) {
		
		hmap.put("Indore",50000 );
		hmap.put("Dewas", 200000);
		hmap.put("Ujjain", 300000);
		System.out.println("After sorting on basis of key");
		sortedByKey();
	}

	private static void sortedByKey() {
		ArrayList<String> alist=new ArrayList<>(hmap.keySet());
		 Collections.sort(alist);
		 
	        for (String x : alist)
	            System.out.println("Key = " + x
	                               + ", Value = " + hmap.get(x));
	}
}
