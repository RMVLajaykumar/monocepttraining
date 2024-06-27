package com.monocept.dip.violation;

public class DBlogger {
	
	void log(Exception error) {
		System.out.println("Logged to database"+error);
	}


}
