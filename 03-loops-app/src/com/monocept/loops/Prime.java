package com.monocept.loops;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scanner.nextInt();
		boolean flag =false;
		int i=2;
		while(i<number)
		{
			if(number%i==0)
				flag= true;
			i++;
		}
		if(flag==false)
			System.out.println("it is prime");
		else
			System.out.println("not a prime");
		
	}

}
