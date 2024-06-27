package com.monocept.ocp.solution;

public class FixedDeposit {
	 private int accountno;
	    private String name;
	    private double principle;
	    private int duration;
		public FixedDeposit(int accountno, String name, double principle, int duration) {
			super();
			this.accountno = accountno;
			this.name = name;
			this.principle = principle;
			this.duration = duration;
		}
		public int getAccountno() {
			return accountno;
		}
		public void setAccountno(int accountno) {
			this.accountno = accountno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public FixedDeposit() {
			super();
		}
		public double getPrinciple() {
			return principle;
		}
		public void setPrinciple(double principle) {
			this.principle = principle;
		}
		public int getDuration() {
			return duration;
		}
		public void setDuration(int duration) {
			this.duration = duration;
		}
	

}
