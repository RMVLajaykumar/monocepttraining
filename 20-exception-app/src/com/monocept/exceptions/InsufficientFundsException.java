package com.monocept.exceptions;

public class InsufficientFundsException extends Exception {
	
	public String getMessage() {
		return "Insufficient ammount to withdraw";
	}
	

}
