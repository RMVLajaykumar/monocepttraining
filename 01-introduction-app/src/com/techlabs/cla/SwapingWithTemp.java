package com.techlabs.cla;

public class SwapingWithTemp {

	public static void main(String[] args) {
		int number1=Integer.parseInt(args[0]);
		int number2=Integer.parseInt(args[1]);
		int temp;
		System.out.println("Before swaping "+number1+","+number2);
		
		temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("After swaping "+number1+","+number2);

	

	}

}
