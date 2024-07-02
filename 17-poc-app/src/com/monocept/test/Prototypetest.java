package com.monocept.test;

import com.monocept.model.Student;

public class Prototypetest {

	public static void main(String[] args) {
		System.out.println("student 1 details");
		Student student=new Student(1,"Ajay");
		System.out.println(student);
		System.out.println(student.hashCode());
		System.out.println();
		Student student2=student.getClone();
		System.out.println("student 2 details");
		student2.setRollno(10);
		student2.setName("Kumar");
		System.out.println(student2);
		System.out.println(student2.hashCode());
		

	}

}
