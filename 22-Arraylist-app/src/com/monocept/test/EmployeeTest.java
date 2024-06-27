package com.monocept.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.monocept.model.Employee;
import com.monocept.test.EmployeeComparator.EmployeebyName;
import com.monocept.test.EmployeeComparator.EmployeebySalary;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("how many employees");
		int size = scanner.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("enter employee id");
			int id = scanner.nextInt();
			System.out.println("enter name of employee");
			String name = scanner.next();
			System.out.println("enter employee salary");
			Double salary=scanner.nextDouble();
			
			//Employee employee 
			employees.add(new Employee(id,name,salary));
		}
		
//       System.out.println(employees);
//       System.out.println(employees.get(1));
//		for(Employee employee:employees) {
//			System.out.println(employee);
//		}
		
//		Iterator emp = employees.iterator();
//		while(emp.hasNext()) {
//			System.out.println(emp.next());
//		}
	//ListIterator emp1 = employees.listIterator();
//		while(emp1.hasNext())
//			System.out.println(emp1.next());
		//while(emp1.hasPrevious())
	//	System.out.println(emp1.previous());
//		
//	for(int i=0;i<employees.size();i++)
//		System.out.println(employees.get(i));
		Collections.sort(employees,new EmployeeComparator.EmployeebyName());
		System.out.println(employees);
		
		
		Collections.sort(employees,new EmployeeComparator.EmployeebySalary());
		System.out.println(employees);

	
	}
}
