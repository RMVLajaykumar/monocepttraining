package com.monocept.test;

import java.util.function.BiPredicate;

public class BipredicateTest {

	public static void main(String[] args) {
		BiPredicate<Integer,Integer>bipredicate=(number1,number2)->{
			if(number1>number2) 
			     return true;
		    return false;
		};
		if(!bipredicate.test(101,15)) {
			System.out.println("number 1 is smaller");
			System.exit(0);
		}
		System.out.println("number 1 is greater");

	}

}
