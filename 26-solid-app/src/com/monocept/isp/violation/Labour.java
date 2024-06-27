package com.monocept.isp.violation;

public class Labour implements Iworker {

	@Override
	public void startWork() {
		System.out.println("labour starts working");
		
	}

	@Override
	public void stopwork() {
		System.out.println("labour stops working");
		
	}

	@Override
	public void eat() {
		System.out.println("labour eats");
		
	}

	@Override
	public void drink() {
		System.out.println("labour drinks");
	}

}
