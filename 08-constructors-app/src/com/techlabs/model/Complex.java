package com.techlabs.model;

public class Complex {
	
	private int real;
	private int imaginary;
	
	
	public Complex() {
		this(5,5);
	}
	public Complex(int real,int imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public void setReal(int real) {
		this.real=real;
	}
	public int getReal() {
		return real;
	}
	public void setImaginary(int imaginary) {
		this.imaginary=imaginary;
	}
	public int getImaginary() {
		return imaginary;
	}
	
	public  String Addition(Complex complex1,Complex complex2) {
		int addReal=complex1.real+complex2.real;
		int addImaginary=complex1.imaginary+complex2.imaginary;
		return addReal+"+"+addImaginary+"i";
	}
}
