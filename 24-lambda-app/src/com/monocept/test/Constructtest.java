package com.monocept.test;

public class Constructtest {
	public int age;
	public String name;
	public Constructtest(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public Constructtest() {
		super();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}