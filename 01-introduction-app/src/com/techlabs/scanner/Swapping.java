package com.techlabs.scanner;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number1:");
		int number1=scanner.nextInt();
		System.out.println("Enter number2:");
		int number2=scanner.nextInt();
		System.out.println("Before swaping"+number1+","+number2);
		
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.println("After swaping "+number1+","+number2);
		

	}

}
