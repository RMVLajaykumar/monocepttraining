package com.monocept.test;

import com.monocept.model.Itester;

public class Itestertest {

	public static void main(String[] args) {
	
		
		Itester test = new Itester() {

			@Override
			public void test1() {
				System.out.println("testing1-----");
			}

			@Override
			public void test2() {
				System.out.println("testing2-----");

			}
			
		};
		test.test1();
		test.test2();
	}

}
