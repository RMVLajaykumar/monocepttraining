package com.monocept.loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter  number:");
		int N=scanner.nextInt();
		int i=1;
		int fact=1;
		while(i<=N) {
			fact=fact*i;
			i++;
		}
	System.out.println(fact);

	}

}
