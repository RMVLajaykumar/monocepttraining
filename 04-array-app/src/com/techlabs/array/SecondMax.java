package com.techlabs.array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMax {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n=scanner.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elements");
		int maxelement=0;
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
			if(array[i]>maxelement) {
				maxelement=array[i];
				
			}
			}
		int secondmax=0;
		for(int i=0;i<array.length;i++) {
		if (array[i]!=maxelement && array[i]>secondmax) {
			secondmax=array[i];
		}
		

		}
		System.out.println("secondmax: "+secondmax);

	}

}

		


