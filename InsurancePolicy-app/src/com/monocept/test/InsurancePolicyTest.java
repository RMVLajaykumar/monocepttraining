package com.monocept.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.monocept.model.InsurancePolicy;

public class InsurancePolicyTest {

	public static void main(String[] args) {
		List<InsurancePolicy> policy=new ArrayList<InsurancePolicy>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("how many policies");
		int size=scanner.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("enter policy number");
			int policynumber=scanner.nextInt();
			System.out.println("enter policyholder name:");
			String holdername=scanner.next();
			System.out.println("enter amount");
			double policyamount=scanner.nextDouble();
			System.out.println("enter creation date");
			String date = scanner.next();  
			LocalDate policycreationdate = LocalDate.parse(date);  
			policy.add(new InsurancePolicy(policynumber,holdername,policyamount,policycreationdate));
		}
		System.out.println(policy);
		
		boolean exits=false;
		while(!exits) {
			System.out.println("\n1.sort by name \n2.sort by Amount \n3.sort by creation date \n4.exit");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:
				Collections.sort(policy, new InsuranceComparator.Sortbyname());
				System.out.println(policy);
				break;
				
			case 2:
				Collections.sort(policy,new InsuranceComparator.SortbyAmount());
				System.out.println(policy);
				break;
			case 3:
				Collections.sort(policy,new InsuranceComparator.SortbyCreationDate());
				System.out.println(policy);
				break;
			case 4:
				exits=true;
				System.out.println("thankyou!!");
				break;
				
			}
		}

	}

}
