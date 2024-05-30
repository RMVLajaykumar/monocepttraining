package com.techlabs.tokens;

public class Swaping {

	public static void main(String[] args) {
		int number1=10;
		int number2=20;
		System.out.println("Before swaping"+number1+","+number2);
		
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.println("After swaping "+number1+","+number2);
	}

}
