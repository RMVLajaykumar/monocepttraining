package com.monocept.forloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scanner.nextInt();
		int fact=1;
		for(int i=number;i>=1;i--) {
			fact=fact*i;
			
		}
		System.out.println(fact);
	}

}
