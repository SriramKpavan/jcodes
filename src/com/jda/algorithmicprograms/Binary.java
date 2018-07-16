package com.jda.algorithmicprograms;

import com.jda.utility.Utility;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		System.out.println("Give a number");
		int num = utility.takeInputInteger();
		int binary = utility.toBinary(num);
		int s = utility.swapNibbles(binary);
		System.out.println(s);
	}


	
}
