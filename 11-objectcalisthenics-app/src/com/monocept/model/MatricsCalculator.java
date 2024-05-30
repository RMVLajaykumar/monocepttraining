package com.monocept.model;

import java.util.Scanner;

public class MatricsCalculator {

	public static void main(String[] args) {
		int matrix[][]=new int[3][3];
		int matrix1[][]=new int[3][3];
		int matrix2[][]=new int[3][3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter elements");
		createRows(matrix,scanner);
		DisplayMatrix(matrix);
		

	}

	private static void DisplayMatrix(int[][] matrix) {
		for(int i=0;i<3;i++) {
			displaycolumns(i,matrix);
		}
		
	}

	private static void displaycolumns(int i, int[][] matrix) {
		for(int j=0;j<3;j++) {
			System.out.print(matrix[i][j]);
		}
		System.out.println();
		
	}

	private static void createRows(int[][] matrix, Scanner scanner) {
		for(int i=0;i<3;i++) {
			createColumns(i,matrix,scanner);
		}
		
	}

	private static void createColumns(int i, int[][] matrix, Scanner scanner) {
		for(int j=0;j<3;j++) {
			matrix[i][j]=scanner.nextInt();
		}
		
	}

}
