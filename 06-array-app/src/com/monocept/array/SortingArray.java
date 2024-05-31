package com.monocept.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {

		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			int array[]=new int[5];
			System.out.println("Enter elements in sorted order");
			for(int i=0;i<array.length;i++) {
				array[i]=scanner.nextInt();
				array[i]=array[i]*array[i];
			}
			int l=0;
			int r=array.length - 1;
			int i=array.length-1;
			int sortedArr[];
			sortedArr=new int[5];
			while(l<=r) {
				if(array[l]>array[r]) {
					sortedArr[i]=array[l];
					l++;
				}
				else {
					sortedArr[i]=array[r];
					r--;
				}
				i--;
			}
			System.out.println("Sorted Array: "+Arrays.toString(sortedArr));
		}

	}

	


