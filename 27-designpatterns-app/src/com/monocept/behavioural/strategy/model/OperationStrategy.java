package com.monocept.behavioural.strategy.model;

public class OperationStrategy implements IOperation {
  
	
	private IOperation ioperation;

	public IOperation getIoperation() {
		return ioperation;
	}

	public void setIoperation(IOperation ioperation) {
		this.ioperation = ioperation;
	}

	public OperationStrategy(IOperation ioperation) {
		super();
		this.ioperation = ioperation;
	}

	@Override
	public int doOperation(int a, int b) {
		
		return ioperation.doOperation(a, b);
	}

	@Override
	public String getDescription() {
		
		return ioperation.getDescription();
	}
	
}
