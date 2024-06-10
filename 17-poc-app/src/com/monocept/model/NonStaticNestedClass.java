package com.monocept.model;

public class NonStaticNestedClass {
	int num=10;
	public void display() {
		System.out.println("its outerclass");
		System.out.println(num);
	}
	public class InnerClass{
		public void show() {
			System.out.println("its innerclass:"+num);
		}
		
	}

	public static void main(String[] args) {
		 NonStaticNestedClass obj=new  NonStaticNestedClass ();
		 obj.display();
		 NonStaticNestedClass.InnerClass obj2= obj.new InnerClass();
		 obj2.show();
		
		 
		

	}

}
