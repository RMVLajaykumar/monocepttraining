package com.techlabs.test;

import com.techlabs.model.Complex;

public class Complextest {

	public static void main(String[] args) {
		Complex complex1=new Complex();
		System.out.println(complex1.getReal()+"+"+complex1.getImaginary()+"i");
		Complex complex2=new Complex(10,20);
		System.out.println(complex2.getReal()+"+"+complex2.getImaginary()+"i");
		Complex complex=new Complex();
		System.out.print("Addition of two complex numbers are:"+complex.Addition(complex1, complex2));
		
		

	}

}
