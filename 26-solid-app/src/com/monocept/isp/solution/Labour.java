package com.monocept.isp.solution;

public class Labour implements Iworker {

	@Override
	public void start() {
		System.out.println("worker starts working");
		
	}

	@Override
	public void stop() {
		System.out.println("worker stops working");
		
	}

	@Override
	public void eat() {
		System.out.println("worker starts eating");
		
	}

	@Override
	public void drink() {
		System.out.println("worker starts drinking");
		
	}

}
