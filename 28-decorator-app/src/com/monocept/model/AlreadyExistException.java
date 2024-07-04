package com.monocept.model;

public class AlreadyExistException extends RuntimeException{
	
	public String getMessage() {
		return "notifier already exist";
			
	}

}
