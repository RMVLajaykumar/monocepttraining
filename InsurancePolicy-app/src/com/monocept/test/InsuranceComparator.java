package com.monocept.test;

import java.util.Comparator;

import com.monocept.model.InsurancePolicy;

public class InsuranceComparator {
	
	public static class Sortbyname implements Comparator<InsurancePolicy>{

		@Override
		public int compare(InsurancePolicy policy1, InsurancePolicy policy2) {
			
			return policy1.getHoldername().compareTo(policy2.getHoldername());
		}
		
	}
	
	public static class SortbyAmount implements Comparator<InsurancePolicy>{

		@Override
		public int compare(InsurancePolicy policy1, InsurancePolicy policy2) {
			
			return (int) (policy1.getPolicyamount()-policy2.getPolicyamount());
		}
		
	}
	public static class SortbyCreationDate implements Comparator<InsurancePolicy>{

		@Override
		public int compare(InsurancePolicy policy1, InsurancePolicy policy2) {
			
			return policy1.getPolicycreationdate().compareTo(policy2.getPolicycreationdate());
		}
	
	}

}
