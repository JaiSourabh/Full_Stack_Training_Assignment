//Program to store data related to item in Vector and after that sort the data.
package com.yash.collectionProgram;

import java.util.Collections;
import java.util.Vector;

public class CollectionTask5 {
	public static void main(String[] args) {
		Vector<String> vector=new Vector<String>();
		vector.add("Car");
		vector.add("Watch");
		vector.add("Shoes");
		vector.add("Pen");
		vector.add("Shirt");
		Collections.sort(vector);
		System.out.println(vector);
	}
}
