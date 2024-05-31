package com.monocept.test;

import com.monocept.model.Student;

public class Studenttest {

	public static void main(String[] args) {
		
		Student student=new Student();
		System.out.println("("+student.getRollnumber()+","+student.getName()+","+student.getAge()+")");
		Student student1=new Student(31,"Ajay",21);
		System.out.println("("+student1.getRollnumber()+","+student1.getName()+","+student1.getAge()+")");
		Student student2=new Student(student1);
		System.out.println("("+student2.getRollnumber()+","+student2.getName()+","+student2.getAge()+")");
		Student student3=new Student();
		student3.setRollnumber(3);
		student3.setName("kumar");
		student3.setAge(22);
		System.out.println("("+student3.getRollnumber()+","+student3.getName()+","+student3.getAge()+")");
		

	}

}
