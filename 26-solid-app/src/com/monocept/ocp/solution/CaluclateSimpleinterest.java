package com.monocept.ocp.solution;

public class CaluclateSimpleinterest {
	FixedDeposit fd;
	public void caluclateSI(Festival fest) {
		double si=(fd.getPrinciple()*fd.getDuration()*fest.festivalType())/100;
		System.out.println("Accountno: "+fd.getAccountno());
		System.out.println("duration: "+fd.getDuration());
		System.out.println("Name: "+fd.getName());
		System.out.println("principle: "+fd.getPrinciple());
		System.out.println("Simpleinterst: "+si);
		System.out.println("Total amount: "+(si+fd.getPrinciple()));
	}
	public CaluclateSimpleinterest(FixedDeposit fd) {
		super();
		this.fd = fd;
	}

}
