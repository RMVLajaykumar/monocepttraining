package com.monocept.isp.violation;

public class Robot implements Iworker{

	@Override
	public void startWork() {
		System.out.println("robot starts working");
		
	}

	@Override
	public void stopwork() {
		System.out.println("robot stops working");
		
	}

	@Override
	public void eat() {
		System.out.println("robot don't eat");
		
	}

	@Override
	public void drink() {
		System.out.println("robot don't drink");
		
	}

}
