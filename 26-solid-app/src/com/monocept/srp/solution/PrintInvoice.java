package com.monocept.srp.solution;

public class PrintInvoice {
	
	public void printInvoice(Invoice invoice, double totalAmount) {
        System.out.println("Invoice ID: " + invoice.getId());
        System.out.println("Description: " + invoice.getDescription());
        System.out.println("Amount: " + invoice.getAmount());
        System.out.println("Tax applied: " + invoice.getTax()+" %");
        System.out.println("Total Amount after tax: " + totalAmount);
    }
}


