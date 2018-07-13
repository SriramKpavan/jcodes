package com.jda.algorithmicprograms;

import com.jda.utility.Utility;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		System.out.println("Give the change you are expecting ");
		int change = utility.takeInputInteger();
		int denom[] = {1000, 500, 100, 50, 10, 5, 1};
		utility.minimumNotes(change, denom);
	}
	
	
}
