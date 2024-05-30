package com.techlabs.loops;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scanner.nextInt();
		int temp,reminder,result=0;
		temp=number;
		while(temp!=0) {
			reminder=temp%10;
			result+=Math.pow(reminder,3);
			temp/=10;
		}
		if (result==number)
			System.out.println("its amstrong");
		else
			System.out.println("its not an amstrong");
			
		

	}

}
