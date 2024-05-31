package com.monocept.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionOfString {

	public static void main(String[] args) {
		//Class<String> stringClass = String.class;
		try {
			Class stringClass=Class.forName("java.lang.String");
			Constructor constructors[]= stringClass.getConstructors();
			for(Constructor constructor:constructors) {
				System.out.println(constructor.getName());
				System.out.println(constructor.getParameterCount());
			}
			Method methods[]=stringClass.getMethods();
			for( Method method:methods) {
				System.out.println(method.getName());
				System.out.println(method.getParameterCount());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
