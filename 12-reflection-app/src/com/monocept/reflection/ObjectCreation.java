package com.monocept.reflection;

public class ObjectCreation {

	public static void main(String[] args) {
		try {
			Class classes=Class.forName("com.monocept.reflection.Reflectiontest");
			Reflectiontest object =(Reflectiontest) classes.newInstance();
			Reflectiontest object2=(Reflectiontest) object;
			System.out.print(object2.Multiply(10, 27));
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
