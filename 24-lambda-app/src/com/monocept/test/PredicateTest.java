package com.monocept.test;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		Predicate<Integer> predicate=(number)->{
			if(number%2==0)
				return true;
			return false;

	};
	if(!predicate.test(10)) {
		System.out.println("number is odd");
		System.exit(0);
	}
	System.out.println("number is even");

}
}
