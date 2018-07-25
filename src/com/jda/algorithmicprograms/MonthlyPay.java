package com.jda.algorithmicprograms;

import com.jda.utility.Utility;

public class MonthlyPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		System.out.println("Give the Principle, years and the rate per annum");
		int p = utility.takeInputInteger();
		int year = utility.takeInputInteger();
		double rate = utility.takeInputDouble();
		Utility.monthlypayment(p, year, rate);
	}

	
}
