package com.monocept.cla;

public class Swaping {

	public static void main(String[] args) {
		int number1=Integer.parseInt(args[0]);
		int number2=Integer.parseInt(args[1]);
		System.out.println("Before swaping"+number1+","+number2);
		
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.println("After swaping "+number1+","+number2);

	}

}
