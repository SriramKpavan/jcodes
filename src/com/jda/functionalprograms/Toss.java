package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class Toss {

	public static void main(String args[]){
		Utility utility = new Utility();
		int n = utility.takeInputInteger();
		int tailCount = utility.getTailCount(n);
		float tailPercent = utility.getTailPercent(tailCount, n);
		float headPercent = 100 - tailPercent;
		System.out.println("Tail Percentage ="+ tailPercent);
		System.out.println("Head Percentage ="+ headPercent);
	}
	
	
	
	
}
