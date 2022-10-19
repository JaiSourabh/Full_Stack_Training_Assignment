//WAP to store elements in List and remove all duplicates names of items. After 
//duplicates are removed print all elements in descending order.

package com.yash.collectionProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTask4 {
  public static void main(String[] args) {
	  	List<String> list=Arrays.asList("Watch","Pen","City","Watch","comb");
		System.out.println("Initial List are : ");
		System.out.println(list);
		List<String> newList = removeDuplicateAndSortDescendingOrder(list);
		System.out.println("List after removing duplicates and arranging in ascending order :  "+newList);
}

private static List<String> removeDuplicateAndSortDescendingOrder(List<String> list) {

	List<String> newList=new ArrayList<>();
	for(String a : list) {
		if(!newList.contains(a)) {
			newList.add(a);
		}
	}
	
	//For descending order
	Collections.sort(newList);
	Collections.reverse(newList);
	return newList;
}
}
