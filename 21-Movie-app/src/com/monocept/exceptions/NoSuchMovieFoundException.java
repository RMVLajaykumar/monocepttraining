package com.monocept.exceptions;

public class NoSuchMovieFoundException extends RuntimeException {
	public String giveMessage() {
		return "no such movie";
	}

}
