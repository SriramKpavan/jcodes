package com.jda.algorithmicprograms;

import com.jda.utility.Utility;

public class TempConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		System.out.println("Celsius to fahrenheit is 1 and the other is 2");
		int choice = utility.takeInputInteger();
		double degree = utility.takeInputDouble();
		Utility.temparatureconversion(degree, choice);
	}

	
}
