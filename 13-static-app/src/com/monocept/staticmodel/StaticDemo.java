package com.monocept.staticmodel;

public class StaticDemo {
	
	private int number1;
	private static int number2;
	
	public StaticDemo() {
    number1=0;
    number2=0;
	}
	public  void StaticIncrement() {
		number1++;
		number2++;
	}
	
	public void Display() {
		System.out.println("number1 is :"+number1);
		System.out.println("number2 is :"+number2);
	}
	
	public static void print() {
		
	  System.out.println("hello");
		
	}
	{
		
		System.out.println("non static");
	}
	
}
