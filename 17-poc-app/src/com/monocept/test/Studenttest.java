package com.monocept.test;

import com.monocept.model.Student;

public class Studenttest {

	public static void main(String[] args) {
		Student student = new Student(1,"aJAY");
		System.out.println(student);
		Student student2= (Student)student.getClone();
		student2.setName("kumar");
		student2.setRollno(10);
		System.out.println(student2);
		

	}

}
