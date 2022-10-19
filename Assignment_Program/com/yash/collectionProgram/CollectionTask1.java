//Program to sort Collection elements in ascending order
package com.yash.collectionProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTask1 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(30);
		Collections.sort(list);
		System.out.println(list);
	}
}
