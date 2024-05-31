package com.monocept.debug;

public class AverageCalculator {

	public static void main(String[] args) {
		int number1=10;
		int number2=20;
		
		int sum=addition(number1,number2);
		double average=averagecal(sum);
		System.out.println(+average);
		
		
		

	}
	private static int addition(int number1,int number2)
	{
		return number1+number2;
	}
	
	private static double averagecal(int sum)
	{
		return sum/2;
	}

}
