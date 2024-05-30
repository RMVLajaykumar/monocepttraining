package com.techlabs.array;

import java.util.Scanner;

public class MaxOfArray {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n=scanner.nextInt();
		int array[]=new int[n];
		int maxelement=array[0];
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
			if(array[i]>maxelement) {
				maxelement=array[i];
			}
		}
		System.out.println(maxelement);

	}

}
