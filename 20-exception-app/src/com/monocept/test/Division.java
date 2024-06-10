package com.monocept.test;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		try {
			
			int number1=Integer.parseInt(args[0]);	
			
			int number2=Integer.parseInt(args[1]);
			double division=divisionCalculator(number1,number2);
		
		//System.out.println("division of 2 numbers is:"+division);
		}
		
		catch(ArithmeticException e) {
			System.out.println("you can't divided with 0 change second number");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid no of inputs");
		}
		catch(Exception e) {
			System.out.println("e");
		}
		finally {
			System.out.println("finally executed");
		}
		System.out.println("byee");
	}

	private static double divisionCalculator(int number1,int number2) {
		{
			double division=0;
			try {
				division=number1/number2;
				System.out.println("done:"+division);
				
			}
			catch(ArithmeticException e) {
				System.out.println("change number2 you cannot divided with 0" );
				//e.printStackTrace();
			}
			return division;
			
		}
		
		
	}

}
