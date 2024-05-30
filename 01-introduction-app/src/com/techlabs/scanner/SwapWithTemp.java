package com.techlabs.scanner;

import java.util.Scanner;

public class SwapWithTemp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number1:");
		int number1=scanner.nextInt();
		System.out.println("Enter number2:");
		int number2=scanner.nextInt();
		int temp;
		System.out.println("Before swaping "+number1+","+number2);
		
		temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("After swaping "+number1+","+number2);

		

	}

}
