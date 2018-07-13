package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		System.out.println("Enter temperature");
		int t = utility.takeInputInteger();
		System.out.println("Enter wind velocity");
		int v = utility.takeInputInteger();
		double vRoot =  Math.pow(v, 0.16);
		double w = 35.74 + (0.6215*t) + (((0.4275*t) - 35.75)*vRoot);
		System.out.println("wind chill = " + w);
	}

}
