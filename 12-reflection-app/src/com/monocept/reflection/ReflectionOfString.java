package com.monocept.reflection;

import java.lang.reflect.Constructor;

public class ReflectionOfString {

	public static void main(String[] args) {
		
		try {
			Class stringClass=Class.forName("java.lang.String");
			Constructor constructors[]= stringClass.getConstructors();
			for(Constructor constructor:constructors) {
				System.out.println(constructor.getName());
				System.out.println(constructor.getParameterCount());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
