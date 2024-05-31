package com.monocept.test;

import java.util.Scanner;

import com.monocept.oopsmodel.Student;

public class Studenttest {

	public static void main(String[] args) {
		
		Student student1=new Student();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter student1 details");
		System.out.println("enter roll number: ");
		int rollnumber=scanner.nextInt();
		student1.setRollnumber(rollnumber);
		System.out.println("enter name: ");
		String name=scanner.next();
		student1.setName(name);
		System.out.println("enter age: ");
		int age=scanner.nextInt();
		student1.setAge(age);
		System.out.println("student 1 details");
		System.out.println("roll  number :"+student1.getRollnumber());
		System.out.println("name is :"+student1.getName());
		System.out.println("age :"+student1.getAge());
		
		
		Student student2=new Student();
		System.out.println("enter student2 details");
		System.out.println("enter roll number: ");
		 rollnumber=scanner.nextInt();
		student2.setRollnumber(rollnumber);
		System.out.println("enter name: ");
		name=scanner.next();
		student2.setName(name);
		System.out.println("enter age: ");
		 age=scanner.nextInt();
		student2.setAge(age);
		System.out.println("student 2 details");
		System.out.println("roll  number :"+student2.getRollnumber());
		System.out.println("name is :"+student2.getName());
		System.out.println("age :"+student2.getAge());
		
	

	}

}
