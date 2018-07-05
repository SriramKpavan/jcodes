package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class HarmonicNum {

	public static void main(String[] args) {
		Utility utility = new Utility();
		int N = utility.takeInputInteger();
		double hmN ;
		if (N>0){
			hmN = utility.harmonicNumber(N);
			System.out.println(N + "th harmonic number is " + hmN);
		}
		else
			System.out.println("Give a valid input");
		}

	
}
