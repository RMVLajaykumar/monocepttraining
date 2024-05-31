package com.monocept.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Average {

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
		int Average=sum/=n;
		System.out.print("Average of elements are:"+Average);
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=0;i<array.length;i++) {
			if(array[i]==Average) {
				if(i>0) {
					result.add(array[i-1]);
				}
				if(i<array.length-1) {
					result.add(array[i+1]);
				}
			}
		}
		System.out.println("\n"+result);

	}

}
