package com.monocept.behavioural.strategy.model;

public class AddOperation implements IOperation {

	@Override
	public int doOperation(int a, int b) {
		
		return a+b;
	}

	@Override
	public String getDescription() {
		
		return "Add Operation";
	}
   

}
