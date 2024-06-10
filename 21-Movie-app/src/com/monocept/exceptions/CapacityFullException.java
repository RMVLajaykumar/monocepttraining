package com.monocept.exceptions;

public class CapacityFullException extends RuntimeException{
	
	public String getMessage() {
		return "no space to add movie";
	
	}
}
