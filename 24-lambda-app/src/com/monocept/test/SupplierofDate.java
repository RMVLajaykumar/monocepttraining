package com.monocept.test;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierofDate {

	public static void main(String[] args) {
		Supplier<LocalDate> supplier = ()->{
			return LocalDate.now();	
		};
		System.out.println(supplier.get());

	}

}
