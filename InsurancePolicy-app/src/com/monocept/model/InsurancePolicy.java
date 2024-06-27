package com.monocept.model;

import java.time.LocalDate;

public class InsurancePolicy {
	private int policynumber;
	private String holdername;
	private double policyamount;
	private LocalDate policycreationdate;
	public int getPolicynumber() {
		return policynumber;
	}
	public void setPolicynumber(int policynumber) {
		this.policynumber = policynumber;
	}
	public String getHoldername() {
		return holdername;
	}
	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}
	public double getPolicyamount() {
		return policyamount;
	}
	public void setPolicyamount(double policyamount) {
		this.policyamount = policyamount;
	}
	public LocalDate getPolicycreationdate() {
		return policycreationdate;
	}
	public void setPolicycreationdate(LocalDate policycreationdate) {
		this.policycreationdate = policycreationdate;
	}
	public InsurancePolicy(int policynumber, String holdername, double policyamount, LocalDate policycreationdate) {
		super();
		this.policynumber = policynumber;
		this.holdername = holdername;
		this.policyamount = policyamount;
		this.policycreationdate = policycreationdate;
	}
	@Override
	public String toString() {
		return "InsurancePolicy [policynumber=" + policynumber + ", holdername=" + holdername + ", policyamount="
				+ policyamount + ", policycreationdate=" + policycreationdate + "]";
	}
	public InsurancePolicy() {
		super();
	}
	

}
