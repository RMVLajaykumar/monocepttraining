package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.oops.Employee;
import com.techlabs.oops.Student;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter employee1 details");
		System.out.println("enter id number: ");
		int id=scanner.nextInt();
		emp1.setId(id);
		System.out.println("enter name: ");
		String name=scanner.next();
		emp1.setName(name);
		System.out.println("salary: ");
		double salary=scanner.nextInt();
		emp1.setSalary(salary);
		System.out.println("employee 1 details");
		System.out.println("id number :"+emp1.getId());
		System.out.println("name is :"+emp1.getName());
		System.out.println("salary :"+emp1.getSalary());
		
		Employee emp2=new Employee();
		System.out.println("enter employee2 details");
		System.out.println("enter id number: ");
		 id=scanner.nextInt();
		emp2.setId(id);
		System.out.println("enter name: ");
		 name=scanner.next();
		emp2.setName(name);
		System.out.println("salary: ");
		 salary=scanner.nextInt();
		emp2.setSalary(salary);
		System.out.println("employee 2 details");
		System.out.println("id number :"+emp2.getId());
		System.out.println("name is :"+emp2.getName());
		System.out.println("salary :"+emp2.getSalary());
	

	}

}
