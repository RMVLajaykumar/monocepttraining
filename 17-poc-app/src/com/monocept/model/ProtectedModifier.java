package com.monocept.model;

public class ProtectedModifier {
	protected int x=12;
	public static void main(String[] args) {
		ProtectedModifier prtmodifier=new ProtectedModifier();
		int x1=prtmodifier.x;
		System.out.println(x1);
	}

}
