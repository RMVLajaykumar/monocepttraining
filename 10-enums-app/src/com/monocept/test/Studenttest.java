package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Student;

public class Studenttest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter no of students");
		int n=scanner.nextInt();
		Student student[]=new Student[n];
		for(int i=0;i<n;i++) {
			student[i]=new Student();
			System.out.println("enter roll number:");
			student[i].setRollno(scanner.nextInt());
			System.out.println("enter name:");
			student[i].setName(scanner.next());
			System.out.println("enter age:");
			student[i].setAge(scanner.nextInt());
			System.out.println("enter emailid:");
			student[i].setEmail(scanner.next());
		}
		for(Student students:student) {
			System.out.println(students);
			
		}

	}

}
