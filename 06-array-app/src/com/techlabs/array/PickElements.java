package com.techlabs.array;

import java.util.Arrays;
import java.util.Scanner;

public class PickElements {
		public static void main(String[] args) {
			Scanner scanner= new Scanner(System.in);
			
			System.out.print("Enter no of elements: ");
			int n = scanner.nextInt();
			int array[]=new int[n];
			int resultarray[]=new int[10];
			int k=0;
			for(int i=0;i<array.length;i++) {
				array[i]=scanner.nextInt();
			}
			for(int i=0;i<array.length;i++) {
				if(i==0) {
					if(array[i]>array[i+1]) {
						resultarray[k]=array[i];
						k++;
					}
					else {
						continue;
					}
				}
				else if(i==n-1) {
					if(array[i]>array[i-1]) {
						resultarray[k]=array[i];
					}
				}
				else {
					if(array[i]>array[i-1] && array[i]>array[i+1]) {
						resultarray[k]=array[i];
						k++;
					}
					else {
						continue;
					}
				}
			}
			for(int i=0;i<k;i++) {
				System.out.println("pickelements are: "+resultarray[i]);
			}

		}

	}