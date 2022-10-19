package com.yash.arraybasics;
//WAP to create a dynamic array. Dynamic Array means when user want to input the number 
//more than size of array it will increase the size of array without throwing exception.
public class ArrayTask3 {

	int array[];
	int size;
	int capacity;

	ArrayTask3() {
		this(1);
	}

	ArrayTask3(int initialCapacity) {
		array = new int[initialCapacity];
		size = 0;
		capacity = initialCapacity;
	}

	public void add(int ele) {
		if (size == capacity) {
			resize(2 * capacity);
		}
		array[size++] = ele;
	}

	public int delete() {
		if (size == 0) {
			throw new RuntimeException("Array is empty");
		}
		int data = array[size - 1];
		size = size - 1;
		if (size == capacity / 4) {
			resize(capacity / 2);
		}
		return data;
	}

	public void resize(int newCapacity) {
		int temp[] = new int[newCapacity];
		for (int i = 0; i < size; i++) {
			temp[i] = array[i];
		}
		array = temp;
		capacity = newCapacity;
	}

	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("Size is : " + size + " " + "Capacity is : " + capacity);
	}

	public static void main(String[] args) {
		ArrayTask3 obj = new ArrayTask3();
		System.out.print("Add 10 :  ");
		obj.add(10);
		obj.print();

		System.out.print("Add 20 :  ");
		obj.add(20);
		obj.print();

		System.out.print("Add 30 :  ");
		obj.add(30);
		obj.print();

		System.out.print("Add 40 :  ");
		obj.add(40);
		obj.print();

		System.out.print("Add 50 :  ");
		obj.add(50);
		obj.print();

		System.out.print("Add 60 :  ");
		obj.add(60);
		obj.print();
	}

}
