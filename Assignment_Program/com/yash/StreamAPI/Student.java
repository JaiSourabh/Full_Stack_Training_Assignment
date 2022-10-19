package com.yash.StreamAPI;

import java.time.LocalDate;

public class Student {
	private int rollno;
	private LocalDate date_of_addmission,dob;
	private double maths, physics, chemistry, English, hindi; // marks in subjects
	private String classname;
	public Student() {
		super();
	}
	public Student(int rollno, LocalDate date_of_addmission, LocalDate dob, double maths, double physics,
			double chemistry, double english, double hindi, String classname) {
		super();
		this.rollno = rollno;
		this.date_of_addmission = date_of_addmission;
		this.dob = dob;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		English = english;
		this.hindi = hindi;
		this.classname = classname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public LocalDate getDate_of_addmission() {
		return date_of_addmission;
	}
	public void setDate_of_addmission(LocalDate date_of_addmission) {
		this.date_of_addmission = date_of_addmission;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public double getMaths() {
		return maths;
	}
	public void setMaths(double maths) {
		this.maths = maths;
	}
	public double getPhysics() {
		return physics;
	}
	public void setPhysics(double physics) {
		this.physics = physics;
	}
	public double getChemistry() {
		return chemistry;
	}
	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}
	public double getEnglish() {
		return English;
	}
	public void setEnglish(double english) {
		English = english;
	}
	public double getHindi() {
		return hindi;
	}
	public void setHindi(double hindi) {
		this.hindi = hindi;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", date_of_addmission=" + date_of_addmission + ", dob=" + dob + ", maths="
				+ maths + ", physics=" + physics + ", chemistry=" + chemistry + ", English=" + English + ", hindi="
				+ hindi + ", classname=" + classname + "]";
	}
	
	
}
