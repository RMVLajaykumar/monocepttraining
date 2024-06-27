package com.monocept.dip.violation;


	public class TaxCalculator {
		DBlogger dblogger;
		double tax;

		public TaxCalculator(DBlogger dblogger) {
			super();
			this.dblogger = dblogger;
		}
		public TaxCalculator() {
		}
		public void calculateTax(double amount,double rate) {
			try {
				tax=amount/rate;
				System.out.println("Tax :"+tax);
			}
			catch(Exception e) {
				dblogger.log(e);
			}
			
		}
	}

