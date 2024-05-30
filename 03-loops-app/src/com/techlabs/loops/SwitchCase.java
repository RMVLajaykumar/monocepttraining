package com.techlabs.loops;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a grade:");
		String grade=scanner.next();
		
		switch(grade)
		{
		case "A":System.out.println("Excellent:");
		         break;
		case "B":System.out.println("good");
		         break;
		case "C":System.out.println("Neads improvement");
		         break;
		case "D":System.out.println("Fail");
		         break;
		 default:System.out.println("Enter a valid grade");
		}
		
		
		

	}

}
