package com.techlabs.loops;

import java.util.Scanner;

public class Perfectnum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scanner.nextInt();
		int result=0;
		int digit=0;
		int i =1;
		while (i<number) {
			if(number%i==0) {
			result+=i;
			}
			i++;
		}
		if (number==result) {
			System.out.println("it is a perfect number");
		}
		else {
			System.out.println("it is not a perfect number");
		}

	}

}