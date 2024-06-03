package com.monocept.model;

public class Derived extends Base {
	public int x;

	public Derived(int x) {
		super(x);
		this.x=x;
		
	}
	
	public void display() {
		System.out.println("outside derived x="+x);
		System.out.println("inside x="+super.x);
	
	
	while(x>0) {
		x--;
		display();
	}

}
}

