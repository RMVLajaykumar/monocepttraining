package com.monocept.test;

import java.util.Comparator;

import com.monocept.model.Employee;

public class EmployeeComparator {
	
	public static class EmployeebyName implements Comparator<Employee>{

		@Override
		public int compare(Employee employee1, Employee employee2) {
			return employee1.getName().compareTo(employee2.getName());
			
		}
		
	}
	public static class EmployeebySalary implements Comparator<Employee>{

		@Override
		public int compare(Employee employee1, Employee employee2) {
			return (int) (employee1.getSalary()-employee2.getSalary());
		}
		
	}

}
