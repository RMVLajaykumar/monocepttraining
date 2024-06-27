package com.monocept.model;

import java.util.function.BiConsumer;

public class BiconsumerSwap {

	public static void main(String[] args) {
		BiConsumer<Integer,Integer> biconsumer=(number1,number2)->{
			
			int temp=0;
			temp=number1;
			number1=number2;
			number2=temp;	
			System.out.println(("swap of 2 numbers is :")+(number1+","+number2));
			
		};
		biconsumer.accept(10, 20);

	}

}
