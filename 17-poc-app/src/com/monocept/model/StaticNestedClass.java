package com.monocept.model;

public class StaticNestedClass {
	int num=10;
	void display() {
		System.out.println("hello its outerclass");
	}
	static class NestedClass{
		void show() {
			System.out.println("its inner class");
		}
		
		public static void main(String[]args) {
			StaticNestedClass obj= new StaticNestedClass();
			obj.display();
			NestedClass obj2=new NestedClass();
			obj2.show();
			
			
		}
		
	}

}
