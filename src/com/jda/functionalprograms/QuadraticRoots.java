package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class QuadraticRoots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		System.out.println("Give the three quadratic co efficients");
		int a = utility.takeInputInteger();
		int b = utility.takeInputInteger();
		int c = utility.takeInputInteger();
	   int delta = (b*b) - (4*a*c);
	   double d = Math.sqrt((delta)), x, y;
	   if(delta>=0){
	   	x = (-b + d)/(2*a);
	   	y= (-b - d)/(2*a);
	   	System.out.println("The quadratic roots are "+ x + " and " + y);
	   }
	   else
	   	System.out.println("The roots are imaginary");
	   
	}

}
