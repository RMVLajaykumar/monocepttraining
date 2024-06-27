package com.monocept.test;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierOfRandom {

	public static void main(String[] args) {
	Supplier<Integer> supplier=()->{
		Random random = new Random();
		return random.nextInt();
		
	};
	System.out.println(supplier.get());

	}

}
