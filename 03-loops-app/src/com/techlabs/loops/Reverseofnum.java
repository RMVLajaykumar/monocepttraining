package com.techlabs.loops;

import java.util.Scanner;

public class Reverseofnum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scanner.nextInt();
		int reverse=0;
		while(number!=0) {
			int digit=number%10;
			reverse=reverse*10+digit;
			number/=10;
		}
		System.out.println("reversed number :"+reverse);
	}

}
