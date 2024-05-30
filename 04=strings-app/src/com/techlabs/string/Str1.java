package com.techlabs.string;

public class Str1 {

	public static void main(String[] args) {
		String string1="ABCD";
		
		System.out.println(string1.hashCode());
		
		
		string1=string1+"XYZ";
		System.out.println(string1.hashCode());
		
		System.out.println(string1);

	}

}
