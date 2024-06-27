package com.monocept.dip.solution;

public class DBLogger implements ILogger{

	@Override
	public void log(Exception error) {
		System.out.println("Logged to database"+error);
		
	}

}
