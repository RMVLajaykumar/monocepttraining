package com.monocept.model;

public class Student {
	
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public Student() {
		super();
	}
	
	public Student getClone() {
		return new Student(rollno,name);
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	

}
