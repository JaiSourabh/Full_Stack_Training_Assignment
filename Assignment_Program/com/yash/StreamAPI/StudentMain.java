package com.yash.StreamAPI;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {

	public static void main(String[] args) {
		Student s1=new Student(101, LocalDate.of(2020, 02, 11), LocalDate.of(2020, 06, 12), 67,89,49,79,60, "First");
		Student s2=new Student(102, LocalDate.of(2020, 05, 19), LocalDate.of(2020, 9, 14), 88,89,99,89,50, "Second");
		Student s3=new Student(103, LocalDate.of(2020, 8, 29), LocalDate.of(2021, 07, 12), 29,29,34,28,40, "First");
		
		List<Student> sList=new ArrayList<>();
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		
		System.out.println("Student who get less than 40%");
		List<Student> lessThanFourty=sList.stream().filter(m -> ((m.getEnglish()+m.getHindi()+m.getMaths()+m.getPhysics()+m.getChemistry())/5)<40).collect(Collectors.toList());
		System.out.println(lessThanFourty);
		
		System.out.println("Student who get more than 75%");
		List<Student> greaterThanSeventyFive=sList.stream().filter(m -> ((m.getEnglish()+m.getHindi()+m.getMaths()+m.getPhysics()+m.getChemistry())/5)>75).collect(Collectors.toList());
		System.out.println(greaterThanSeventyFive);
		
		System.out.println("Students who are fail in atleast one subject");
		List<Student> failInAtLeastOneSubject=sList.stream().filter(m -> (m.getEnglish()<33 || m.getHindi()<33 || m.getMaths()<33 || m.getPhysics()<33 || m.getChemistry()<33)).collect(Collectors.toList());
		System.out.println(failInAtLeastOneSubject);
		
		System.out.println("Students are promoted to another class");
		List<Student> promoteToAnotherClass=sList.stream().filter(m -> (m.getEnglish()>33 && m.getHindi()>33 && m.getMaths()>33 && m.getPhysics()>33 && m.getChemistry()>33)).collect(Collectors.toList());
		System.out.println(promoteToAnotherClass);
		
		
	}

}
