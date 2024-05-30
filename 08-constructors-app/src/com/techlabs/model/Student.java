package com.techlabs.model;

public class Student {
	private int rollno;
	private String name;
	private int age;
	
	
	public Student() {
	}
	
	public Student(int rollno,String name,int age) {
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public Student(Student student) {
		student.getRollnumber();
		student.getName();
		student.getAge();
	}
	
	public void setRollnumber(int rollno) {
		this.rollno=rollno;
	}
	public int getRollnumber() {
		return rollno;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}

}
