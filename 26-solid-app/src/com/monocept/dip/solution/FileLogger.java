package com.monocept.dip.solution;

public class FileLogger implements ILogger {

	@Override
	public void log(Exception error) {
		System.out.println("Logged to file"+error);
		
	}

}
