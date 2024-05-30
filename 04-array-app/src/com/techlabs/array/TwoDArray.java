package com.techlabs.array;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter elements");
		int Array[][]=new int[3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				Array[i][j]=scanner.nextInt();
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print( Array[i][j]);
			}
			System.out.println(" ");
	
		}
		

		
	}

}
