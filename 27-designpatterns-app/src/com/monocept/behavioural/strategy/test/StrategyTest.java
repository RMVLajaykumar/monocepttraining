package com.monocept.behavioural.strategy.test;

import com.monocept.behavioural.strategy.model.AddOperation;
import com.monocept.behavioural.strategy.model.MultiplyOperation;
import com.monocept.behavioural.strategy.model.OperationStrategy;

public class StrategyTest {

	public static void main(String[] args) {
		
		
		OperationStrategy os=new OperationStrategy(new AddOperation());
		System.out.println(os.getDescription());
		System.out.println(os.doOperation(10, 20));
		System.out.println("-----------");
		os.setIoperation(new MultiplyOperation());
		System.out.println(os.getDescription());
		System.out.println(os.doOperation(20, 10));
		

	}

}
