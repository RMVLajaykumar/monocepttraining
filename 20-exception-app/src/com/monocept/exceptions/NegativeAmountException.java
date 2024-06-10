package com.monocept.exceptions;

public class NegativeAmountException extends Exception {
	
	public String giveMessage() {
		return "cannot deposit in negative amount";
	}

}
