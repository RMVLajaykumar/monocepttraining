package com.monocept.tokens;

public class SwapWithTemp {

	public static void main(String[] args) {
		int number1=20;
		int number2=10;
		int temp;
		System.out.println("Before swaping "+number1+","+number2);
		
		temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("After swaping "+number1+","+number2);

	}

}
