package com.monocept.model;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
	HashSet<String> set = new HashSet<String>();
	
	String str1=new String("abc");
	System.out.println(str1.hashCode());
	set.add(str1);
	String str2=new String("xyz");
	System.out.println(str2.hashCode());
	set.add(str2);
	String str3=new String("pqr");
	System.out.println(str3.hashCode());
	set.add(str3);
	String str4=new String("str");
	System.out.println(str4.hashCode());
	set.add(str4);
	
	System.out.println(set);
	System.out.println(set.size());

	}

}
