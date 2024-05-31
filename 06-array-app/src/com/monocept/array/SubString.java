package com.monocept.array;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string:");
		String Fstring=scanner.next();
		System.out.println("Enter a substring:");
		String substring=scanner.next();
		int len=substring.length();
		for(int i=0;i<=Fstring.length()-len;i++) {
			String temp=Fstring.substring(i, (i+len));
			if(temp.equals(substring)) {
				System.out.println("True");
				return;
			}
			
			
		}
		
		System.out.println("False");

	}

}
