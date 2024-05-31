package com.monocept.array;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArray {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n=scanner.nextInt();
		int array[]=new int[n];
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
			//[1,2,3,4]
			
		}
		int resultarray[]=new int[n];
		int prefix=1;
		for(int j=0;j<array.length;j++) {
			resultarray[j]=prefix;
			prefix*=array[j];
			//[1,1,2,6]
			
		}
		int postfix=1;//4
		for(int k=array.length-1;k>=0;k--) {
			resultarray[k]*=postfix;
			postfix*=array[k];
			//[24,12,8,6]
		}
		System.out.println(Arrays.toString(resultarray));

	}

}