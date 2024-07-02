package com.monocept.behavioural.strategy.model;

public class MultiplyOperation implements IOperation {

	public int doOperation(int a, int b) {
	
		return a*b;
	}

	@Override
	public String getDescription() {
		
		return "Multiply Operation";
	}

}
