package com.monocept.isp.solution;

public class Wokertest {

	public static void main(String[] args) {
		Iworker loader = new Labour();
		loader.drink();
		loader.eat();
		loader.start();
		loader.stop();
		System.out.println();
		
		Iworkable robo =new robot();
		robo.start();
		robo.stop();

	}

}
