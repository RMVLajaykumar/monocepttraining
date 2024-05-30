package com.monocept.model;

import java.util.Scanner;

public class InputValidator {
	 
	public static boolean inputvalidate(String input,int minLength,int maxLength) {
		if(input==null||input=="" ||input.length()<minLength ||input.length()>maxLength)
		return false;
	return true;
	}
	public static boolean Username(String username) {
		return inputvalidate(username,3,30);
	}
	public static boolean Password(String password) {
		return inputvalidate(password,8,30);
	}
	public static boolean Email(String email) {
		if (!inputvalidate(email,5,50))
		return false;
		if(!email.contains("@")||!email.contains("."))
			return false;
	 return true;
	}		
	}

	

