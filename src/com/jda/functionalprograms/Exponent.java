package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class Exponent {

	public static void main(String args[]){
		Utility utility = new Utility();
		double N = utility.takeInputInteger();
		if(N<31 && N>=0){
			for(int i=0; i<=N; i++)
				System.out.println(i + "th power of 2 = "+ utility.expOf2(i));
		}
		else
			System.out.println("Enter a valid input");
	}
}
