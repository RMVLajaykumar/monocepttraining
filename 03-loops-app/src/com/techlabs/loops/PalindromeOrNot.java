package com.techlabs.loops;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scanner.nextInt();
		int temp=number;
		int reverse=0;
		while(temp!=0) {
			int digit=temp%10;
			reverse=reverse*10+digit;
			temp/=10;
		}
		System.out.println(reverse);
		if(number==reverse) 
			System.out.println("It is palindrome");
		else 
			System.out.println("It is not a palindrome");
			
	}

}
