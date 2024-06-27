package com.monocept.srp.solution;


	public class TaxCaluclator {
	    public double calculateTax(Invoice invoice) {
	        return invoice.getAmount()+(invoice.getAmount()*invoice.getTax()/100);
	    }
	
	}

