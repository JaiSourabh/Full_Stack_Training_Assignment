package com.yash.collectionProgram.CollectionTask7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestMain {
	static Map<Student, Double> smap = new HashMap<>();

	public static void main(String[] args) {

		List<Student> sList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of students");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("enter roll no.");
			int rollNo = sc.nextInt();
			System.out.println("enter Sname");
			String sname = sc.next();
			System.out.println("enter className");
			String classname = sc.next();
			System.out.println("enter total marks");
			double marks = sc.nextInt();

			sList.add(new Student(rollNo, sname, classname, marks));
		}

		Collections.sort(sList, new MarksComparator());
		Collections.reverse(sList);
		System.out.println("Student who secure First,second and third position");
		
		if(sList.size()<3) {
			for(Student s : sList) {
				System.out.println(s.getTotalmarks());
			}
		}
		else {
			for (int i = 0; i < 3; i++) {
				System.out.println(sList.get(i).sname + " ");
			}
		}
		

		for (int i = 0; i < sList.size(); i++) {
			smap.put(sList.get(i), sList.get(i).totalmarks / sList.size());
		}

		sortedByValue();

		System.out.println("Details of Student on basis of name");
		for (Student name : smap.keySet()) {
			String key = name.toString();
			double value = smap.get(name);
			System.out.println(key + " Percentage =  " + value);
		}

	}

	private static void sortedByValue() {
		ArrayList<Double> arr = new ArrayList<>(smap.values());
		Collections.sort(arr);
		System.out.println("Student whose marks are below 50%");

		for (Double s : arr) {
			if (s < 50) {
				getKeyByValue(s);
			}
		}

		System.out.println("Student whose marks are below 35% i.e Fail");

		for (Double s : arr) {
			if (s < 35) {
				getKeyByValue(s);
			}
		}

		System.out.println("Student whose marks are above average socre");
		double totalMarksOfStudent = 0.0;
		for (Double s : arr) {
			totalMarksOfStudent += (s * smap.size());
		}
		double averageMarks = totalMarksOfStudent / smap.size();
		System.out.println("Average Marks : " + averageMarks);
		for (Double s : arr) {
			if ((s * smap.size()) > averageMarks) {
				getKeyByValue(s);
			}
		}

	}

	private static void getKeyByValue(Double mark) {
		for (Entry<Student, Double> entry : smap.entrySet()) {
			if (entry.getValue() == mark) {
				System.out.println(entry.getKey().sname);
				break;
			}
		}
	}
}
