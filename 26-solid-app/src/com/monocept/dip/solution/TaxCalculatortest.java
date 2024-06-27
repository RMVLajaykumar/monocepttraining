package com.monocept.dip.solution;

import com.monocept.dip.solution.TaxCalculator;
import com.monocept.dip.solution.DBLogger;
import com.monocept.dip.solution.FileLogger;

public class TaxCalculatortest {

	public static void main(String[] args) {
		TaxCalculator t1=new TaxCalculator(new DBLogger());
		t1.calculateTax(200, 10);
		TaxCalculator t2=new TaxCalculator(new FileLogger());
		t2.calculateTax(2000,10);
		
		
		
	}

}
