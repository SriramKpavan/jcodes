package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Give the x co ordinate");
		int x = utility.takeInputInteger();
		System.out.println("Give the y co ordinate");
		int y = utility.takeInputInteger();
		double dist = utility.distance(x,y);
		System.out.println(dist);
 
	}

	
}
