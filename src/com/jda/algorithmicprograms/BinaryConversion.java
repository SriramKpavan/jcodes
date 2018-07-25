package com.jda.algorithmicprograms;

import com.jda.utility.Utility;

public class BinaryConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		System.out.println("Give the number that needs to be converted into binary");
		int num = utility.takeInputInteger();
		int binary = Utility.toBinary(num);
		System.out.println(num + " in binary is " + binary);
	}

	
}
