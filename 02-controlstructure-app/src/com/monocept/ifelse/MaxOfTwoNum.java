package com.monocept.ifelse;

import java.util.Scanner;

public class MaxOfTwoNum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter  number1:");
		int number1=scanner.nextInt();
		System.out.println("Enter  number2:");
		int number2=scanner.nextInt();
		if(number1>number2)
			System.out.println("number1 is greater");
		else if(number1<number2)
			System.out.println("number2 is greater");
		else
			System.out.println("both are equal");

	}

}
