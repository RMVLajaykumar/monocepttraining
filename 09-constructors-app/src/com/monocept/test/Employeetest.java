package com.monocept.test;

import com.monocept.model.Employee;

public class Employeetest {

	public static void main(String[] args) {
		Employee employee=new Employee();
		System.out.println("("+employee.getId()+","+employee.getName()+","+employee.getSalary()+")");
		Employee employee1=new Employee();
		employee1.setId(10);
		employee1.setName("Ajay");
		employee1.setSalary(10000);
		System.out.println("("+employee1.getId()+","+employee1.getName()+","+employee1.getSalary()+")");
		Employee employee2=new Employee(10,"kumar",21000);
		System.out.println("("+employee2.getId()+","+employee2.getName()+","+employee2.getSalary()+")");
		

	}

}
