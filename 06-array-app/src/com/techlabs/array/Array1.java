package com.techlabs.array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n=scanner.nextInt();
		int array[]=new int[n];
		 int sum=0;
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
			sum+=array[i];
		}
		System.out.print("sum of elements are:"+sum);
		
		
		
		

	}

}
