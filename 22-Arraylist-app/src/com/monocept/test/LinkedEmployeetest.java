package com.monocept.test;

import java.util.LinkedList;
import java.util.Scanner;

import com.monocept.model.LinkedEmployee;

public class LinkedEmployeetest {

	public static void main(String[] args) {
		LinkedList<LinkedEmployee> employees = new LinkedList<LinkedEmployee>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter no of employees");
		int size = scanner.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("enter employee id");
			int id = scanner.nextInt();
			System.out.println("enter name of employee");
			String name = scanner.next();
			System.out.println("enter employee salary");
			Double salary=scanner.nextDouble();
			
			LinkedEmployee employee = new LinkedEmployee(id,name,salary);
		   employees.add(employee);
		}
		for(LinkedEmployee employee:employees)
		{
			System.out.println(employee);
			
			}
		//System.out.println(employees.getFirst());
//		System.out.println(employees.getLast());
//		System.out.println(employees.peek());
//		System.out.println(employees.peekFirst());
//		System.out.println(employees.peekLast());
		System.out.println();
		System.out.println(employees.removeFirst());
		}

}
