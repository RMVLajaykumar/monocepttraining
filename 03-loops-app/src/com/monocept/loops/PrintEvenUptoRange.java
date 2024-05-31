package com.monocept.loops;

import java.util.Scanner;

public class PrintEvenUptoRange {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter  number:");
		int N=scanner.nextInt();
		int i=1;
		while(i<=N) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
		

	}

}
