package com.monocept.exceptions;

public class AgeNotValidException extends RuntimeException {
	
	public String getMessage() {
		return "Age is invalid";
	}

}
