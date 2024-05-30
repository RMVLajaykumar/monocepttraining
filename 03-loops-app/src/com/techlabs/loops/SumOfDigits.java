package com.techlabs.loops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scanner.nextInt();
		int digit=0;
		int sum=0;
		while (number>0) {
			digit=number%10;
			sum=sum+digit;
			number=number/10;
			}
		System.out.println(sum);
		}

	}
