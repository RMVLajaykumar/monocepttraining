package com.monocept.test;

import java.util.Scanner;

import com.monocept.oc.InputValidator;

public class InputValidatortest {

	public static void main(String[] args) {
		InputValidator inputs=new InputValidator();
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter username:");
		String input1=scanner.next();
		System.out.println(inputs.Username(input1));
		System.out.println("enter password");
		String password=scanner.next();
		System.out.println(inputs.Password(password));
		System.out.println("enter emailid");
		String email=scanner.next();
		System.out.println(inputs.Email(email));	
	}

}
