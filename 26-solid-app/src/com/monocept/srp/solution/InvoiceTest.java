package com.monocept.srp.solution;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice(1, "Laptop", 1000.0, 18.0);
		TaxCaluclator taxCalculator = new TaxCaluclator();
       PrintInvoice invoicePrinter = new PrintInvoice();
       
       double totalamount=taxCalculator.calculateTax(invoice);
       invoicePrinter.printInvoice(invoice, totalamount);
       

	}

}
