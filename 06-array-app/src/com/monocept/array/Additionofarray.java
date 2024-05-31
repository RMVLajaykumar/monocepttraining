package com.monocept.array;

import java.util.Scanner;

public class Additionofarray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int n=scanner.nextInt();
		System.out.println("Enter no of columns");
		int m=scanner.nextInt();
		System.out.println("Enter elements");
		int Array[][]=new int[n][m];
		int Array2[][]=new int[n][m];
		int Array3[][]=new int[n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				Array[i][j]=scanner.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print( Array[i][j]+"\t");
			}
			System.out.println(" ");
	
		}
		
		
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				Array2[i][j]=scanner.nextInt(); 
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print( Array2[i][j]+"\t");
			}
			System.out.println(" ");
	
		}
	 System.out.print("Addition of 2 matrix is \n");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				Array3[i][j]=Array[i][j]+Array2[i][j];
				System.out.print(Array3[i][j]+"\t");
				
			}
			System.out.println(" ");
			}
	}

}
