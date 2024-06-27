package com.monocept.ocp;

public class Fixedtest {

	public static void main(String[] args) {
        FixedDeposit fd = new FixedDeposit(123456, "Ajay", 10000, 2, Festival.diwali);
        double interest1 = fd.calculateSimpleInterest();
        System.out.println("simple interest rate is: "+fd.getInterestRate());
        System.out.println("Simple Interest for " + fd.getName() + " is: " + interest1);

        FixedDeposit fd2 = new FixedDeposit(654321, "kumar", 5000, 1, Festival.holi);
        double interest2 = fd2.calculateSimpleInterest();
        System.out.println("simple interest rate is: "+fd2.getInterestRate());
        System.out.println("Simple Interest for " + fd2.getName() + " is: " + interest2);
    }
}
