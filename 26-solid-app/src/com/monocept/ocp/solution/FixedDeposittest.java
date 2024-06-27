package com.monocept.ocp.solution;

public class FixedDeposittest {

	public static void main(String[] args) {
		FixedDeposit fd2=new FixedDeposit(1,"Ajay",1000,3);
		CaluclateSimpleinterest si=new CaluclateSimpleinterest(fd2);
		si.caluclateSI(new Others());

	}

}
