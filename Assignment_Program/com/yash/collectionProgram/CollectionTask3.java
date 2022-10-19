//Program  to store elements in List and remove all duplicates value from it. (Numbers 
//should be inserted). When duplicates are removed print all elements in ascending order

package com.yash.collectionProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTask3 {
	
	public static List<Integer> removeDuplicateAndSort(List<Integer> list){
		List<Integer> newList=new ArrayList<>();
		for(Integer a : list) {
			if(!newList.contains(a)) {
				newList.add(a);
			}
		}
		
		//For ascending order
		Collections.sort(newList);
		return newList;
	}
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(70,10,20,10,30,40,50,40);
		System.out.println("Initial List are : ");
		System.out.println(list);
		List<Integer> newList = removeDuplicateAndSort(list);
		System.out.println("List after removing duplicates and arranging in ascending order :  "+newList);
	}
}
