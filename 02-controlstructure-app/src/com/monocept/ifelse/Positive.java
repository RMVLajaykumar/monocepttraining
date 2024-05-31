package com.monocept.ifelse;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number1=scanner.nextInt();
		
		if(number1>0)
			System.out.println("positive");
		else
			System.out.println("negetive");
			

	}

}
