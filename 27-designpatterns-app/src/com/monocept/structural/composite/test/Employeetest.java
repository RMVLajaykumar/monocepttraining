package com.monocept.structural.composite.test;

import com.monocept.structural.composite.model.CompanyDirectory;
import com.monocept.structural.composite.model.Developer;
import com.monocept.structural.composite.model.Developer;
import com.monocept.structural.composite.model.IEmployee;
import com.monocept.structural.composite.model.Manager;


public class Employeetest {

	public static void main(String[] args) {
		IEmployee dev1 = new Developer("Ajay", "Junior Developer");
		IEmployee dev2 = new Developer("kumar", "Senior Developer");

		IEmployee man1 = new Manager("ram", "DoNet Manager");
		IEmployee man2 = new Manager("Ak", "AWS Manager");

		CompanyDirectory developerDirectory = new CompanyDirectory ();
		developerDirectory.addEmployee(dev1);
		developerDirectory.addEmployee(dev2);

		CompanyDirectory managerDirectory = new CompanyDirectory ();
		managerDirectory.addEmployee(man1);
		managerDirectory.addEmployee(man2);
		managerDirectory.removeEmployee(man2);
		
		

		CompanyDirectory companyDirectory = new CompanyDirectory();
		companyDirectory.addEmployee(developerDirectory);
		companyDirectory.addEmployee(managerDirectory);
          
		System.out.println("Company Employees:");
		companyDirectory.showEmployeeDetails();

	}

		 
		 
		 
		 
		 
		 
		 

	}


