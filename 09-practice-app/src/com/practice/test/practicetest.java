package com.practice.test;

import java.util.Scanner;

import com.monocept.e.Practice;

public class practicetest {

	public static void main(String[] args) {
		Practice prac=new Practice();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter rollnumber");
		String rollno1=scanner.next();
		System.out.println(prac.Rollnumber(rollno1));
		System.out.println("enter name");
		String name1=scanner.next();
		System.out.println(prac.Name(name1));
		System.out.println("enter address");
		String address1=scanner.next();
		System.out.println(prac.Address(address1));
		System.out.println("enter phno:");
		long pno1=scanner.nextLong();
		System.out.println(prac.Phoneno(pno1));
		System.out.println(prac.result(rollno1, name1, address1, pno1));
		
			
		

	}

}
