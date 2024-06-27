package com.monocept.isp.violation;

public class Iworkertest {

	public static void main(String[] args) {
		Iworker labour = new Labour();
		labour.startWork();
		
		Iworker robo = new Robot();
		robo.startWork();

	}

}
