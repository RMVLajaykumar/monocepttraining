package com.monocept.test;

import com.monocept.model.IFactorial;

public class IFactorialTest {

	public static void main(String[] args) {
		System.out.print(function((int a)->{
		
				int factorial=1;
				for(int i=1;i<=a;i++) {
					factorial=factorial*i;
				}
				return factorial;
			
			
		}));
		
		//System.out.println(fact.fact(5));

	}

	private static int function(IFactorial fact) {
		return fact.fact(5);
		// TODO Auto-generated method stub
		
	}

}
